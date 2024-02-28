//Task 1.a
class Main{
	
	public static void main(String []args){
		//Task 1.g
		Team team = new Team("G2", 3, "Poul");
		//Task 1.k
		Team team2 = new Team("G3", 2, "Poul");
		Team team3 = new Team("G4", 4, "Poul");
		Team team4 = new Team("G5", 7, "Poul");
		Team team5 = new Team("G6", 8, "Poul");

		//Task 1.i
		team.setRank(1);


		System.out.println(team.toString());
		//Task 1.k
		System.out.println(team2.toString());
		System.out.println(team3.toString());
		System.out.println(team4.toString());
		System.out.println(team5.toString());

	}


}