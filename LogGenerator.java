import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogGenerator{


    public static void main(String[] args) {

        String csvFile = "./r1/LDAP/2010-04.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        Node activityEntry;

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] logEntry = line.split(cvsSplitBy);

                activityEntry = new Node(logEntry[0], logEntry[1], logEntry[2], logEntry[3], logEntry[4]);

                System.out.println( activityEntry.getEmail() );

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

}
