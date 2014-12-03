package simulation.elevator.resultAnalyser.int_resutlAnalyser;

import simulation.elevator.resultAnalyser.imp_resultAnalyser.ResultAnalyserFactoryImplementation;


public class ResultAnalyserFactory {

		
		/**
		 */
		public static IResultAnalyser createResultAnalyser(){
			return ResultAnalyserFactoryImplementation.createResultAnalyser();
		}

}
