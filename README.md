### generic-hub   [![Build Status](https://travis-ci.org/AtlasOfLivingAustralia/generic-hub.svg?branch=master)](https://travis-ci.org/AtlasOfLivingAustralia/generic-hub)
# generic-hub

Generic-hub is a [Grails](http://www.grails.org/) web application that is aimed to be an example implementation of the 
ALA Biocache (occurrence record search interface). There is very little code in this project as most of the functionality 
is provided by a Grails plugin called [biocache-hubs](http://github.com/AtlasOfLivingAustralia/biocache-hubs). If you intend to 
create your own custom skinned version of the Biocache webapp, then this is the project you should clone/fork as a starting point.

## Getting started
First download and install [Grails](http://www.grails.org/download) (Note: version **2.3.x** is currently required but check the `application.properties` file
for the specific version). Fork this project to your local machine.

Then try running the app with the command line:

    cd generic-hub
    grails run-app

## Documentation

Please see the [ALA documentation](https://github.com/AtlasOfLivingAustralia/documentation/wiki)
