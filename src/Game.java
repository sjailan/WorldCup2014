
public class Game {

	private Team team1;
	private Team team2;
	private Team winner;
	private Team loser;
	private boolean draw = false;
	private String gameResult ="";
	private String penResult ="";




	public Game(Team team1, Team team2){
		this.team1 = team1;
		this.team2 = team2;


	}


	public Team getWinner() {
		return winner;
	}

	public Team getLoser() {
		return loser;
	}

	public Team getTeam1() {
		return team1;
	}
	public Team getTeam2() {
		return  team2;
	}
	
	public void setGameResult(boolean group){
		int team1Goals = 	team1.getGoalsScored();  
		int team2Goals = 	team2.getGoalsScored(); 
		if(group)
		{
			team1.setAllTeamFields();
			team2.setAllTeamFields();
			team1.setGoalsFor(team1Goals);
			team2.setGoalsFor(team2Goals);
			team1.setGoalsAgainst(team2Goals);
			team2.setGoalsAgainst(team1Goals);
			team1.setGoalsDifference(team1Goals, team2Goals);
			team2.setGoalsDifference(team2Goals, team1Goals);
		
		}


		if(team1Goals  > team2Goals) {
						
			gameResult = team1.getName()+" "+team1Goals +":"+team2Goals+" "+team2.getName();
			if(group)
			{
				team1.incrementWin();
				team2.incrementLoss();
			}
			winner = team1;
			loser = team2;
			
			

		}else if(team1Goals  < team2Goals){
						
			gameResult = team1.getName()+" "+team1Goals +":"+team2Goals+" "+team2.getName();
			if(group){
				team2.incrementWin();
				team1.incrementLoss();
			}
			winner = team2;
			loser = team1;
		
			

		}else if (team1Goals  == team2Goals){
					
			gameResult = team1.getName()+" "+team1Goals +":"+team2Goals+" "+team2.getName();
			if(group)
			{
				team1.incrementDraw();
				team2.incrementDraw();
			}
			draw = true;
		}
		
	}


	public String getGameResult() {
		return gameResult;
	}
	
	public String getPenResult() {
		return penResult;
	}


	public String toString(){
		return team1.getName()+ " V "+team2.getName();
	}

	public boolean isDraw(){
		if(draw){
			
			return true;
		}

		return false;
	}

	public Team runPenalties(){
		int team1Goals = team1.getPenaltiesTotal5();
		int team2Goals = team2.getPenaltiesTotal5();

		while(team1Goals == team2Goals){

			team1Goals=team1.getPenaltiesTotal1();
			team2Goals=team2.getPenaltiesTotal1();

		}


		if(team1Goals > team2Goals){ 
			
			penResult = "Penalties: "+team1.getName()+" "+team1Goals+":"+team2Goals+" "+team2.getName() ;
			winner = team1;
			loser = team2;
			return team1;
		}
		else{
			
			penResult = "Penalties: "+team1.getName()+" "+team1Goals+":"+team2Goals+" "+team2.getName();
			winner = team2;
			loser = team1;
			return team2;
		}

	}
} 
