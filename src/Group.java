import java.util.ArrayList;
import java.util.Arrays;




public class Group {

	private Team team1;
	private Team team2;
	private Team team3;
	private Team team4;

	private Game g1;
	private Game g2;
	private Game g3;
	private Game g4;
	private Game g5;
	private Game g6;

	private Team groupWinner;
	private Team groupRunnerUp;
	private String groupGamesResult;
	private String groupTeams;
	private ArrayList<Team> groupWinnerAndgroupRunnerUp = new ArrayList<Team>();
	
	
	

	public Group(Team team1, Team team2, Team team3, Team team4) {
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		this.team4 = team4;
		this.g1 = new Game(this.team1, this.team2);
		this.g2 = new Game(this.team1, this.team3);
		this.g3 = new Game(this.team1, this.team4);
		this.g4 = new Game(this.team2, this.team3);
		this.g5 = new Game(this.team2, this.team4);
		this.g6 = new Game(this.team3, this.team4);

	}

	public void setGame1Result() {
		g1.setGameResult(true);
	}

	public void setGame2Result() {
		g2.setGameResult(true);
	}

	public void setGame3Result() {
		g3.setGameResult(true);
	}

	public void setGame4Result() {
		g4.setGameResult(true);
	}

	public void setGame5Result() {
		g5.setGameResult(true);
	}

	public void setGame6Result() {
		g6.setGameResult(true);
	}

	public String getGame1Result() {
		return g1.getGameResult();
	}

	public String getGame2Result() {
		return g2.getGameResult();
	}

	public String getGame3Result() {
		return g3.getGameResult();
	}

	public String getGame4Result() {
		return g4.getGameResult();
	}

	public String getGame5Result() {
		return g5.getGameResult();
	}

	public String getGame6Result() {
		return g6.getGameResult();
	}

	public void setAllGroupGamesResult() {
		setGame1Result();
		setGame2Result();
		setGame3Result();
		setGame4Result();
		setGame5Result();
		setGame6Result();
		// set totalMatchesPlayed

		team1.setTotalGamesPlayed();
		team2.setTotalGamesPlayed();
		team3.setTotalGamesPlayed();
		team4.setTotalGamesPlayed();

		// set points for each team
		team1.setTotalPoints();
		team2.setTotalPoints();
		team3.setTotalPoints();
		team4.setTotalPoints();
	}

	public String getAllGroupGamesResult() {

		groupGamesResult = getGame1Result() + "\n";
		groupGamesResult += getGame2Result() + "\n";
		groupGamesResult += getGame3Result() + "\n";
		groupGamesResult += getGame4Result() + "\n";
		groupGamesResult += getGame5Result() + "\n";
		groupGamesResult += getGame6Result() + "\n";
		return groupGamesResult;
	}

	public void displayGroupTable() {

		String h0 = "";
		String h1 = "MP";
		String h2 = "W";
		String h3 = "D";
		String h4 = "L";
		String h5 = "GF";
		String h6 = "GA";
		String h7 = "GD";
		String h8 = "Pts";
		String divider = "----------------------------------------------";

		System.out.printf("%-13s %3s  %3s %3s %3s %3s %3s %3s %3s %n", h0, h1,
				h2, h3, h4, h5, h6, h7, h8);
		System.out.println(divider);
		System.out.printf("%-13s %3d  %3d %3d %3d %3d %3d %3d %3d %n",
				team1.getName(), team1.getTotalGamesPlayed(), team1.getWin(),
				team1.getDraw(), team1.getLoss

				(), team1.getGoalsFor(), team1.getGoalsAgainst(),
				team1.getGoalsDifference(), team1.getTotalPoints());
		System.out.printf("%-13s %3d  %3d %3d %3d %3d %3d %3d %3d %n",
				team2.getName(), team2.getTotalGamesPlayed(), team2.getWin(),
				team2.getDraw(), team2.getLoss

				(), team2.getGoalsFor(), team2.getGoalsAgainst(),
				team2.getGoalsDifference(), team2.getTotalPoints());
		System.out.printf("%-13s %3d  %3d %3d %3d %3d %3d %3d %3d %n",
				team3.getName(), team3.getTotalGamesPlayed(), team3.getWin(),
				team3.getDraw(), team3.getLoss

				(), team3.getGoalsFor(), team3.getGoalsAgainst(),
				team3.getGoalsDifference(), team3.getTotalPoints());
		System.out.printf("%-13s %3d  %3d %3d %3d %3d %3d %3d %3d %n",
				team4.getName(), team4.getTotalGamesPlayed(), team4.getWin(),
				team4.getDraw(), team4.getLoss

				(), team4.getGoalsFor(), team4.getGoalsAgainst(),
				team4.getGoalsDifference(), team4.getTotalPoints());
	}
	

	public void setGroupWinnerAndRunnerUp() {

		
		Team[] array = new Team[4];
		array[0] = team1;
		array[1] = team2;
		array[2] = team3;
		array[3] = team4;
		// Sort array so that index 0 has least point and index 3 has most points
		Arrays.sort(array);
     // assigns team1 to have most points and team4 the least points
		
	   team1 = array[3];
	   team2 = array[2];
	   team3 = array[1];
	   team4 = array[0];

		// Set winner and runner up
		groupWinner =  array[3];
		groupRunnerUp = array[2];

		

	}

	public Team getTeam1() {
		return team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public Team getTeam3() {
		return team3;
	}

	public Team getTeam4() {
		return team4;
	}

	public Team getGroupWinner() {
		return groupWinner;
	}

	public Team getGroupRunnerUp() {
		return groupRunnerUp;
	}
public void printGroupWinnerAndRunnerUp(){
	groupWinnerAndgroupRunnerUp.add(groupWinner);
	groupWinnerAndgroupRunnerUp.add(groupRunnerUp);
	for(Team team: groupWinnerAndgroupRunnerUp){
		System.out.println(team.getName()+ " is through to the Round16 of the world cup");
	}
	
}
	public String toString() {
		String output = g1.toString() + "\n";
		output += g2.toString() + "\n";
		output += g3.toString() + "\n";
		output += g4.toString() + "\n";
		output += g5.toString() + "\n";
		output += g6.toString() + "\n";
		return output;

	}

	public void setGroupTeams() {
		groupTeams = team1.getName() + "\n";
		groupTeams += team2.getName() + "\n";
		groupTeams += team3.getName() + "\n";
		groupTeams += team4.getName() + "\n";

	}

	public String getGroupTeams() {
		return groupTeams;
	}
}
