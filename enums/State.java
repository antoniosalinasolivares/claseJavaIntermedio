public enum State{
    
    PREPARING("The process is still not running. Status: [ %s ]."),
    IN_PROGRESS("The process is currently running. Status: [ %s ]"),
    OVER("The process has been completed. Status: [ %s ]"),
    ERROR("There has been an error during the process. Status: [ %s ].");
    
    private String message;
    
    private State(String message) {
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}
