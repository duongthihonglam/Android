package com.example.lamduong.tong_hieu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }
        public void btbTong(View v)
        {
            EditText  edita = (EditText) findViewById(R.id.editTextSoA);
            int a = Integer.parseInt(edita.getText()+ "");
            EditText editb=(EditText)findViewById(R.id.editTextSoB);
            int b = Integer.parseInt(editb.getText()+ "");
            TextView txtkq = ( TextView) findViewById(R.id.txtkq);
            txtkq.setText((a+b) + "");

        }

    //@Override
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
