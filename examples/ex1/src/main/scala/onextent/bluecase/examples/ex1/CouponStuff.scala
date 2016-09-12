package onextent.bluecase.examples.ex1

import spray.json._

/**
   generated by aglio https://github.com/danielgtaylor/aglio with theme bluecase https://github.com/navicore/aglio-theme-bluecase
   with command:
       aglio -i ../../test/example.md -t bluecase -o src/main/scala/onextent/bluecase/examples/ex1/CouponStuff.scala --theme-super-class CouponStuff --theme-collection-type List --theme-doubles 
*/

sealed abstract class CouponStuff

case class CouponBase(percent_off:Int, redeem_by:Int) extends CouponStuff

// json support

object CouponBaseJsonProtocol extends DefaultJsonProtocol {
  implicit val couponBaseFormat = jsonFormat2(CouponBase)
} // CouponBase

