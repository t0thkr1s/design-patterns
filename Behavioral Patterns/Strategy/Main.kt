import java.io.File

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val compressionContext = CompressionContext()
        compressionContext.setCompressionStrategy(ZipCompression())
        // empty just for presentation purposes
        val files = ArrayList<File>()
        compressionContext.createArchive(files)
    }
}
