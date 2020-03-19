import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InvalidCatalogException {
        Main app = new Main();
        app.testCreateSave();
        app.testLoadView();
    }

    private void testCreateSave() throws IOException {
        Catalog1 catalog =
                new Catalog1("Java Resources", "d:/java/catalog.ser");
        Document1 doc = new Document1("java1", "Java Course 1",
                "https://profs.info.uaic.ro/~acf/java/slides/en/intro_slide_en.pdf");
        doc.addTag("type", "Slides");
        catalog.add(doc);
        CatalogUtil.save(catalog);
    }

    private void testLoadView() throws IOException, InvalidCatalogException {
        Catalog1 catalog = CatalogUtil.load("d:/java/catalog.ser");
        Document1 doc = catalog.findById("java1");
        CatalogUtil.view(doc);
    }
}
