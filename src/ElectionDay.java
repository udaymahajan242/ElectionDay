

public class ElectionDay {

	public static void main(String[] args) {


		Candidate[] presidents = {new Candidate("George Washington"),  new Candidate("Thomas Jefferson"), new Candidate("Abraham Lincoln")};
		Office president = new Office("President", presidents);
		Candidate[] governors = {new Candidate("Meriwether Lewis"), new Candidate("William Clark")};
		Office governor = new Office("Governor", governors);
		Office[] offices = {president, governor};
		Election election = new Election(offices);
		election.vote(new String[]{"Abraham Lincoln", "Meriwether Lewis"});
		System.out.println(election.winner(president)); // Should print Abraham Lincoln
		System.out.println(election.winner(governor)); // Should print Meriwether Lewis
		election.vote(new String[]{"George Washington", "Thomas Jefferson"});
		election.vote(new String[]{"George Washington", "Thomas Jefferson"});
		System.out.println(election.winner(president)); // Should print Abraham Lincoln
		election.vote(new String[]{"George Washington", "Abraham Lincoln", "William Clark"});
		election.vote(new String[]{"George Washington", "Abraham Lincoln", "William Clark"});
		election.vote(new String[]{"George Washington", "Abraham Lincoln", "William Clark"});
		System.out.println(election.winner(governor)); // Should print William Clark
		election.vote(new String[]{"Billy the Kid", "Thomas Jefferson"});
		election.vote(new String[]{"Billy the Kid", "Thomas Jefferson"});
		System.out.println(election.winner(president)); // Should print Thomas Jefferson


	}

}
