package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.acme.csci3130_demo.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        /*I originally wrote the program to use a new activity to display the message.
        A second read of the instructions for the assignment indicated that i should
        not have done so. I left the code here, commented out.
         */
       // Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
       // intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }


}
