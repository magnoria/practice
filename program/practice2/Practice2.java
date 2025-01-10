package practice2;


import java.util.Scanner;

//생성자 개념이 중요해서 한번더 정확히

/*
실습2 : 게시판 프로그램
	- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) , 클래스/객체 -> 클래스/객체의 개념 조금 명확히 정리하기
	- 제목 , 내용 , 작성자 를 입력받아서 저장/출력 구현
	- 게시물 클래스 설계 하기.
	- 게시물 3개 저장 하기 , 게시물1개당 객체 1개 필요 , 객체1개당 3개의 멤버변수를 갖는다.
	
	* 1단계 1~ 5번따라치기
	* 2단계 10분정도 고민후 그후 횟수적기
	* 9시 전까지 이메일로 제출
	* 
	* 
	2025 01 10 10시 12분
							10시 29분 완
	
	
	
*/


public class Practice2 {
	
	public static void main(String[] args) {
		
		Practice2Dto list1 = new Practice2Dto();
		Practice2Dto list2 = new Practice2Dto();
		Practice2Dto list3 = new Practice2Dto();
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("===== 선택화면 =====");			
			System.out.println("1.입력 2.출력"); int choose = scan.nextInt();
			
			if (choose == 1) {
				System.out.println("입력을 선택하셨습니다.");
					System.out.print("제목:"); String subject = scan.next();
					System.out.print("내용:"); String content = scan.next();
					System.out.print("작성자"); String writer = scan.next();
					
					if (list1.subject == null) {// 여기서 아직 익숙하지 않은듯 참조하는데 바로바로 안나옴
						list1.subject = subject;
						list1.content = content;
						list1.writer = writer;
						
					}else if (list2.subject == null) {
						list2.subject = subject;
						list2.content = content;
						list2.writer = writer;
					}else if (list3.subject == null) {
						list3.subject = subject;
						list3.content = content;
						list3.writer = writer;
						
					}else {
						System.out.println("더이상 입력할 수 없습니다.");
					}
				
				
				
			}else if (choose == 2) {
				System.out.println("출력을 선택하셨습니다.");
				if (list1.subject != null) {
					System.out.println(">> 제목:" + list1.subject + "내용:" + list1.content + "작성자:" + list1.writer);
				}
				if (list2.subject != null) {
					System.out.println(">> 제목:" + list2.subject + "내용:" + list2.content + "작성자" + list2.writer);
				}
				if (list3.subject != null) {
					System.out.println(">> 제목:" + list3.subject + "내용:" + list3.content + "작성자" + list3.writer);
				}
				
			}//if end
			
			
			
			
			
		}// w end
		
		
		
		
		
		
		
		
		
		
		
	}// main end

}// class end







