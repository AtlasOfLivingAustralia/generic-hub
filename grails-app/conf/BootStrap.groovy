import grails.util.Holders

class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        log.info "config.security.cas.bypass = ${grailsApplication.config.security.cas.bypass}"
        log.info "config.skin = ${grailsApplication.config.skin}"
        log.info "config.security.cas.appServerName = ${grailsApplication.config.security.cas.appServerName}"
        log.info "config.plugins.proxy = ${grailsApplication.config.plugins.proxy}"
        log.info "config.test.var = ${grailsApplication.config.test.var}"
    }
    def destroy = {
    }
}
