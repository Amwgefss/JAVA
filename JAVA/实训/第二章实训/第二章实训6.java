import java.util.Scanner;
public class �ڶ���ʵѵ6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		String array[]={"����","ʯͷ","��"};
		System.out.print("������0�� ʯͷ��1������2��\n����������ѡ��");
		while(count!=2){
			String sult="";
			Scanner input=new Scanner(System.in);
			int computerNumber=(int)(Math.random()*3);
			int userNumber=input.nextInt();
			if(Math.abs(userNumber-computerNumber)==1)
				if(userNumber>computerNumber){
					sult="Ӯ";
					count++;
				}
				else
					sult="��";
			else if(Math.abs(userNumber-computerNumber)==2)
				if(userNumber<computerNumber){
					sult="Ӯ";
					count++;
				}
				else
					sult="��";
			else if(Math.abs(userNumber-computerNumber)==0)
				sult="��ƽ��";
			else
				System.out.println("Enter error!");
			System.out.println("�������ѡ����"+array[computerNumber]+"������ѡ����"+array[userNumber]+",��"+sult+"��");
		}
	}
}
