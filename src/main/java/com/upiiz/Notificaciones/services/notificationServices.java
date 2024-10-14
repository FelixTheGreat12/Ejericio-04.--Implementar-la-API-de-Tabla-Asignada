package com.upiiz.Notificaciones.services;

import com.upiiz.Notificaciones.models.Notification;

import java.util.ArrayList;
import java.util.List;
import com.upiiz.Notificaciones.models.Notification;
import com.upiiz.Notificaciones.repository.notificationRepository;
import org.springframework.stereotype.Service;

@Service

public class notificationServices {
     notificationRepository repo;

     public notificationServices(notificationRepository repo) {
          this.repo = repo;
     }

     public List<Notification> getallNotifications() {
          return repo.getNotifications();
     }

     public Notification getNotificationById(Long id) {
          return repo.getNotificationById(id);
     }

     public Notification saveNotification(Notification notification) {
          return repo.guardar(notification);
     }

     public Notification updateNotification(Notification notification) {
          return repo.actualizar(notification);
     }

     public void deleteNotification(Long id) {
          repo.eliminar(id);
     }


}

