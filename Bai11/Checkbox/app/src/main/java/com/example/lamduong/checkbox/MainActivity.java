package com.example.lamduong.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbBongda,cbKiemHiep,cbTuKi,cbDuLich;
    Button btbVote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbBongda = (CheckBox) findViewById(R.id.checkBox);
        cbKiemHiep = (CheckBox) findViewById(R.id.checkBox2);
        cbDuLich = (CheckBox) findViewById(R.id.checkBox3);
        cbTuKi = (CheckBox) findViewById(R.id.checkBox4);
        btbVote = (Button) findViewById(R.id.btbVote);

        btbVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thongbao = "Sở thích: ";
                if (cbBongda.isChecked() == true) {
                    thongbao += " Xem bóng đá ";
                }
                if (cbKiemHiep.isChecked() == true) {
                    thongbao += " Xem phim kiếm hiệp ";
                }
                if (cbDuLich.isChecked() == true) {
                    thongbao += " Đi du lịch ";
                }
                if (cbTuKi.isChecked() == true) {
                    thongbao += " Tự kỉ 1 mình ";
                }
                Toast.makeText(getApplicationContext(), thongbao, Toast.LENGTH_SHORT).show();
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
