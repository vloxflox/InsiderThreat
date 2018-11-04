import java.util.List;
import java.util.ArrayList;

public abstract class Node{

    protected Info info;
    protected List<Node> child; 


    //public abstract void addChild(Entry entry);


    public boolean contains(ActivityEntry activityEntry){
        return info.contains(activityEntry);
    }


    public Node find_son(ActivityEntry activityEntry){
        for(int i = 0; i < child.size(); i++) {
            if(child.get(i).contains(activityEntry)){
                return child.get(i);
            }
        }
        return null;
    }


    public void show(){
        info.show();
    }
    
}