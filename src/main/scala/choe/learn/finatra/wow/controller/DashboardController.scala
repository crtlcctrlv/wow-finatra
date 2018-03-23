package choe.learn.finatra.wow.controller

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class DashboardController extends Controller {

  get("/ping") { request: Request =>
    response.ok.file("test.txt")
  }

  get("/logback/xml") { request: Request =>
    response.ok.file("logback.xml")
  }

}
