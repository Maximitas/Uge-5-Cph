//Task 1.b
class Team{
	String teamName;
	int rank;
	String name;

//Task 1.c, 1.d, 1.e
	Team(String teamName, int rank, String name){
	this.teamName = teamName;
	this.rank = rank;
	this.name = name;

	}
	//Task 1.h
	public void setRank(int rank){
		this.rank = rank;
	}

	//Task 1.j
	public String toString(){
		return "Team: " + teamName + " Rank: " + rank;

	}	


}