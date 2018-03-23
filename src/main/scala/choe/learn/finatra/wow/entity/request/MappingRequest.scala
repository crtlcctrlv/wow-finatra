package choe.learn.finatra.wow.entity.request

import javax.inject.Inject

import com.twitter.finagle.http.Request
import com.twitter.finatra.request.{Header, QueryParam}

case class FooRequest(@Inject request: Request, @QueryParam foo: String)

case class HeaderExampleRequest(@Header `user-agent`: String)