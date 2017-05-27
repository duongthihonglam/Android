package com.example.lamduong.vidu_listviewnangcao_customor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lamduong on 5/27/2017.
 */
public class ListAdapter extends ArrayAdapter<SinhVien> {

    public ListAdapter(Context context, int resource, List<SinhVien> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view =  inflater.inflate(R.layout.activity_dong_sinh_vien, null);
        }
        SinhVien p = getItem(position);
        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txt = (TextView) view.findViewById(R.id.txtHoTen);
            txt.setText(p.hoten);
            TextView txt1 = (TextView) view.findViewById(R.id.txtNamSinh);
            txt1.setText(String.valueOf(p.namsinh));


        }
        return view;
    }

}