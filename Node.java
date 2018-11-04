import java.util.List;
import java.util.ArrayList;

public class Node{

    private String employee_name;
    private String user_id;
    private String domain;
    private String email;
    private String role;

    private List<Node> child; 

    public Node(String employee_name,String user_id,String domain,String email,String role){
        this.employee_name = employee_name;
        this.user_id       = user_id;
        this.domain        = domain;
        this.email         = email;
        this.role          = role;

        child = new ArrayList<Node>();
    }


    public void setEmployee_name(String employee_name){
        this.employee_name = employee_name;
    }
    public String getEmployee_name(){
        return employee_name;
    }


    public void setUser_id(String user_id){
        this.user_id = user_id;
    }
    public String getUser_id(){
        return user_id;
    }


    public void setDomain(String domain){
        this.domain = domain;
    }
    public String getDomain(){
        return domain;
    }

    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }

    
}
