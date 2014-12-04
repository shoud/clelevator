/**
 * 
 */
package simulation.elevator.moveOptimizer.imp_moveOptimizer;

import simulation.elevator.elevator.int_elevator.IElevator;
import simulation.elevator.moveOptimizer.int_moveOptimizer.IMoveOptimizer;

/**
 * @author uapv1301804
 *
 */
public class MoveOptimizerFactoryImplementation {
	
	public static IMoveOptimizer createMoveOptimizer(IElevator elevator)
	{
		// TODO : to implement
		return new DummyMoveOptimizer(elevator);
	}

}
