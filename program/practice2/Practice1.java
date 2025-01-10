package practice2;


import java.util.Scanner;

/*
실습2 : 게시판 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체 
	- 제목 , 내용 , 작성자 를 입력받아서 저장/출력 구현
	- 게시물 클래스 설계 하기.
	- 게시물 3개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.
	
	* 1단계 1~ 5번따라치기
	* 2단계 10분정도 고민후 그후 횟수적기 1번
	* 9시 전까지 이메일로 제출
	2025 01 10 9시 50분
	
	
	
*/

public class Practice1 {
	public static void main(String[] args) {
				PracticeDto dto1 = new PracticeDto(); // 생성자 참조 개념이 보고 기억났음
				PracticeDto dto2 = new PracticeDto();
				PracticeDto dto3 = new PracticeDto();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.println("=====출력화면 ======");
	
		System.out.print("1. 저장 2. 출력"); int choose = scan.nextInt();
			if (choose == 1) {
				System.out.println("저장을 선택하셨습니다.");
				System.out.print("제목:"); String title = scan.next();
				System.out.print("내용:"); String content = scan.next();
				System.out.print("작성자:"); String writer = scan.next();
					if (dto1.title == null) {
						dto1.title = title;
						dto1.content = content;
						dto1.writer = writer;
						
						
					}else if (dto2.title == null) {
						dto2.title = title;
						dto2.content = content;
						dto2.writer = writer;
					}else if (dto3.title == null) {
						dto3.title = title;
						dto3.content = content;
						dto3.writer = writer;
					}else {
						System.out.println("더이상 저장할 수 없습니다.");
					}
				
				
				
				
			}else if (choose == 2) {
				System.out.println("출력을 선택하셨습니다");
					if (dto1.title != null) {
						System.out.println(">>제목:"+ dto1.title +"내용:"+dto1.content+"작성자:"+dto1.writer);
						
					}// 지금 이거하면서 if로 내려간 이유가 기억이 남 , else if의 경우 첫번째 경우에서 true가 되면 다음 if가 실행이 되지 않지만 
					// 이경우는 true여도 나와서 다른 if도 실행됨, 혹 이 내용이 틀릴경우 말씀해주세요
					if (dto2.title != null) {
						System.out.println(">>제목:"+ dto2.title +"내용:" + dto2.content+"작성자"+ dto2.writer);
					}	
					if (dto3.title != null) {
						System.out.println(">>제목" + dto3.title + "내용:" + dto3.content+ "작성자" + dto3.writer);
					}
					
					
					
			}// if end
		
		}// w end
		
		
	}//main end
	

}// class end
