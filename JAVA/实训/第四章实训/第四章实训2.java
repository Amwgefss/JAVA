package ������17031110123;
class Car{
	public void brake(){
	}
	public void brake(String path){
		System.out.println("����"+path+"��ɲ��");
	}
}
class SUV extends Car{
	public void brake(){
		System.out.println("����SUV��ɲ��");
	}
}
class Truck extends Car{
	public void brake(){
		System.out.println("����ɲ��");
	}

}
public class ������ʵѵ�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Truck();
		String path="��·";
		System.out.println("���õķ���Ϊ");
		c.brake();
		c.brake(path);
		c=new SUV();
		System.out.println("���÷���Ϊ");
		c.brake();
	}
}
