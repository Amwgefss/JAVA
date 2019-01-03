package 黄青林17031110123;
import java.util.*;
import java.io.*;
public class 第七章实训5{
	public static void main(String [] args)throws Exception{
		File file = new File("Exercise7_5.txt");
		if(!file.exists()){
			try(PrintWriter output = new PrintWriter(file);){
				for(int i=1;i<=100;i++){
					output.print((int)(Math.random()*100)+" ");
				}
			}
		}
		try(Scanner input = new Scanner(file);){
			int [] num=new int[100];
			for(int i=0;i<100;i++)
				num[i]=input.nextInt();
			Arrays.sort(num);
			for(int i=0;i<100;i++) {
				System.out.printf("%4d",num[i]);
				if((i+1)%10==0)
					System.out.println("");
			}
		}
	}
}
	