package simulation.elevator.Sequencer.imp_sequencer;

import simulation.elevator.Sequencer.int_sequencer.ISequencer;

public class SequencerFactoryImplementation {
	
	public static ISequencer createSequencer(long start, long duration, int contraction, int expansion)
	{
		return new Sequencer(start,  duration,  contraction,  expansion);
	}

}
