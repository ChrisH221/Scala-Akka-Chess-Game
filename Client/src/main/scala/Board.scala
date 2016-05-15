import java.awt._
import java.awt.event._
import javax.swing._


class ChessBoard extends JFrame with MouseListener {

	def setup(){
	
    this.setSize(300, 300)
    this.setResizable(false)
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    this.setVisible(true)

	val c = getContentPane
    c.setLayout(new GridLayout(8, 8, 1, 1))
	
	
	
	}
	
	


  def mouseClicked(e: MouseEvent) {
  }

  def mouseEntered(e: MouseEvent) {
  }

  def mouseExited(e: MouseEvent) {
  }

  def mousePressed(e: MouseEvent) {
  }

  def mouseReleased(e: MouseEvent) {
  }
}
