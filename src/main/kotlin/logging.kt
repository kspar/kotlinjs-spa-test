import kotlin.js.Date

private const val DEBUG_PREFIX = "[DEBUG]"
private const val WARN_PREFIX = "[WARN]"

// TODO: take function instead of String to avoid evaluating messages for log levels that are disabled

fun debug(msg: String) {
    println("$DEBUG_PREFIX ${Date().toISOString()}: $msg")
}

fun warn(msg: String) {
    println("$WARN_PREFIX ${Date().toISOString()}: $msg")
}
