package text;
import java.util.Scanner;
public class 第三章实训4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入社保账号：");
		String ssn=input.next();
		boolean result=ssn.matches("\\d{3}-\\d{2}-\\d{4}");
		if(result)
			System.out.println(ssn+"合法");
		else
			System.out.println(ssn+"不合法");
	}
}
