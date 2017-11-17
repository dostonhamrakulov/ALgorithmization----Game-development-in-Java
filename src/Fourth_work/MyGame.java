//Created by DOston Hamrakulov
//10.02.2017 in Riga, Latvia
package Fourth_work;

//Created by DOston Hamrakulov
//10.02.2017 in Riga, Latvia
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MyGame extends Game{
	static int result = 0;
	public void Continents(){
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

	public void Country(int random) throws IndexOutOfBoundsException{

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


	public void Matching(int random, int choice){

		LinkedList<String> list = new LinkedList<String>();
		list.add("You are CORRECT!");list.add("Sorry, you are NOT correct!");

		if(random < 16 && choice == 1){
			list.getFirst();
			result++;
		}
		else if(random > 15 && random < 31 && choice == 2){
			list.getFirst();result++;
		}
		else if(random > 30 && random < 41 && choice == 3){
			list.getFirst();result++;
		}
		else if(random > 40 && random < 51 && choice == 4){
			list.getFirst();result++;
		}
		else if(random > 50 && random < 67 && choice == 5){
			list.getFirst();result++;
		}else{
			list.get(1);
		}


	}

	public int Random(){
		//random generator for putting Countri and getting one random country

		Random rand = new Random();
		return rand.nextInt(66);
	}
	

	public void Runner(int numPlayer){

		Player rn = new Future_player(numPlayer); // polymophism
		Scanner s = new Scanner(System.in);
		
		if(rn.numPlayer() == 1){
			System.out.println("How many questions will you answer?");
			int numQuestion = s.nextInt();
			for (int j = 1; j <= numQuestion; j++) {

				System.out.println("\n" + "Question N: " + j);
				int r = Random();
				System.out.print("In which continent is "); Country(r);
				System.out.println();
				Continents();
				Matching(r, rn.Start());
			}
			System.out.format("Your result is %d out of %d", result, numQuestion);

		}else{
			
			for(int i=1; i<=rn.numPlayer(); i++){
				result  = 0;

				System.out.format("\n\nPlayer N: %d, How many questions will you answer?", i);
				int numQuestion = s.nextInt();
				for (int j = 1; j <= numQuestion; j++) {

					System.out.println("\n" + "Question N: " + j);
					int r = Random();
					System.out.print("In which continent is "); Country(r);
					System.out.println();
					Continents();
					Matching(r, rn.Start());
				}
				System.out.format("Player N: %d, your result is %d out of %d", i, result, numQuestion);
			}
		}		
	}
}
