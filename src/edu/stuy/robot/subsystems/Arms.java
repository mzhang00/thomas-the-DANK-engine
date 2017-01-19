package edu.stuy.robot.subsystems;

import edu.stuy.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Arms extends Subsystem {
    
    private Solenoid shortIn;
    private Solenoid shortOut;
    private Solenoid longIn;
    private Solenoid longOut;
    
    private int extensionLevel;
    //extensionLevel describes the level of the extension of the arms. 3 lvls 0=closed 1=semiopen 2=open
    

    public Arms() {
        shortIn = new Solenoid(RobotMap.PCM_1, RobotMap.ARM_SOLENOID_SHORT_CLOSE );
        shortOut = new Solenoid(RobotMap.PCM_1, RobotMap.ARM_SOLENOID_SHORT_OPEN );
        longIn = new Solenoid(RobotMap.PCM_1, RobotMap.ARM_SOLENOID_LONG_CLOSE );
        longOut = new Solenoid(RobotMap.PCM_1, RobotMap.ARM_SOLENOID_LONG_OPEN );
        
        extensionLevel = 0;
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void shortArm(boolean open){
        shortOut.set(open);
        shortIn.set(!open);
    }

    public void longArm(boolean open){
        longOut.set(open);
        longIn.set(!open);
    }
    public void interpretLevel(int extensionLevel){
        if(extensionLevel == 0){
            shortArm(false);
            longArm(false);
        }else if(extensionLevel == 1){
            shortArm(true);
            longArm(false);
           
        }else{
            shortArm(true);
            longArm(true);
        }
    }

    
}

    