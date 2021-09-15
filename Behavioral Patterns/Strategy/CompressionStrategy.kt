import java.io.File

interface CompressionStrategy {
    fun compressFiles(files: ArrayList<File>)
}
