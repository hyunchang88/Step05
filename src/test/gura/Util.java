package test.gura;

public class Util {
	// static 멤버 필드
	public static int version = 1; // Utill.version 으로 접근 (Static 이니까 클래스명.필드명)
	
	// static 멤버 메소드
	public static void sendMessage(){ // Utill.sendMessage 로 접근 (Static 이니까 클래스명.메소드명)
		System.out.println("메세지를 전송합니다.");
	}
}
