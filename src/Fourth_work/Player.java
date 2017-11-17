package Fourth_work;

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
		Scanner sn = new Scanner(System.in);
		return sn.nextInt();
	}
}
