import org.w3c.dom.HTMLDivElement
import org.w3c.dom.asList
import kotlin.dom.appendText

fun main() {
    debug("Yo")


    val first = tmRender("tm-first", mapOf("id" to "firrr"))
    val second = tmRender("tm-first", mapOf("id" to "seccc"))

    val container = getElemByIdAs<HTMLDivElement>(EasyConst.CONTAINER_ID)
    container.innerHTML += first
    container.innerHTML += second

    getElemByIdAs<HTMLDivElement>("firrr").appendText("wuuuuuuuu")

}

fun clearContainer() {
    val container = getElemById(EasyConst.CONTAINER_ID)
    container.childNodes.asList().forEach { container.removeChild(it) }
}


