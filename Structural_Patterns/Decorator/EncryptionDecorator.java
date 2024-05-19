package Structural_Patterns.Decorator;

class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(FileDataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encrypt(data);
        file.put(wrapee.getFilename(), encryptedData);
    }

    @Override
    public void readData() {
        System.out.println(file.get(wrapee.getFilename()));
    }

    private String encrypt(String data) {
        // Encryption logic here
        return "Encrypted(" + data + ")";
    }
}