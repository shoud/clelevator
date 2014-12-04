package simulation.elevator.elevator.imp_elevator;

// Start of user code to add imports for Elevator
 
import simulation.elevator.commonType.Direction;
import simulation.elevator.commonType.ElevatorCageState;
import simulation.elevator.commonType.ElevatorState;
import simulation.elevator.commonType.SensorLocation;
import simulation.elevator.commonType.SensorState;
import simulation.elevator.elevator.int_elevator.IElevatorConfigurator;
import simulation.elevator.elevator.int_elevator.IElevatorCommand;
import simulation.elevator.elevator.int_elevator.IElevatorInfo;

// End of user code

/**
 * Description of the class Elevator.
 * @uml.dependency   supplier="simulation.elevator.elevator.int_elevator.IElevatorInfo"
 */

public class DummyElevator implements IElevatorCommand, IElevatorConfigurator, IElevatorInfo {

	// *** Enum ***
	Direction direction;
	ElevatorCageState cageState;
	ElevatorState elevState;
	SensorLocation sensorLocation; 		// *** Inutile ? ***
	SensorState sensorState; 			// *** Inutile ? ***
	
	long speed;	
	
	int levelNb;
	int currentLevel;
	long distanceBtw;
	
	DummyElevator(){}
	
	@Override
	public void setParam(){/*Direction direction, ElevatorCageState cageState, ElevatorState elevState, long speed, int currentLevel, int levelNb, long distanceBtw) {*/
		// *** Config Manuel ***
		this.direction = Direction.UP;// = direction;
		this.cageState = ElevatorCageState.CLOSED;// = cageState;
		this.elevState = ElevatorState.SLEEPING; //= elevState;
		this.speed = 50 ; //= speed; (cm par seconde ?)
		this.currentLevel = 0; //= currentLevel;
		this.levelNb = 10; // = levelNb;
		this.distanceBtw = 2; // =distanceBtw; // Distance entre deux étages;
		
	}

	
	@Override
	public void move(Object direction) {
		
		long currentTime = 0;
		long time = System.currentTimeMillis(); // On récupère le temps
		cageState = ElevatorCageState.CLOSED;
		elevState = ElevatorState.MOVING; 
		/* Normalement il faut verifier que les portes soient fermées pour que l'ascenseur bouge 
		 * et du coup verifier que l'ascenseur bouge pour commencer a le faire bouger.*/
		int saveLevel = this.currentLevel;
		if(direction == Direction.UP){
			
			while (this.currentLevel != saveLevel+1 && this.currentLevel < this.levelNb){
				
				currentTime = System.currentTimeMillis() - time; 		// currentTime = le temps écoulé depuis que l'on a lancé move();
				long currentDistance = this.speed * currentTime; 		// Nous donne la distance parcouru
				if(currentDistance >= this.distanceBtw){
					
					this.currentLevel++;
				}
			}
			//return; // ************************************************** ????????????????????????????????????
		}
		if(direction == Direction.DOWN){
			
			while (this.currentLevel != saveLevel-1 && this.currentLevel >= 0){
				
				currentTime = System.currentTimeMillis() - time; 		// currentTime = le temps écoulé depuis que l'on a lancé move();
				long currentDistance = this.speed * currentTime; 		// Nous donne la distance parcouru
				if(currentDistance >= this.distanceBtw){
					
					this.currentLevel--;
					
				}
			}
			//return; // ************************************************** ????????????????????????????????????
		}
	}

	@Override
	public void stopNextLevel() {

		long currentTime = 0;
		long time = System.currentTimeMillis(); 						// On récupère le temps
		cageState = ElevatorCageState.CLOSED;
		elevState = ElevatorState.MOVING; 
		/* Normalement il faut verifier que les portes soient fermées pour que l'ascenseur bouge 
		 * et du coup verifier que l'ascenseur bouge pour commencer a le faire bouger.*/
		
		int saveLevel = this.currentLevel;
		if(direction == Direction.UP){

			while (this.currentLevel != saveLevel+1 && this.currentLevel < this.levelNb){
				
				currentTime = System.currentTimeMillis() - time; 		// currentTime = le temps écoulé depuis que l'on a lancé move();
				long currentDistance = this.speed * currentTime; 		// Nous donne la distance parcouru
				if(currentDistance >= this.distanceBtw){
					
					this.currentLevel++;
				}
			}
			elevState = ElevatorState.SLEEPING;
			cageState = ElevatorCageState.MOVING; 						// ouverture des portes après arret
		}
		else{
			while (this.currentLevel != saveLevel-1 && this.currentLevel >= 0){
				
				currentTime = System.currentTimeMillis() - time; 		// currentTime = le temps écoulé depuis que l'on a lancé move();
				long currentDistance = this.speed * currentTime; 		// Nous donne la distance parcouru
				if(currentDistance >= this.distanceBtw){
					
					this.currentLevel--;
				}
			}
			elevState = ElevatorState.SLEEPING;
			cageState = ElevatorCageState.MOVING;						// ouverture des portes après arret
		}
	}

	@Override
	public int getCurrentFloor() {
		
		return this.currentLevel;
	}
	@Override
	public ElevatorState getState() {
		
		return elevState;
	}

	@Override
	public void trigger(long t) {
		long currentTime = 0;
		long time = t; // On récupère le temps
		cageState = ElevatorCageState.CLOSED;
		elevState = ElevatorState.MOVING; 
		/* Normalement il faut verifier que les portes soient fermées pour que l'ascenseur bouge 
		 * et du coup verifier que l'ascenseur bouge pour commencer a le faire bouger.*/
		int saveLevel = this.currentLevel;
		if(direction == Direction.UP){
			
			while (this.currentLevel != saveLevel+1 && this.currentLevel < this.levelNb){
				
				currentTime = System.currentTimeMillis() - time; 		// currentTime = le temps écoulé depuis que l'on a lancé move();
				long currentDistance = this.speed * currentTime; 		// Nous donne la distance parcouru
				if(currentDistance >= this.distanceBtw){
					
					this.currentLevel++;
				}
			}
			//return; // ************************************************** ????????????????????????????????????
		}
		if(direction == Direction.DOWN){
			
			while (this.currentLevel != saveLevel-1 && this.currentLevel >= 0){
				
				currentTime = System.currentTimeMillis() - time; 		// currentTime = le temps écoulé depuis que l'on a lancé move();
				long currentDistance = this.speed * currentTime; 		// Nous donne la distance parcouru
				if(currentDistance >= this.distanceBtw){
					
					this.currentLevel--;
					
				}
			}
			//return; // ************************************************** ????????????????????????????????????
		}
		
	}
}
