
//NAME OF STUDENT PROGRAMMER => Uday Mahajan

// PROGRAM NAME => Election
// COURSE => CS 142 (3270)  
// ASSIGNMENT => 06. Election Day
// DUE DAY, DATE & TIME => 	Wednesday; November 9th, 2016 ; 10:00 AM (PST)

/**
 * Represents a mock election. NOTE: Please don't use this class for a real
 * election!
 * 
 * NAME: Uday Mahajan
 */

public class Election {

	private Office[] offices; // creates offices array of the Office type.

	public Election(Office[] offices) {

		this.offices = offices; // Creates a new election object for offices.

	}

	private static boolean doesBallotContainDuplicatesForOffice(Office office, String[] ballot) {
		// A method to check if the ballot contains duplicates for same office.
		boolean checkbox = false;
		// Check box represents a match on ballot and office.

		// For each office, we look at each name on the ballot.
		// so therefore, we need a nested loop that compares every name on
		// ballot with
		// every name of the candidate in the office.

		for (int i = 0; i < ballot.length; i++) {

			// Are there two names on the ballot that are candidates running for
			// that office?

			for (int j = 0; j < office.getCandidateCount(); j++) {
				if (ballot[i].equals(office.getCandidate(j).getName())) {
					if (checkbox != true) {
						checkbox = true;
						// if the checkbox is not true and the above if
						// condition is
						// satisfied, then it checks the box as true

						// If there are two or more candidates running for that
						// office,
						// i.e. if check box is already true,
						// we should return the method as true.
					} else
						return true;
				}

			}

		}

		return false; // if no duplicates, then we must return the method as
						// false.

	}

	private void voteForCandidateForOffice(Office office, String[] ballot) {

		// This method votes for the Candidate running for the office by calling
		// the
		// vote method if the name of candidate on ballot matches with that for
		// office.

		for (int i = 0; i < ballot.length; i++) {

			for (int j = 0; j < office.getCandidateCount(); j++) {
				if (ballot[i].equals(office.getCandidate(j).getName())) {

					office.getCandidate(j).vote(); // Calling the vote method
													// from the Candidate class.
					return;

				}

			}
		}
	}

	public void vote(String[] ballot) {

		// For each office, we check to see if office has duplicates.
		// (by calling the doesBallotContainDuplicates method written above)
		// If it contains duplicates, we continue to next office.
		// If not then for each element of ballot we call the
		// voteForCandidateOffice
		// method written above, which increments the vote for us.

		// TODO: implement me!
		for (int i = 0; i < offices.length; i++) {
			if (doesBallotContainDuplicatesForOffice(offices[i], ballot)) {
				continue; // goes back to top of the loop and checks for other
							// candidates.
			}

			// if we are here that means that ballot does not
			// have duplicates and we can vote for candidates in the ballot.
			voteForCandidateForOffice(offices[i], ballot);

		}

	}

	public String winner(Office o) {

		// This method declares the winner of the election by comparing the vote
		// counts of candidates.

		int winnerCount = o.getCandidate(0).getVoteCount();

		// starts with winner count equal to that of first candidate.

		String winner = o.getCandidate(0).getName();
		// winner is initialized to first candidate's name so that it is in sync
		// with
		// the winner count.

		for (int i = 0; i < o.getCandidateCount(); i++) {
			// gets the candidate count for every candidate running for that
			// office.

			if (o.getCandidate(i).getVoteCount() > winnerCount) {

				// if the candidate count is greater than
				// previous winner count, it sets the
				// winner count as that value.

				winnerCount = o.getCandidate(i).getVoteCount();
				winner = o.getCandidate(i).getName().toString();
			}
		}
		return winner; // finally returns the winner string for the method after
						// for loop ends.
	}

}
