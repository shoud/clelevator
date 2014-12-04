package simulation.elevator.elevator_UI.int_elevator_UI;

import simulation.elevator.elevator_UI.imp_elevator_UI.ElevatorUIFactoryImplementation;
import simulation.elevator.moveOptimizer.int_moveOptimizer.IMoveOptimizer;

public class ElevatorUIFactory {

	public static IElevatorUI createElevatorUI(IMoveOptimizer moveOptimizer){
		return ElevatorUIFactoryImplementation.createElevatorUI(moveOptimizer);
	}
}
