package 黄青林17031110123;
public class 第四章实训1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student test=new Student();
		//System.out.println("姓名："+test.name+"\n年级："+test.status+"\n地址："+test.address+"\n手机号："+test.phoneNumber+"\n电子邮件："+test.E_mail);
		System.out.println(test.E_mail);
		test.E_mail="15936075483@163.com";
		System.out.println(test.E_mail);
	}
}
class Person{
	protected String name="黄青林";
	protected String address="河南省周口市淮阳县四通镇";
	protected String phoneNumber="17716283195";
	protected String E_mail="2245411836@qq.com";
	@Override
	public String toString() {
		return "person "+name;
	}
}
class Student extends Person{
	public static final String FRESHMAN="大一";
	public static final String SOPHOMORE="大二";
	public static final String JUNIOR="大三";
	public static final String SENIOR="大四";
	protected String status=SOPHOMORE;
	@Override
	public String toString(){
		return "student "+name;
	}
}
class Employee extends Person{
	protected String office="209";
	protected int salary=20000;
	protected String dateHired="2018年11月16日";
	@Override
	public String toString(){
		return "Employee "+name;
	}
}
class Faculty extends Employee{
	public static char LECTURER = 'A';
	public static char ASSISTANT_PROFESSOR = 'B';
	public static char ASSOCTANT_PROFESSOR = 'C';
	public static char PROFESSOR = 'D';
	protected String officeHours="周一到周五";
	protected char rank=ASSISTANT_PROFESSOR;
	@Override
	public String toString(){
		return "Faculty "+name;
	}
}
class Staff extends Employee{
	protected String title="第四章实训一";
	@Override
	public String toString(){
		return "Staff "+name;
	}
}