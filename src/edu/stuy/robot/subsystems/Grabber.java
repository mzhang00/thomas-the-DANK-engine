package edu.stuy.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.stuy.robot.RobotMap;
/**
 *
 */
public class Grabber extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

        private Solenoid pistonIn;
        private Solenoid pistonOut;
        private boolean opened;
        
    public Grabber() {
          pistonIn = new Solenoid(RobotMap.PCM_2, RobotMap.GRABBER_SOLENOID_CLOSE);
          pistonOut = new Solenoid(RobotMap.PCM_2,RobotMap.GRABBER_SOLENOID_OPEN);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void toggle() {
        
        if (opened) {
            open(false);
        } else {
            open(true);
        }
        System.out.println("Opened: " + opened);
    }

    /**
     * Changes the state of the can grabber
     * @param open Whether or not the can grabber should be opened.
     */
    
    public void open(boolean open) {
        pistonOut.set(open);
        pistonIn.set(!open);
        opened = open;
    }
}

