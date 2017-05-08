package com.example.lamduong.activityislistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;


public class MainActivity extends Activity implements OnClickListener{

    EditText editTen,editCao,editNang,editBMI, editChuanDoan;
    Button btbBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTen =(EditText)findViewById(R.id.editTextTen);
        editCao=(EditText)findViewById(R.id.editTextChieuCao);
        editNang=(EditText)findViewById(R.id.editTextCanNang);
        editBMI=(EditText)findViewById(R.id.editTextBMI);
        editChuanDoan=(EditText)findViewById(R.id.editTextChuanDoan);
        btbBMI=(Button)findViewById(R.id.btnTinhBMI);
        btbBMI.setOnClickListener(this);

    }
    public void onClick(View arg0){

            double H=Double.parseDouble(editCao.getText()+"");
            double W=Double.parseDouble(editNang.getText()+"");
            double BMI=W/Math.pow(H, 2);
            String chandoan="";
            if(BMI<18)
            {
                chandoan="Bạn gầy";
            }
            else if(BMI<=24.9)
            {
                chandoan="Bạn bình thường";
            }
            else if(BMI<=29.9)
            {
                chandoan="Bạn béo phì độ 1";
            }
            else if(BMI<=34.9)
            {
                chandoan="Bạn béo phì độ 2";
            }
            else
            {
                chandoan="Bạn béo phì độ 3";
            }

        DecimalFormat lamtron= new DecimalFormat("#.0");
        editBMI.setText(lamtron.format(BMI));
        editChuanDoan.setText(chandoan);

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
