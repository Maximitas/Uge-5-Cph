import java.util.ArrayList;
//Task 4.e
class Main{
	
	public static void main(String[] args){
		ArrayList<String> actions = new ArrayList<String>();
		
		//Task 4.g
		GameMenu gameMenu = new GameMenu(actions);

		//Task 4.f
		actions.add("Start game");
		actions.add("Resume game");
		actions.add("Pause game");
		actions.add("End game");

		//Task 4.g
		//gameMenu.displayMenu();
		//Task 5.d
		String userInput = gameMenu.getAction();
		int input = Integer.parseInt(userInput);

		doAction(input);


			}
	//Task 5.d
	public static void doAction(int input){
		//Task 5.f
			switch(input){
			case 1:
				System.out.println("Starting the game now");
				break;
			case 2:
				System.out.println("Fetching previously saved game data");
				break;
			case 3:
				System.out.println("Game paused");
				break;
			case 4:
				System.out.println("Ending game");
				break;
			}


	}
	

}