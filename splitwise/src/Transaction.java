import java.util.ArrayList;

// this class is just raw class, it can be changed according to requirements
public class Transaction {
	private Member payer;
	private String description;
	private double amount;
	private ArrayList<Member> expenseMembers;

	public Transaction(Member payer, String text, float amount, ArrayList<Member> members) {
		this.amount = amount;
		this.description = text; // needs to be changed
		this.expenseMembers = members;
		this.payer = payer;
	}

}
