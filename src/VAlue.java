import com.google.gson.annotations.SerializedName;

public class Value {
    @SerializedName("id")
    private String id;
    @SerializedName("joke")
    private static String joke;

    public Value(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        return;
    }

    public static String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
        return;
    }


}
