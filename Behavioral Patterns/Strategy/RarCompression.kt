import java.io.File

class RarCompression : CompressionStrategy {
    override fun compressFiles(files: ArrayList<File>) {
        // compress files using RAR approach
        println("RAR Compression!")
    }
}
