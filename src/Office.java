
/**
 * Represents an office up for election in a mock election. NOTE: Please don't
 * use this class for a real election!
 * 
 */
public class Office {
	/**
	 * Name of the office, e.g. "President"
	 */
	private String name;

	/**
	 * Candidates on the ballot for this office.
	 */
	private Candidate[] candidates;

	/**
	 * Create a new Office. We assume that the caller will not modify the
	 * Candidate array once it's passed to the Office constructor.
	 * 
	 * @param name
	 *            Name of the office
	 * @param candidates
	 *            Array of candidates on the ballot
	 */
	public Office(String name, Candidate[] candidates) {
		this.name = name;
		this.candidates = candidates;
	}

	/**
	 * Getter for the name of the office.
	 * 
	 * @return The name off the office
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the number of candidates on the ballot for this office.
	 * 
	 * @return The number of candidates
	 */
	public int getCandidateCount() {
		return candidates.length;
	}

	/**
	 * Get the candidate corresponding to the index, or null if the index is
	 * invalid.
	 * 
	 * @param index
	 *            Index at least 0 and less than candidate count
	 * @return Candidate, or null
	 */
	public Candidate getCandidate(int index) {
		if (index >= 0 && index < candidates.length) {
			return candidates[index];
		}
		return null;
	}

	/**
	 * Vote for the candidate with the given name, if one exists.
	 * 
	 * @param name
	 *            Name of candidate
	 * @return true if there was a candidate with that name, false otherwise
	 */
	public boolean vote(String name) {
		for (int i = 0; i < candidates.length; i++) {
			if (candidates[i].getName().equals(name)) {
				candidates[i].vote();
				return true;
			}
		}
		return false;
	}
}
