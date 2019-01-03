package 黄青林17031110123;
import java.util.Scanner;
import java.io.*;
public class 第七章实训7 {
	public static void main(String [] args)throws Exception{
		Scanner fileInput = new Scanner(new File("hangman.txt"));
		int count =0;
		while(fileInput.hasNext()){
			fileInput.next();
			count++;
		}
		fileInput.close();
		String[] words=new String[count];
		count=0;
		
		fileInput = new Scanner(new File("hangman.txt"));
		while(fileInput.hasNext()){
			words[count++]=fileInput.next();
		}
		char anotherGame;
		Scanner input = new Scanner(System.in);
		do{
			int index = (int)(Math.random()*words.length);
			String hiddenWord = words[index];
			StringBuilder guessedWord = new StringBuilder();
			for(int i=0;i<hiddenWord.length();i++)
				guessedWord.append('*');
			int numberOfCorrectLettersGuessed=0,numberOfMisses=0;
			while(numberOfCorrectLettersGuessed<hiddenWord.length()){
				System.out.print("(Guess) Enter a letter in word "+guessedWord+">");
				String s = input.nextLine();
				char letter = s.charAt(0);
				if(guessedWord.indexOf(letter + "")>=0) {
					System.out.println("\t"+letter + " 已经在单词中了");
				}
				else if(hiddenWord.indexOf(letter)<0){
					System.out.println("\t"+letter+" 不在单词中");
					numberOfMisses++;
				}
				else {
					int k= hiddenWord.indexOf(letter);
					while(k>=0){
						guessedWord.setCharAt(k,letter);
						numberOfCorrectLettersGuessed++;
						k=hiddenWord.indexOf(letter,k+1);
					}
				}
			}
			System.out.println("单词是 "+hiddenWord+".你猜错了"+numberOfMisses+"次");
			System.out.print("继续猜下一个单词吗？Enter y or n> ");
			anotherGame = input.nextLine().charAt(0);
		}
		while(anotherGame=='y');
		
	}
}	