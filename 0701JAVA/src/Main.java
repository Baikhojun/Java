
public class Main {

	public static void main(String[] args) {
		//new Main().testMethod();
		//new Main().testMethod1();
		int a = new Main().testCalculater(4, 5,'*');
		System.out.println(a);
	}
	 /*/
	  *  Ŭ���� �ٷ� �ؿ� �����ϴ� ������
	  *  ������� field ��� ǥ���Ѵ�
	  *  �̷��� ������ ������ Heap �޸� ������ ����.
	  *  Heap �޸𸮿� ��� �������� JVM�� ���ϴ� �⺻������
	  *  �ʱ�ȭ�� �̷������.
	  */
	int num;
	
	public void testMethod(){
		/*
		 * �޼ҵ� ���ο� ����� ������ ����������� �θ���
		 * ���� ������ Stack �޸� ������ ����Ǹ� 
		 * �޼ҵ� ȣ�� �ÿ� �����ǰ�,�޼ҵ尡 ����Ǹ�
		 * �Բ� �������.
		 */
		 int num1 = 100;
		 
		 System.out.println("�������� num :"+ num);
		 System.out.println("�������� num1 :"+ num1);
	}
	
	public void testMethod1(){
		int num = 100;
		System.out.println("�������� num :"+ num);
	}
	
    
	 /*
	  * Ŭ��������
	  * - ����ϴ� ��ɿ� ���� �ҽ� �ڵ���� ����ü
	  * 
	  * 3. �޼ҵ� 
	  * - Ư�� ��ɿ� ���ؼ� ������ �ҽ� �ڵ�
	  * - ����
	  * - ���ؿ� �޼ҵ�
	  * - main();
	  * - ��� ������ �޼ҵ�
	  * - ������
	  */
	
	
	
	public void testVariable1(){
		// �ڹ��� ������ �⺻ �ڷ���
		// �� �ڷ��� ( true / false(��/����))
		
		boolean result1 = true;
		
		System.out.println(result1);

		// ���� �� �� �ڷ���
		char result2 = 'A';
		
		System.out.println(result2);
		
		// ���� �ڷ���
		
		byte resultByte = 10;
		short resultShort = 30;
		int resultInt = 500;
		long resultLong = 1000l;
		
		// �Ǽ� �ڷ���
		float resultFloat = 3.14f;
		double resultDouble = 3.14;
		
		// ���� �ڷ��� 
		
		String str = "��ο�!!";
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
		 * && : and : �׸���
		 * || : or : ~�Ǵ� ~ �ų�
		 * 
		 * (���� && ���� ) �Ѵٸ¾ƾ��Ѵ�
		 * (����) || (����) ���� �ϳ�
		 * (����) && (����) �տ����� ������ �ڿ��͵� ���� 
		 * (����) || (����) �տ����� Ʋ���� �ڿ����� ���� 
		 * 
		 *
		 *
		 */
		
		
	}

}
