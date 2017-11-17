package Second_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class User_game{
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("How many players are you?");
		
		int choice  = sn.nextInt();
		
		Player(choice, Random());
		
		
	}
	public static void Continents(){
		LinkedList list = new LinkedList();
		list.addFirst("This is default option");
		list.add("Asia");
		list.add("Africa");
		list.add("South America");
		list.add("North America");
		list.add("Europa");
		
		for (int i = 1; i < list.size(); i++) {
			System.out.println((i) + ". " + list.get(i));
			
		}
		
	}
	public static void Player(int choice, int random){
		Scanner sn = new Scanner(System.in);
		
		if(choice == 1){
			System.out.print("In which continent is "); Country(random);
			System.out.println();
			Continents();
			int a = sn.nextInt();
			Matching(random, a);
			
		}
		else if(choice > 1){
			
			for (int i = 1; i <= choice; i++) {
				
				System.out.println("\n" + "Player N: " + i);
				int r = Random();
				System.out.print("In which continent is "); Country(r);
				System.out.println();
				Continents();
				int a = sn.nextInt();
				
				Matching(r, a);
			}
		}else{
			System.out.println("Please choose only number greater than 1");
		}
		
	}
	public static void Country(int random) throws IndexOutOfBoundsException{
		
		String content = new String();
		//int count=1;
		File file = new File("country.txt");
		LinkedList<String> list = new LinkedList<String>();

		try {
			Scanner sc = new Scanner(new FileInputStream(file));
			while (sc.hasNextLine()){
				content = sc.nextLine();
				list.add(content);
				
			}
			
			System.out.print(list.get(random));
			sc.close();
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static int Random(){
		//random generator for putting Countri and getting one random country
		
		Random rand = new Random();
		return rand.nextInt(66);
	}
	public static void Matching(int random, int choice){
		
		if(random < 16 && choice == 1){
			System.out.println("You are correct!");
		}
		else if(random > 15 && random < 31 && choice == 2){
			System.out.println("You are correct!");
		}
		else if(random > 30 && random < 41 && choice == 3){
			System.out.println("You are correct!");
		}
		else if(random > 40 && random < 51 && choice == 4){
			System.out.println("You are correct!");
		}
		else if(random > 50 && random < 67 && choice == 5){
			System.out.println("You are correct!");
		}else{
			System.out.println("Sorry, you are NOT correct!");
		}
		
	}

}
