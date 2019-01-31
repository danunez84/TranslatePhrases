package com.danunez.gridlayoutdemo;

import android.media.MediaPlayer;
import android.nfc.Tag;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    public void playPhraseInFrench(View view){

        int theIntId = view.getId();
        String theId = "";

        theId = view.getResources().getResourceEntryName(theIntId);
        int resourceId = view.getResources().getIdentifier(theId , "raw", "com.danunez.gridlayoutdemo");
        MediaPlayer mPlayer = MediaPlayer.create(this , resourceId);
        mPlayer.start();
    }

/*    public void playPhraseInFrench2(View view){

        String theTag = view.getTag().toString();

        MediaPlayer mPlayer = new MediaPlayer();
        switch (theTag){
            case "DoYouSpeakEnglish": mPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                break;
            case "GoodEvening": mPlayer = MediaPlayer.create(this, R.raw.goodevening);
                break;
            case "Hello": mPlayer = MediaPlayer.create(this, R.raw.hello);
                break;
            case "HowAreYou": mPlayer = MediaPlayer.create(this, R.raw.howareyou);
                break;
            case "ILiveIn": mPlayer = MediaPlayer.create(this, R.raw.ilivein);
                break;
            case "MyNameIs": mPlayer = MediaPlayer.create(this, R.raw.mynameis);
                break;
            case "Please": mPlayer = MediaPlayer.create(this, R.raw.please);
                break;
            case "Welcome": mPlayer = MediaPlayer.create(this, R.raw.welcome);
                break;
        }

        mPlayer.start();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
