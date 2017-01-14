package edu.stuy.robot.commands;

import edu.stuy.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AcquirerControlCommand extends Command {

    public AcquirerControlCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.acquirer);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double rightAcquirer = 0.0;
        double leftAcquirer = 0.0;
        
        if (Robot.oi.gamepad.getRawRightTrigger()) {
            rightAcquirer = -1.0;
            leftAcquirer = 1.0;
        }
        if (Robot.oi.gamepad.getRawLeftTrigger()) {
            rightAcquirer = 1.0;
            leftAcquirer = -1.0;
        }
        
        System.out.println("rightA: " + rightAcquirer);
        System.out.println("leftA: " + leftAcquirer);

        Robot.acquirer.acquire(leftAcquirer, rightAcquirer);
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
