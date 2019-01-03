package 黄青林17031110123;
import java.util.*;
public class 第七章实训2 {
	public static void main(String [] args){
		int [] data =new int[100];
		for(int i=0;i<100;i++)
			data[i]=(int)(Math.random()*10000);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index:");
		int index = input.nextInt();
		try{
			System.out.println("The element is "+data[index]);
		}
		catch (Exception ex){
			System.out.print("Index out of bound");
		}
	}
}
