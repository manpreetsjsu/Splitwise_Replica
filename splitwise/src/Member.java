import java.util.ArrayList;

public class Member {
	
	private String name ;
	private float balance ;
	private ArrayList<Transaction> activities ;
	
	public Member(String name) {
		this.name = name ;
		activities = new ArrayList<>();
	}
	public ArrayList<Transaction> getActivities() {
		return this.activities ;
	}
	
	public void addActivity(Transaction e) {
		this.activities.add(e);
	}
	
	public void addToBalance(float amt) {
		this.balance += amt;
	}
	
	public void reduceToBalance(float amt) {
		this.balance -= amt;
	
	}
	
	
}
