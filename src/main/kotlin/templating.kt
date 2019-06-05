import org.w3c.dom.HTMLScriptElement


fun tmRender(templateId: String, data: Map<String, Any>): String =
    render(getElemByIdAs<HTMLScriptElement>(templateId).text, data)


private fun render(template: String, data: Map<String, Any>): String {
    Mustache.parse(template)
    return Mustache.render(template, mapToJsObject(data).unsafeCast<MustacheContext>())
}

