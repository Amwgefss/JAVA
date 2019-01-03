package 黄青林17031110123;
abstract class Fish{
	public Fish(){
	}
	public void Swing(){
		System.out.println("我会游动");
	}
	public abstract void Kind();
}
abstract class test2 extends Fish{
	public void Kind() {
		System.out.println("我是测试类");
	}
}
abstract class freshWaterFish extends test2{
	public void Kind(){
		System.out.println("我是淡水鱼");
	}
	public abstract void Kind1();
}
class carp extends freshWaterFish{
	public void Kind1(){
		System.out.println("我是鲤鱼");
	}
}
class weever extends freshWaterFish{
	public void Kind1(){
		System.out.println("我是鲈鱼");
	}
}
class catfish extends freshWaterFish{
	public void Kind1(){
		System.out.println("我是鲶鱼");
	}
}
class tropicalFish extends Fish{
    public tropicalFish(){ }
	public void Kind(){
		System.out.println("我是热带鱼");
	}
}
public class 第五章实训1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish test1=new tropicalFish();
		test1.Kind();
		test1=new carp();
		test1.Kind();
		freshWaterFish test3=new carp();
		test3.Kind();
		test3=new catfish();
		test3.Kind();
	}	
}
