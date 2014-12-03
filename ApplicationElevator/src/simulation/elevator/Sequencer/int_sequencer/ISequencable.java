package simulation.elevator.Sequencer.int_sequencer;

import java.util.ArrayList;

import simulation.elevator.traffic.int_traffic.IUser;


public interface ISequencable {
	
	 void trigger(long date);
	 ArrayList<IUser> getListUser();
}
