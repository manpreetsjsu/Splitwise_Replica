import java.util.ArrayList;

// this class is just raw class, it can be changed according to requirements
public class Transaction {
	private Member payer;
	private String description;
	private double amount;
	private ArrayList<Member> expenseMembers;

	public Transaction() {

	}

	public Transaction(Member payer, String text, float amount, ArrayList<Member> members) {
		this.amount = amount;
		this.description = text; // needs to be changed
		this.expenseMembers = members;
		this.payer = payer;
	}

	public Member getPayer() {
		return this.payer;
	}

	public double getAmount() {
		return this.amount;
	}

	public ArrayList<Member> getExpenseMemberList() {
		return (ArrayList<Member>) this.expenseMembers.clone();
	}

	public String getTransactionString() {
		if (payer != null && description != null)
			return (payer.getName() + " added '" + description + "' which cost $" + amount);

		return "No Transaction Record";
	}

	@Override
	public String toString() {
		return this.getTransactionString();
	}

}
