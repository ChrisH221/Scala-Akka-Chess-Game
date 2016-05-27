import java.awt._
import java.awt.event._
import javax.swing._
import java.awt.image.BufferedImage

class Board extends JFrame with MouseListener with Piece{

     val whiteList = setupPieces(0, "black")
     val BlackList = setupPieces(48, "white")
	
	/*
	*Setup the board.
	*/
    def setup(){
        
        this.setSize(800, 800)
        this.setResizable(false)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        this.setVisible(true)
        val c = getContentPane
        c.setLayout(new GridLayout(8, 8,1,1))
       // val image = new ImageIcon("\\Users\\Chris\\Desktop\\testP").getImage()		     
		//val bi = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB)		
        var count = 0
        var x = 64//number of squares on a chessboard
		var y = 1
        var string = "white"//Starting colour for a chessboard top right corner 
		
        while(x > 0){
            
           var square = new JButton(y.toString)
           square.addMouseListener(this)
            string match {// Reverse the colour for the next iteration of the loop
                
                case "black" => {
                    square.setBackground(Color.BLACK)
                    string = "white"
                }
                case "white" =>{
                    square.setBackground(Color.WHITE)
                    string = "black"
                }
                
            }
	
            this.add(square)
            count = count + 1
			
            if (count == 8){//Every 8 squares the colour needs to be swapped to ensure the next row of squares is the opposite of the current row
                
                string match {
                    
                    case "black" => {
                        string = "white"
                    }
                    case "white" =>{
                        string = "black"
                    }
                    
                }
                count = 0
                
            }
		    y = y + 1
            x = x - 1
        }
		
	
    }
	
	//def getPieceAtLocation(pos:Int){//
	//val list = whiteList//
	//list foreach{//
  //      _ match {//
            
         //   case Rook.asInstanceOf[Board.this.ChessPiece] =>{if(_.Location = pos) println("a rook")}
            
        //    case Pawn => println("a pawn")
     //  }////
 //   }
	
//	}
	
	def setupPieces(startPos:Int , colour:String):scala.collection.immutable.List[ChessPiece] = {
	
	
     val r = new Rook(startPos + 1)	
     val kn = new Knight(startPos + 2)
	 val b = new Bishop(startPos + 3)
	 var q = new Queen(0)
	 var k = new King(0)
  	 val b2 = new Bishop(startPos + 6)
	 val r2 = new Rook(startPos + 7)
	 val kn2 = new Knight(startPos + 8)
	 val p1 = new Pawn(startPos + 9)	
	 val p2 = new Pawn(startPos + 10)
	 val p3 = new Pawn(startPos + 11)
	 val p4 = new Pawn(startPos + 12)
	 val p5 = new Pawn(startPos + 13)
	 val p6 = new Pawn(startPos + 14)
	 val p7 = new Pawn(startPos + 15)
	 val p8 = new Pawn(startPos + 16)	
	
	 colour match {
                    case "black" => {
                     q = new Queen(startPos + 5)
					 k = new King(startPos + 4)
                    }
                    case "white" =>{
                      q = new Queen(startPos + 4)
					  k = new King(startPos + 5)
                    }
                    
                }
	 
	
	 var Pieces =  scala.collection.immutable.List(r,kn,b,q,k,b2,kn2,r2,p1,p2,p3,p4,p5,p6,p7,p8)
		 
	 println(Pieces)
	 Pieces
	}
    
	
	/*
	*TODO Mouse Events
	*/
    def mouseClicked(e: MouseEvent) {
	val labelReference = e.getSource.asInstanceOf[JButton]
	println(labelReference.getText.toInt)

    }
    
    def mousePressed(e: MouseEvent) {
    }
    
    def mouseReleased(e: MouseEvent) {
    }
    
    def mouseEntered(e: MouseEvent) {
    }
    
    def mouseExited(e: MouseEvent) {
    }
    
    
    
    
}