package Structural_Patterns.Decorator;

class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(FileDataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        String existingData = file.getOrDefault(wrapee.getFilename(), "");
        String combinedData = existingData + compressedData;
        file.put(wrapee.getFilename(), combinedData);
    }

    @Override
    public void readData() {
        System.out.println(decompress(file.get(wrapee.getFilename())));
    }

    private String compress(String data) {
        // Compression logic here
        return "Compressed(" + data + ")";
    }

    private String decompress(String data) {
        // Decompression logic here
        return data; // For simplicity, decompression is not implemented in this example
    }
}