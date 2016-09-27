modules = {
//    application {
//        resource url:'js/application.js'
//    }

    // Define your skin module here - it must 'dependsOn' either bootstrap (ALA version) or bootstrap2 (unmodified) and core

    generic {
        dependsOn 'bootstrap2', 'hubCore' //
        resource url: [dir:'css', file:'generic.css']
    }

    bootstrap {
        dependsOn 'jquery'
        resource url: [dir:'bootstrap/css', file:'bootstrap.min.css', plugin: 'biocache-hubs'],attrs: [ media: 'all' ]
        resource url: [dir:'bootstrap/css', file:'bootstrap-responsive.min.css', plugin: 'biocache-hubs'],attrs: [ media: 'all' ]
        resource url: [dir:'bootstrap/js', file:'bootstrap.js', plugin:'biocache-hubs'], disposition: 'head'

    }

}