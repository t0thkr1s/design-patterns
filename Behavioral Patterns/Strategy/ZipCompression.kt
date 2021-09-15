import java.io.File

class ZipCompression : CompressionStrategy {
    override fun compressFiles(files: ArrayList<File>) {
        // compress files using ZIP approach
        println("ZIP Compression!")
    }
}
