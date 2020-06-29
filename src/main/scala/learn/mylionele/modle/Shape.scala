package learn.mylionele.modle

case class Point(x:Double = 0.0,y:Double = 0.0) {

}

abstract class Shape(){
  def draw(f: String => Unit): Unit = f(s"draw : ${this.toString}")
}


case class Circle(center: Point ,radius: Double) extends Shape

