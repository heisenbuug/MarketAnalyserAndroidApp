package com.example.asus_pc.marketanalyserdemo;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class StockNews extends AppCompatActivity {

    public static WebView news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_news);
        news = findViewById(R.id.webView);
        news.setWebViewClient(new WebViewClient());
        news.getSettings().setJavaScriptEnabled(true);



        FetchNews Foo = new FetchNews();
        Foo.execute();

    }
}
