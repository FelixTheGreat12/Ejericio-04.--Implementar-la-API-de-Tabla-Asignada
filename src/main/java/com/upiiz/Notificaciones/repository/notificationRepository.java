package com.upiiz.Notificaciones.repository;

import com.upiiz.Notificaciones.models.Notification;
import org.aspectj.weaver.ast.Not;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class notificationRepository {
    private List<Notification> notifications = new ArrayList<>();
    private AtomicLong notificationId = new AtomicLong();

    public Notification guardar(Notification notification) {
        notification.setNotificationId(notificationId.incrementAndGet());
        notifications.add(notification);
        return notification;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public Notification getNotificationById(long id) {
        return notifications.stream().filter(notification -> notification.getNotificationId() == id).findFirst().orElse(null);
    }

    public void eliminar(Long id) {
        notifications.removeIf(notification -> notification.getNotificationId().equals(id));
    }

    public Notification actualizar(Notification notification) {
        eliminar(notification.getNotificationId());
        notifications.add(notification);
        return notification;

    }
}
