#!groovy

node {
    checkout scm

    // Load groovy script and execute it
    def ciScript = load "ci.groovy"
    ciScript.start()
}
