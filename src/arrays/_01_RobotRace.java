package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] rob=new Robot[5];

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.
	int k = 0;
for(int i = 0; i<rob.length;i++) {
	rob[i]=new Robot();
	rob[i].setY(600);
	k+=125;
	rob[i].setX(k);
	
}

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
while(rob[0].getY()>0&&rob[1].getY()>0&&rob[2].getY()>0&&rob[3].getY()>0&&rob[4].getY()>0) {
for(int i =0;i<5;i++) {
	Random ran= new Random();
	
	int g = ran.nextInt(50);
	
	
		if(rob[i].getY()>0) {
			rob[i].move(g);
		}
		
	
}
}

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
