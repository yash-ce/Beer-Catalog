package com.example.beerc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
    private RequestQueue mQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text7 = (TextView) findViewById(R.id.text7);
        text8 = (TextView) findViewById(R.id.text8);
        text9 = (TextView) findViewById(R.id.text9);
        text10 = (TextView) findViewById(R.id.text10);

        mQueue = Volley.newRequestQueue(this);

        class SayHello extends TimerTask {
            public void run() {
                Data();
            }
        }

// And From your main() method or any other method
        Timer timer = new Timer();
        timer.schedule(new SayHello(), 0, 10000);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#e68a00"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimaryDark));
        }





    }


    private void Data() {

        String url = "https://random-data-api.com/api/v2/beers?size=10&response_type=json";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                for (int i = 0; i < response.length(); i++) {
                    // creating a new json object and
                    // getting each object from our json array.
                    try {
                        // we are getting each json object.
                        JSONObject responseObj = response.getJSONObject(i);
//                        Log.d("my-api","==== "+responseObj.getString("name"));
//                        Log.d("my-api","==== "+responseObj.getString("brand"));
//                        Log.d("my-api","==== "+responseObj.getString("alcohol"));

                        String firstName = responseObj.getString("name");
                        String age = responseObj.getString("brand");
                        String mail = responseObj.getString("alcohol");

                        String str= mail.replaceAll("[^a-zA-Z0-9]","");
                        mail += "Alcohol";
                        if(i == 0){
                            if ((Integer.parseInt(str)) > 50) {
                                text1.setBackgroundResource(R.color.green);
                            }
                            else{

                                text1.setBackgroundResource(R.color.red);

                            }
                            text1.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 1){
                            if ((Integer.parseInt(str)) > 50) {

                                text2.setBackgroundResource(R.color.green);
                            }
                            else{
                                text2.setBackgroundResource(R.color.red);

                            }
                            text2.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 2){
                            if ((Integer.parseInt(str)) > 50) {

                                text3.setBackgroundResource(R.color.green);
                            }
                            else{
                                text3.setBackgroundResource(R.color.red);

                            }
                            text3.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 3){
                            if ((Integer.parseInt(str)) > 50) {

                                text4.setBackgroundResource(R.color.green);
                            }
                            else{
                                text4.setBackgroundResource(R.color.red);

                            }
                            text4.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 4){
                            if ((Integer.parseInt(str)) > 50) {

                                text5.setBackgroundResource(R.color.green);
                            }
                            else{
                                text5.setBackgroundResource(R.color.red);

                            }
                            text5.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 5){
                            if ((Integer.parseInt(str)) > 50) {

                                text6.setBackgroundResource(R.color.green);
                            }
                            else{
                                text6.setBackgroundResource(R.color.red);

                            }
                            text6.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 6){
                            if ((Integer.parseInt(str)) > 50) {

                                text7.setBackgroundResource(R.color.green);
                            }
                            else{
                                text7.setBackgroundResource(R.color.red);

                            }
                            text7.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 7){
                            if ((Integer.parseInt(str)) > 50) {

                                text8.setBackgroundResource(R.color.green);
                            }
                            else{
                                text8.setBackgroundResource(R.color.red);

                            }
                            text8.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 8){
                            if ((Integer.parseInt(str)) > 50) {

                                text9.setBackgroundResource(R.color.green);
                            }
                            else{
                                text9.setBackgroundResource(R.color.red);

                            }
                            text9.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }
                        if(i == 9){
                            if ((Integer.parseInt(str)) > 50) {

                                text10.setBackgroundResource(R.color.green);
                            }
                            else{
                                text10.setBackgroundResource(R.color.red);

                            }
                            text10.setText(firstName + ", " + age + ", " + mail + "\n\n");

                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Please turn on Internet..", Toast.LENGTH_SHORT).show();
            }
        });
        mQueue.add(jsonArrayRequest);
    }


}
