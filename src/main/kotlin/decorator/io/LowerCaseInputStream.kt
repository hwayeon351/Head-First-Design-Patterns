package decorator.io

import java.io.*

class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {
    @Throws(IOException::class)
    override fun read(): Int {
        val c = `in`.read()
        return if (c == -1) c else c.toChar().lowercaseChar().code
    }

    @Throws(IOException::class)
    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result = `in`.read(b, off, len)
        for (i in off until off + result) {
            b[i] = Char(b[i].toUShort()).lowercaseChar().toByte()
        }

        return result
    }
}