package org.usfirst.frc.team694.robot.commands;

import org.usfirst.frc.team694.robot.Robot;
import org.usfirst.frc.team694.robot.subsystems.Thomas;

import edu.wpi.first.wpilibj.command.Command;

public class FatConductorCommand extends Command {
	
    public FatConductorCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.thomas);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double rightWheel = Robot.oi.gamepad.getRightY();
    	double leftWheel = Robot.oi.gamepad.getLeftY();
    	System.out.println(rightWheel);
    	System.out.println(leftWheel);
    	
        Robot.thomas.tankDrive(leftWheel,rightWheel);
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
