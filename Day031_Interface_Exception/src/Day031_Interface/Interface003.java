package Day031_Interface;
interface Board{ public void exec(); }
class BoardInsert implements Board{
	public void exec() {System.out.println("게시판 삽입기능입니다.");}
}
class BoardDelete implements Board{
	public void exec() {System.out.println("게시판 삭제기능입니다.");}
}
class BoardSelect implements Board{
	public void exec() {System.out.println("게시판 선택기능입니다.");}
}
class BoardUpdate implements Board{
	public void exec() {System.out.println("게시판 수정기능입니다.");}
}
public class Interface003 {
	public static void main(String[] args) {
		Board board = null; //new를 못하니까 null로 잡는 것
		board = new BoardInsert(); board.exec();
		board = new BoardDelete(); board.exec();
		board = new BoardSelect(); board.exec();
		board = new BoardUpdate(); board.exec();
	}
}
 