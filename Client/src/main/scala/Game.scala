import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props


class actor extends Actor {
  def receive = {
    case "hello" => println(s"hello ")
    case _       => println(s"'huh?'")
  }
}

object Main extends App {
// val system = ActorSystem("System")
  
  //val Actor = system.actorOf(Props[actor], name = "helloactor")

  val board = new ChessBoard()
  board.setup

}