import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog1 implements Serializable {
    private String name;
    private String path;
    private List<Document1> documents = new ArrayList<>();

    public Catalog1() {
    }

    public Catalog1(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void add(Document1 doc) {
        documents.add(doc);
    }
    public Document1 findById(String id) {
        return documents.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }
}