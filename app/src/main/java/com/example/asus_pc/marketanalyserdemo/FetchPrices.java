package com.example.asus_pc.marketanalyserdemo;

import android.os.AsyncTask;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchPrices extends AsyncTask<String, Void, Void> {
    String data = "";
    String dataParsed = "";

    @Override
    protected Void doInBackground(String... urls) {
        try {
            URL url = new URL(urls[0]);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream inputStream = httpURLConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            JSONObject jsonObject = new JSONObject(data);

            dataParsed = "Symbol: " + jsonObject.getString("symbol") + "\n" +
                    "Company Name: " + jsonObject.getString("companyName") + "\n" +
                    "Open: " + jsonObject.getString("open") + "\n" +
                    "Close: " + jsonObject.getString("close") + "\n" +
                    "High: " + jsonObject.getString("high") + "\n" +
                    "Low: "  + jsonObject.getString("low") + "\n" +
                    "week52High: " + jsonObject.getString("week52High") + "\n" +
                    "week52Low: "  + jsonObject.getString("week52Low");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        StockPrices.data.setText(dataParsed);

    }
}




