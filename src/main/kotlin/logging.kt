import kotlin.js.Date

private const val DEBUG_PREFIX = "[D]"


fun debug(msg: String) {
    println("$DEBUG_PREFIX ${Date().toISOString()}: $msg")
}

