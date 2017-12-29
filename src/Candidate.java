
/**
 * Represents a candidate in a mock election. NOTE: Please don't use this class
 * for a real election!
 */
public class Candidate {
	/**
	 * Name of the candidate, e.g. "George Washington"
	 */
	private String name;

	/**
	 * Number of votes for the candidate.
	 */
	private int voteCount;

	/**
	 * Create a new Candidate object with the given name and voteCount set to 0.
	 * 
	 * @param name
	 *            Name of the candidate
	 */
	public Candidate(String name) {
		this.name = name;
	}

	/**
	 * Get the name for the candidate
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the number of votes cast for the candidate
	 * 
	 * @return vote count
	 */
	public int getVoteCount() {
		return voteCount;
	}

	/**
	 * Vote for the candidate (increment the candidate's vote count by 1).
	 */
	public void vote() {
		voteCount++;
	}
}
