package balta.io.ddd.demo.flunt.notification;

import java.util.Collection;

public interface INotifiable {

    void addNotification(String property, String message);

    void addNotification(Notification notification);

    void addNotifications(Collection<Notification> notifications);

    void addNotifications(Notifiable item);

    void addNotifications(Notifiable... items);

}
