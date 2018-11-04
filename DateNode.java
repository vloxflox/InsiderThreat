import java.util.List;
import java.util.ArrayList;

public class DateNode extends Node{


    public DateNode(String datePlaceHolder){

        info  = new DateInfo(datePlaceHolder);
        child = new ArrayList<Node>();
        //TODO colocar node com o dia na inicialização
    }

    public void addChild(ActivityEntry activityEntry){
        //child.add(new DateNode(activityEntry));
    }

    
}
