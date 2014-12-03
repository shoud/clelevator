/**
 * 
 */
package simulation.elevator.elevator.int_elevator;

import simulation.elevator.elevator.imp_elevator.ElevatorConfiguratorFactoryImplementation;

/** 
 * @author uapv1301804
 */
public class ElevatorConfiguratorFactory{
	
	public static IElevatorConfigurator createElevatorConfigurator()
	{
		return ElevatorConfiguratorFactoryImplementation.createElevatorConfigurator();
	}

}
