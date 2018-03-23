package choe.learn.finatra.wow.controller

import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class ResponseController extends Controller {

  prefix("/response") {
    get("/annotation") { request: Request =>
      "The String ResponseBody"
    }

    get("/charset/accept") { request: Request =>
      """\u3053\u3093\u306b\u3061\u306f\u4e16\u754c\uff01 ("Hello world!" in Japanese)"""
    }
  }

}
