package ex0811.board;

public class MainApp {
	
	//1) 필드를 이용한 다형성
	Board board; // Free or Qa or Upload
	BoardService boardService;  // FreeBoardServiceImp1 or QaBoardServiceImp1 or UploadBoardServiceImp1
	
	public MainApp() {//객체가 생성되는 시점에 맴버필드 초기화 해야함
		
		board = new FreeBoard(1, "제목1", "작성자1", "내용1");
		boardService = new FreeBoardServiceImp();
		test(boardService, board);
		/////////////////////////////
		
		board = new QaBoard(2, "제목2", "작성자2", "내용2", false);
		boardService = new QaBoardServiceImpl();
		test(boardService, board);
		/////////////////////////////////////////////////
		
		board = new UploadBoard(3, "제목3", "작성자3", "내용3", "test.txt");
		boardService = new UploadBoardImpl();
		test(boardService, board);
		
		
		
		
	}
	
	public void test(BoardService service, Board boar) {//2) 매개변수를 이용한 다형성
		service.insert(board);
		service.update(board);
		service.selsecByNo(5);
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		
		new MainApp();
		
		

	}

}
