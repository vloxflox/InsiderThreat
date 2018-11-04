import java.util.List;
import java.util.ArrayList;

public class UserNode extends Node{


    public UserNode(UserEntry userEntry){

        info  = new UserInfo(userEntry);
        child = new ArrayList<Node>();
        //TODO colocar node com o dia na inicialização
    }

    public void addChild(String datePlaceHolder){
        datePlaceHolder = "01/04/2010";
        child.add(new DateNode(datePlaceHolder));
    }

    
}
