import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Group {
	
	private String name;
	//private ArrayList<Member> memberList ;
	private HashMap<Integer,Member> memberList ;
	
	public Group(String name) {
		this.name = name;
		memberList= new HashMap<>();
	
	}
	
	public String getName() {
		return this.name ;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	public void addMember(Member m) {
		if(memberList.containsKey(m.getName().hashCode())) return ;
		memberList.putIfAbsent(m.getName().hashCode(), m);
	}
	
	public Collection<Member> getMembers(){
		return this.memberList.values();
	}
	
	public void deleteMember(int key) {
		memberList.remove(key);
	}
	
}
