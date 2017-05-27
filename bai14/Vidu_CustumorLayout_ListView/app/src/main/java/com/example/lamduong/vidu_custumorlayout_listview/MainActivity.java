package com.example.lamduong.vidu_custumorlayout_listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayList<Employee>arrEmployee= new ArrayList<Employee>();
    MyArrayAdapter adapter=null;
    ListView lvNhanVie= null;
    Button btnNhap;
    ImageButton btnRemoveAll;
    EditText editMa, editTen;
    RadioGroup nhom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNhap= (Button)findViewById(R.id.btnNhap);
        btnRemoveAll=(ImageButton)findViewById(R.id.btndelete);
        editMa=(EditText)findViewById(R.id.editMa);
        editTen=(EditText)findViewById(R.id.editTen);
        nhom=(RadioGroup)findViewById(R.id.radioGroup1);

        lvNhanVie=(ListView)findViewById(R.id.lvnhanvien);
        arrEmployee=new ArrayList<Employee>();
        // khoi tao data soure
        adapter= new MyArrayAdapter(this,R.layout.my_item_layout,arrEmployee);
        lvNhanVie.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xulyNhap();
            }
        });
        btnRemoveAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xulyXoa();
            }
        });
    }
        public  void xulyNhap(){
            String ma= editMa.getText()+"";
            String ten=editTen.getText()+"";
            boolean gioitinh=false;

            if (nhom.getCheckedRadioButtonId()==R.id.radNu)
                gioitinh=true;

            Employee emp=new Employee();
            emp.setId(ma);
            emp.setName(ten);
            emp.setGender(gioitinh);

            arrEmployee.add(emp);
            adapter.notifyDataSetChanged();

            editMa.setText("");
            editTen.setText("");
            editMa.requestFocus();
        }
    public void xulyXoa(){
        for( int i = lvNhanVie.getChildCount()-1; i >= 0 ; i--){
            View v= lvNhanVie.getChildAt(i);
            CheckBox chk=(CheckBox)v.findViewById(R.id.chkitem);
            // neu xoa Check thi xoa ra khoi arrEm
            if(chk.isChecked()){
                arrEmployee.remove(i);
            }
        }
        //sau khi xoa update giao dien
        adapter.notifyDataSetChanged();
    }
}
