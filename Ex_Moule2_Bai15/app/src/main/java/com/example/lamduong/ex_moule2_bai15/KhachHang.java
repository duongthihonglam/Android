package com.example.lamduong.ex_moule2_bai15;

/**
 * Created by lamduong on 5/10/2017.
 */

public class KhachHang {
    private String tenKh;

    private int slmua;

    private boolean isVip;

    public static final int GIA=20000;

    public KhachHang()

    {

    }
    public KhachHang(String tenKh,int slmua,boolean isVip)

    {

        this.tenKh=tenKh;

        this.slmua=slmua;

        this.isVip=isVip;

    }

    public String getTenKh() {

        return tenKh;

    }

    public void setTenKh(String tenKh) {

        this.tenKh = tenKh;

    }

    public int getSlmua() {

        return slmua;

    }

    public void setSlmua(int slmua) {

        this.slmua = slmua;

    }

    public boolean isVip() {

        return isVip;

    }

    public void setVip(boolean isVip) {

        this.isVip = isVip;

    }

    public double tinhThanhTien()

    {

        return (!isVip?slmua*GIA:slmua*GIA*0.9);

    }

}



