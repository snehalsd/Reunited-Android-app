package com.example.snehalsurendradesai.keepmeclose;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button missing,found;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        missing=(Button) findViewById(R.id.button);
        found=(Button) findViewById(R.id.button2);
        missing.setOnClickListener(this);
        found.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v==missing)
        {
            Intent intent1 = new Intent(MainActivity.this,report_missing.class);
            startActivity(intent1);
        }
        if(v==found)
        {
            Intent intent2 = new Intent(MainActivity.this,found.class);
            startActivity(intent2);
        }
    }
}
