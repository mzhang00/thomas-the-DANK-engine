package org.usfirst.frc.team694.robot.subsystems;

import org.usfirst.frc.team694.robot.RobotMap;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Thomas extends Subsystem {

    TalonSRX leftMotor;
	TalonSRX rightMotor;
	
	public Thomas(){
		leftMotor = new TalonSRX(RobotMap.LEFT_MOTOR);
		rightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void tankDrive (double left, double right){
		leftMotor.set(left); //Did you just assume the orientation of the Robot?
		rightMotor.set(right);
		}

	public void tankStop()
	{
	   tankDrive(0,0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    }
}
