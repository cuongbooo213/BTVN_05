/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

public class Book extends ThuVien{
    public int soTrang;

    public Book(String MaTaiLieu, String tenTL, String NXB, int soTrang) {
        super(MaTaiLieu, tenTL, NXB);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public String toString() {
        return "Book{" + "MaTaiLieu = " + MaTaiLieu + ", tenTL = " + tenTL + ", NXB = " + NXB + ", soTrang = " + soTrang + '}';
    }    
}
