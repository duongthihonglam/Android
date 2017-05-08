package com.example.lamduong.explicitlistenerclass;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class MainActivity extends Activity
{
    EditText txta,txtb, txtc;
    TextView kq;
    Button btnTiepTuc, btnGiai, btnThoat;
    DecimalFormat LamTron=new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta=(EditText) findViewById(R.id.editTextSoA);
        txtb=(EditText) findViewById(R.id.editTextSoB);
        txtc=(EditText) findViewById(R.id.editTextSoC);
        kq=(TextView) findViewById(R.id.txtHienThi);
        btnTiepTuc=(Button) findViewById(R.id.btbTiepTuc);
        btnGiai=(Button) findViewById(R.id.btnGiai);
        btnThoat=(Button) findViewById(R.id.btnThoat);
        btnTiepTuc.setOnClickListener(new MyEvent());
        btnGiai.setOnClickListener(new MyEvent());
        btnThoat.setOnClickListener(new MyEvent());
    }
    public  class MyEvent implements OnClickListener{

        public void TiepTuc()
        {
            txta.setText("");
            txtb.setText("");
            txtc.setText("");
            kq.setText("");
            txta.requestFocus();
        }

        public void GiaiPT()
        {
            try{
                double da = Double.parseDouble(txta.getText().toString());
                double db = Double.parseDouble(txtb.getText().toString());
                double dc = Double.parseDouble(txtc.getText().toString());

                if(da==0)
                    if(db==0)
                        if(dc==0)
                            kq.setText("PT vô số nghiệm");
                        else kq.setText("PT vô nghiệm");
                    else kq.setText("PT có nghiệm duy nhất  x= " + LamTron.format(-dc/db));
                else
                {
                    double delta = Math.pow(db, 2) - 4*da*dc;
                    if(delta<0) kq.setText("PT vô nghiêm");
                    else if(delta==0) kq.setText("PT có nghiệm kép: x1 = x2 = " + LamTron.format(-db/(2*da)));
                    else {
                        double x1, x2;
                        x1 = (-db - Math.sqrt(delta))/(2*da);
                        x2 = (-db+ Math.sqrt(delta))/(2*da);
                        kq.setText("PT có 2 nghiệm : x1 = " + LamTron.format(x1) + ", x2 = " + LamTron.format(x2));
                    }

                }
            }
            catch(Exception e)
            {
                kq.setText("lấy giá trị nguyên");
            }
        }

        public void Thoat()
        {
            finish();
        }
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            if(v==btnTiepTuc) this.TiepTuc();
            if(v==btnGiai) this.GiaiPT();
            if(v==btnThoat) this.Thoat();

        }

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
