package org.grails.bug

class DemoTagLib {
    static defaultEncodeAs = [taglib: 'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def someTagName = { attrs, body ->
        out << 'Hello'
    }
}
