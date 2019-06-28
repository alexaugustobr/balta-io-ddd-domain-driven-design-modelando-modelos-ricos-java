package balta.io.ddd.demo.flunt.notification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class Notifiable implements INotifiable {

    private List<Notification> notificationList = new ArrayList();

    @Override
    public final void addNotification(String property, String message) {
        this.notificationList.add(new Notification(property, message));
    }

    @Override
    public final void addNotification(Notification notification) {
        this.notificationList.add(notification);
    }

    @Override
    public final void addNotifications(Collection<Notification> notifications) {
        this.notificationList.addAll(notifications);
    }

    @Override
    public final void addNotifications(Notifiable item) {
        if (item == null) {
            return;
        }
        this.addNotifications(item.notificationList);
    }

    @Override
    public final void addNotifications(Notifiable... items) {
        for (Notifiable item : items) {
            if (item != null) {
                this.addNotifications(item);
            }
        }
    }

    public List<Notification> getNotificationList() {
        return Collections.unmodifiableList(notificationList);
    }

    public boolean isInvalid() {
        return !notificationList.isEmpty();
    }

    public boolean isValid() {
        return !this.isInvalid();
    }
}
