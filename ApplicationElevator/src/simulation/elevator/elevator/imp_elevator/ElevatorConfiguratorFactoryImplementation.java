package simulation.elevator.elevator.imp_elevator;

import simulation.elevator.elevator.int_elevator.IElevatorConfigurator;

public class ElevatorConfiguratorFactoryImplementation {
	
	public static IElevatorConfigurator createElevatorConfigurator()
	{
		System.out.println("ElevatorConfigurator created");
		return new DummyElevator();
	}

}
