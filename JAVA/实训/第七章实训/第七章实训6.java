package 黄青林17031110123;
import java.util.*;
import java.io.*;
public class 第七章实训6 {
	public static void main(String [] args) throws Exception{
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String filename = consoleInput.nextLine();
		int []lower = new int[26];
		int []upper = new int[26];
		Scanner input = new Scanner(new File(filename));
		while(input.hasNext()){
			String s = input.nextLine();
			for(int i=0;i<s.length();i++){
				char ch =s.charAt(i);
				if(Character.isLetter(ch)){
					if(65<=ch&&ch<=90){
						int index = ch -'A';
						upper[index]++;
					}
					else if(97<=ch&&ch<=122) {
						int index=ch-'a';
						lower[index]++;
					}
				}
			}
		}
		displayCounts(lower,false);
		displayCounts(upper,true);
	}
	public static void displayCounts(int [] counts,boolean isUpper){
		for(int i=0;i<counts.length;i++){
			if(counts[i]!=0){
				if(isUpper){
					System.out.println("字母"+(char)(i+'A')+"出现"+counts[i]+"次");
				}
				else {
					System.out.println("字母"+(char)(i+'a')+"出现"+counts[i]+"次");
				}
			}
		}
	}
}
