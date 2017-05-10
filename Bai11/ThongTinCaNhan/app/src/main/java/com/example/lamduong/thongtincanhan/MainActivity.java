package com.example.lamduong.thongtincanhan;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTen, editCMND, edditBoSung;
    CheckBox chkDocBao, chkdocSach,chkDocCoding;
    Button btbguitt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTen=(EditText)findViewById(R.id.edHoTen);
        edditBoSung=(EditText)findViewById(R.id.edBoSung);
        editCMND=(EditText)findViewById(R.id.edCMND);
        chkDocBao=(CheckBox)findViewById(R.id.chkDocBao);
        chkdocSach=(CheckBox)findViewById(R.id.chkDocSach);
        chkDocCoding=(CheckBox)findViewById(R.id.chkDocCoding);
        btbguitt=(Button)findViewById(R.id.btbguitt);
        btbguitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0 ) {
                ThongTin();
            }
        });

    }
    public void ThongTin()
    {
        String ten = editTen.getText()+ "";
        ten.trim();
        if (ten.length()<3)
        {
            editTen.requestFocus();
            editTen.selectAll();
            Toast.makeText(this,"Tên phải >= 3 lí tự ", Toast.LENGTH_LONG).show();
            return;
        }
        String cmnd=editCMND.getText()+ " ";
        cmnd=cmnd.trim();
        if(cmnd.length()!=9){
            editCMND.requestFocus();
            editCMND.selectAll();
            Toast.makeText(this,"CMND phải đúng 9 ký tự ", Toast.LENGTH_LONG).show();
            return;
        }
        String bang="";
        RadioGroup group=(RadioGroup)findViewById(R.id.GroupRadio1);
        int id = group.getCheckedRadioButtonId();
        if (id==-1)
        {
            Toast.makeText(this,"Phải chọn bằng cấp ", Toast.LENGTH_LONG).show();
            return;
        }
        RadioButton rad =(RadioButton)findViewById(id);
        bang=rad.getText()+"";

        String sothich="";
        if (chkDocBao.isChecked())
            sothich+=chkDocBao.getText()+"\n";
        if (chkdocSach.isChecked())
            sothich+=chkdocSach.getText()+"\n";
        if (chkDocCoding.isChecked())
            sothich+=chkDocCoding.getText()+"\n";
        String bosung = edditBoSung.getText()+"";
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Thông tin cá nhân");
        builder.setPositiveButton("Đóng",new  DialogInterface.OnClickListener(){
          public  void onClick(DialogInterface dialog, int which ){
              dialog.cancel();
          }
        });

        String msg = ten +"\n";
        msg+= cmnd+"\n";
        msg+=bang+"\n";
        msg+=sothich+"\n";
        msg+="_________________________\n";
        msg+="Thong tin bổ sung:\n ";
        msg+=bosung+"\n";
        msg+="_______________________________";
        builder.setMessage(msg);
        builder.create().show();
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
