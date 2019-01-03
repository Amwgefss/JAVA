package 啦啦啦;
class sad{
	public static char[] shuzi(){
		char[] array=new char [4];
		for(int i=0;i<4;i++)
			array[i]=(char)('0'+Math.random()*10);
		return array;
	}
	public static char[] chr(){
		char[] array=new char [4];
		for(int i=0;i<4;i++){
			int flag=((int)(Math.random()*10000))%2;
			if(flag==1)
				array[i]=(char)('a'+Math.random()*26);
			if(flag==0)
				array[i]=(char)('A'+Math.random()*26);			
		}
		return array;
	}	
	public static char[] rand(){
		char[] array=new char [4];
		for(int i=0;i<4;i++){
			int flag=((int)(Math.random()*10000))%3;
			if(flag==1)
				array[i]=(char)('a'+Math.random()*26);
			if(flag==0)
				array[i]=(char)('A'+Math.random()*26);
			if(flag==2)
				array[i]=(char)('0'+Math.random()*10);
		}
		return array;	
	}
}
public class 第三张实训5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array1=sad.rand();
		System.out.println(array1);
		char[] array2=sad.rand();
		System.out.println(array2);
		char[] array3=sad.rand();
		System.out.println(array3);
		
	}

}
