package choe.learn.finatra.wow.controller

import javax.inject.Inject

import choe.learn.finatra.wow.repository.mysql.UserRepository
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class QuillFinagleMysqlController extends Controller {

  @Inject var userRepository: UserRepository = _

  get("/quill/finagle/mysql/user/search/:id") { request: Request =>
    val userId: String = request.params("id")

    userRepository.findByUserId(userId).map {
      optionUser =>
        optionUser match {
          case Some(user) => response.ok.plain(user.firstName + "." + user.lastName)
          case None => response.notFound("not found by id " + userId)
        }
    }
  }

}
