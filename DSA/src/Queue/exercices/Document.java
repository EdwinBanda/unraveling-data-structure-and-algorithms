package Queue.exercices;

public class Document {
    private String name;
    private int sheets;

    public Document(String name, int sheets) {
        super();
        this.name = name;
        this.sheets = sheets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }
}
