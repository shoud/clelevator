/**
 * 
 */
package simulation.elevator.moveOptimizer.int_moveOptimizer;

import simulation.elevator.elevator.int_elevator.IElevatorCommand;
import simulation.elevator.elevator.int_elevator.IElevatorInfo;
import simulation.elevator.moveOptimizer.imp_moveOptimizer.ElevatorInfoFactoryImplementation;

/** 
 * @author uapv1301804
 */
public class ElevatorInfoFactory {
	
	
	public static IElevatorInfo createElevatorInfo(IElevatorCommand elevatorCommand)
	{
		return ElevatorInfoFactoryImplementation.createElevatorInfo(elevatorCommand);
	}

}
