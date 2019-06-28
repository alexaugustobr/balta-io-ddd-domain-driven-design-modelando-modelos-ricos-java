package balta.io.ddd.demo.notification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class Notifiable {

    private List<Notification> notifications = new ArrayList();

    protected Notifiable() {
    }

    public final void addNotification(String property, String message) {
        this.notifications.add(new Notification(property, message));
    }

    public final void addNotification(Notification notification) {
        this.notifications.add(notification);
    }

    public final void addNotifications(Collection<Notification> notifications) {
        this.notifications.addAll(notifications);
    }

    public final void addNotifications(Notifiable item) {
        if (item == null) {
            return;
        }
        this.addNotifications(item.notifications);
    }

    public final void addNotifications(Notifiable... items) {
        for (Notifiable item : items) {
            if (item != null) {
                this.addNotifications(item);
            }
        }
    }

    public List<Notification> getNotifications() {
        return Collections.unmodifiableList(notifications);
    }

    public boolean isInvalid() {
        return !notifications.isEmpty();
    }

    public boolean isValid() {
        return !this.isInvalid();
    }
}
