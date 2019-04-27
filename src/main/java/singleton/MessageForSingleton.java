package singleton;

public class MessageForSingleton {
    private String message;

    public String getMessage() {
        return "MessageForSingleton: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}