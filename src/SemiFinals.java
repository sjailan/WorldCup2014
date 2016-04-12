import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class SemiFinals {
	Game semiFinalm1;
	Game semiFinalm2; 
	
	ArrayList<Team> teams;
	ArrayList<Team> winningTeams = new ArrayList<Team>(); // list of teams which will qualify for  finals
	ArrayList<Team> losingTeams = new ArrayList<Team>(); // list of teams which will qualify for third place
	
	public SemiFinals(ArrayList<Team> teams){
		this.teams = teams;



		semiFinalm1= new Game(teams.get(0), teams.get(1));
		semiFinalm2 = new Game(teams.get(2), teams.get(3));
		
		 setSemiFinalsGames();


		if(semiFinalm1.isDraw())
		{
			winningTeams.add(semiFinalm1.runPenalties());
		}
		else
		{
			winningTeams.add(semiFinalm1.getWinner());
			losingTeams.add(semiFinalm1.getLoser());
		}
		if(semiFinalm2.isDraw())
		{
			winningTeams.add(semiFinalm2.runPenalties());
		}
		else
		{
			winningTeams.add(semiFinalm2.getWinner());
			losingTeams.add(semiFinalm2.getLoser());
		}
        
		finalQualifiers();
		semiFinalLosers();

}
	public void finalQualifiers()
	{   System.out.println("To play in the Final");
		for(Team t : winningTeams)
		{ 
			System.out.println(t.getName() +" is through to the Final of the world cup");
		}
	}
	public void semiFinalLosers()
	{ System.out.println("To play for 3rd place");
		for(Team t :losingTeams)
		{ 
			System.out.println(t.getName() +" To play for Third Place of the world cup");
		}
	}

	
	public ArrayList<Team> getWinningTeams() {
		return winningTeams;
	}
	
	public ArrayList<Team> getLosingTeams() {
		return losingTeams;
	}
	public void setSemiFinalsGames(){
		//set SemiFinalResult


		semiFinalm1.setGameResult(false);
		semiFinalm2.setGameResult(false);
		



	}
	public JPanel displaySemiFinalFixtures(Color color){
		   JPanel panel = new JPanel(new GridLayout(2,1));
		   JLabel[] label = new JLabel[2];
			
			
			label[0] = new JLabel(semiFinalm1.toString(), JLabel.CENTER);
			label[0].setFont(new Font("Serif", Font.BOLD, 18));
			label[0].setForeground(Color.BLUE);
			
			label[1] = new JLabel(semiFinalm2.toString(), JLabel.CENTER);
			label[1].setFont(new Font("Serif", Font.BOLD, 18));
			label[1].setForeground(Color.BLUE);

			
		   
			panel.setBackground(color);
			
			for(int i = 0; i < label.length; i++){
				panel.add(label[i]);
			}
		   
		   
		 return panel;
		   
	   }
	public JPanel displaySemiFinalMatchesResult(Color color){
    	JPanel panel = new JPanel(new GridLayout(2, 2));
    	
		JLabel[] label = new JLabel[4];
		
		
		label[0] = new JLabel(semiFinalm1.getGameResult());
		label[0].setFont(new Font("Serif", Font.BOLD, 13));
		label[0].setForeground(Color.BLUE);
		
		label[1] = new JLabel(semiFinalm1.getPenResult());
		label[1].setFont(new Font("Serif", Font.ITALIC, 12));
		label[1].setForeground(Color.red);
		
		label[2] = new JLabel(semiFinalm2.getGameResult());
		label[2].setFont(new Font("Serif", Font.BOLD, 13));
		label[2].setForeground(Color.BLUE);
		
		label[3] = new JLabel(semiFinalm2.getPenResult());
		label[3].setFont(new Font("Serif", Font.ITALIC, 12));
		label[3].setForeground(Color.red);
		
		
		panel.setBackground(color);
		for(int i = 0; i < label.length;i++){
			panel.add(label[i]);
		}
		

    	return panel;
    	
    }
   
	
}

	