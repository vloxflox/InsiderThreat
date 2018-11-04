import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class LogGenerator{

    private List<UserNode> users = new ArrayList<UserNode>();



    public static void main(String[] args) {

    }


    public static void initializeUsers(String csvFile) {

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


        ActivityEntry search = new ActivityEntry("{A3U1-F3GA48SC-7481SKGQ}","01/04/2010 13:37:47","DTAA/AAA0371","PC-1689","http://espn.go.com");
        if(users.get(84).contains(search)){
            users.get(84).show();
        }

    }

}
