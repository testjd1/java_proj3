package chapter03.EX04;

public class RelationOperator {

	public static void main(String[] args) {
/*
		//크기 비교 : True, False로 값을 변환

		System.out.println(5<2);			// false
		System.out.println(5>2);			// true
		System.out.println(5<5);			// false
		System.out.println(5<=5);			// true
		System.out.println(5>=5);			// true
*/		

/*		
		//등가 비교
		// == : 같을 때 (true), != : 같지 않을 때 (true)
		  
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==c);
*/		
		// 참조 자료형일 때, 등가비교 ( 객체의 참조 주소를 비교 )
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1==str2);
		
		System.out.println(str1);			// 객체의 번지수를 출력
		System.out.println(str2);			
		
		
	}

}
