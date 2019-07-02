
public class Main {

	public static void main(String[] args) {
		//new Main().testMethod();
		//new Main().testMethod1();
		int a = new Main().testCalculater(4, 5,'*');
		System.out.println(a);
	}
	 /*/
	  *  클래스 바로 밑에 선언하는 변수를
	  *  멤버변수 field 라고 표현한다
	  *  이렇게 생성된 변수는 Heap 메모리 영역에 담긴다.
	  *  Heap 메모리에 담긴 변수들을 JVM이 정하는 기본값으로
	  *  초기화가 이루어진다.
	  */
	int num;
	
	public void testMethod(){
		/*
		 * 메소드 내부에 선언된 변수를 지역변수라고 부른다
		 * 지역 변수는 Stack 메모리 영역에 저장되며 
		 * 메소드 호출 시에 생성되고,메소드가 종료되면
		 * 함께 사라진다.
		 */
		 int num1 = 100;
		 
		 System.out.println("전역변수 num :"+ num);
		 System.out.println("지역변수 num1 :"+ num1);
	}
	
	public void testMethod1(){
		int num = 100;
		System.out.println("전역변수 num :"+ num);
	}
	
    
	 /*
	  * 클래스선언
	  * - 사용하는 기능에 대한 소스 코드들의 집학체
	  * 
	  * 3. 메소드 
	  * - 특정 기능에 대해서 구현된 소스 코드
	  * - 종류
	  * - 실해용 메소드
	  * - main();
	  * - 기능 제공용 메소드
	  * - 나머지
	  */
	
	
	
	public void testVariable1(){
		// 자바의 데이터 기본 자료형
		// 논리 자료형 ( true / false(참/거짓))
		
		boolean result1 = true;
		
		System.out.println(result1);

		// 문자 한 개 자료형
		char result2 = 'A';
		
		System.out.println(result2);
		
		// 정수 자료형
		
		byte resultByte = 10;
		short resultShort = 30;
		int resultInt = 500;
		long resultLong = 1000l;
		
		// 실수 자료형
		float resultFloat = 3.14f;
		double resultDouble = 3.14;
		
		// 참조 자료형 
		
		String str = "헬로우!!";
		System.out.println(resultByte);
		System.out.println(resultShort);
		System.out.println(resultInt);
		System.out.println(resultLong);
		System.out.println(resultFloat);
		System.out.println(resultDouble);
		System.out.println(str);
		
	}
	
	public int testCalculater(int num1 ,int num2, char ch ){
		int result=0;
		switch(ch){
		case '+' : result=(num1+num2); break;
		case '-' : result=(num1-num2); break; 
		case '*' : result=(num1*num2); break;
		case '/' : result=(num1/num2); break;
		default: System.out.println("error"); break;
		}
		
		
		
		
		return result;
	}
	
	
	public void testMethod4(){
		/*
		 * && : and : 그리고
		 * || : or : ~또는 ~ 거나
		 * 
		 * (논리값 && 논리값 ) 둘다맞아야한다
		 * (논리값) || (논리값) 둘중 하나
		 * (논리식) && (논리식) 앞에것이 맞으면 뒤에것도 실행 
		 * (논리식) || (논리식) 앞에것이 틀리면 뒤에것을 실행 
		 * 
		 *
		 *
		 */
		
		
	}

}
