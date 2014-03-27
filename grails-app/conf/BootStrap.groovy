import grails.util.Holders

class BootStrap {

    def init = { servletContext ->
        log.error "config.security.cas.bypass = ${Holders.config.security.cas.bypass}"
        log.error "config.skin = ${Holders.config.skin}"
        log.error "config.security.cas.appServerName = ${Holders.config.security.cas.appServerName}"
    }
    def destroy = {
    }
}
