import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document1 implements Serializable {
    private String id;
    private String name;
    private String location; //file name or Web page

    private Map<String, Object> tags = new HashMap<>();
    //…

    public String getId() {
        return id;
    }

    public Document1(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }
//…
}