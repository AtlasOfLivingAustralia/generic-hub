import grails.util.Holders

class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        log.error "config.security.cas.bypass = ${grailsApplication.config.security.cas.bypass}"
        log.error "config.skin = ${grailsApplication.config.skin}"
        log.error "config.security.cas.appServerName = ${grailsApplication.config.security.cas.appServerName}"
        log.error "config.plugins.proxy = ${grailsApplication.config.plugins.proxy}"
        log.error "config.test.var = ${grailsApplication.config.test.var}"
    }
    def destroy = {
    }
}
