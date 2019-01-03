package 黄青林17031110123;
class Employee{
	protected String name;
	protected int age;
	protected double salary=500;
	public double getSalary() {
		return this.salary;
	}
}
class Manager extends Employee{
	public double getSalary() {
		return this.salary*=2.0;
	}	
}
class Worker extends Employee{
	public double getSalary() {
		return this.salary*=1.5;
	}
}
public class 第四章实训3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee test=new Employee();
		System.out.println("这个员工的salary为："+test.getSalary());
		test=new Manager();
		System.out.println("这个经理的salary为："+test.getSalary());
		test=new Worker();
		System.out.println("这个工人的salary为："+test.getSalary());
	}
}
