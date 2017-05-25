package com.example.lamduong.vidu_listview_xml_array;

/**
 * Created by lamduong on 5/25/2017.
 */

public abstract class Employee {
    private  String id;
    private String name;

    public String getId(){
        return  id;
    }

    public  void setId(String id){
        this.id=id;
    }


    public  String getName(){
        return  name;

    }
    public  void setName(String name){
        this.name =name;
    }
    public abstract  double TinhLuong();

    public  String toString(){
        return  this.id+" - "+ this.name;
    }
}
