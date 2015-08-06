package com.example.yanir.middleproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewContactButton = (Button) findViewById(R.id.viewContectBtn);
        whenClick();
    }

    public void whenClick() {
        Button addContactButton = (Button) findViewById(R.id.addContactBtn);
        addContactButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, AddContactActivity.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
    }

    public Button viewContactButton;

}