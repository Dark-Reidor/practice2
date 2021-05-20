package ru.mirea.linnik.multiactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView edo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        edo = (TextView) findViewById(R.id.textView);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", edo.getText());
        startActivity(intent);
    }
}