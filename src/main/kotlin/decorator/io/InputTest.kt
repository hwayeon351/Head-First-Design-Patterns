package decorator.io

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream

@Throws(IOException::class)
fun main() {
    var c: Int
    var `in`: InputStream? = null
    try {
        `in` = LowerCaseInputStream(BufferedInputStream(FileInputStream("test.txt")))
        while (`in`.read().also { c = it } >= 0) {
            print(c.toChar())
        }
    } catch (e: IOException) {
        e.printStackTrace()
    } finally {
        `in`?.close()
    }
    println()
    try {
        LowerCaseInputStream(BufferedInputStream(FileInputStream("test.txt")))
            .use { in2 ->
                while (in2.read().also { c = it } >= 0) {
                    print(c.toChar())
                }
            }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}