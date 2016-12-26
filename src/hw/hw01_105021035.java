package hw;
import java.util.Scanner;

public class hw01_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn = new Scanner(System.in);
		int  n = new.nextInt();
		int v1=1,v2=0,v3=0;
		for(int a=n;a>=1;a--){
			v3=v2+v1;
			System.out.print(v3+"\t");
			v1=v2;
			v2=v3;
		}
	}

} 
