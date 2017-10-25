package job

class DevelopJob extends MyJob implements Serializable {
    public DevelopJob(scr) {

    }
    public String test() {
        return "Hello from Develop"
    }
}

return new DevelopJob(this)