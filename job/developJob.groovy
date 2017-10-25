package job

class DevelopJob extends MyJob implements Serializable {
    public String test() {
        return "Hello from Develop"
    }
}

return new DevelopJob()