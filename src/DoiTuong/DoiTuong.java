/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;

public class DoiTuong {
    protected String MaDoiTuuong;
    protected String TenDoiTuong;
    protected String GioiTinh;
    protected String yob;

    public DoiTuong(String MaDoiTuuong, String TenDoiTuong, String GioiTinh, String yob) {
        this.MaDoiTuuong = MaDoiTuuong;
        this.TenDoiTuong = TenDoiTuong;
        this.GioiTinh = GioiTinh;
        this.yob = yob;
    }

    public String getMaDoiTuuong() {
        return MaDoiTuuong;
    }

    public void setMaDoiTuuong(String MaDoiTuuong) {
        this.MaDoiTuuong = MaDoiTuuong;
    }

    public String getTenDoiTuong() {
        return TenDoiTuong;
    }

    public void setTenDoiTuong(String TenDoiTuong) {
        this.TenDoiTuong = TenDoiTuong;
    }

    public String isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "DoiTuong{" + "MaDoiTuuong=" + MaDoiTuuong + ", TenDoiTuong=" + TenDoiTuong + ", GioiTinh=" + GioiTinh + ", yob=" + yob + '}';
    }
    
    
            
            
}
