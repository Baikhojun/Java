import java.util.Scanner;
import java.util.*;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = (num >0) ? "�����" : "����� �ƴϴ�";
		System.out.println(num + " �� " + result);
		
		if(num > 0)
		{
			System.out.println(num + " �� �����" );
		}else
		{
			System.out.println(num + " �� ����� �ƴϴ�");
		}
	}
}
