import java.util.ArrayList;
import java.util.HashMap;

public class Member {

	private String name;
	private ArrayList<Transaction> activities;
	private HashMap<Member, Double> oweList; // this is list of members which this Member owes to them

	// this list is the final list that this member owes the other members which are
	// keys of hashmap
	private HashMap<Member, Double> simplifiedDebtList;

	public Member(String name) {
		this.name = name;
		activities = new ArrayList<>();
		oweList = new HashMap<Member, Double>();
		simplifiedDebtList = new HashMap<Member, Double>();
	}

	public ArrayList<Transaction> getActivities() {
		return this.activities;
	}

	public void addActivity(Transaction e) {
		this.activities.add(e);
	}

	public void modifyOweList(Member m, double oweAmount) {

		if (oweList.containsKey(m)) {
			oweList.put(m, oweList.get(m) + oweAmount);
			return;
		}
		oweList.putIfAbsent(m, oweAmount);
	}

	public void modifySimplfiedDebtList(Member m, double oweAmount) {

		if (this.simplifiedDebtList.containsKey(m)) {
			this.simplifiedDebtList.put(m, oweAmount);
			return;
		}

		simplifiedDebtList.putIfAbsent(m, oweAmount);
	}

	public HashMap<Member, Double> getOweList() {
		return this.oweList;
	}

	public HashMap<Member, Double> getSimplifiedDebtList() {
		return this.simplifiedDebtList;
	}

	public String getName() {
		return this.name;
	}

}
