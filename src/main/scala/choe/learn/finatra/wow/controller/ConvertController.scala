package choe.learn.finatra.wow.controller

import choe.learn.finatra.wow.entity.request.{DateValueRequest, IntValueRequest, MultiValueRequest}
import com.twitter.finatra.http.Controller

class ConvertController extends Controller {

  prefix("/convert") {
    get("/primitive") { intValueRequest: IntValueRequest =>
      "Converted primitive " + intValueRequest.value
    }

    /**
      * pass timestamp or pattern like 1994-11-05T08:15:30
      */
    get("/date") { dateValueRequest: DateValueRequest =>
      "Converted date " + dateValueRequest.value
    }

    get("/collection") { multiValueRequest: MultiValueRequest =>
      "Converted collection " + multiValueRequest.values
    }
  }

}
