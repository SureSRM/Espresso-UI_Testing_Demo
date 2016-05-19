package com.suresrm.espressodemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        EditText editText = (EditText) findViewById(R.id.inputField);
        switch (view.getId()) {
            case R.id.changeText:

                editText.setText("Lalala");
                break;
            case R.id.switchActivity:

                String inputText = editText.getText().toString();

                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("input", inputText);
                startActivity(intent);
                break;
        }
    }
}