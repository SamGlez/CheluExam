import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Connection {
    String BASE_URL = "http://api.icndb.com/jokes/random";
    public final String composedUrl;

    public Connection(String firstName, String lastName) {
        composedUrl = BASE_URL + "?firstName=" + firstName + "&amp;lastName=" + lastName;
    }

    public String request() {
        try {
            System.out.println(composedUrl);
            URL url = new URL(composedUrl);
            URLConnection request = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String inputLine;
            String allMessage = "";
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                allMessage = allMessage.concat(inputLine);
            }
            in.close();
            return allMessage;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
