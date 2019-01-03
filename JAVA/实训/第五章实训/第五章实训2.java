package 黄青林17031110123;
public class 第五章实训2 {
	public static void main(String[] args) {
		Cicle obj1=new Cicle();
		Cicle obj2=new Cicle();
		obj1.setRadius(12);
		obj2.setRadius(12);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
		System.out.println(obj1.getArea());
	}
}
class Cicle implements Comparable<Cicle>{
	private double radius;
	public Cicle() {
		this(1.0);
	}
	public Cicle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	@Override
	public String toString() {
		return "圆的半径="+radius;
	}
	@Override
	public int compareTo(Cicle o) {
		if (this.getArea()>o.getArea())
			return 1;
		else if(this.getArea()<o.getArea())
			return -1;
		else 
			return 0;
	}
	public boolean equals(Object obj) {
		return this.getArea()==((Cicle)obj).getArea();
	}
}