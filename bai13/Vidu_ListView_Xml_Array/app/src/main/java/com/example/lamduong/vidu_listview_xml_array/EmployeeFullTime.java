package com.example.lamduong.vidu_listview_xml_array;

/**
 * Created by lamduong on 5/25/2017.
 */

public class EmployeeFullTime extends Employee {
    public  double TinhLuong(){
        return 500;
    }

    public  String toString(){
        return  super.toString()+" --> FullTime="+ TinhLuong();
    }
}
