package choe.learn.finatra.wow

import choe.learn.finatra.wow.controller._
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.{CommonFilters, LoggingMDCFilter, TraceIdMDCFilter}
import com.twitter.finatra.http.routing.HttpRouter

object ChoeServerMain extends ChoeServer

class ChoeServer extends HttpServer {

  override val defaultFinatraHttpPort: String = ":8888"

  override def configureHttp(router: HttpRouter) {
    router
      .filter[LoggingMDCFilter[Request, Response]]
      .filter[TraceIdMDCFilter[Request, Response]]
      .filter[CommonFilters]
      .add[SimpleController]
      .add[HelloController]
      .add[MappingController]
      .add[RequestDataController]
      .add[ConvertController]
      .add[MessageConvertersController]
      .add[ValidationController]
      .add[ResponseController]
      .add[QuillFinagleMysqlController]
      .add[DashboardController]
  }

}