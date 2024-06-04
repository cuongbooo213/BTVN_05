/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;


public class Teacher extends DoiTuong{
    private String monDay;
    private String trinhDO;

    public Teacher(String MaDoiTuuong, String TenDoiTuong, String GioiTinh, String yob, String monDay, String trinhDO) {
        super(MaDoiTuuong, TenDoiTuong, GioiTinh, yob);
        this.monDay = monDay;
        this.trinhDO = trinhDO;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getTrinhDO() {
        return trinhDO;
    }

    public void setTrinhDO(String trinhDO) {
        this.trinhDO = trinhDO;
    }
    public String toString() {
        return "Teacher{" + "MaDoiTuuong = " + MaDoiTuuong + ", TenDoiTuong = " + TenDoiTuong + ", GioiTinh = " + GioiTinh + ", yob = " + yob 
                + ", monDay = " + monDay + ", trinhDo = " + trinhDO + '}';
    }    
}
