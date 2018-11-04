public class UserInfo{

    private String employee_name;
    private String user_id;
    private String domain;
    private String email;
    private String role;

    public UserInfo(UserEntry userEntry){
        this.employee_name = userEntry.getEmployee_name();
        this.user_id       = userEntry.getUser_id();
        this.domain        = userEntry.getDomain();
        this.email         = userEntry.getEmail();
        this.role          = userEntry.getRole();
    }


    //verifica se a activity entry se refere ao usuário procurado
    public boolean belongs(ActivityEntry activityEntry){
        //placeHolder todos do T1 têm prefixo DTAA/
        String userCode = "DTAA/" + activityEntry.getUser();
        return userCode.equals(user_id);
    }

    public void show(){
        System.out.println("Nome do funcionário:    " + employee_name);
        System.out.println("ID do funcionário:      " + user_id);
        System.out.println("Domínio do funcionário: " + domain);
        System.out.println("Email do funcionário:   " + email);
        System.out.println("Função do funcionário:  " + role);
        System.out.println();
    }

    
    
}
