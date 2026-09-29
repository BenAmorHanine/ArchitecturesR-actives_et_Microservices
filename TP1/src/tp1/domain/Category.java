package tp1.domain;
import java.util.*;
public class Category implements CatalogItem {
    private final String name; private final List<CatalogItem> items = new ArrayList<>();
    public Category(String name) { this.name = name; }
    public Category add(CatalogItem i) { items.add(i); return this; }
    public void remove(CatalogItem i) { items.remove(i); }
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (CatalogItem i : items) i.display(indent + "   ");
    }
}
