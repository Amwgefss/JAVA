import java.util.Scanner;
public class �ڶ���ʵѵ5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]={"����","ʯͷ","��"};
		String sult="";
		Scanner input=new Scanner(System.in);
		int computerNumber=(int)(Math.random()*3);
		System.out.print("������0�� ʯͷ��1������2��\n����������ѡ��");
		int userNumber=input.nextInt();
		if(Math.abs(userNumber-computerNumber)==1)
			if(userNumber>computerNumber)
				sult="Ӯ";
			else
				sult="��";
		else if(Math.abs(userNumber-computerNumber)==2)
			if(userNumber<computerNumber)
				sult="Ӯ";
			else
				sult="��";
		else if(Math.abs(userNumber-computerNumber)==0)
				sult="��ƽ��";
		else
			System.out.println("Enter error!");
		System.out.println("�������ѡ����"+array[computerNumber]+"������ѡ����"+array[userNumber]+",��"+sult+"��");

	}
}
