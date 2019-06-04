import org.w3c.dom.asList

fun main() {
    debug("Yo")

    println(tmRender(""""{{a"}}"-{{b}}""", mapOf("a\"" to "wut", "b" to 3)))

}

fun clearContainer() {
    val container = getElemById(EasyConst.CONTAINER_ID)
    container.childNodes.asList().forEach { container.removeChild(it) }
}


