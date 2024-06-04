/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;

public class Student extends DoiTuong{
    private String Lop;
    private String Ban;

    public Student(String MaDoiTuuong, String TenDoiTuong, String GioiTinh, String yob, String Lop, String Ban) {
        super(MaDoiTuuong, TenDoiTuong, GioiTinh, yob);
        this.Lop = Lop;
        this.Ban = Ban;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getBan() {
        return Ban;
    }

    public void setBan(String Ban) {
        this.Ban = Ban;
    }    
    @Override
    public String toString() {
        return "Student{" + "MaDoiTuuong = " + MaDoiTuuong + ", TenDoiTuong = " + TenDoiTuong + ", GioiTinh = " + GioiTinh + ", yob = " + yob 
                + ", Lop = " + Lop + ", Ban = " + Ban + '}';
    }         

//   @Override
//    public String toString() {
//        return "Student{" + "Lop=" + Lop + ", Ban=" + Ban + '}';
//    }
//    
}
