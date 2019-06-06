import kotlin.js.Date

private const val DEBUG_PREFIX = "[DEBUG]"
private const val WARN_PREFIX = "[WARN]"


fun debug(msg: String) {
    println("$DEBUG_PREFIX ${Date().toISOString()}: $msg")
}

fun warn(msg: String) {
    println("$WARN_PREFIX ${Date().toISOString()}: $msg")
}
