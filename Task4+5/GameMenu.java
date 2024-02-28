import java.util.ArrayList;
import java.util.Scanner; 
//Task 4.a
class GameMenu{
	//Task 4.b
	private ArrayList<String> actions = new ArrayList<>();
	
	//Task 4.c, 4.d
	GameMenu(ArrayList<String> actions){
		this.actions = actions;

	}
	//Task 4.h
	public void displayMenu(){
		for(int i = 0; i < actions.size(); i++){
			System.out.println((i+1) + " " + actions.get(i));
		}
	}
	//Task 5.a, 5.b, 5.c
	public String getAction(){
		Scanner scan = new Scanner(System.in);
			System.out.println("Type a number to choose an action");
			displayMenu();
			return scan.nextLine();
	}

}