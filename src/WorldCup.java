import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class WorldCup {

	private Group groupA = new Group(new Team("Brazil"), new Team("Croatia"), new Team("Mexico"), new Team("Cameroon"));
	private Group groupB = new Group(new Team("Spain"),	new Team("Netherlands"), new Team("Chile"), new Team("Australia"));
	private Group groupC = new Group(new Team("Colombia"), new Team("Greece"), new Team("Ivory Coast"), new Team("Japan"));
	private Group groupD = new Group(new Team("Uruguay"), new Team("Costa Rica"), new Team("England"), new Team("Italy"));;
	private Group groupE = new Group(new Team("Switzerland"), new Team("Ecuador"), new Team("France"), new Team("Honduras"));
	private Group groupF = new Group(new Team("Argentina"), new Team("Bosnia-Herzegovina"), new Team("Iran"), new Team("Nigeria"));
	private Group groupG = new Group(new Team("Germany"), new Team("Portugal"),	new Team("Ghana"), new Team("USA"));
	private Group groupH = new Group(new Team("Belgium"), new Team("Algeria"), new Team("Russia"), new Team("South Korea"));
	private Round16 r16;
	private  QuarterFinals qf;
	private SemiFinals sf;
	private ThirdPlace thirdPlace;
	private Final f;		
			
			public WorldCup() {

				ArrayList<Team> r16Teams = new ArrayList<Team>();// holds winner and runnerUp of each group
				ArrayList<Team> thirdPlaceTeams = new ArrayList<Team>();// holds teams which will play for third place
				ArrayList<Team> finalTeams = new ArrayList<Team>();// holds teams which will play in the final

				groupA.setAllGroupGamesResult();
				System.out.println(groupA.getAllGroupGamesResult());
				groupA.setGroupWinnerAndRunnerUp();
				groupA.displayGroupTable();
				groupA.printGroupWinnerAndRunnerUp();

			    groupB.setAllGroupGamesResult();
				System.out.println(groupB.getAllGroupGamesResult());
				groupB.setGroupWinnerAndRunnerUp();
				groupB.displayGroupTable();
				groupB.printGroupWinnerAndRunnerUp();

				groupC.setAllGroupGamesResult();
				System.out.println(groupC.getAllGroupGamesResult());
				groupC.setGroupWinnerAndRunnerUp();
				groupC.displayGroupTable();
				groupC.printGroupWinnerAndRunnerUp();

				groupD.setAllGroupGamesResult();
				System.out.println(groupD.getAllGroupGamesResult());
				groupD.setGroupWinnerAndRunnerUp();
				groupD.displayGroupTable();
				groupD.printGroupWinnerAndRunnerUp();


				groupE.setAllGroupGamesResult();
				System.out.println(groupE.getAllGroupGamesResult());
				groupE.setGroupWinnerAndRunnerUp();
				groupE.displayGroupTable();
				groupE.printGroupWinnerAndRunnerUp();

				groupF.setAllGroupGamesResult();
				System.out.println(groupF.getAllGroupGamesResult());
				groupF.setGroupWinnerAndRunnerUp();
				groupF.displayGroupTable();
				groupF.printGroupWinnerAndRunnerUp();

				groupG.setAllGroupGamesResult();
				System.out.println(groupG.getAllGroupGamesResult());
				groupG.setGroupWinnerAndRunnerUp();
				groupG.displayGroupTable();
				groupG.printGroupWinnerAndRunnerUp();

				groupH.setAllGroupGamesResult();
				System.out.println(groupH.getAllGroupGamesResult());
				groupH.setGroupWinnerAndRunnerUp();
				groupH.displayGroupTable();
				groupH.printGroupWinnerAndRunnerUp();
				
				
				
				// Adding R16 teams to a list
			    r16Teams.add(groupA.getGroupWinner());
				r16Teams.add(groupB.getGroupRunnerUp());
				r16Teams.add(groupC.getGroupWinner());
				r16Teams.add(groupD.getGroupRunnerUp());
				r16Teams.add(groupB.getGroupWinner());
				r16Teams.add(groupA.getGroupRunnerUp());
				r16Teams.add(groupD.getGroupWinner());
				r16Teams.add(groupC.getGroupRunnerUp());
				r16Teams.add(groupE.getGroupWinner());
				r16Teams.add(groupF.getGroupRunnerUp());
				r16Teams.add(groupG.getGroupWinner());
				r16Teams.add(groupH.getGroupRunnerUp());
				r16Teams.add(groupF.getGroupWinner());
				r16Teams.add(groupE.getGroupRunnerUp());
				r16Teams.add(groupH.getGroupWinner());
				r16Teams.add(groupG.getGroupRunnerUp());
				
			    	
			    
			  r16 = new Round16(r16Teams);// make instance of Round16 so that we can access groupWinner and RunnersUp
               
			   qf = new QuarterFinals(r16.getWinningTeams());
                
				sf = new SemiFinals(qf.getWinningTeams());

				// adding third place teams
				thirdPlaceTeams.add(sf.semiFinalm1.getLoser());
				thirdPlaceTeams.add(sf.semiFinalm2.getLoser());

				 thirdPlace = new ThirdPlace(thirdPlaceTeams);

				// adding final teams
				finalTeams.add(sf.semiFinalm1.getWinner());
				finalTeams.add(sf.semiFinalm2.getWinner());

				f = new Final(finalTeams);
			}


			public Round16 getR16() {
				return r16;
			}


			public QuarterFinals getQf() {
				return qf;
			}


			public SemiFinals getSf() {
				return sf;
			}


			public ThirdPlace getThirdPlace() {
				return thirdPlace;
			}
           

			public Final getF() {
				return f;
			}


			public Group getGroupA() {
				return groupA;
			}


			public void setGroupA(Group groupA) {
				this.groupA = groupA;
			}


			public Group getGroupB() {
				return groupB;
			}


			public void setGroupB(Group groupB) {
				this.groupB = groupB;
			}


			public Group getGroupC() {
				return groupC;
			}


			public void setGroupC(Group groupC) {
				this.groupC = groupC;
			}


			public Group getGroupD() {
				return groupD;
			}


			public void setGroupD(Group groupD) {
				this.groupD = groupD;
			}


			public Group getGroupE() {
				return groupE;
			}


			public void setGroupE(Group groupE) {
				this.groupE = groupE;
			}


			public Group getGroupF() {
				return groupF;
			}


			public void setGroupF(Group groupF) {
				this.groupF = groupF;
			}


			public Group getGroupG() {
				return groupG;
			}


			public void setGroupG(Group groupG) {
				this.groupG = groupG;
			}


			public Group getGroupH() {
				return groupH;
			}


			public void setGroupH(Group groupH) {
				this.groupH = groupH;
			}

			public JPanel groupTeams(Group group, String groupName, Color color){

				JPanel panel = new JPanel(new GridLayout(5, 1));
				JLabel[] groupString = new JLabel[5];
				groupString[0] = new JLabel(groupName, JLabel.CENTER);
				groupString[0].setFont(new Font("Serif", Font.BOLD, 18));
				groupString[0].setForeground(Color.BLUE);

				groupString[1] =  new JLabel(group.getTeam1().getName(), JLabel.CENTER);
				groupString[1].setFont(new Font("Serif", Font.BOLD, 18));

				groupString[2] = new JLabel(group.getTeam2().getName(), JLabel.CENTER);
				groupString[2].setFont(new Font("Serif", Font.BOLD, 18));

				groupString[3] = new JLabel(group.getTeam3().getName(), JLabel.CENTER);
				groupString[3].setFont(new Font("Serif", Font.BOLD, 18));

				groupString[4] = new JLabel(group.getTeam4().getName(), JLabel.CENTER);
				groupString[4].setFont(new Font("Serif", Font.BOLD, 18));

				panel.setBackground(color);// sets the colour
				for(int i = 0 ; i < groupString.length; i++){
					panel.add(groupString[i]);
				}



				return panel;

			}

			public JPanel groupMatchesResult(Group group, String groupName, Color color) {
				JPanel panel = new JPanel(new GridLayout(7, 1));
				JLabel[] result = new JLabel[7];

				result[0] = new JLabel(groupName, JLabel.CENTER);
				result[0].setFont(new Font("Serif", Font.BOLD, 18));
				result[0].setForeground(Color.BLUE);

				result[1] = new JLabel(group.getGame1Result(), JLabel.CENTER);
				result[1].setFont(new Font("Courier New", Font.BOLD, 15));
				result[1].setForeground(Color.BLACK);

				result[2] = new JLabel(group.getGame2Result(), JLabel.CENTER);
				result[2].setFont(new Font("Courier New", Font.BOLD, 15));
				result[2].setForeground(Color.BLACK);

				result[3] = new JLabel(group.getGame3Result(), JLabel.CENTER);
				result[3].setFont(new Font("Courier New", Font.BOLD, 15));
				result[3].setForeground(Color.BLACK);

				result[4] = new JLabel(group.getGame4Result(), JLabel.CENTER);
				result[4].setFont(new Font("Courier New", Font.BOLD, 15));
				result[4].setForeground(Color.BLACK);

				result[5] = new JLabel(group.getGame5Result(), JLabel.CENTER);
				result[5].setFont(new Font("Courier New", Font.BOLD, 15));
				result[5].setForeground(Color.BLACK);

				result[6] = new JLabel(group.getGame6Result(), JLabel.CENTER);
				result[6].setFont(new Font("Courier New", Font.BOLD, 15));
				result[6].setForeground(Color.BLACK);


				for (int i = 0; i < result.length; i++) {
					panel.add(result[i]);
				}
				panel.setBackground(color);

				return panel;
			}
			public JPanel groupTable(Group group, Color color) {

				
				String h1 = "MP";
				String h2 = "W";
				String h3 = "D";
				String h4 = "L";
				String h5 = "GF";
				String h6 = "GA";
				String h7 = "GD";
				String h8 = "Pts";
			
				JPanel panel = new JPanel(new GridLayout(5, 2));
				JTextArea[] teamLabels = new JTextArea[10];
				
				teamLabels[0] = new JTextArea("Team");
				teamLabels[0].setForeground(Color.RED); 
				teamLabels[0].setOpaque(false);
				
				teamLabels[1] = new JTextArea(String.format(
						" %2s  %2s %2s %2s %2s %2s %2s %2s ", h1, h2, h3, h4, h5, h6, h7, h8));
				teamLabels[1].setForeground(Color.RED); 
				teamLabels[1].setOpaque(false);
				
				teamLabels[2]= new JTextArea(group.getTeam1().getName());
				teamLabels[2].setForeground(Color.BLUE);  
				teamLabels[2].setOpaque(false);
				
				teamLabels[3] = new JTextArea(String.format(
						" %3d  %3d %3d %3d %3d %3d %3d %3d ", 
						group.getTeam1().getTotalGamesPlayed(),
						group.getTeam1().getWin(), group.getTeam1().getDraw(), group
						.getTeam1().getLoss(), group.getTeam1().getGoalsFor(),
						group.getTeam1().getGoalsAgainst(), group.getTeam1()
						.getGoalsDifference(), group.getTeam1()
						.getTotalPoints()));
				teamLabels[3].setForeground(Color.BLACK);
				teamLabels[3].setOpaque(false); 
				
				teamLabels[4]= new JTextArea(group.getTeam2().getName());
				teamLabels[4].setForeground(Color.BLUE);  
				teamLabels[4].setOpaque(false);
				
				teamLabels[5] = new JTextArea(String.format(
						" %3d  %3d %3d %3d %3d %3d %3d %3d ", group.getTeam2().getTotalGamesPlayed(),
						group.getTeam2().getWin(), group.getTeam2().getDraw(), group
						.getTeam2().getLoss(), group.getTeam2().getGoalsFor(),
						group.getTeam2().getGoalsAgainst(), group.getTeam2()
						.getGoalsDifference(), group.getTeam2()
						.getTotalPoints()));
				teamLabels[5].setForeground(Color.BLACK); 
				teamLabels[5].setOpaque(false);
				
				teamLabels[6]= new JTextArea(group.getTeam3().getName());
				teamLabels[6].setForeground(Color.BLUE);  
				teamLabels[6].setOpaque(false);
				
				teamLabels[7] = new JTextArea(String.format(
						" %3d  %3d %3d %3d %3d %3d %3d %3d ", group.getTeam3().getTotalGamesPlayed(),
						group.getTeam3().getWin(), group.getTeam3().getDraw(), group
						.getTeam3().getLoss(), group.getTeam3().getGoalsFor(),
						group.getTeam3().getGoalsAgainst(), group.getTeam3()
						.getGoalsDifference(), group.getTeam3()
						.getTotalPoints()));
				teamLabels[7].setForeground(Color.BLACK);  
				teamLabels[7].setOpaque(false);
				
				teamLabels[8]= new JTextArea(group.getTeam4().getName());
				teamLabels[8].setForeground(Color.BLUE); 
				teamLabels[8].setOpaque(false);
				
				teamLabels[9] = new JTextArea(String.format(
						"%3d  %3d %3d %3d %3d %3d %3d %3d ", group.getTeam4().getTotalGamesPlayed(),
						group.getTeam4().getWin(), group.getTeam4().getDraw(), group
						.getTeam4().getLoss(), group.getTeam4().getGoalsFor(),
						group.getTeam4().getGoalsAgainst(), group.getTeam4()
						.getGoalsDifference(), group.getTeam4()
						.getTotalPoints()));
				
				teamLabels[9].setForeground(Color.BLACK);  
				teamLabels[9].setOpaque(false);
				
				for (int x = 0; x < teamLabels.length; x++) {
					panel.add(teamLabels[x]);
				}
				panel.setBackground(color);
				
				return panel;

			}

   

}
