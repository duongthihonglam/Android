package com.example.lamduong.vidu_listview_xml_array;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends Activity {

    EditText editId, editName;
    Button btnNhap;
    RadioGroup radgroup;
    ListView lvNhanVien;
    ArrayList<Employee> arrEmployee=new ArrayList<Employee>();
    ArrayAdapter<Employee>adapter=null;

    Employee employee= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String arr[]=getResources().getStringArray(R.array.myarray);
        setContentView(R.layout.activity_main);
        editId=(EditText) findViewById(R.id.editMa);
        editName=(EditText) findViewById(R.id.editTen);
        btnNhap=(Button) findViewById(R.id.btnnhap);
        radgroup=(RadioGroup) findViewById(R.id.radiogroud1);
        lvNhanVien=(ListView) findViewById(R.id.lvnhanvien);

        //
        adapter=new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1,arrEmployee);
        //
        lvNhanVien.setAdapter(adapter);

        btnNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                processNhap();
            }
        });

    }
    public  void  processNhap(){
        int radId=radgroup.getCheckedRadioButtonId();
        String id=editId.getText()+"";
        String name = editName.getText()+"";
        if ((radId==R.id.radChinhthuc)){
            employee=new EmployeeFullTime();
        }
        else {
            employee= new EmployeePartTime();
        }
        employee.setId(id);
        employee.setName(name);

        arrEmployee.add(employee);

        adapter.notifyDataSetChanged();
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
