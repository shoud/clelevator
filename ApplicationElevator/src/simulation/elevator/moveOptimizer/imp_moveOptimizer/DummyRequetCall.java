package simulation.elevator.moveOptimizer.imp_moveOptimizer;

import simulation.elevator.commonType.Direction;

public class DummyRequetCall {

	int level;
	int destination;
	Direction direction;
	
	public DummyRequetCall(int level, Direction direction, int destination) {
		this.level = level;
		this.direction = direction;
		this.destination = destination;
	}
	public int getLevel()
	{
		return this.level;
	}
	public Direction getDirection()
	{
		return this.direction;
	}
	public int getDestination()
	{
		return destination;
	}
}
