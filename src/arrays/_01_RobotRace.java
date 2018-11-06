package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot[] boi = new Robot[8];
	//3. use a for loop to initialize the robots.
	for (int i = 0; i < boi.length; i++) {
		boi[i] = new Robot();
		boi[i].moveTo(250+ i*100, 550);
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean ayy = false; 
	while (ayy == false) {
	for (int j = 0; j < boi.length; j++) {
		boi[j].setSpeed(100);
		Random ran = new Random();
		int esketit = ran.nextInt(50);
		boi[j].move(esketit);
		if(boi[j].getY() <= 50) {
			ayy = true;
			JOptionPane.showMessageDialog(null, "Robot #" + j + " wins the race!!!");
			break;
		}
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
