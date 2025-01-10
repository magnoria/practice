package practice1;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String 제목1 = null;   String 내용1 = null;   String 작성자1 = null;
		String 제목2 = null;   String 내용2 = null;   String 작성자2 = null;
		String 제목3 = null;	  String 내용3 = null; 	String 작성자3 = null;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== 게시판 ===");
			System.out.println("1.입력 2.출력 3.삭제 4.수정"); int choose = scan.nextInt();
			
			if (choose == 1) {
				System.out.println("입력을선택하셨습니다.");
				System.out.print("제목:"); String subject = scan.next();
				System.out.print("내용:"); String content = scan.next();
				System.out.print("작성자:"); String writer = scan.next();
				
				if (제목1 == null) {
					제목1 = subject;
					내용1 = content;
					작성자1 = writer;
				}else if (제목2 == null) {
					제목2 = subject;
					내용2 = content;
					작성자2 = writer;
				}else if (제목3 == null) {
					제목3 = subject;
					내용3 = content;
					작성자3 = writer;
				}else {
					System.out.println("더이상 입력할수 없습니다.");
				}
				
				
			}else if (choose == 2) {
				System.out.println("출력을 선택하셨습니다.");
				System.out.println(제목1 + 내용1 + 작성자1);
				System.out.println(제목2 + 내용2 + 작성자2 );
				System.out.println(제목3 + 내용3 + 작성자3 );
		
				
				
			}else if (choose == 3) {
				System.out.println("삭제를 선택하셨습니다.");
					System.out.println("삭제할 작성자 번호"); int choice = scan.nextInt();
					
				
					if (choice == 1) {
						제목1 = null; 내용1 = null; 작성자1 = null;
						
						
					} else if (choice == 2) {
						제목2 = null; 내용2 = null; 작성자2 = null;
					} else if (choice == 3) {
						제목3 = null; 내용3 = null; 작성자3 = null;
					}
					
			}else if (choose == 4) {
				System.out.println("수정을 선택하셨습니다.");
				System.out.println("수정할 작성자 입력"); String choice1 = scan.next();
				System.out.println("수정할 제목 입력"); String choice2 = scan.next();
				System.out.println("수정할 내용 입력"); String choice3 = scan.next();
					if ( choice1 == 작성자1) {
							작성자1 = choice1;
							내용1 = choice2;
							제목1 = choice3;
					}else if (choice1 == 작성자2) {
						작성자2 = choice1;
						내용2 = choice2;
						제목2 = choice3;
					}else if (choice1 == 작성자3) {
						작성자3 = choice1;
						내용3 = choice2;
						제목3 = choice3;
					}
				
			}
			
			
			
			
			
		}// w end
	}

}
