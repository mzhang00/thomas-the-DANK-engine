package edu.stuy.robot.subsystems;

import com.ctre.CANTalon;

import edu.stuy.robot.RobotMap;
import edu.stuy.robot.commands.DrivetrainControlCommand;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    CANTalon frontLeftMotor;
    CANTalon frontRightMotor;
    CANTalon backLeftMotor;
    CANTalon backRightMotor;

	public Drivetrain() {
		frontLeftMotor = new CANTalon(RobotMap.FRONT_LEFT_MOTOR);
		frontRightMotor = new CANTalon(RobotMap.FRONT_RIGHT_MOTOR);
		backLeftMotor = new CANTalon(RobotMap.BACK_LEFT_MOTOR);
        backRightMotor = new CANTalon(RobotMap.BACK_RIGHT_MOTOR);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void tankDrive (double left, double right){
		frontLeftMotor.set(left); //Did you just assume the orientation of the Robot?
		backLeftMotor.set(left);
		frontRightMotor.set(-1.0 * right);
		backRightMotor.set(-1.0 * right);
	}

	public void tankStop() {
	   tankDrive(0,0);
	}

    public void initDefaultCommand() {
        setDefaultCommand( new DrivetrainControlCommand() );
    }
}
