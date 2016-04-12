public class Team implements Comparable<Team> {
	private String name;
	private int seed;
	private int defenceStrength;
	private int attackStrength;
	private int goalsScored;
	private int totalPoints = 0;
	private int totalGamesPlayed= 0;
	private int goalsFor=0;
	private int goalsAgainst;
	private int goalsDifference;
	private int win=0;
	private int draw=0;
	private int loss=0;
	private int penaltiesTotal5=0;
    private int penaltiesTotal1=0;
    
    
    
   
    public Team(String name){
		this.name = name;
	}  
    
	public int getWin() {
		return win;
	}

	public void incrementWin() {
		 win++;
	}

	public int getDraw() {
		return draw;
	}

	public void incrementDraw() {
		draw++;
	}

	public int getLoss() {
		return loss;
	}

	public void incrementLoss() {
		loss++;
	}

	public int getGoalsFor() {
		return goalsFor;
	}

	public void setGoalsFor(int goals) {
		goalsFor +=goals;
	}
	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	public void setGoalsAgainst(int goals) {
		goalsAgainst += goals;
	}
    
   


	public int getGoalsDifference() {
		return goalsDifference;
	}

	public void setGoalsDifference(int goalsFor, int goalsAgainst) {
		goalsDifference += (goalsFor - goalsAgainst);
	  
	}

	
   
	public String getName() {
		return name;
	}
	public void setName(String name){
		
		this.name = name;
	}
	public void setTotalGamesPlayed() {
		totalGamesPlayed += (win + draw + loss);
	}
	public int getTotalGamesPlayed() {
		
		return totalGamesPlayed;
	}
	public void setTotalPoints(){
		totalPoints += ((win*3) +(draw*1));
	}
    public int getTotalPoints(){
    	
    	return totalPoints;
    }
	public void setSeed(){
		int seedVal =  (1 + (int)(Math.random()*(31)+1));//pick a random number between 1-32 inclusive
		this.seed = seedVal;
	}
	
	public int getSeed() {
		return seed;
	}
	public int getDefenceStrength() {

		return defenceStrength;
	}
	public void setDefenceStrength(){
		int defenceStrengthA = (1 + (int)(Math.random()*(4)+1));//pick a random number between 1-5 inclusive
		this.defenceStrength = defenceStrengthA;
	}


	public int getAttackStrength() {

		return attackStrength;
	}
	public void setAttackStrength() {
		int attackStrengthA =  (1 + (int)(Math.random()*(4)+1));//pick a random number between 1-5 inclusive
		this.attackStrength = attackStrengthA;
	}
	public int getGoalsScored() {
		return goalsScored;
	}
	public void setGoalsScored() { 
		int goals = this.getAttackStrength() + this.getDefenceStrength() + this.getSeed();
		int goalsForA = (goals%6);//limits goals  0-5
		this.goalsScored = goalsForA;
	}
	public void setAllTeamFields(){//set up all fields before using the getGoalsScored method
		this.setAttackStrength();
		this.setDefenceStrength();
		this.setSeed();
		this.setGoalsScored();
	}
	@Override
    public int compareTo(Team other) {
         
           if(this.getTotalPoints() > other.getTotalPoints())
           {
                  return 1;
           }
          if(this.getTotalPoints() < other.getTotalPoints())
           {
                  return -1;
           }
          
           // if we are here then points are equal so compare goal difference
           if(this.getGoalsDifference() > other.getGoalsDifference())
           {
                  return 1;
           }
           if(this.getGoalsDifference() < other.getGoalsDifference())
           {
                  return -1;
           }
          
           return 0;
    }
	

	
	public int getPenaltiesTotal1() {
		 
		  for(int i = 0 ;i <1; i++){
			 int rand =	 (int)(Math.random()*(2)+0);
					
			  penaltiesTotal1 += rand;
		  }	
		
		 
		  
		return penaltiesTotal1;
	}

	
	 public  int getPenaltiesTotal5(){
		  
		  for(int i =0 ; i < 5; i++){
					int rand =	 (int)(Math.random()*(2)+0);
					
					penaltiesTotal5 += rand;
		  }	
		
		
		
		return penaltiesTotal5;
		  
	  }


	
}       

