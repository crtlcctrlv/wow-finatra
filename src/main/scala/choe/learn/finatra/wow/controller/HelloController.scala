package choe.learn.finatra.wow.controller

import choe.learn.finatra.wow.entity.model.SnakeCaseExampleModel
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller
import choe.learn.finatra.wow.entity.request.HiRequest

class HelloController extends Controller {

  get("/hi") { request: Request =>
    info("hi")
    "Hello " + request.params.getOrElse("name", "unnamed")
  }

  post("/hi") { hiRequest: HiRequest =>
    "Hello " + hiRequest.name + " with id " + hiRequest.id
  }

  post("/json/snakecase") { model: SnakeCaseExampleModel =>
    model
  }

}