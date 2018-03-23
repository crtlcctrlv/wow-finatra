package choe.learn.finatra.wow.controller

import choe.learn.finatra.wow.entity.request.FooRequest
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class RequestDataController extends Controller {

  prefix("/data") {
    get("/param") { fooRequest: FooRequest =>
      "Obtained 'foo' query parameter value '" + fooRequest.foo + "'"
    }

    get("/path/:var") { request: Request =>
      "Obtained 'var' path variable value '" + request.params("var") + "'"
    }

    get("/:path1/:path2") { request: Request =>
      ""
    }

    get("/header") { request: Request =>
      "Obtained 'Accept' header '" + request.headerMap.getOrNull("Accept") + "'"
    }

    get("/cookie") { request: Request =>
      "Obtained 'openid_provider' cookie '" + request.cookies.getValue("openid_provider") + "'"
    }

    post("/body") { request: Request =>
      "Posted request body '" + request.contentString + "'"
    }

    post("/entity") { request: Request =>
      "Posted request body '" + request.contentString + "'; headers = " + request.headerMap
    }
  }

}
