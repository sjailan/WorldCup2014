import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;



public class Round16  {

	
		 
		 Game r16m1;
		 Game r16m2; 
		 Game r16m4;
		 Game r16m3;
		 Game r16m5; 
		 Game r16m6;
		 Game r16m7; 
		 Game r16m8;
		 ArrayList<Team> teams;
		 ArrayList<Team> winningTeams = new ArrayList<Team>(); // list of teams which  qualify for quarter finals
	     private String outputScores; 
 
 
    public Round16(ArrayList<Team> teams){
    	     this.teams = teams;
    
			 
		  
		    r16m1 = new Game(teams.get(0), teams.get(1));
		    r16m2 = new Game(teams.get(2), teams.get(3));
		    r16m3 = new Game(teams.get(4), teams.get(5));
		    r16m4 = new Game(teams.get(6), teams.get(7));
		    r16m5 = new Game(teams.get(8), teams.get(9));
		    r16m6 = new Game(teams.get(10), teams.get(11));
		    r16m7 = new Game(teams.get(12), teams.get(13));
		    r16m8 = new Game(teams.get(14), teams.get(15));
		    
		    setRound16Games();
		    
		    if(r16m1.isDraw())
		    {
		    	winningTeams.add(r16m1.runPenalties());
		    	System.out.println(r16m1.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m1.getWinner());
		    }
		    if(r16m2.isDraw())
		    {
		    	winningTeams.add(r16m2.runPenalties());
		    	System.out.println(r16m2.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m2.getWinner());
		    }
		    if(r16m3.isDraw())
		    {
		    	winningTeams.add(r16m3.runPenalties());
		    	System.out.println(r16m3.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m3.getWinner());
		    }
		    if(r16m4.isDraw())
		    {
		    	winningTeams.add(r16m4.runPenalties());
		    	System.out.println(r16m4.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m4.getWinner());
		    }
		    if(r16m5.isDraw())
		    {
		    	winningTeams.add(r16m5.runPenalties());
		    	System.out.println(r16m5.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m5.getWinner());
		    }
		    if(r16m6.isDraw())
		    {
		    	winningTeams.add(r16m6.runPenalties());
		    	System.out.println(r16m6.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m6.getWinner());
		    }
		    if(r16m7.isDraw())
		    {
		    	winningTeams.add(r16m7.runPenalties());
		    	System.out.println(r16m7.getPenResult());
		    }
		    else
		    {
		    	winningTeams.add(r16m7.getWinner());
		    }
		    if(r16m8.isDraw())
		    {
		    	winningTeams.add(r16m8.runPenalties());
		    }
		    else
		    {
		    	winningTeams.add(r16m8.getWinner());
		    }
		     
		   
		 printWinners();   
		     	
		      
		
	}	
    
  

	public ArrayList<Team> getWinningTeams() {
		return winningTeams;
	}

	public void setWinningTeams(ArrayList<Team> winningTeams) {
		this.winningTeams = winningTeams;
	}

	public void printWinners()
    {
    	for(Team t : winningTeams)
    	{ 
    		System.out.println(t.getName() +" is through to the Quarter final of the world cup");
    	}
    }
    
   
   
    public void setRound16Games(){
		 //set round16GameResult
    	  	 
		 r16m1.setGameResult(false);
		 r16m2.setGameResult(false);
		 r16m3.setGameResult(false);
		 r16m4.setGameResult(false);
		 r16m5.setGameResult(false);
		 r16m6.setGameResult(false);
		 r16m7.setGameResult(false);
		 r16m8.setGameResult(false);
	}
    
    public Game getR16m1() {
		return r16m1;
	}



	public void setR16m1(Game r16m1) {
		this.r16m1 = r16m1;
	}



	public Game getR16m2() {
		return r16m2;
	}



	public void setR16m2(Game r16m2) {
		this.r16m2 = r16m2;
	}



	public Game getR16m4() {
		return r16m4;
	}



	public void setR16m4(Game r16m4) {
		this.r16m4 = r16m4;
	}



	public Game getR16m3() {
		return r16m3;
	}



	public void setR16m3(Game r16m3) {
		this.r16m3 = r16m3;
	}



	public Game getR16m5() {
		return r16m5;
	}



	public void setR16m5(Game r16m5) {
		this.r16m5 = r16m5;
	}



	public Game getR16m6() {
		return r16m6;
	}



	public void setR16m6(Game r16m6) {
		this.r16m6 = r16m6;
	}



	public Game getR16m7() {
		return r16m7;
	}



	public void setR16m7(Game r16m7) {
		this.r16m7 = r16m7;
	}

    

	public Game getR16m8() {
		return r16m8;
	}



	public void setR16m8(Game r16m8) {
		this.r16m8 = r16m8;
	}



	public ArrayList<Team> getTeams() {
		return teams;
	}



	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

   

	public String getOutputScores() {
		return outputScores;
	}



	public void setOutputScores(String outputScores) {
		this.outputScores = outputScores;
	}

   public JPanel displayR16Fixtures(Color color){
	   JPanel panel = new JPanel(new GridLayout(8,1));
	   JLabel[] label = new JLabel[8];
		
		
		label[0] = new JLabel(r16m1.toString(), JLabel.CENTER);
		label[0].setFont(new Font("Serif", Font.BOLD, 18));
		label[0].setForeground(Color.BLUE);
		
		label[1] = new JLabel(r16m2.toString(), JLabel.CENTER);
		label[1].setFont(new Font("Serif", Font.BOLD, 18));
		label[1].setForeground(Color.BLUE);

		label[2] = new JLabel(r16m3.toString(), JLabel.CENTER);
		label[2].setFont(new Font("Serif", Font.BOLD, 18));
		label[2].setForeground(Color.BLUE);

		label[3] = new JLabel(r16m4.toString(), JLabel.CENTER);
		label[3].setFont(new Font("Serif", Font.BOLD, 18));
		label[3].setForeground(Color.BLUE);

		label[4] = new JLabel(r16m5.toString(), JLabel.CENTER);
		label[4].setFont(new Font("Serif", Font.BOLD, 18));
		label[4].setForeground(Color.BLUE);

		label[5] = new JLabel(r16m6.toString(), JLabel.CENTER);
		label[5].setFont(new Font("Serif", Font.BOLD, 18));
		label[5].setForeground(Color.BLUE);

		label[6] = new JLabel(r16m7.toString(), JLabel.CENTER);
		label[6].setFont(new Font("Serif", Font.BOLD, 18));
		label[6].setForeground(Color.BLUE);

		label[7] = new JLabel(r16m8.toString(), JLabel.CENTER);
		label[7].setFont(new Font("Serif", Font.BOLD, 18));
		label[7].setForeground(Color.BLUE);

	   
		panel.setBackground(color);
		
		for(int i = 0; i < label.length; i++){
			panel.add(label[i]);
		}
	   
	   
	 return panel;
	   
   }

	public String displayRoundOf16Score(){
    	outputScores =   r16m1.getGameResult()+"\n"; 
    	outputScores +=  r16m2.getGameResult()+"\n";
    	outputScores +=  r16m3.getGameResult()+"\n";
    	outputScores +=  r16m4.getGameResult()+"\n";
    	outputScores +=  r16m5.getGameResult()+"\n";
    	outputScores +=  r16m6.getGameResult()+"\n";
    	outputScores +=  r16m7.getGameResult()+"\n";
    	outputScores +=  r16m8.getGameResult()+"\n";
		return outputScores;
    	
    }
   
    
    public JPanel displayR16MatchesResult(Color color){
    	JPanel panel = new JPanel(new GridLayout(8, 2));
    	
		JLabel[] label = new JLabel[16];
		
		
		label[0] = new JLabel(r16m1.getGameResult());
		label[0].setFont(new Font("Serif", Font.BOLD, 13));
		label[0].setForeground(Color.BLUE);
		
		label[1] = new JLabel(r16m1.getPenResult());
		label[1].setFont(new Font("Serif", Font.ITALIC, 12));
		label[1].setForeground(Color.red);
		
		label[2] = new JLabel(r16m2.getGameResult());
		label[2].setFont(new Font("Serif", Font.BOLD, 13));
		label[2].setForeground(Color.BLUE);
		
		label[3] = new JLabel(r16m2.getPenResult());
		label[3].setFont(new Font("Serif", Font.ITALIC, 12));
		label[3].setForeground(Color.red);
		
		label[4] = new JLabel(r16m3.getGameResult());
		label[4].setFont(new Font("Serif", Font.BOLD, 13));
		label[4].setForeground(Color.BLUE);
		
		label[5] = new JLabel(r16m3.getPenResult());
		label[5].setFont(new Font("Serif", Font.ITALIC, 12));
		label[5].setForeground(Color.red);
		
		label[6] = new JLabel(r16m4.getGameResult());
		label[6].setFont(new Font("Serif", Font.BOLD, 13));
		label[6].setForeground(Color.BLUE);
		
		label[7] = new JLabel(r16m4.getPenResult());
		label[7].setFont(new Font("Serif", Font.ITALIC, 12));
		label[7].setForeground(Color.red);
		
		label[8] = new JLabel(r16m5.getGameResult());
		label[8].setFont(new Font("Serif", Font.BOLD, 13));
		label[8].setForeground(Color.BLUE);
		
		label[9] = new JLabel(r16m5.getPenResult());
		label[9].setFont(new Font("Serif", Font.ITALIC, 12));
		label[9].setForeground(Color.red);
		
		label[10] = new JLabel(r16m6.getGameResult());
		label[10].setFont(new Font("Serif", Font.BOLD, 13));
		label[10].setForeground(Color.BLUE);
		
		label[11] = new JLabel(r16m6.getPenResult());
		label[11].setFont(new Font("Serif", Font.ITALIC, 12));
		label[11].setForeground(Color.red);
		
		label[12] = new JLabel(r16m7.getGameResult());
		label[12].setFont(new Font("Serif", Font.BOLD, 13));
		label[12].setForeground(Color.BLUE);
		
		label[13] = new JLabel(r16m7.getPenResult());
		label[13].setFont(new Font("Serif", Font.ITALIC, 12));
		label[13].setForeground(Color.red);
		
		label[14] = new JLabel(r16m8.getGameResult());
		label[14].setFont(new Font("Serif", Font.BOLD, 13));
		label[14].setForeground(Color.BLUE);
		
		label[15] = new JLabel(r16m8.getPenResult());
		label[15].setFont(new Font("Serif", Font.ITALIC, 12));
		label[15].setForeground(Color.red);
		
		panel.setBackground(color);
		for(int i = 0; i < label.length;i++){
			panel.add(label[i]);
		}
		

    	return panel;
    	
    }
 
}
