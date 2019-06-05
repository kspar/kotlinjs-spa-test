import org.w3c.dom.asList
import pl.treksoft.jquery.JQueryAjaxSettings
import pl.treksoft.jquery.jQuery

fun main() {
    debug("Yo")

    val ajaxSettings = mapOf("url" to "https://reqres.in/api/products/3")

    val r = jQuery.get(mapToJsObject(ajaxSettings).unsafeCast<JQueryAjaxSettings>())
    r.then({ data, status, xhr -> println(data.asDynamic().data.id) }) // TODO: safer/nicer cast to model?

}

fun clearContainer() {
    val container = getElemById(EasyConst.CONTAINER_ID)
    container.childNodes.asList().forEach { container.removeChild(it) }
}


