package choe.learn.finatra.wow.controller

import choe.learn.finatra.wow.entity.model.ChoeModel
import choe.learn.finatra.wow.entity.request.FormPostRequest
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class MessageConvertersController extends Controller {

  prefix("/messageconverters") {
    post("/string") { request: Request =>
      ""
    }

    get("/string") { request: Request =>
      "Wrote a string"
    }

    post("/form") { formPostRequest: FormPostRequest =>
      "Read x-www-form-urlencoded: " + formPostRequest
    }

    get("/form") { request: Request =>
      ""
    }

    post("/json") { choeModel: ChoeModel =>
      "Read from JSON: " + choeModel
    }

    get("/json") { request: Request =>
      ChoeModel("baz", "peach")
    }
  }

}
