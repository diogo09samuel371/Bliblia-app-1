package com.palavradedeus.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView web = new WebView(this);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        web.setBackgroundColor(0xFF0B1730);
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() {
        setContentView(new WebView(this));
        super.onBackPressed();
    }
}
