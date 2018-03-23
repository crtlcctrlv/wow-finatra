package choe.learn.finatra.wow.entity.request

import javax.inject.Inject

import com.twitter.finagle.http.Request
import com.twitter.finatra.request.QueryParam
import org.joda.time.DateTime

case class IntValueRequest(@Inject request: Request, @QueryParam value: Int)

case class DateValueRequest(@Inject request: Request, @QueryParam value: DateTime)

case class MultiValueRequest(@Inject request: Request, @QueryParam values: Seq[Int])
