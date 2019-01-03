package 黄青林17031110123;
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
public class 第六章实训3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myinteger int1=new Myinteger(5);
		System.out.println("这个值是："+int1.getValue()+"\t该值是否是偶数"+int1.isEven()+"\t\t该值是否是奇数"+int1.isOdd()+"\t\t是否是素数"+int1.isPrime());
		
		System.out.println("这个值是：6\t该值是否是偶数"+int1.isEven(6)+"\t\t该值是否是奇数"+int1.isOdd(6)+"\t\t是否是素数"+int1.isPrime(6));
	}
}
