import org.grails.bug.demo.DemoBean

// Place your Spring DSL code here
beans = {
    someTagName(DemoBean) {
        somePropertyName = 'hello'
    }
}
