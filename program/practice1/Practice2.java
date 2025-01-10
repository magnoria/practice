package practice1;


	import java.util.Scanner;


	/*
	실습1 : 게시판 프로그램
		- 문법 : 변수 , 입출력함수 , 연산자 , 제어문(조건문/반복문) 
		- 제목 , 내용 , 작성자 를 입력받아서 저장/출력/삭제/수정 구현
		- 게시물 3개 저장 하기 , 게시물1개당 제목/내용/작성자 저장소(변수) 3개 필요 , 게시물3 --> 변수 9개 필요.
		* 1단계 1~ 5번따라치기
		* 2단계 10분정도 고민후 그후 횟수적기 1번
		* 9시 전까지 이메일로 제출
		
		
	*/


	public class Practice2 {
			public static void main(String[] args) {
								
				String subject1 = null; String content1 = null; String writer1 = null;
				String subject2 = null; String content2 = null; String writer2 = null;
				String subject3 = null; String content3 = null; String writer3 = null;
				
				Scanner scan = new Scanner(System.in);
				
				while(true) {
					System.out.println("===== 안내페이지 =====");
					System.out.print("1.저장 2. 출력"); int choose = scan.nextInt();
				
					if (1 == choose) {
						System.out.println("저장을 선택하셨습니다.");
							System.out.println("제목:"); String subject = scan.next();
							System.out.println("내용:"); String content = scan.next();
							System.out.println("작성자:"); String writer = scan.next();
							
							if (subject1 == null) {
								subject1 = subject;
								content1 = content;
								writer1 = writer;
							}else if (subject2 == null) {
								subject2 = subject;
								content2 = content;
								writer2 = writer;
							}else if (subject3 == null) {
								subject3 = subject;
								content3 = content;
								writer3 = writer3;
							}else {
								System.out.println("더이상 저장할 수 없습니다.");
							}
						
					}else if (2== choose) {
						if ( subject1 != null) {
							System.out.println( subject1 + content1 + writer1);
							System.out.println( subject2 + content2 + writer2);
							System.out.println(subject3 + content3 + writer3);
						}
						
						
					}// if end
					
					
					
					
					
					
					
					
				}//w end
				
				
						
				
				
				
				
				
				
				
				
				
				
			}// main end
		

	}// class end

	
	
	
	


