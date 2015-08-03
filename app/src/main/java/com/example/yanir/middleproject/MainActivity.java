package com.example.yanir.middleproject;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View.OnClickListener




public class MainActivity extends Activity {
    Button addContactButton =  (Button) findViewById(R.id.addContactBtn);
    addContactButton.setOnClickListener(new OnclickListener(){

    });


    Button viewContactButton =  (Button) findViewById(R.id.viewContectBtn);
    viewContactButton.setOnClickListener(new OnclickListener(){

    });


}
