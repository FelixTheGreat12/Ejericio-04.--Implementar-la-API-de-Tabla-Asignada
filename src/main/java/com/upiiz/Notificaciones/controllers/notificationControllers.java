package com.upiiz.Notificaciones.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.upiiz.Notificaciones.services.notificationServices;
import com.upiiz.Notificaciones.models.Notification;

import java.util.List;


@RestController
@RequestMapping("api/v1/notification")

public class notificationControllers {

    notificationServices NotificationServices;

    public notificationControllers(notificationServices NotificationServices) {
        this.NotificationServices = NotificationServices;
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getAllNotifications() {
        return ResponseEntity.ok(NotificationServices.getallNotifications());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) {
        return ResponseEntity.ok(NotificationServices.getNotificationById(id));
    }

    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
        return ResponseEntity.ok(NotificationServices.saveNotification(notification));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Notification> updateNotification(@PathVariable Long id, @RequestBody Notification notification) {
        notification.setNotificationId(id);
        return ResponseEntity.ok(NotificationServices.saveNotification(notification));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Notification> deleteNotification(@PathVariable Long id) {
        NotificationServices.deleteNotification(id);
        return ResponseEntity.noContent().build();
    }


}
