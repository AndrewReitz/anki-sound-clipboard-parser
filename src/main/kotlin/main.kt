import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.promise

val copyPaste = js("require('copy-paste')")

val regex = "\\[sound:(.+\\.(mp3|ogg))]".toRegex()

fun main() {
    GlobalScope.promise {
        while (true) {
            val clipboardContents = copyPaste.paste() as String
            val match = regex.find(clipboardContents) ?: continue
            copyPaste.copy(match.groupValues[1])
            delay(200)
        }
    }
}
