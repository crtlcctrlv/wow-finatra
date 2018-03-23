package choe.learn.finatra.wow.controller

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class SimpleController extends Controller {

  get("/simple") { request: Request =>
    "Hello world!"
  }

  get("/simple/revisited") { request: Request =>
    "Hello world revisited!"
  }
}
