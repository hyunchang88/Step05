package test.main;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car type 객체 2개 생성해서 참조값을 각각 지역변수에 담기
		Car c1 = new Car();
		Car c2 = new Car();
		// c2 에 담겨있는 참조값을 이용해서 필드의 내용 수정하기
		c2.brand="쌍용";
		
		// c1, c2 객체의 필드를 참조해서 값을 복사해주기 
		String a = c1.brand; // Audi
		String b = c2.brand; // 쌍용 9번쨰 line 이 없으면 Audi
		
	}
}
