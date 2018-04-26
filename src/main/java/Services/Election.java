package Services;

public class Election implements IElection{

	@Override
	public String getCandidateByParty(String party) {
		
		if(party.equals("Axity")){
			return "Urbano";
		}
		
		return "Elmer Homero";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		if(party.equals("Axity")){
			return 100;
		}
		
		return 50;
	}

}
