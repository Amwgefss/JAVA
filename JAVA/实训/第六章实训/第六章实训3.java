package ������17031110123;
class Myinteger{
	int value=32;
	public Myinteger(int value){
		this.value=value;
	}
	public int getValue(){
		return this.value;
	}
	public boolean isEven(){
		return value%2==0?true:false;
	}
	public boolean isEven(int value){
		return value%2==0?true:false;
	}
	public boolean isOdd(){
		return value%2!=0?true:false;
	}
	public boolean isOdd(int value){
		return value%2!=0?true:false;
	}
	public boolean isPrime(){
		int i;
		for(i=2;i<Math.sqrt(value);i++){
			if(value%i==0){
				break;
			}
		}
		if(i<=Math.sqrt(value)){
			return false;
		}
		return true;
	}
	public boolean isPrime(int value){
		this.value=value;
		return isPrime();
	}
}
public class ������ʵѵ3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinteger int1=new Myinteger(5);
		System.out.println("���ֵ�ǣ�"+int1.getValue()+"\t��ֵ�Ƿ���ż��"+int1.isEven()+"\t\t��ֵ�Ƿ�������"+int1.isOdd()+"\t\t�Ƿ�������"+int1.isPrime());
		
		System.out.println("���ֵ�ǣ�6\t��ֵ�Ƿ���ż��"+int1.isEven(6)+"\t\t��ֵ�Ƿ�������"+int1.isOdd(6)+"\t\t�Ƿ�������"+int1.isPrime(6));
	}
}
