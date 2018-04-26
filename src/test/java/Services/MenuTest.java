package Services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class MenuTest {

	@Test
	void getNameByPartyTest() {
		IElection election =new ElectionMock();
		
		String candidateName= election.getCandidateByParty("Axity");
		int numOfVotes= election.getNumberOfVotesByParty("Axity");
		
		assertEquals("Prueba",candidateName);
		assertEquals( 100, numOfVotes);
	}
	
	@Test
	void getNameByPartyTestMockito() {
		IElection election = mock(Election.class);
		
		when(election.getCandidateByParty("Otra cosa")).thenReturn("Arturo");
		when(election.getNumberOfVotesByParty("")).thenReturn(0);
		
		String candidateName= election.getCandidateByParty("Otra cosa");
		int numOfVotes= election.getNumberOfVotesByParty("");
		
		
		assertEquals("Arturo",candidateName);
		assertEquals( 0, numOfVotes);
	}
	
	
	
}
