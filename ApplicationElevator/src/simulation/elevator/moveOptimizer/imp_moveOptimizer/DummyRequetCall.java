package simulation.elevator.moveOptimizer.imp_moveOptimizer;

import simulation.elevator.commonType.Direction;

public class DummyRequetCall {

	int level;
	Direction direction;
	
	public DummyRequetCall(int level, Direction direction) {
		this.level = level;
		this.direction = direction;
	}
	public int getLevel()
	{
		return this.level;
	}
	public Direction getDirection()
	{
		return this.direction;
	}
}
