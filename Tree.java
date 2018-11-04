import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class Tree{

    private List<UserNode> users = new ArrayList<UserNode>();



    public Tree () {
        
        String userFile = "../r1/LDAP/2010-04.csv";

        initializeUsers(userFile);

        searchEntry();
    }


    private void initializeUsers(String csvFile) {

        
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        UserEntry userEntry;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] logEntry = line.split(cvsSplitBy);

                userEntry = new UserEntry(logEntry[0], logEntry[1], logEntry[2], logEntry[3], logEntry[4]);


                users.add(new UserNode(userEntry));

            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private void searchEntry(){
        ActivityEntry search = new ActivityEntry("{F1C5-I5CN19JK-9863ZHWX}","01/04/2010 13:45:58","DTAA/QGM0222","PC-1214","http://espn.go.com");
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).contains(search)){
                users.get(i).show();
            }
        }
    }

}
