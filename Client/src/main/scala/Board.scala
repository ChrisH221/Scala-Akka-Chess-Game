import java.awt._
import java.awt.event._
import javax.swing._


class Board extends JFrame with MouseListener {
    
    def setup(){
        
        this.setSize(300, 300)
        this.setResizable(false)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        this.setVisible(true)
        val c = getContentPane
        c.setLayout(new GridLayout(8, 8,1,1))
        
        
        var count = 0
        
        var x = 64
        
        var string = "black"
        while(x > 0){
            
            var square = new JPanel
            
            string match {
                
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
            x = x - 1
        }
        
        
        
    }
    
    
    def mouseClicked(e: MouseEvent) {
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