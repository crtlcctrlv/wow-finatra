package choe.learn.finatra.wow.entity.request

import com.twitter.finatra.request.FormParam

case class FormPostRequest(@FormParam name: String, @FormParam age: Int)