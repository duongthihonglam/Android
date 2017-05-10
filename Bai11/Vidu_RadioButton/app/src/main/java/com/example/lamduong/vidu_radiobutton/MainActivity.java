package com.example.lamduong.vidu_radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    RadioGroup rNhom;
    Button btbVote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rNhom =(RadioGroup)findViewById(R.id.radioGroup1);
        btbVote=(Button)findViewById(R.id.btbVote);
        btbVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThongTinCheckBox();
            }
        });
    }
    public void ThongTinCheckBox()
    {
        String ThongBao = "";
        int tmp = rNhom.getCheckedRadioButtonId();
        if(tmp==R.id.radioButton)
            ThongBao += "Rất thích";
        else if (tmp==R.id.radioButton2)
            ThongBao +="Hơi thích";
        else if(tmp==R.id.radioButton3)
            ThongBao +="Không lung lay";
        else if (tmp==R.id.radioButton4)
            ThongBao +="Nhìn mặt thấy ghét";
        else if(tmp==R.id.radioButton5)
            ThongBao +="Nhìn mật muốn báo công an";
        Toast.makeText(getApplicationContext(),ThongBao, Toast.LENGTH_SHORT).show();
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
