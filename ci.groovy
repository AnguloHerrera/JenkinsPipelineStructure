#!groovy

// Load all the jobs for each branch case.
// Important note: to keep the project structure, all those files must have the same methods
load 'job/job.groovy'
masterJob = load 'job/masterJob.groovy'
developJob = load 'job/developJob.groovy'
aux = load 'job/aux.groovy'

/**
 * Function called from Jenkinsfile to start the Job
 */
void start() {
    try {
        init()
    } catch (ex) {
        throw ex
    } finally {
        echo "Job Ended"
    }
}


def init() {
    // ENV parameters
    def targetBranchName = env.TARGET_BRANCH

    def job = getJob(targetBranchName)

    echo job.testDad()
    echo job.test()

}


def getJob(branch) {
    def job

    switch (branch) {
        case ~/master$/:
            job = masterJob
            break
        case ~/develop$/:
            job = developJob
            break
    }

    return job
}


return this
