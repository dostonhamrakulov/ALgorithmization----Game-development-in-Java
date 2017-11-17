//Created by DOston Hamrakulov
//10.02.2017 in Riga, Latvia

package First_work;

import java.util.*;

public class User_game {
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
		
		try{
			LinkedList<String> list = new LinkedList<String>();
			list.addFirst("default zero country");
			list.add("China");list.add("Japan");list.add("South Korea");list.add("Uzbekistan");list.add("India"); // in Asia
			list.add("Bangladesh");list.add("Iran");list.add("Nepal");list.add("Pakistan");list.add("Turkey");
			list.add("Tajikistan");list.add("Russian Federation");list.add("United Arab Emirates");list.add("Vietnam");list.add("Singapore");
			
			list.add("Namibia");list.add("Ghana");list.add("Egypht");list.add("Congo");list.add("Algeria"); // in Africa
			list.add("Angola");list.add("Cameroon");list.add("Gambia");list.add("Kenya");list.add("Libya");
			list.add("Liberia");list.add("Ethiopia");list.add("Nigeria");list.add("Niger");list.add("Somalia");
			
			list.add("Brazil");list.add("Chile");list.add("Argentina");list.add("Peru");list.add("Ecuador"); // in South America
			list.add("Bolivia");list.add("Guyana");list.add("Paraguay");list.add("Uruguay");list.add("Venezuela");
			//list.add("");list.add("");list.add("");list.add("");list.add("");
			
			list.add("Canada");list.add("Mexico");list.add("Cuba");list.add("Dominica");list.add("USA"); //North America
			list.add("Honduras");list.add("Panama");list.add("Honduras");list.add("Cuba");list.add("Mexico");
			//list.add("");list.add("");list.add("");list.add("");list.add("");
			
			list.add("Malta");list.add("Liechtenstein");list.add("Iceland");list.add("Georgia");list.add("Cyrpus"); //Europe
			list.add("Albania");list.add("Armenia");list.add("Azerbaijan");list.add("Bulgaria");list.add("Czech Republic");
			list.add("Finland");list.add("Hungary");list.add("Luxembourg");list.add("Moldova");list.add("Norway");
			
			System.out.print(list.get(random));
			
		}catch(Exception e){
			System.out.println("Exception is caught in Country method");
		}
		
		
	}
	
	public static int Random(){
		//random generator for putting Countri and getting one random country
		
		Random rand = new Random();
		return rand.nextInt(67);
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
