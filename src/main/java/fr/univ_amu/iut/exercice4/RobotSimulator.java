package fr.univ_amu.iut.exercice4;

import java.util.List;

public class RobotSimulator {
    private Robot robot;
    private String instructions;

    public RobotSimulator(Robot robot, String instructions) {
        this.robot = robot;
        this.instructions = instructions;
    }

    public void simulate() {
        for (int i=0; i < instructions.length();i++){
            switch (instructions.charAt(i)){
                case 'L' :
                    robot.turnLeft();
                    break;
                case 'R' :
                    robot.turnRight();
                    break;
                case 'A' :
                    robot.advance();
                    break;

            }
        }
    }

    public List<Movement> getMovements() {
        throw new RuntimeException("Not yet implemented !");
    }
}
