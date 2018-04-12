import akka.http.scaladsl.server.Directives._

class MockController {
  val route =
    pathPrefix("user") {
      complete("it works")
    }
}
