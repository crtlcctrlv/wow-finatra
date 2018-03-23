package choe.learn.finatra.wow.controller

import choe.learn.finatra.wow.entity.request.ValidationRequest
import com.twitter.finatra.http.Controller

class ValidationController extends Controller {

  get("/validate") { validationRequest: ValidationRequest =>
    "No errors, number: %d, date: %s".format(validationRequest.number, validationRequest.date)
  }

}
