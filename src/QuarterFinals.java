import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class QuarterFinals {


	Game quarterFinalm1;
	Game quarterFinalm2; 
	Game quarterFinalm3;
	Game quarterFinalm4;


	ArrayList<Team> teams;
	ArrayList<Team> winningTeams = new ArrayList<Team>(); // list of teams which will qualify for semi finals



	public QuarterFinals(ArrayList<Team> teams){
		this.teams = teams;



		quarterFinalm1= new Game(teams.get(0), teams.get(1));
		quarterFinalm2 = new Game(teams.get(2), teams.get(3));
		quarterFinalm3 = new Game(teams.get(4), teams.get(5));
		quarterFinalm4 = new Game(teams.get(6), teams.get(7));

		setQuarterFinalsGames();


		if(quarterFinalm1.isDraw())
		{
			winningTeams.add(quarterFinalm1.runPenalties());
		}
		else
		{
			winningTeams.add(quarterFinalm1.getWinner());
		}
		if(quarterFinalm2.isDraw())
		{
			winningTeams.add(quarterFinalm2.runPenalties());
		}
		else
		{
			winningTeams.add(quarterFinalm2.getWinner());
		}
		if(quarterFinalm3.isDraw())
		{
			winningTeams.add(quarterFinalm3.runPenalties());
		}
		else
		{
			winningTeams.add(quarterFinalm3.getWinner());
		}
		if(quarterFinalm4.isDraw())
		{
			winningTeams.add(quarterFinalm4.runPenalties());
		}
		else
		{
			winningTeams.add(quarterFinalm4.getWinner());
		}
		printWinners(); 

	}
	public ArrayList<Team> getWinningTeams() {
		return winningTeams;
	}
	public void printWinners()
	{
		for(Team t : winningTeams)
		{ 
			System.out.println(t.getName() +" is through to the Semi final of the world cup");
		}
	}

	public JPanel displayQFinalFixtures(Color color){
		   JPanel panel = new JPanel(new GridLayout(4,1));
		   JLabel[] label = new JLabel[4];
			
			
			label[0] = new JLabel(quarterFinalm1.toString(), JLabel.CENTER);
			label[0].setFont(new Font("Serif", Font.BOLD, 18));
			label[0].setForeground(Color.BLUE);
			
			label[1] = new JLabel(quarterFinalm2.toString(), JLabel.CENTER);
			label[1].setFont(new Font("Serif", Font.BOLD, 18));
			label[1].setForeground(Color.BLUE);

			label[2] = new JLabel(quarterFinalm3.toString(), JLabel.CENTER);
			label[2].setFont(new Font("Serif", Font.BOLD, 18));
			label[2].setForeground(Color.BLUE);

			label[3] = new JLabel(quarterFinalm4.toString(), JLabel.CENTER);
			label[3].setFont(new Font("Serif", Font.BOLD, 18));
			label[3].setForeground(Color.BLUE);

			

		   
			panel.setBackground(color);
			
			for(int i = 0; i < label.length; i++){
				panel.add(label[i]);
			}
		   
		   
		 return panel;
		   
	   }
	public JPanel displayQFinalMatchesResult(Color color){
    	JPanel panel = new JPanel(new GridLayout(4, 2));
    	
		JLabel[] label = new JLabel[8];
		
		
		label[0] = new JLabel(quarterFinalm1.getGameResult());
		label[0].setFont(new Font("Serif", Font.BOLD, 13));
		label[0].setForeground(Color.BLUE);
		
		label[1] = new JLabel(quarterFinalm1.getPenResult());
		label[1].setFont(new Font("Serif", Font.ITALIC, 12));
		label[1].setForeground(Color.red);
		
		label[2] = new JLabel(quarterFinalm2.getGameResult());
		label[2].setFont(new Font("Serif", Font.BOLD, 13));
		label[2].setForeground(Color.BLUE);
		
		label[3] = new JLabel(quarterFinalm2.getPenResult());
		label[3].setFont(new Font("Serif", Font.ITALIC, 12));
		label[3].setForeground(Color.red);
		
		label[4] = new JLabel(quarterFinalm3.getGameResult());
		label[4].setFont(new Font("Serif", Font.BOLD, 13));
		label[4].setForeground(Color.BLUE);
		
		label[5] = new JLabel(quarterFinalm3.getPenResult());
		label[5].setFont(new Font("Serif", Font.ITALIC, 12));
		label[5].setForeground(Color.red);
		
		label[6] = new JLabel(quarterFinalm4.getGameResult());
		label[6].setFont(new Font("Serif", Font.BOLD, 13));
		label[6].setForeground(Color.BLUE);
		
		label[7] = new JLabel(quarterFinalm4.getPenResult());
		label[7].setFont(new Font("Serif", Font.ITALIC, 12));
		label[7].setForeground(Color.red);
		panel.setBackground(color);
		for(int i = 0; i < label.length;i++){
			panel.add(label[i]);
		}
		

    	return panel;
    	
    }

	public Game getQuarterFinalm1() {
		return quarterFinalm1;
	}
	public void setQuarterFinalm1(Game quarterFinalm1) {
		this.quarterFinalm1 = quarterFinalm1;
	}
	public Game getQuarterFinalm2() {
		return quarterFinalm2;
	}
	public void setQuarterFinalm2(Game quarterFinalm2) {
		this.quarterFinalm2 = quarterFinalm2;
	}
	public Game getQuarterFinalm3() {
		return quarterFinalm3;
	}
	public void setQuarterFinalm3(Game quarterFinalm3) {
		this.quarterFinalm3 = quarterFinalm3;
	}
	public Game getQuarterFinalm4() {
		return quarterFinalm4;
	}
	public void setQuarterFinalm4(Game quarterFinalm4) {
		this.quarterFinalm4 = quarterFinalm4;
	}
	public void setQuarterFinalsGames(){
		//set QFinalResult


		quarterFinalm1.setGameResult(false);
		quarterFinalm2.setGameResult(false);
		quarterFinalm3.setGameResult(false);
		quarterFinalm4.setGameResult(false);



	}



	
}
