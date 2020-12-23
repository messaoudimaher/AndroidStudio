package com.example.tp2_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG ="Main_Activity" ;
    public int i=0;
    TextView mReplyHeadTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.textView)).setText(i + "");
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");
        mReplyHeadTextView = (TextView) findViewById(R.id.textView);
        if (savedInstanceState != null) {
            i= savedInstanceState.getInt("count");
            ((TextView) findViewById(R.id.textView)).setText(String.valueOf(i));
            }
    }
    public void inc(View v){
        i++;
        ((TextView) findViewById(R.id.textView)).setText(i+"");
    }
    /*
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"onRestart");
    }
    */
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",i);
    }
}
