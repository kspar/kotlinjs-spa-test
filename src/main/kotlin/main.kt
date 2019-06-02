import org.w3c.dom.asList

fun main() {
    debug("Yo")


}

fun clearContainer() {
    val container = getElemById(EasyConst.CONTAINER_ID)
    container.childNodes.asList().forEach { container.removeChild(it) }
}


