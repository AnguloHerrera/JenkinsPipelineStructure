package job

class MasterJob extends MyJob implements Serializable {
    def scr

    public MasterJob(scr) {
        scr.echo "Heeeelloooooooo"
        this.scr = scr
    }
    public String test() {
        this.scr.sh "echo 'blablabla'"
        def aux = this.scr.load 'job/aux.groovy'
        aux.mymethod()
        return "Hello from Master"
    }
}

return new MasterJob(this)