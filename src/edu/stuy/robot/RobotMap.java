package edu.stuy.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

    // USB ports
	public static final int GAMEPAD = 0;

	// PWM ports
	public static final int FRONT_LEFT_MOTOR =  1;
	public static final int BACK_LEFT_MOTOR =   2;
	public static final int FRONT_RIGHT_MOTOR = 3;
    public static final int BACK_RIGHT_MOTOR =  4;

	// Digital ports
	public static final int LEFT_ACQUIRER =   5;
	public static final int RIGHT_ACQUIRER =  6;
	
	// Solenoid ports
	public static final int GRABBER_SOLENOID_OPEN =  1;
	public static final int GRABBER_SOLENOID_CLOSE = 2;
    
}
