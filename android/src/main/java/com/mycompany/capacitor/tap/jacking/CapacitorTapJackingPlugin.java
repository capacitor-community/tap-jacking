package com.mycompany.capacitor.tap.jacking;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.webkit.WebView;
import android.app.Activity;

@CapacitorPlugin(name = "TapJacking")
public class CapacitorTapJackingPlugin extends Plugin {

    private CapacitorTapJacking implementation;

    @Override
    public void load() {
        Activity activity = getBridge().getActivity();
        WebView webView = getBridge().getWebView();
        implementation = new CapacitorTapJacking(activity, webView);
    }

    @PluginMethod
    public void preventOverlays(PluginCall call) {
      getBridge().getActivity().runOnUiThread(new Runnable() {
        @Override
        public void run() {
          implementation.preventOverlays();
          call.resolve();
        }
      });
    }

    @PluginMethod
    public void enableOverlays(PluginCall call) {
      getBridge().getActivity().runOnUiThread(new Runnable() {
        @Override
        public void run() {
          implementation.enableOverlays();
          call.resolve();
        }
      });
    }
}
