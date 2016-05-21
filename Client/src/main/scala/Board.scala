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
        
        var i = 32
        var swap = false
        var count = 1
        while(i > 0){
            
            var j1 = new JPanel
            var j2 = new JPanel
            
            if(!swap){
                
                j1.setBackground(Color.BLACK)
                j2.setBackground(Color.WHITE)
                this.add(j1)
                this.add(j2)
            }
            else{
                
                j1.setBackground(Color.WHITE)
                j2.setBackground(Color.BLACK)
                this.add(j1)
                this.add(j2)
                
            }
            
            if(count == 4){
                swap = !swap
                count = 1
            }
            
            i = i - 1
            
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