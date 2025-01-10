package ptactice3;


import java.util.ArrayList;
import java.util.Scanner;

/*
실습3 : 게시판 프로그램 - v3
- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체 , 배열    
- 제목 , 내용 , 작성자 를 입력받아서 저장/출력 구현
- 게시물 클래스 설계 하기.
- 게시물 최대 100개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.

* 1단계 1~ 5번따라치기
	* 2단계 10분정도 고민후 그후 횟수적기 1
	* 9시 전까지 이메일로 제출
	* 
	* 
			
			2025 01 10 10시 35분     

*/

public class Practice1 {
	public static void main(String[] args) {
	
		ArrayList<PracticeDto> list = new ArrayList<PracticeDto>(100);// 배열을 사용하는 이유는 저장을 여러개 하기위해서
		// class 로 3개의 변수()를 참조할수 있고 그걸 ArrayList의 list변수에 넣어서 생성자로 100개를 저장할수 있게끔 한다.
		// 기억이 짬봉되서 틀렸습니다..........................
		// 오늘은 여기까지 하겠습니다........ 내일 아침 여기부터 시작하겠습니다
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("=====선택화면=====");
			System.out.print("1.저장 2.출력"); int choose = scan.nextInt();
			
			if (choose == 1) {System.out.println("저장을 선택하셨습니다.");
				
				
				
				
				
			}
			
		}// w end
		
		
		
		
		
		
		
		
		
		
		
	}//main end
	

	
	
	
	
	
	
}//class end
