package com.irandrive.game;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b) {
  super.onCreate(b);
  getWindow().getDecorView().setSystemUiVisibility(5894|1024|512|4096);
  WebView w=new WebView(this); setContentView(w);
  w.setWebViewClient(new WebViewClient());
  WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true);
  w.loadUrl("file:///android_asset/game.html");
 }
 @Override public void onBackPressed(){super.onBackPressed();}
}
