package com.alphabet7.hellogcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by Gentra on 10/06/2015.
 */
public class MyInstanceIDListenerService extends InstanceIDListenerService {

    public static final String TAG = MyInstanceIDListenerService.class.getName();

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        Intent intent = new Intent(this, GcmRegistrationIntentService.class);
        startService(intent);
    }
}
