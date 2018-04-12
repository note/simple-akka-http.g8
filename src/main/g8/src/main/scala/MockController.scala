import akka.http.scaladsl.server.Directives._

class MockController {
  val route =
    pathPrefix("something") {
      complete("it works")
    }
}
