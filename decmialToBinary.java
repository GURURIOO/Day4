package day7;
import java.util.*;

public class decmialToBinary {
	public static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0;
		for( i=0;n>0;i++)    
		{    
		a[i]=n%2;    
		n=n/2;    
		}    
		for(i=i-1;i>=0;i--)    
		{    
		System.out.print(a[i]);   
		}    
	}

}
