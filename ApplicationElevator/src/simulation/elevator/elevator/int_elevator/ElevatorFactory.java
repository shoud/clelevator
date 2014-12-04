package simulation.elevator.elevator.int_elevator;

import simulation.elevator.elevator.imp_elevator.ElevatorFactoryImplementation;

public class ElevatorFactory {
	public static IElevator createElevator(){
		return ElevatorFactoryImplementation.createElevator();
	}

}
