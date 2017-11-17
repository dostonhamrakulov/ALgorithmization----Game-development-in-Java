package Third_work;

import java.util.Scanner;

public class Player {
	static int a;
	static Scanner sn = new Scanner(System.in);
	
	Player(int x){
		
		a = x;
	}
	public static int numPlayer(){
		 return a;
	}
	
	public static int Start(){
		int b = sn.nextInt();
		
		return b;
	}
}
