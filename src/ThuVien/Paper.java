/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;


public class Paper extends ThuVien{
    public int taiBan;

    public Paper(String MaTaiLieu, String tenTL, String NXB, int taiBan) {
        super(MaTaiLieu, tenTL, NXB);
        this.taiBan = taiBan;
    }

    public int getTaiBan() {
        return taiBan;
    }

    public void setTaiBan(int taiBan) {
        this.taiBan = taiBan;
    }
    public String toString() {
        return "Paper{" + "MaTaiLieu = " + MaTaiLieu + ", tenTL = " + tenTL + ", NXB = " + NXB + ", taiBan = " + taiBan + '}';
    }       
    
}
