import java.util.Scanner;
import java.util.Random;
public class 第三章实训3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String sourceString=input.nextLine();
		String password1="";
		int[] password=new int[sourceString.length()];
		char []array=new char[sourceString.length()];
		System.out.print("是否加密？（y/n)：");
		String choose=input.next();
		if("y".equals(choose)) {
			System.out.print("请输入加密密文：");
			password1=input.next();
			array=encryption.randomEncryption(sourceString,password);
			System.out.print("加密后的密文是：");
			System.out.println(array);
			System.out.print("是否解密？（y/n）：");
			choose=input.next();
		}
		if("y".equals(choose)) {
			System.out.print("请输入密文：");
			String password2=input.next();
			if(password1.equals(password2)) {
				array=encryption.decode(array, password);
				System.out.print("解密后的密文是：");
				System.out.println(array);
			}
		}
	}
}
class encryption{
	public static char[] randomEncryption(String sourceString,int[] password) {
		Random random=new Random(1);
		char [] array=sourceString.toCharArray();			
		for(int i=0;i<array.length;i++) {
			password[i]=random.nextInt(1000);
			array[i]-=password[i];
		}
		return array;
	}
	public static char[] decode(char[] array,int[] password) {
		Random random=new Random(1);		
		for(int i=0;i<array.length;i++) {
			password[i]=random.nextInt(1000);
			array[i]+=password[i];
		}
		return array;
	}
}
