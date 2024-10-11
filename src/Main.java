import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	static {
		lastArticleId = 0;
		
		articles = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		
		Scanner sc = new Scanner(System.in);
		
		int lastId = 0;
		
		
		
		while (true) {
			System.out.printf("명령어) ");
			
			String cmd = sc.nextLine();

			List<Article> articles;
			
			articles = new ArrayList<>();
			
			
			if (cmd.equals("exit")) {
				break;
			}
			
			if (cmd.equals("article write")) {
				System.out.printf("제목: ");
				String title = sc.nextLine();
				System.out.printf("내용: ");
				String body = sc.nextLine();
				
				lastId++;
				
				articles.add(int id, String title, String body, Util regDate, Util updateDate)
				
				System.out.printf("%d번 게시물이 작성되었습니다.\n");
				
			} else if (cmd.equals("article list")) {
				
				String num = cmd.substring("article list".length());
				
				if (num.length() == 0) {
					System.out.println("번호	| 	 제목	|	작성일");
					
					for (int i = 0; i >=lastId; i++) {
						
						
						
						System.out.printf("%d	| 	 %s	|	%s");
					}
					
						
					
				} 
				
				
			} else if (cmd.startsWith("article detail ")) {
				
				try {
					String id = cmd.split(" ");
				} catch (Exception e) {
					return null;
				}
				
				if (id == null) {
					System.out.println("잘못된 명령어 입니다.");
				}
				
				int id = Integer.parseInt(id);
				
				System.out.printf("번호 : %d");
				System.out.printf("작성일 : %s");
				System.out.printf("수정일 : %s");
				System.out.printf("제목 : %s");
				System.out.printf("내용 : %s");
				
				
			} else if (cmd.startsWith("article modify ")) {
				
				try {
					String id = cmd.split(" ");
				} catch (Exception e) {
					return null;
				} return id;
				
				if (id == null) {
					System.out.println("잘못된 명령어 입니다.");
				}
				
				if (Article article : article) {
					System.out.println("제목 :");
					
					System.out.println("내용 :");
					
					System.out.println("%d번 게시물이 수정되었습니다.");
				}
				
				
				
			} else if (cmd.startsWith("article delete ")) {
				try {
					String id = cmd.split(" ");
				} catch (Exception e) {
					return null;
				}
				
				if (id == null) {
					System.out.println("잘못된 명령어 입니다.");
				}
				
				if (Article article : article) {
					
					
				}
				
				
			} else {
				System.out.println("존재하지 않는 명령어입니다.");
				continue;
			}
			
			
			
		}
		
		
	}

}
