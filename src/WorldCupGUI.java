import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WorldCupGUI extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainPanel = new JPanel();
	private JPanel leftPanel = new JPanel();
	private JPanel leftMiddlePanel = new JPanel();
	private JPanel rightMiddlePanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private WorldCup worldCup = new WorldCup();
	private JButton[] buttons = new JButton[16];
	private boolean on = false;
	
	public WorldCupGUI() throws IOException {

		super("WORLD CUP 2014");
		 
		// manage layouts
		mainPanel.setLayout(new GridLayout(1, 4));
		leftPanel.setLayout(new GridLayout(4, 1));
		leftMiddlePanel.setLayout(new GridLayout(4, 1));
		rightPanel.setLayout(new GridLayout(4, 1));
		
		rightMiddlePanel.setLayout(new BorderLayout());
		
	    
		JPanel center = new JPanel();
	    center.setBackground(Color.YELLOW);
	    
	    JPanel south  = new JPanel();
        south.setBackground(Color.BLUE);
        ImageIcon icon = new ImageIcon("src//fifa2014.jpg");
        JLabel label = new JLabel(icon);
    
      
        rightMiddlePanel.add(label, BorderLayout.CENTER); //places image on the centre of leftMiddlePanel
        rightMiddlePanel.add(south , BorderLayout.SOUTH);
       

		
		// add to main panel
       
		mainPanel.add(leftPanel);
		mainPanel.add(leftMiddlePanel);
		mainPanel.add(rightMiddlePanel);
		mainPanel.add(rightPanel);
		

		leftPanel.setBackground(Color.green);
		leftMiddlePanel.setBackground(Color.blue);
		rightMiddlePanel.setBackground(Color.cyan);
		rightPanel.setBackground(Color.yellow);

		// Adding group Images
		leftPanel.add(worldCup.groupTeams(worldCup.getGroupA(), "Group A", Color.WHITE));
		leftPanel.add(worldCup.groupTeams(worldCup.getGroupB(), "Group B", Color.YELLOW));
		leftPanel.add(worldCup.groupTeams(worldCup.getGroupC(), "Group C", Color.WHITE));		
		leftPanel.add(worldCup.groupTeams(worldCup.getGroupD(), "Group D", Color.YELLOW));
		 
		 
		 
		rightMiddlePanel.add(displayGUIButtons(), BorderLayout.SOUTH);
		
		
		
		rightPanel.add(worldCup.groupTeams(worldCup.getGroupE(), "Group E", Color.WHITE));
		rightPanel.add(worldCup.groupTeams(worldCup.getGroupF(), "Group F", Color.YELLOW));
		rightPanel.add(worldCup.groupTeams(worldCup.getGroupG(), "Group G", Color.WHITE));
		rightPanel.add(worldCup.groupTeams(worldCup.getGroupH(), "Group H", Color.YELLOW));
		
		
			
		// adding to main frame
	
		add(mainPanel);
	
		for (int x = 0; x < buttons.length; x++) {
			buttons[x].addActionListener(this);
		}
		buttons[1].setEnabled(false);
		buttons[2].setEnabled(false);
		buttons[3].setEnabled(false);
		buttons[4].setEnabled(false);
		buttons[5].setEnabled(false);
		buttons[6].setEnabled(false);
		buttons[7].setEnabled(false);
		buttons[8].setEnabled(false);
		buttons[9].setEnabled(false);   
		buttons[10].setEnabled(false);
		buttons[11].setEnabled(false);
		buttons[12].setEnabled(false);
		buttons[13].setEnabled(false);
		buttons[15].setEnabled(false);
		

	}// end no args constructor

	

	public JPanel displayGUIButtons() {
		JPanel panel = new JPanel(new GridLayout(8, 2));

		buttons[0] = new JButton("Run Group A Matches");
		buttons[1] = new JButton("Run Group B Matches");
		buttons[2] = new JButton("Run Group C Matches");
		buttons[3] = new JButton("Run Group D Matches");
		buttons[4] = new JButton("Run Group E Matches");
		buttons[5] = new JButton("Run Group F Matches");
		buttons[6] = new JButton("Run Group G Matches");
		buttons[7] = new JButton("Run Group H Matches");
		buttons[8] = new JButton("Display All Group Tables");
		buttons[9] = new JButton("Show Round16 Games");
		buttons[10] = new JButton("Show Quarter Final Games");
		buttons[11] = new JButton("Show Semi Final Games");
		buttons[12] = new JButton("Show Third Place Game");
		buttons[13] = new JButton("Show Final Game");
		buttons[14] = new JButton("Exit");
		buttons[15] = new JButton("PlayAgain");

		for (int x = 0; x < buttons.length; x++) {
			panel.add(buttons[x]);
		}

		return panel;

	}
	
	

	public static void main(String[] args) throws IOException {

		WorldCupGUI wCup = new WorldCupGUI();
		wCup.setSize(1677, 1005); // sets the size
       	wCup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate on exit
		wCup.setVisible(true); // Make JFrame visible
		

	}// end method main

	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {

		if (actionEvent.getSource() == buttons[0]) {

			leftPanel.remove(0); // removes component at index 0
			leftPanel.add(worldCup.groupMatchesResult(worldCup.getGroupA(), "Group A", Color.cyan), 0); // adds panel at index 0
			leftPanel.revalidate(); // if you add jpanel it need to be
			leftPanel.repaint(); // revalidate and repaint
			buttons[0].setEnabled(false);
			buttons[1].setEnabled(true);
		} else if (actionEvent.getSource() == buttons[1]) {

			leftPanel.remove(1); // removes component at index 1
			leftPanel.add(worldCup.groupMatchesResult(worldCup.getGroupB(),"Group B",  Color.yellow), 1);  // adds at index 1
			leftPanel.revalidate(); // if you add jpanel it need to be revalidate and repaint
			leftPanel.repaint();
			buttons[1].setEnabled(false);
			buttons[2].setEnabled(true);
		} else if (actionEvent.getSource() == buttons[2]) {

			leftPanel.remove(2); // removes component at index 2
			leftPanel.add(worldCup.groupMatchesResult(worldCup.getGroupC(),"Group C", Color.cyan), 2); // adds at index2
			leftPanel.revalidate(); // if you add jpanel it need to be revalidate and repaint
			leftPanel.repaint();
			buttons[2].setEnabled(false);
			buttons[3].setEnabled(true);
		} else if (actionEvent.getSource() == buttons[3]) {

			leftPanel.remove(3); // removes component at index 3
			leftPanel.add(worldCup.groupMatchesResult(worldCup.getGroupD(), "Group D", Color.white), 3); // adds at index  3
			leftPanel.revalidate(); // if you add jpanel it need to be
			leftPanel.repaint(); // revalidate and repaint
			buttons[3].setEnabled(false);
			buttons[4].setEnabled(true);
		} else if (actionEvent.getSource() == buttons[4]) {

			rightPanel.remove(0); // removes component at index 0
			rightPanel.add(
			worldCup.groupMatchesResult(worldCup.getGroupE(), "Group E",Color.yellow), 0); // adds at index 0
			rightPanel.revalidate(); // if you add jpanel it need to be
			rightPanel.repaint();  // revalidate and repaint
			buttons[4].setEnabled(false);
			buttons[5].setEnabled(true);
		} else if (actionEvent.getSource() == buttons[5]) {

			rightPanel.remove(1); // removes component at index 0
			rightPanel.add(worldCup.groupMatchesResult(worldCup.getGroupF(), "Group F",Color.white), 1); // adds at index 1
			rightPanel.revalidate(); // if you add jpanel it need to be
			rightPanel.repaint(); // revalidate and repaint
			buttons[5].setEnabled(false);
			buttons[6].setEnabled(true);
		} else if (actionEvent.getSource() == buttons[6]) {

			rightPanel.remove(2); // removes component at index 0
			rightPanel.add(
			worldCup.groupMatchesResult(worldCup.getGroupG(), "Group G", Color.cyan), 2); // adds at index 2
			rightPanel.revalidate(); // if you add jpanel it need to be revalidate and repaint
			rightPanel.repaint();
			buttons[6].setEnabled(false);
			buttons[7].setEnabled(true);
		} else if(actionEvent.getSource() == buttons[7]) {

			rightPanel.remove(3); // removes component at index 3
			rightPanel.add(worldCup.groupMatchesResult(worldCup.getGroupH(),"Group H", Color.white), 3); // adds at index 3
			rightPanel.revalidate(); // if you add jpanel it need to be
			rightPanel.repaint();  // revalidate and repaint
			buttons[7].setEnabled(false);
			buttons[8].setEnabled(true);
		}else if (actionEvent.getSource() == buttons[8]) {
			leftPanel.remove(0);
			leftPanel.add(worldCup.groupTable(worldCup.getGroupA(), Color.yellow), 0);
			leftPanel.revalidate();
			leftPanel.repaint();
			
			
			
			
			leftPanel.remove(1);
			leftPanel.add(worldCup.groupTable(worldCup.getGroupB(), Color.cyan),1);
			leftPanel.revalidate();
			leftPanel.repaint();
			
			leftPanel.remove(2);
			leftPanel.add(worldCup.groupTable(worldCup.getGroupC(), Color.white),2);
			leftPanel.revalidate();
			leftPanel.repaint();
			
			leftPanel.remove(3);
			leftPanel.add(worldCup.groupTable(worldCup.getGroupD(), Color.cyan),3);
			leftPanel.revalidate();
			leftPanel.repaint();
			
			rightPanel.remove(0);
			rightPanel.add(worldCup.groupTable(worldCup.getGroupE(), Color.white), 0);
			rightPanel.revalidate();
			rightPanel.repaint();
			
			rightPanel.remove(1);
			rightPanel.add(worldCup.groupTable(worldCup.getGroupF(), Color.yellow), 1);
			rightPanel.revalidate();
			rightPanel.repaint();
			
			rightPanel.remove(2);
			rightPanel.add(worldCup.groupTable(worldCup.getGroupG(), Color.white), 2);
			rightPanel.revalidate();
			rightPanel.repaint();
			
			rightPanel.remove(3);
			rightPanel.add(worldCup.groupTable(worldCup.getGroupH(), Color.cyan), 3);
			rightPanel.revalidate();
			rightPanel.repaint();
			
			buttons[8].setEnabled(false);
			buttons[9].setEnabled(true);
		}else if (actionEvent.getSource() == buttons[9]) {
			if(!on){
				    leftMiddlePanel.add(worldCup.getR16().displayR16Fixtures(Color.cyan));
					leftMiddlePanel.revalidate();
					leftMiddlePanel.repaint();
					buttons[9].setText("Run Round16 Matches"); 
					on = true;
			}else if(on){
				
				leftMiddlePanel.remove(0);
				leftMiddlePanel.add(worldCup.getR16().displayR16MatchesResult(Color.WHITE), 0);
				leftMiddlePanel.revalidate();
				leftMiddlePanel.repaint();
				on = false;
				buttons[9].setEnabled(false);
				buttons[10].setEnabled(true);
			}
			
			
		}else if (actionEvent.getSource() == buttons[10]) {
			if(!on){
			    leftMiddlePanel.add(worldCup.getQf().displayQFinalFixtures(Color.cyan));
				leftMiddlePanel.revalidate();
				leftMiddlePanel.repaint();
				buttons[10].setText("Run QuarterFinal Matches"); 
				on = true;
		     }else if(on){
			
				leftMiddlePanel.remove(1);
				leftMiddlePanel.add(worldCup.getQf().displayQFinalMatchesResult(Color.cyan), 1);
				leftMiddlePanel.revalidate();
				leftMiddlePanel.repaint();
				on = false;
				buttons[10].setEnabled(false);
				buttons[11].setEnabled(true);
		     }
			
			
			
		}else if (actionEvent.getSource() == buttons[11]) {
			if(!on){
			    leftMiddlePanel.add(worldCup.getSf().displaySemiFinalFixtures(Color.cyan));
				leftMiddlePanel.revalidate();
				leftMiddlePanel.repaint();
				buttons[11].setText("Run Semi Final Matches"); 
				on = true;
		     }else if(on){
			
				leftMiddlePanel.remove(2);
				leftMiddlePanel.add(worldCup.getSf().displaySemiFinalMatchesResult(Color.WHITE), 2);
				leftMiddlePanel.revalidate();
				leftMiddlePanel.repaint();
				on = false;
				buttons[11].setEnabled(false);
				buttons[12].setEnabled(true);
		     }
			
			
			
		}
		else if (actionEvent.getSource() == buttons[12]) {
			if(!on){
				leftMiddlePanel.add(worldCup.getThirdPlace().displayThirdPlacelFixtures(Color.yellow));
				leftMiddlePanel.revalidate();
			    leftMiddlePanel.repaint();
				buttons[12].setText("Run ThirdPlace Match"); 
				on = true;
		     }else if(on){
			
		    	 leftMiddlePanel.remove(3);
		    	 leftMiddlePanel.add(worldCup.getThirdPlace().displayThirdPlaceMatchesResult(Color.yellow), 3);
		    	 leftMiddlePanel.revalidate();
		    	 leftMiddlePanel.repaint();
		    	 on = false;
				buttons[12].setEnabled(false);
				buttons[13].setEnabled(true);
		     }
			
			
			
		}else if (actionEvent.getSource() == buttons[13]) {
			if(!on){
			    rightMiddlePanel.add(worldCup.getF().displayFinalFixture(), BorderLayout.NORTH);
			    rightMiddlePanel.revalidate();
			    rightMiddlePanel.repaint();
				buttons[13].setText("Run Final Match"); 
				on = true;
		     }else if(on){
		          BorderLayout layout = (BorderLayout) rightMiddlePanel.getLayout();
		    	  rightMiddlePanel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
		    	
		    	 rightMiddlePanel.add(worldCup.getF().displayFinalMatchResult(Color.yellow), BorderLayout.CENTER);
		    	 rightMiddlePanel.revalidate();
		    	 rightMiddlePanel.repaint();
		    	
				on = false;
				buttons[13].setEnabled(false);
				buttons[15].setEnabled(true);
				
		     }
			
			
			
		}else if(actionEvent.getSource() == buttons[14]){ 
			  System.exit(0);
			
		}else if(actionEvent.getSource() == buttons[15]){ 
					this.dispose();
					try {
						WorldCupGUI.main(null);
					} catch (IOException e) {
						
						e.printStackTrace();
					}   
			
		}
		
	}
}// end class

