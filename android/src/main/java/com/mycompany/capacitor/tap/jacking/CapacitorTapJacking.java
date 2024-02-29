package com.mycompany.capacitor.tap.jacking;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;

public class CapacitorTapJacking {

    Activity activity;
    WebView webView;

    CapacitorTapJacking(Activity activity, WebView webView) {
        this.activity = activity;
        this.webView = webView;
    }

    public void preventOverlays() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            activity.getWindow().setHideOverlayWindows(true);
        } else {
            webView.setFilterTouchesWhenObscured(true);
        }
    }

    public void enableOverlays() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            activity.getWindow().setHideOverlayWindows(false);
        } else {
            webView.setFilterTouchesWhenObscured(false);
        }
    }
}
