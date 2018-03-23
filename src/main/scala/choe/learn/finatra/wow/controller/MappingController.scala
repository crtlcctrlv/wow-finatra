package choe.learn.finatra.wow.controller

import choe.learn.finatra.wow.entity.model.ChoeModel
import choe.learn.finatra.wow.entity.request.{FooRequest, HeaderExampleRequest}
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class MappingController extends Controller {

  get("/mapping/path") { request: Request =>
    "Mapped by path!"
  }

  get("/mapping/path/:*") { request: Request =>
    "Mapped by path pattern ('" + request.uri + "')"
  }

  get("/mapping/method") { request: Request =>
    "Mapped by path + method {" + request.method + "}"
  }

  get("/mapping/parameter") { fooRequest: FooRequest =>
    "Mapped by path + method + presence of query parameter foo {" + fooRequest.foo + "}!"
  }

  get("/mapping/header") { headerExampleRequest: HeaderExampleRequest =>
    "Mapped by path + method + presence of user-agent header {" + headerExampleRequest.`user-agent` + "}!"
  }

  post("/mapping/consumes") { choeModel: ChoeModel =>
    "Mapped by path + method + consumable media type ('" + choeModel + "')"
  }

  get("/mapping/produces") { request: Request =>
    ChoeModel("pine", "peach")
  }

}
