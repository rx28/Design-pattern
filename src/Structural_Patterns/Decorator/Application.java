package Structural_Patterns.Decorator;

public class Application {
    public static void main(String[] args) {
        FileDataSource source = new FileDataSource("test");
        source.writeData("It's working");
        source.readData();

        DataSourceDecorator s = new DataSourceDecorator(source);
        s.writeData("Old Data");
        s.readData();

        DataSourceDecorator source1 = new EncryptionDecorator(source);
        source1.writeData("Add1");
        source1.readData();

        DataSourceDecorator source2 = new CompressionDecorator(source);
        source2.writeData("Add2");
        source2.readData();
    }
}
