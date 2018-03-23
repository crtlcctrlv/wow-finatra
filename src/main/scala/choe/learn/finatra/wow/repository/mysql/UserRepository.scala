package choe.learn.finatra.wow.repository.mysql

import javax.inject.Singleton

import choe.learn.finatra.wow.config.choeFinagleMysqlContext
import com.twitter.util.Future

case class User(id: Long, userId: String, firstName: String, lastName: String, age: Short, isActive: Boolean)

@Singleton
class UserRepository {

  val context = choeFinagleMysqlContext

  import context._

  val users = quote(querySchema[User]("t_choe_user"))

  def findByName(firstName: String, lastName: String): Future[Seq[User]] = {
    run(users.filter(_.firstName == lift(firstName)).filter(_.lastName == lift(lastName)))
  }

  def findByUserId(userId: String): Future[Option[User]] = {
    run(users.filter(_.userId == lift(userId))).map(_.headOption)
  }

}