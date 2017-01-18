package edu.stuy.robot.subsystems;

import com.ctre.CANTalon;

import edu.stuy.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Acquirer extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from commands.
    private CANTalon rightAcquirer;
    private CANTalon leftAcquirer;
    
    //private Solenoid piston;
    

    public Acquirer() {
        rightAcquirer = new CANTalon(RobotMap.RIGHT_ACQUIRER);
        leftAcquirer = new CANTalon(RobotMap.LEFT_ACQUIRER);
        
        //piston = new Solenoid(RobotMap.GRABBER_SOLENOID_OPEN,RobotMap.GRABBER_SOLENOID_CLOSE);
    }

    public void acquire(double left, double right){
        rightAcquirer.set(right);
        leftAcquirer.set(left);
       
    }
    
    public void stop(){
        acquire(0,0);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
