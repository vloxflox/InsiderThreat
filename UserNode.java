import java.util.List;
import java.util.ArrayList;

public class UserNode{

    private UserInfo userInfo;
    private List<UserNode> child; 

    public UserNode(UserEntry userEntry){

        userInfo = new UserInfo(userEntry);
        //child    = new ArrayList<Node>();
    }

    public boolean belongs(ActivityEntry activityEntry){
        return userInfo.belongs(activityEntry);
    }

    public void show(){
        userInfo.show();
    }

    public void addEntry(ActivityEntry activityEntry){
        //child.add(new Node(activityEntry));
    }

    
}
