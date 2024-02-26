package com.mycompany.capacitor.tap.jacking;

import android.util.Log;
import android.app.Activity;
import android.webkit.WebView;

public class CapacitorTapJacking {

    Activity activity;
    WebView webView;

    CapacitorTapJacking(Activity activity, WebView webView) {
        this.activity = activity;
        this.webView = webView;
    }

    public void setFilterTouchesWhenObscured(Boolean value) {
        webView.setFilterTouchesWhenObscured(value);
    }
}
