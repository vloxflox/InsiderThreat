import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class LogGenerator{


    public static void main(String[] args) {

        String csvFile = "../r1/LDAP/2010-04.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        List<UserNode> users = new ArrayList<UserNode>();
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


        ActivityEntry search = new ActivityEntry("{X4L7-R1QF61WA-2063JYMZ}","01/04/2010 13:50:57","DTAA/SML0086","PC-1586","http://pagesex.com");
        if(users.get(84).contains(search)){
            users.get(84).show();
        }

    }

}
