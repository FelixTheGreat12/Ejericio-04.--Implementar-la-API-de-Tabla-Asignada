package com.upiiz.Notificaciones.models;

import java.util.Date;

public class Notification {
    private Long notificationId;
    private String notification_text;
    private Long user_id;
    private Date notification_date;

    public Notification(){}

    public Notification(Long notificationId, String notification_text, Long user_id, Date notification_date) {
        this.notificationId = notificationId;
        this.notification_text = notification_text;
        this.user_id = user_id;
        this.notification_date = notification_date;
    }

    public Long getNotificationId() { return notificationId; }
    public void setNotificationId(Long notificationId) { this.notificationId = notificationId; }

    public String getNotification_text() { return notification_text; }
    public void setNotification_text(String notification_text) { this.notification_text = notification_text; }

    public Long getUser_id() { return user_id; }
    public void setUser_id(Long user_id) { this.user_id = user_id; }

    public Date getNotification_date() { return notification_date; }
    public void setNotification_date(Date notification_date) { this.notification_date = notification_date; }

}


