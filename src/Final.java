import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Final {
	Game finalMatch;
	ArrayList<Team> teams;
	ArrayList<Team> winningTeams = new ArrayList<Team>();
	
	public Final(ArrayList<Team> teams){
		      this.teams = teams;
		      finalMatch= new Game(teams.get(0), teams.get(1));
		      setFinalGame();
		      finalMatch.setGameResult(false);

			if(finalMatch.isDraw())
			{
				winningTeams.add(finalMatch.runPenalties());
			}
			else
			{
				winningTeams.add(finalMatch.getWinner());
				
			}
			printWinner();
			
}
	 public void printWinner()
	    {
	    	for(Team t : winningTeams)
	    	{ 
	    		System.out.println(t.getName() +" is the winner of the WorldCup Final");
	    	}
	    }
	    
	  
	   
	    public void setFinalGame(){
			 //set thirdplace
	    	finalMatch.setGameResult(false);
	    }
	    public JPanel displayFinalFixture(){
			   JPanel panel = new JPanel(new GridLayout(1,1));
			   JLabel[] label = new JLabel[1];
								
				label[0] = new JLabel( finalMatch.toString(), JLabel.CENTER);
				label[0].setFont(new Font("Serif", Font.BOLD, 18));
				label[0].setForeground(Color.BLUE);
				
				   
				panel.add(label[0], Color.YELLOW);
				
			  return panel;
			   
		}
	    public JPanel displayFinalMatchResult(Color color){
	    	JPanel panel = new JPanel(new GridLayout(1, 2));
	    	
			JLabel[] label = new JLabel[2];
			
			
			label[0] = new JLabel(finalMatch.getGameResult());
			label[0].setFont(new Font("Serif", Font.BOLD, 13));
			label[0].setForeground(Color.BLUE);
			
			label[1] = new JLabel(finalMatch.getPenResult());
			label[1].setFont(new Font("Serif", Font.ITALIC, 12));
			label[1].setForeground(Color.red);
			
			
			panel.setBackground(color);
			for(int i = 0; i < label.length;i++){
				panel.add(label[i]);
			}
			

	    	return panel;
	    	
	    }


}
