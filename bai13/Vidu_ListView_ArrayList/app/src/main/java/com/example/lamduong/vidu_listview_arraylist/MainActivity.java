package com.example.lamduong.vidu_listview_arraylist;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    EditText txtten;
    TextView txtchon;
    Button btn;
    ListView lv;
    ArrayAdapter <String> adapter=null;
    ArrayList <String> arrList=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtten = (EditText) findViewById(R.id.txtTen);
        txtchon = (TextView) findViewById(R.id.txtselection);

        lv = (ListView) findViewById(R.id.lvperson);
        //1. Tạo ArrayList object
        arrList = new ArrayList<>();
        //2. Gán Data Source (ArrayList object) vào ArrayAdapter
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrList);
        lv.setAdapter(adapter);
        btn = (Button) findViewById(R.id.btnNhap);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                arrList.add(txtten.getText() + "");
                adapter.notifyDataSetChanged();
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                txtchon.setText("postion:" + arg2 + ";value=" + arrList.get(arg2));
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                arrList.remove(arg2);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
    }
}


