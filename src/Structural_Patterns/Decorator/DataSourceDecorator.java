package Structural_Patterns.Decorator;

import java.util.HashMap;

class DataSourceDecorator implements DataSource {
    protected HashMap<String, String> file = new HashMap<>();
    protected FileDataSource wrapee;

    public DataSourceDecorator(FileDataSource source) {
        wrapee = source;
    }

    public void writeData(String data) {
        file.put(wrapee.getFilename(), data);
    }

    public void readData() {
        System.out.println(file.get(wrapee.getFilename()));
    }
}