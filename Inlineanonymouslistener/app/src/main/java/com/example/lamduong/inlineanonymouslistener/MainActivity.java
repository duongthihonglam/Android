package com.example.lamduong.inlineanonymouslistener;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a;
    Button doi;
    TextView c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doi=(Button)findViewById(R.id.btnDoi);
        doi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
               a=(EditText)findViewById(R.id.editText);
               c= (TextView)findViewById(R.id.textViewQuiTi);
               try {
                   int x = Integer.parseInt(a.getText().toString());
                    c.setText(Can(x%10)+ " " + Chi(x%12));
               }
               catch (Exception e1)
               {
                   c.setText(" Xin Nhập giá trị vào");
               }
            }
        });
     }
    public String Can(int x){
        switch (x)
        {
            case 0 : return "Canh";
            case 1 : return "Tân";
            case 2 : return "Nhâm";
            case 3 : return "Quý";
            case 4 : return "Giáp";
            case 5 : return "Ất";
            case 6 : return "Bính";
            case 7 : return "Đinh";
            case 8 : return "Mậu";
            case 9 : return "Ký";
            default : return "";
        }

    }

    public  String Chi (int x )
    {
        switch (x)
        {
            case 0: return " Thân";
            case 1: return  "Dậu";
            case 2: return " Tuất";
            case 3: return " Hợi";
            case 4: return  " Tý";
            case 5: return " Sửu";
            case 6: return " Dần";
            case 7: return " Mẹo";
            case 8: return " Thìn";
            case 9: return "Tỵ";
            case 10: return " Ngọ";
            case 11: return "Mùi";
            default : return "";

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
