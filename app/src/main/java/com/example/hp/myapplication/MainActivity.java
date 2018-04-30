package com.example.hp.myapplication;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickvoice(View view) {
        try{
            Intent intent = new Intent();
            intent.setClassName("com.twilio.voice.quickstart", "com.twilio.voice.quickstart.VoiceActivity");
            startActivity(intent);

        }catch (ActivityNotFoundException e)
        {
            e.printStackTrace();
        }

    }

    public void onClickChat(View view) {
        try{
            Intent intent = new Intent();
            intent.setClassName("com.origamistudios.twilioapp", "com.origamistudios.twilioapp.MainAvtivity");
            startActivity(intent);

        }catch (ActivityNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
