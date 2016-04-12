import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ThirdPlace {
	Game thirdPlace;
	ArrayList<Team> teams;
	ArrayList<Team> winningTeams = new ArrayList<Team>();
	
	public ThirdPlace(ArrayList<Team> teams){
		      this.teams = teams;
              this.thirdPlace= new Game(teams.get(0), teams.get(1));
		      setThirdPlaceGame();
            

			if(thirdPlace.isDraw())
			{
				winningTeams.add(thirdPlace.runPenalties());
			}
			else
			{
				winningTeams.add(thirdPlace.getWinner());
				
			}
			printWinner();
}
	 public void printWinner()
	    {
	    	for(Team t : winningTeams)
	    	{ 
	    		System.out.println(t.getName() +" is the winner of Third Place");
	    	}
	    }
	   
	   
	    public void setThirdPlaceGame(){
			 //set thirdplace
	    	thirdPlace.setGameResult(false);
	    }
	    public JPanel displayThirdPlacelFixtures(Color color){
			   JPanel panel = new JPanel(new GridLayout(1,1));
			   JLabel[] label = new JLabel[1];
								
				label[0] = new JLabel(thirdPlace.toString(), JLabel.CENTER);
				label[0].setFont(new Font("Serif", Font.BOLD, 18));
				label[0].setForeground(Color.BLUE);
				
				   
				panel.setBackground(color);
				panel.add(label[0]);
				
			  return panel;
			   
		}
	    public JPanel displayThirdPlaceMatchesResult(Color color){
	    	JPanel panel = new JPanel(new GridLayout(1, 2));
	    	
			JLabel[] label = new JLabel[2];
			
			
			label[0] = new JLabel(thirdPlace.getGameResult());
			label[0].setFont(new Font("Serif", Font.BOLD, 13));
			label[0].setForeground(Color.BLUE);
			
			label[1] = new JLabel(thirdPlace.getPenResult());
			label[1].setFont(new Font("Serif", Font.ITALIC, 12));
			label[1].setForeground(Color.red);
			
			
			panel.setBackground(color);
			for(int i = 0; i < label.length;i++){
				panel.add(label[i]);
			}
			

	    	return panel;
	    	
	    }


	
	}
