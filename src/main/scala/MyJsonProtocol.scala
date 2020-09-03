import spray.json._

case class MyObject  (
                      name: String
                     )


object MyJsonProtocol extends DefaultJsonProtocol {
  implicit val format = jsonFormat1(MyObject)
}