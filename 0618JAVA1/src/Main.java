import java.util.Scanner;
import java.util.*;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String result = (num >0) ? "양수다" : "양수가 아니다";
		System.out.println(num + " 은 " + result);
		
		if(num > 0)
		{
			System.out.println(num + " 은 양수다" );
		}else
		{
			System.out.println(num + " 은 양수가 아니다");
		}
	}
}
