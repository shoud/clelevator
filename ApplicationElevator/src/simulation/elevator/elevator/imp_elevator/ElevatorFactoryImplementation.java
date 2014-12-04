package simulation.elevator.elevator.imp_elevator;

import simulation.elevator.elevator.int_elevator.IElevator;


public class ElevatorFactoryImplementation {
	public static IElevator createElevator(){
		return new DummyElevator();
	}

}
