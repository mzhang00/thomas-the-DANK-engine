package edu.stuy.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

import edu.stuy.robot.RobotMap;
import edu.stuy.robot.commands.AcquirerControlCommand;

/**
 *
 */
public class Acquirer extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from commands.
    private CANTalon rightAcquirer;
    private CANTalon leftAcquirer;

    public Acquirer() {
        rightAcquirer = new CANTalon(RobotMap.RIGHT_ACQUIRER);
        leftAcquirer = new CANTalon(RobotMap.LEFT_ACQUIRER);
    }

    public void acquire(double left, double right){
        rightAcquirer.set(right);
        leftAcquirer.set(left);
    }
    public void stop(){
        acquire(0,0);
    }
    public void initDefaultCommand() {
        setDefaultCommand(new AcquirerControlCommand());
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
