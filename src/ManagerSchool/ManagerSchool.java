/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerSchool;

import DoiTuong.Student;
import DoiTuong.Teacher;
import ThuVien.Book;
import ThuVien.Paper;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerSchool {
    private static final ArrayList<Student> listStudent = new ArrayList<>();
    private static final ArrayList<Teacher> listTeacher = new ArrayList<>();
    private static final ArrayList<Book> listBook = new ArrayList<>();
    private static final ArrayList<Paper> listPaper = new ArrayList<>();
    public static void main(String[] args) {
        Student std1 = new Student("HE186832","Truong Tran Cuong", "Nam", "2004", "SE1905", "SE");
        Teacher teacher1 = new Teacher("NamNV", "Nguyen Van Nam", "Nam", "1972", "MAD", "Tien Si");
        Book book1 = new Book("S123421", "Su Lua Chon", "Dan Tri", 424);
        Paper bao1 = new Paper("B124433", "Bao Con", "Kim Dong", 12);
        listStudent.add(std1);
        listTeacher.add(teacher1);
        listBook.add(book1);
        listPaper.add(bao1);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhap so hoc sinh muon them: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    Student[] myStd = new Student[n];
                    inputStudent(myStd, n);
                    for (int i = 0; i < n; i++) {
                        listStudent.add(myStd[i]);
                    }
                    break;
                case 2:
                    Scanner sn = new Scanner(System.in);
                    System.out.println("Nhap so hoc sinh muon them: ");
                    int m = sn.nextInt();
                    sn.nextLine();
                    Teacher[] myTch = new Teacher[m];
                    inputTeacher(myTch, m);
                    for (int i = 0; i < m; i++) {
                        listTeacher.add(myTch[i]);
                    }
                    break;
                case 3:
                    Scanner sk = new Scanner(System.in);
                    System.out.println("Nhap so hoc sinh muon them: ");
                    int k = sk.nextInt();
                    sk.nextLine();
                    Book[] myBook = new Book[k];
                    inputBook(myBook, k);
                    for (int i = 0; i < k; i++) {
                        listBook.add(myBook[i]);
                    }
                    break;
                case 4:
                    Scanner sh = new Scanner(System.in);
                    System.out.println("Nhap so hoc sinh muon them: ");
                    int h = sh.nextInt();
                    sh.nextLine();
                    Paper[] myPaper = new Paper[h];
                    inputPaper(myPaper, h);
                    for (int i = 0; i < h; i++) {
                        listPaper.add(myPaper[i]);
                    }
                    break;
                case 5:
                    outputStdAndTch();
                    break;
                case 6:
                    outputBookAndPaper();
                case 7:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 7);
        
        
    }
    public static void menu(){
        System.out.println("==============MENU===============");
        System.out.println("1. Them hoc sinh.");
        System.out.println("2. Them giao vien.");
        System.out.println("3. Them sach.");
        System.out.println("4. Them bao.");
        System.out.println("5. In ra giao vien va hoc sinh");
        System.out.println("6. In ra sach va bao.");
        System.out.println("7. Thoat.");
    }
    
    public static void inputStudent(Student[] myStd,int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sinh vien: ");
            String MaDoiTuong = sc.nextLine();
            System.out.print("Nhap ten: ");
            String TenDoiTuong = sc.nextLine();
            System.out.print("Gioi Tinh: ");
            String GioiTinh = sc.nextLine();
            System.out.print("Nam Sinh: ");
            String yob = sc.nextLine();
            System.out.print("Lop: ");
            String Lop= sc.nextLine();
            System.out.print("Ban: ");
            String Ban = sc.nextLine();
            myStd[i] = new Student(MaDoiTuong, TenDoiTuong, GioiTinh, yob, Lop, Ban);
        }
    }
    
    public static void inputTeacher(Teacher[] myTch,int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sinh vien: ");
            String MaDoiTuong = sc.nextLine();
            System.out.print("Nhap ten: ");
            String TenDoiTuong = sc.nextLine();
            System.out.print("Gioi Tinh: ");
            String GioiTinh = sc.nextLine();
            System.out.print("Nam Sinh: ");
            String yob = sc.nextLine();
            System.out.print("Mon Day: ");
            String monDay= sc.nextLine();
            System.out.print("Trinh Do: ");
            String trinhDO = sc.nextLine();
            myTch[i] = new Teacher(MaDoiTuong, TenDoiTuong, GioiTinh, yob, monDay,trinhDO);
        }
    }
    
    public static void inputBook(Book[] myBook, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma tai lieu: ");
            String MaTaiLieu = sc.nextLine();
            System.out.print("Nhap ten sach: ");
            String tenTL = sc.nextLine();
            System.out.print("Nha xuat ban: ");
            String NXB = sc.nextLine();
            System.out.print("So trang: ");
            int m = sc.nextInt();
            sc.nextLine();
            myBook[i] = new Book(MaTaiLieu, tenTL, NXB, m);
        }
    }
    public static void inputPaper(Paper[] myPaper, int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma tai lieu: ");
            String MaTaiLieu = sc.nextLine();
            System.out.print("Nhap ten sach: ");
            String tenTL = sc.nextLine();
            System.out.print("Nha xuat ban: ");
            String NXB = sc.nextLine();
            System.out.print("So lan xuat ban: ");
            int m = sc.nextInt();
            sc.nextLine();
            myPaper[i] = new Paper(MaTaiLieu, tenTL, NXB, m);
        }
    }
    public static void outputStdAndTch(){
        for (int i = 0; i <listTeacher.size() ; i++) {
            System.out.println(listTeacher.get(i).toString());
        }
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i).toString());
        }
    } 
    public static void outputBookAndPaper(){
        for (int i = 0; i < listBook.size(); i++) {
            System.out.println(listBook.get(i).toString());
        }
        for (int i = 0; i < listPaper.size(); i++) {
            System.out.println(listPaper.get(i).toString());
        }
    }
    
}
