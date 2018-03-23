package choe.learn.finatra.wow.entity.request

import com.twitter.finatra.request.QueryParam
import com.twitter.finatra.validation.{FutureTime, Max}
import org.joda.time.DateTime

case class ValidationRequest(@Max(100) @QueryParam number: Int,
                             @FutureTime @QueryParam date: Option[DateTime])
