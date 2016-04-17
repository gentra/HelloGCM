package com.alphabet7.hellogcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by Gentra on 27/05/2015.
 */
public class MyGcmListenerService extends GcmListenerService {

    public static final String TAG = MyGcmListenerService.class.getName();

    private static final String KEY_CONTENT = "content";

    private NotificationManager notificationManager;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * Called when message is received.
     *
     * @param from SenderID of the sender.
     * @param data Data bundle containing message data as key/value pairs.
     *             For Set of keys use data.keySet().
     */
    @Override
    public void onMessageReceived(String from, Bundle data) {
        super.onMessageReceived(from, data);
        notificationManager = (NotificationManager)
                this.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        Notification notif = generateBaseNotificationBuilder(this.getString(R.string.app_name), data.getString(KEY_CONTENT), pendingIntent)
                .build();
        notificationManager.notify(Integer.MAX_VALUE, notif);
    }

    private NotificationCompat.Builder generateBaseNotificationBuilder(String title, String subtitle, PendingIntent pendingIntent) {
        return new NotificationCompat.Builder(this).setSmallIcon(R.mipmap.ic_launcher).setContentTitle(title).
                setContentText(subtitle).setTicker(subtitle).setStyle(new NotificationCompat.BigTextStyle().
                bigText(subtitle)).setAutoCancel(true).setLights(this.getResources().getColor(R.color.colorPrimary), 500, 500).
                setContentIntent(pendingIntent).setAutoCancel(true);
    }

}
