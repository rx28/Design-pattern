package Structural_Patterns.Decorator;

import java.util.HashMap;

class FileDataSource implements DataSource {
    private HashMap<String, String> file = new HashMap<>();
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void writeData(String data) {
        file.put(filename, data);
    }

    public void readData() {
        System.out.println(file.get(filename));
    }
}