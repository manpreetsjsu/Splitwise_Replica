import java.util.ArrayList;

public class GroupList {
	private ArrayList<Group> groupList;
	
	public GroupList() {
		groupList = new ArrayList<>();
	}
	public void addGroup(Group newGroup) {
		groupList.add(0,newGroup);
	}
	
	public ArrayList<Group> getGroupList() {
		return this.groupList;
	}
}
