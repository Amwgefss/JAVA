package 黄青林17031110123;
import java.util.Scanner;
public class 扫雷 {
	static char[][] a=new char[100][100];
	static int n,m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String b[]=new String[100];
		int i,j;
		n=input.nextInt();
		m=input.nextInt();
		for(i=0;i<n;i++) {
			b[i]=input.next();
			a[i]=b[i].toCharArray();
		}
		for (i=0;i<n;i++) { 
			for (j=0;j<m;j++) { 
				if (a[i][j]=='*') 
					System.out.print("*");
				else 
					myFind(i,j);
				if (j+1==m) 
					System.out.println(""); 
			} 
		}
	}
	private static void myFind(int i,int j) {
		int flag=0; 
		for (int di=-1;di<=1;di++) 
			for (int dj=-1;dj<=1;dj++) { 
				int x=i+di;
				int y=j+dj; 
				if ((di!=0||dj!=0)&&x>=0&&x<n&&y>=0&&y<m) 
					if (a[x][y]=='*') 
						flag++;
			} 
			System.out.print(flag);
	}
}