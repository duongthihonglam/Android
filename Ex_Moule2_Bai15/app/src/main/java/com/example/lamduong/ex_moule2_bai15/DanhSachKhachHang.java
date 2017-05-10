package com.example.lamduong.ex_moule2_bai15;

import java.util.ArrayList;

/**
 * Created by lamduong on 5/10/2017.
 */

public class DanhSachKhachHang {
    ArrayList<KhachHang> listKH=new ArrayList<KhachHang>();

    public void addKhachHang(KhachHang kh)

    {

        listKH.add(kh);

    }

    public double tongDoanhThu()

    {

        double tien=0.0;

        for(KhachHang kh:listKH)

        {

            tien+=kh.tinhThanhTien();

        }

        return tien;

    }

    public int tongKhachHang()

    {

        return listKH.size();

    }

    public int tongKhachHangVip()

    {

        int s=0;

        for(KhachHang kh:listKH)

        {

            if(kh.isVip())

                s++;

        }

        return s;

    }

}


