package edu.stuy.robot.commands;

import edu.stuy.Robot;
import edu.stuy.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;

public class DrivetrainControlCommand extends Command {
	
    public DrivetrainControlCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double rightWheel = 0.25 * Robot.oi.gamepad.getRightY();
    	double leftWheel =  0.25 * Robot.oi.gamepad.getLeftY();
    	System.out.println(rightWheel);
    	System.out.println(leftWheel);
    	
        Robot.drivetrain.tankDrive(leftWheel,rightWheel);
    }
  
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
