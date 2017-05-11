package test.auto;

public class Car {
	// public 은 접근 지정자
	// field 와 method를 임의로 접근지정 할 수가 있어.
	
	// 일반 멤버필드 정의하기 (클래스 안의 멤버필드는 지역변수)
	public String brand = "Audi";
	
	// 일반 멤버 메소드 정의하기
	public void drive(){
		System.out.println("달려요~!");
	}
	
}
