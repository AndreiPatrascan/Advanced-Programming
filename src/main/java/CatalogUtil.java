import java.awt.*;
import java.io.*;

public class CatalogUtil {
    public static void save(Catalog1 catalog)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
    public static Catalog1 load(String path)
            throws InvalidCatalogException, IOException {

        try (ObjectInputStream oos = new ObjectInputStream(
                new FileInputStream(path))) {
            return (Catalog1)oos.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return new Catalog1();

    }
    public static void view(Document1 doc) {
        Desktop desktop = Desktop.getDesktop();
        //… browse or open, depending of the location type
    }
}
