package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
 	Robot B = new Robot ();
 	B.setSpeed(10);
 	B.penDown();
 	B.setRandomPenColor();
 	B.move(300);
 	B.turn(90);
	B.move(100);
	B.turn(90);
	B.move(300);
	B.penUp();
	B.move(-150);
	B.setRandomPenColor();
	B.penDown();
	B.turn(-90);
	B.move(-100);
}
}
