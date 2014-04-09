package models

import anorm.SqlParser._
import anorm.~

/**
 * User: Diego Fabbro
 * Date: 24/12/12
 * Time: 10.45
 */
case class Address(id:Long, street:String, city:String, cap:Int, primary:Boolean) {

}

object Address {
  val address = {
    get[Long]("id") ~
      get[String]("street") ~
      get[String]("city") ~
      get[Int]("cap") ~
      get[Boolean]("primary") map {
      case id~street~city~cap~primary => Address(id, street, city, cap, primary)
    }
  }
}
