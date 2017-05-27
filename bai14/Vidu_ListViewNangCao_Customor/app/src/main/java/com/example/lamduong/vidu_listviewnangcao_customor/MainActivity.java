package com.example.lamduong.vidu_listviewnangcao_customor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvSinhVien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSinhVien=(ListView)findViewById(R.id.listviewSinhVien);

        ArrayList<SinhVien> arrSinhVien=new ArrayList<SinhVien>();
        arrSinhVien.add(new SinhVien("Nguyen Hong Ngoc",1996));
        arrSinhVien.add(new SinhVien("Nguen van thinh",1987));
        arrSinhVien.add(new SinhVien("Duong Thi Tham Thuy",1994));
        arrSinhVien.add(new SinhVien("Duong Ngoc Tuan", 1995));

        ListAdapter adapter= new ListAdapter(
                MainActivity.this,R.layout.activity_dong_sinh_vien,arrSinhVien
        );
        lvSinhVien.setAdapter(adapter);
    }
}
