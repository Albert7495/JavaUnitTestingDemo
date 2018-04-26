package Services;

public class Menu {
	
	public static void main(String []arg) {
		
		IElection election =new Election();
		
		String candidateName= election.getCandidateByParty("Axity");
		
		int numOfVotes= election.getNumberOfVotesByParty("Axity");
		
		System.out.println(String.format("Name: %s-Votes $s",candidateName,numOfVotes));
		
	}
}
