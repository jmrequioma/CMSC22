package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

@SuppressWarnings("serial")
public class RockPaperScissorsLizardSpock extends Frame {
	private Label display;
	private Label p1lbl;
	private Label messg;
	private TextField p1fld;
	private Label p2lbl;
	private TextField p2fld;
	private CheckboxGroup choices;
	private Checkbox rock;
	private Checkbox paper;
	private Checkbox scissors;
	private Checkbox lizard;
	private Checkbox spock;
	private TextArea ta;
	private Button btnPlay;
	private Button ok;
	private Dialog dlog;
	
	private int p1score;
	private int p2score;
	
	public RockPaperScissorsLizardSpock() {
		setLayout(new FlowLayout());
		
		display = new Label("Your choice: ");
		p1lbl = new Label("Player's Score ");
		p2lbl = new Label("Computer's Score ");
		messg = new Label();
		p1fld = new TextField();
		p2fld = new TextField();
		choices = new CheckboxGroup();
		rock = new Checkbox("Rock", choices, false);
		paper = new Checkbox("Paper", choices, false);
		scissors = new Checkbox("Scissors", choices, false);
		lizard = new Checkbox("Lizard", choices, false);
		spock = new Checkbox("Spock", choices, false);
		ta = new TextArea("Result:\n");
		btnPlay = new Button("RockPaperScissorsLizardSpock!");
		ok = new Button("OK");
		dlog = new Dialog(this, "Game Over!", Dialog.ModalityType.DOCUMENT_MODAL);
		dlog.setLayout(new FlowLayout());
		dlog.add(messg);
		dlog.setSize(200, 200);
		ok.setSize(10, 10);
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p1fld.setText("0");
				p2fld.setText("0");
				p1score = 0;
				p2score = 0;
				ta.setText("Result:\n");
				dlog.dispose();
			}
			
		});
		dlog.add(ok);
		dlog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
		
		
		
		ta.setEditable(false);
		p1fld.setEditable(false);
		p2fld.setEditable(false);
		
		btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String wnnr = "";
        		String compChoice = compChoice();
                if (rock.getState() == true) {
                	if (compChoice == "lizard" || compChoice == "scissors") {
                		p1fld.setText(Integer.toString(++p1score));
                		ta.append("Player chose ROCK\n" + "Computer chose " + compChoice + "\n\n" + "YOU WIN THIS ROUND.\n\n");
                	} else if (compChoice == "spock" || compChoice == "paper") {
                		p2fld.setText(Integer.toString(++p2score));
                		ta.append("Player chose ROCK\n" + "Computer chose " + compChoice + "\n\n" + "COMPUTER WINS THIS ROUND.\n\n");
                		
                	} else {
                		ta.append("Player chose ROCK\n" + "Computer chose " + compChoice + "\n\n" + "ROUND DRAW.\n\n");
                	}
                } else if (paper.getState() == true){
                	if (compChoice == "rock" || compChoice == "spock") {
                		p1fld.setText(Integer.toString(++p1score));
                		ta.append("Player chose PAPER\n" + "Computer chose " + compChoice + "\n\n" + "YOU WIN THIS ROUND.\n\n");
                	} else if (compChoice == "scissors" || compChoice == "lizard") {
                		p2fld.setText(Integer.toString(++p2score));
                		ta.append("Player chose PAPER\n" + "Computer chose " + compChoice + "\n\n" + "COMPUTER WINS THIS ROUND.\n\n");
                	} else {
                		ta.append("Player chose PAPER\n" + "Computer chose " + compChoice + "\n\n" + "ROUND DRAW.\n\n");
                	}
                } else if (scissors.getState() == true){
                	if (compChoice == "lizard" || compChoice == "paper") {
                		p1fld.setText(Integer.toString(++p1score));
                		ta.append("Player chose SCISSORS\n" + "Computer chose " + compChoice + "\n\n" + "YOU WIN THIS ROUND.\n\n");
                	} else if (compChoice == "rock" || compChoice == "spock") {
                		p2fld.setText(Integer.toString(++p2score));
                		ta.setText("Player chose SCISSORS\n" + "Computer chose " + compChoice + "\n\n" + "COMPUTER WINS THIS ROUND.\n\n");
                	} else {
                		ta.append("Player chose SCISSORS\n" + "Computer chose " + compChoice + "\n\n" + "ROUND DRAW.\n\n");
                	}
                } else if (lizard.getState() == true){
                	if (compChoice == "spock" || compChoice == "paper") {
                		p1fld.setText(Integer.toString(++p1score));
                		ta.append("Player chose LIZARD\n" + "Computer chose " + compChoice + "\n\n" + "YOU WIN THIS ROUND.\n\n");
                	} else if (compChoice == "rock" || compChoice == "scissors") {
                		p2fld.setText(Integer.toString(++p2score));
                		ta.append("Player chose LIZARD\n" + "Computer chose " + compChoice + "\n\n" + "COMPUTER WINS THIS ROUND.\n\n");
                	} else {
                		ta.append("Player chose LIZARD\n" + "Computer chose " + compChoice + "\n\n" + "ROUND DRAW.\n\n");
                	}
                } else if (spock.getState() == true){
                	if (compChoice == "scissors" || compChoice == "rock") {
                		p1fld.setText(Integer.toString(++p1score));
                		ta.append("Player chose SPOCK\n" + "Computer chose " + compChoice + "\n\n" + "YOU WIN THIS ROUND.\n\n");
                	} else if (compChoice == "paper" || compChoice == "lizard") {
                		p2fld.setText(Integer.toString(++p2score));
                		ta.append("Player chose SPOCK\n" + "Computer chose " + compChoice + "\n\n" + "COMPUTER WINS THIS ROUND.\n\n");
                	} else {
                		ta.append("Player chose SPOCK\n" + "Computer chose " + compChoice + "\n\n" + "ROUND DRAW.\n\n");
                	} 
                }
                if (p1score == 5 || p2score == 5) {
                	if (p1score > p2score) {
            			wnnr = "Player 1";
            		} else {
            			wnnr = "Computer";
            		}
                	messg.setText("Game Over! " + wnnr + " won.");
            		dlog.setVisible(true);

                }
            }
        });
		
		add(display);
		add(rock);
		add(paper);
		add(scissors);
		add(lizard);
		add(spock);
		add(ta);
		add(btnPlay);
		add(p1lbl);
		add(p1fld);
		add(p2lbl);
		add(p2fld);
		
		setTitle("Rock Paper Scissors Lizard Spock");
        setSize(500, 500);
        setVisible(true);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
	}
	
	public String compChoice() {
		Random rand = new Random();
		int randomNum = rand.nextInt(5) + 1;
		String answer = "";
		if (randomNum == 1) {
			answer = "rock";
		} else if (randomNum == 2) {
			answer = "paper";
		} else if (randomNum == 3) {
			answer = "scissors";
		} else if (randomNum == 4) {
			answer = "lizard";
		} else {
			answer = "spock";
		}
		return answer;
	}
	public static void main(String[] args) {

        new RockPaperScissorsLizardSpock();
    }
}
