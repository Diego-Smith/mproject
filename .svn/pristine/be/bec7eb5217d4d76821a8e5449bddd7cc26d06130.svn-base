package models

import java.util.Date
import anorm.SqlParser._
import anorm._
import anorm.~


/**
 * 
 * User: Diego Fabbro
 * Date: 24/12/12
 * Time: 10.56
 *
 */
case class Order(id: Long, orderDate: Date, deliveryDate: Date, orderType: OrderType.OrderType) {

}

object Order {
  val order = {
    get[Long]("id") ~
      get[Date]("orderDate") ~
      get[Date]("deliveryDate") ~
      get[String]("orderType")  map {
      case id~orderDate~deliveryDate~orderType => Order(id, orderDate, deliveryDate, OrderType.withName(orderType))
    }
  }
  import play.api.db._
  import play.api.Play.current
  def getOrder(id: Long) : Order = DB.withConnection { implicit c =>
    SQL("select * from order where id = " + id).single(order)
  }

  def createOrder(orderDate: Date, deliveryDate: Date, orderType: OrderType.OrderType) {
    DB.withConnection( implicit c =>
      SQL("insert into order (orderDate, deliveryDate, orderType) values ({orderDate}, {deliveryDate}, {orderType}").
      on('orderDate -> orderDate, 'deliveryDate -> deliveryDate, 'orderType -> orderType).executeInsert()
    )
  }
}

object OrderType extends Enumeration {
  type OrderType = Value
  val Reservation, Carrier, NoSelected = Value
}