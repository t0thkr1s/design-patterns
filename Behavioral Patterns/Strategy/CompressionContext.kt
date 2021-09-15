import java.io.File

class CompressionContext {

    private var compressionStrategy: CompressionStrategy? = null

    fun setCompressionStrategy(cs: CompressionStrategy) {
        compressionStrategy = cs
    }

    fun createArchive(files: ArrayList<File>) {
        compressionStrategy?.compressFiles(files)
    }
}
