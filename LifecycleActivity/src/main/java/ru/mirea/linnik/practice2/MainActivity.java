package ru.mirea.linnik.practice2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String TAG = "cycl";
    private TextView tvOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onCreate");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "onPostCreate()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onPostCreate");
    }

       @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onSaveInstanceState");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onPostResume");
    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
        Log.i(TAG, "onRestoreInstanceState()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onRestoreInstanceState");
    }
    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
        tvOut = (TextView)findViewById(R.id.cycl);
        tvOut.setText("onAttachedToWindow");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        //setContentView(R.layout.activity_main);
        Log.i(TAG, "onRestart()");
        //tvOut = (TextView)findViewById(R.id.cycl);
        //tvOut.setText("onRestart");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onDetachedFromWindow()");
        //tvOut = (TextView)findViewById(R.id.cycl);
        //tvOut.setText("onDetachedFromWindow");
    }
}