
import java.util.Scanner; 
import java.io.*; 

public class SinhVien 
{ 
   
    private String maSV; 
    private String gioiTinh; 
    private String hoTen; 
   

   
    public String getMaSV() 
    { 
        return maSV; 
    } 

    public void setMaSV(String maSV) 
    { 
        this.maSV = maSV; 
    } 

    public String getHoTen() 
    { 
        return hoTen; 
    } 

    public void setHoTen(String hoTen) 
    { 
        this.hoTen = hoTen; 
    } 

    public String getGioiTinh() 
    { 
        return gioiTinh; 
    } 

    public void setGioiTinh(String gioiTinh) 
    { 
        this.gioiTinh = gioiTinh; 
    } 

    

    public SinhVien(String maSV, String hoTen, String gioiTinh) 
    { 
        this.maSV = maSV; 
        this.hoTen = hoTen; 
        this.gioiTinh = gioiTinh; 
     } 
public String toString() 
    { 
        return "MSSV: "+this.maSV+"\nHoTen: "+this.hoTen+"\nGioi tinh:"+this.gioitinh; 
    } 

    
   
} 
