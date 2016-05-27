trait Piece{

abstract class ChessPiece
case class King(Location: Int) extends ChessPiece
case class Queen(Location: Int) extends ChessPiece 
case class Rook(Location: Int) extends ChessPiece
case class Bishop(Location: Int) extends ChessPiece
case class Knight(Location: Int) extends ChessPiece
case class Pawn(Location: Int) extends ChessPiece


}