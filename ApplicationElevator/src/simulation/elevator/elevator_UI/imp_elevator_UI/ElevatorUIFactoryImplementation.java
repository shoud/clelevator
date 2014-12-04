package simulation.elevator.elevator_UI.imp_elevator_UI;

import simulation.elevator.elevator_UI.int_elevator_UI.IElevatorUI;
import simulation.elevator.moveOptimizer.int_moveOptimizer.IMoveOptimizer;


public class ElevatorUIFactoryImplementation {
	public static IElevatorUI createElevatorUI(IMoveOptimizer moveOptimizer){
		return new ElevatorUI(moveOptimizer);
	}

}
