package job

class MasterJob extends MyJob implements Serializable {
    public String test() {
        return "Hello from Master"
    }
}

return new MasterJob()