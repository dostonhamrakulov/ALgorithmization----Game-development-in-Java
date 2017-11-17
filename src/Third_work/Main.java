//Created by DOston Hamrakulov
//10.02.2017 in Riga, Latvia

package Third_work;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);	
		System.out.println("How many players are you?");
		
		Game gm = new Game();
		int x = sn.nextInt();
		gm.Runner(x);
		
	}
}
