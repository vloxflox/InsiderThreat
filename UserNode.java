import java.util.List;
import java.util.ArrayList;

public class UserNode{

    private UserInfo userInfo;
    private List<UserNode> child; 

    public UserNode(UserEntry userEntry){

        userInfo = new UserInfo(userEntry);
        //child    = new ArrayList<Node>();
    }

    public boolean contains(ActivityEntry activityEntry){
        return userInfo.contains(activityEntry);
    }


    public UserNode find_son(ActivityEntry activityEntry){
        for(int i = 0; i < child.size(); i++) {
            if(child.get(i).contains(activityEntry)){
                return child.get(i);
            }
        }
        return null;
    }


    public void show(){
        userInfo.show();
    }

    public void addEntry(ActivityEntry activityEntry){
        //child.add(new Node(activityEntry));
    }

    
}
