package ex0804.array.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	
	private Student stArr [] = new Student [5];
	
	// 배열방에서 저장된 객체의 개수를 저장하는 변수
	public static int count; //초기값 : 0
	
	
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	
	// init : ~~을 초기화 한다.
	public void init(String [][] data) {
	
		
		for (int i = 0 ; i < data.length ; i++) {
			stArr[ count++ ] = this.create(data[i]);
		}
		
	}
	
	
	/**
	 *  Student객체를 생성해서 리턴해주는 메소드 작성
	 * */
	
	private Student create( String [] row ){ // {"희정", "20', "대구"}
		Student st = new Student();
		st.setName(row[0]);
		st.setAge(Integer.parseInt(row[1]));
		st.setAddr(row[2]);
		
		
		return st;
	}
	 
	
	

	 /**
	   학생의 정보 등록하기 
	    : 학생의 이름이 중복이면 등록할 수 없다.
	    : 배열의 경계를 벗어나면 더이상 추가할수 없습니다.
	    : 이외에는 추가를 한다.
	    
	    @return : int형
	    		  0이면 중복이다. -1이면 더이상 등록불가, 1이면 성공이다.
	  **/
	
	public int insert(Student student) {
		
		// 배열의 경계를 벗어나면 더이상 추가할수 없습니다.
		if ( count == stArr.length) return -1;
		
		//학생의 이름이 중복이면 등록할 수 없다.
		Student searchedStudent = this.selectByName(student.getName());
		if(searchedStudent != null) return 0;
		
		stArr[count++] = student; //카운트와 랭스가 같아질때 스탑
		
		return 1; // 성공
	}
	 
	 
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	
	public Student[] selectAll() {
		
		return stArr;
		}
	
	 
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소 = student를 리턴하고
	 *     없으면 null 리턴
	 * */
	
	public Student selectByName(String name) { //String name은 객체 이기 때문에 주소값이 들어 있음
		// 기능 작성
		for(int i = 0 ; i < count ; i++) {
			if(stArr[i].getName().equals(name)) { // 문자열 == 은 주소비교 , String 비교할때는 equals()
				// 찾았다. 같다.
				return stArr[i];
			}
		}
		//못찾았다
		return null;
	}
	 
	
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기  //조건 : 이름
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 > false 리턴
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   true 리턴
	 *   @param : Student
	 *   @return : boolean > 경우의 수가 많을것 같지 않음
	 *   			true 이면 수정성공, false 수정실패
	 * */
	public boolean update(Student student){
		
		Student searchSt = this.selectByName(student.getName());
		if(searchSt == null) return false;
		
		//수정하자
		searchSt.setAge(student.getAge());
		searchSt.setAddr(student.getAddr());
		
		return true;
	}
	 

}

