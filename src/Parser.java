import com.google.gson.Gson;

import java.lang.reflect.Array;
import java.util.List;

public class Parser {


    public static String parse(String jsonText) {
        Gson gson = new Gson();
        Response Response = gson.fromJson(jsonText, Response.class);
        List<Value>  Values = Response.getValue();
        return Value.getJoke();
    }
}