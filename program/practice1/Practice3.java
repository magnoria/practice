package practice1;

import java.util.Scanner;



public class Practice3 {

	public static void main(String[] args) {
			String writer1 = null; String content1 = null; String title1 = null;
			String writer2 = null; String content2 = null; String title2 = null;
			String writer3 = null; String content3 = null; String title3 = null;
			
			
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				System.out.println("===== 출력화면 =====");
				System.out.print("1. 입력 2. 출력"); int choice = scan.nextInt();
				
				if (choice == 1) {
					System.out.println("입력을 선택했습니다.");
						System.out.println("제목:"); String title = scan.next();
						System.out.println("내용:"); String content = scan.next();
						System.out.println("작성자:"); String writer = scan.next();
							
					
					if ( title1 == null) {
						title1 = title; content1 = content; writer1 = writer;
						
					}else if (title2 == null) {
						title2 = title; content2 = content; writer2 = writer;
					}else if (title3 == null) {
						title3 = title; content3 = content; writer3 = writer;
					}else {
						System.out.println("더이상 저장할수 없습니다.");
					}
					
					
					
					
				}else if (choice == 2) {
					System.out.println("출력을 선택하셨습니다.");
					
					if ( writer1 != null) {
						System.out.println(title1 + content1 + writer1);
					}
					if (writer2 != null) {
						System.out.println(title2 + content2 + writer2);
					}
					if (writer3 != null) {
						System.out.println(title3+ content3 + writer3);
					}
					
				}//if end
				
				
				// 2025 01 10 9 36분 완
				
				
				
			}// while end
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main end

}//class end
