package 黄青林17031110123;
class Car{
	public void brake(){
	}
	public void brake(String path){
		System.out.println("车在"+path+"上刹车");
	}
}
class SUV extends Car{
	public void brake(){
		System.out.println("正在SUV上刹车");
	}
}
class Truck extends Car{
	public void brake(){
		System.out.println("卡车刹车");
	}

}
public class 第四章实训二 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Truck();
		String path="公路";
		System.out.println("调用的方法为");
		c.brake();
		c.brake(path);
		c=new SUV();
		System.out.println("调用方法为");
		c.brake();
	}
}
