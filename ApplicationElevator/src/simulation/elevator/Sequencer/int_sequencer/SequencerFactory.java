package simulation.elevator.Sequencer.int_sequencer;

import simulation.elevator.Sequencer.imp_sequencer.SequencerFactoryImplementation;


public class SequencerFactory {

		private static ISequencer instance;
		
		public static ISequencer getInstance() {
			return instance;
		}
		
		public static ISequencer createSequencer(long start, long duration, int contraction, int expansion){
			if (instance != null) {
				throw new IllegalStateException("Instance already exist.");
			}
			instance = SequencerFactoryImplementation.createSequencer(start,  duration,  contraction,  expansion);
			return instance;
		}

}
