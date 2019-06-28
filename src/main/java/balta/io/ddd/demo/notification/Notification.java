package balta.io.ddd.demo.notification;

public class Notification {

    private String property;
    private String message;

    public Notification(String property, String message) {
        this.property = property;
        this.message = message;
    }

    public String getProperty() {
        return property;
    }

    public String getMessage() {
        return message;
    }
}
