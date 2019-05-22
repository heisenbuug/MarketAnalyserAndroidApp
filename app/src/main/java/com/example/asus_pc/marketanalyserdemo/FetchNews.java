package com.example.asus_pc.marketanalyserdemo;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchNews extends AsyncTask<Void, Void, Void> {
    String data = "";
    String dataParsed = "";
    String singleParsed = "";
    String u = "";

    @Override
    protected Void doInBackground(Void... voids) {
        try {

            URL url = new URL("https://newsapi.org/v2/top-headlines?sources=business-insider&apiKey=0df307ad3ae0483f94e1a691ba55c299");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpURLConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";

            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONObject jsonObject = new JSONObject(data);
            String test = jsonObject.getString("articles");
            JSONArray JA = new JSONArray(test);

            for (int i = 0; i < JA.length(); i++) {
                JSONObject JO = (JSONObject) JA.get(i);
                singleParsed = "Title: " + JO.getString("title") + "\n" +
                        JO.getString("url")+"\n\n";
                dataParsed = dataParsed + singleParsed;
                u = JO.getString("url");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        StockNews.news.loadUrl("https://www.businessinsider.in/business");
    }
}

