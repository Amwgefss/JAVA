package 黄青林17031110123;
import java.util.Scanner;
public class 第七章实训1 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		boolean done = false;
		int num1=0;
		int num2=0;
		System.out.print("Enter two integers:");
		while(!done){
			try{
				num1=input.nextInt();
				num2=input.nextInt();
				done = true;
			}
			catch (Exception ex){
				ex.printStackTrace();
				System.out.print("");
				input.nextLine();
			}
		}
		System.out.println("Sum is "+ (num1+num2));
	}
}
