import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import cats.data.NonEmptyList

import scala.util.{Failure, Success}

object Main {
  def main(args: Array[String]): Unit = {
    println("starting...")

    implicit val system = ActorSystem("app-system")
    implicit val materializer = ActorMaterializer()

    // TODO: Check if services/controllers should use ActorSystem's EC
    implicit val ec = system.dispatcher

    val route = {
      val mockController = new MockController

      mockController.route
    }

    val bindRes = Http().bindAndHandle(route, "localhost", 8080)

    bindRes.onComplete {
      case Success(binding) => println("Application listens on: " + binding.localAddress)
      case Failure(ex) => println("Application failed to bind", ex)
    }
  }
}