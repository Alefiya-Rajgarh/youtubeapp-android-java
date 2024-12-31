package com.example.youtubeapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the WebView by its ID
        WebView webView = findViewById(R.id.webView);

        // Enable JavaScript for YouTube support
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Ensure links open within the WebView instead of a browser
        webView.setWebViewClient(new WebViewClient());

        // Load YouTube's URL
        webView.loadUrl("https://www.youtube.com/");
    }
}
