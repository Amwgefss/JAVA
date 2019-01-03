package 黄青林17031110123;
import java.util.*;
import java.io.*;
public class 第七章实训4 {
	public static void main(String [] args)throws Exception{
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String filename = consoleInput.nextLine();
		try(Scanner input = new Scanner(new File(filename));){
			double sum=0;
			int i=0;
			while(input.hasNext()){
				sum+=input.nextDouble();
				i++;
			}
			System.out.println("Total is " + sum);
			System.out.println("Average is " + sum/i);
		}
	}
}
