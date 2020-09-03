import scalaj.http.{Http, HttpResponse}
import spray.json._
import MyJsonProtocol._

object Hello {
  def main(args: Array[String]) = {
    val url = "https://pokeapi.co/api/v2/pokemon/ditto"
    val response: HttpResponse[String] = Http(url).asString
    val myClass = response.body.parseJson.convertTo[MyObject]
    println(myClass.name)
  }

}
