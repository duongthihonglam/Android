package com.example.lamduong.nhietdo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnFar,btnCel,btnClear;
    private EditText txtFar,txtCel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFar=(EditText)findViewById(R.id.editTextFar);
        txtCel=(EditText)findViewById(R.id.editTextCel);
        btnCel=(Button)findViewById(R.id.btbCel);
        btnFar=(Button)findViewById(R.id.btbFar);
        btnClear=(Button)findViewById(R.id.btbClear);
        btnCel.setOnClickListener(myVarListenner);
        btnFar.setOnClickListener(myVarListenner);
        btnClear.setOnClickListener(myVarListenner);
    }
    private View.OnClickListener myVarListenner=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if ( v == btnCel) {
                try {
                    double far = Double.parseDouble(txtFar.getText().toString());
                    txtCel.setText((far - 32) * 5 / 9 + "");
                } catch (Exception e) {
                    txtCel.setText("Lấy giá trị nguyên");
                }
            }
            if (v== btnFar)
            {
                try{
                    double cel= Double.parseDouble(txtCel.getText().toString());
                    txtFar.setText(cel*9/5 +32 +"");
                }
                catch (Exception e)
                {
                    txtFar.setText("Lấy giá trị nguyên");
                }
            }
            if (v==btnClear) {
                txtFar.setText("");
                txtCel.setText("");
                txtFar.requestFocus();

            }
        }
    };

}
