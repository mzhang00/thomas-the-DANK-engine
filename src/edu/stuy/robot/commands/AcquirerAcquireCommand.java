package edu.stuy.robot.commands;

import edu.stuy.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AcquirerAcquireCommand extends Command {

    public AcquirerAcquireCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.acquirer);        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.acquirer.acquire(-1.0, 1.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {// Kevin was here
    }
}
