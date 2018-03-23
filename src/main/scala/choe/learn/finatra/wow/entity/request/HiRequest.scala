package choe.learn.finatra.wow.entity.request

import javax.inject.Inject
import com.twitter.finagle.http.Request

case class HiRequest(@Inject request: Request, id: Long = 0, name: String)