package hw;
import java.util.Scanner;
public class hw04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner scn = new (System.in);
		char z ='a';
		while (true){
			int x = 0;
			int a = 0;
			int b = 0;
			int c = 0;
		while(x!=999){
			System.out.print("請輸入數字: ");
		 x = scn.nextInt();
		 if(x>0){
			 a++;
		 }
		 if(x==0){
			 b++;
		 }
		 if(x<0){
			 c++;
		 }
		 
		}System.out.println("正數:"+(a-1)+"零:"+b+"負數:"+c);
			System.out.println("請問是否繼續(Y or n):  ");
			  z =scn.next().charAt(0);
			 if( z =='n'||z =='N'){
		
				 break;
			 }
			}
		
	}

}
	}

}
