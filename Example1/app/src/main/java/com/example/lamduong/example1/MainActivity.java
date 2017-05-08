package com.example.lamduong.example1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtCount;
    Button btbCount;
    RadioButton rBtUp, rBtDown;

    int count = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // buoc 2 : Anh xa
        rBtUp = ( RadioButton ) findViewById(R.id.rBtUpId);
        rBtDown = ( RadioButton ) findViewById(R.id.rBtDownId);
        txtCount = (TextView) findViewById(R.id.txtCountId);
        txtCount.setText(String.valueOf(count));// lay gia tri

        btbCount = (Button) findViewById(R.id.btbCountId);

        // bat su kien click trong button count

        btbCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rBtUp.isChecked()) {
                    count++;
                } else if (rBtDown.isChecked()) {
                    count--;
                }
                txtCount.setText(String.valueOf(count));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
