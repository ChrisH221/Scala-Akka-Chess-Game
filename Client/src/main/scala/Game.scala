

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props


class actor extends Actor {
  def receive = {
    case "hello" => println(s"hello ")
    case _       => println(s"'huh?'")
  }
}

class Game{

  val board = new Board()
  board.setup

  

}

object Main extends App {
// val system = ActorSystem("System")
  
  //val Actor = system.actorOf(Props[actor], name = "helloactor")

 val g= new Game

}