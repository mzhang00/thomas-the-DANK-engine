package edu.stuy.robot;

import org.usfirst.frc.team694.util.Gamepad;

import edu.stuy.robot.commands.AcquirerAcquireCommand;
import edu.stuy.robot.commands.AcquirerDeacquireCommand;
import edu.stuy.robot.commands.AcquirerStopCommand;
import edu.stuy.robot.commands.ArmToggleCommand;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	public Gamepad gamepad = new Gamepad(RobotMap.GAMEPAD);
	
	public OI() {
	    gamepad.getLeftBumper().whileHeld(new AcquirerAcquireCommand());
	    gamepad.getRightBumper().whileHeld(new AcquirerDeacquireCommand());
	    gamepad.getLeftBumper().whenReleased(new AcquirerStopCommand());
	    gamepad.getRightBumper().whenReleased(new AcquirerStopCommand());

	    gamepad.getBottomButton().whenPressed( new ArmToggleCommand() );//Open and close top grabber
	    
	    gamepad.getLeftButton().whenPressed( new ArmToggleCommand() );//Used for toggling the state

	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}