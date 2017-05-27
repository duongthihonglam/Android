package com.example.lamduong.vidu_custumorlayout_listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lamduong on 5/25/2017.
 */

public class MyArrayAdapter extends ArrayAdapter<Employee> {

    Activity  context = null;
    ArrayList<Employee> myArray=null;
    int layoutId;
    public MyArrayAdapter(Activity context,int layoutId,ArrayList<Employee>arr) {
        super(context, layoutId, arr);
        this.context = context;
        this.layoutId = layoutId;
        this.myArray = arr;
        }
    public View getView(int position, View convertView,ViewGroup parent){
        LayoutInflater inflater=
                context.getLayoutInflater();
        convertView=inflater.inflate(layoutId, null);
        if(myArray.size()>0 && position>=0)
        {

            final TextView txtdisplay=(TextView)
                    convertView.findViewById(R.id.txtitem);

            final Employee emp=myArray.get(position);

            txtdisplay.setText(emp.toString());
            //lấy ImageView ra để thiết lập hình ảnh cho đúng
            final ImageView imgitem=(ImageView)
                    convertView.findViewById(R.id.imgitem);
            //nếu là Nữ thì lấy hình con gái
            if(emp.isGender())
                imgitem.setImageResource(R.drawable.wonamicon);
            else//nếu là Nam thì lấy hình con trai
                imgitem.setImageResource(R.drawable.boyicon );
        }
        //Vì View là Object là dạng tham chiếu đối tượng, nên
        //mọi sự thay đổi của các object bên trong convertView
        //thì nó cũng biết sự thay đổi đó
        return convertView;//trả về View này, tức là trả luôn
        //về các thông số mới mà ta vừa thay đổi
    }


}


