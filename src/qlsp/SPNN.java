/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

import java.util.Scanner;

/**
 *
 * @author Thuan_Thuan
 */
public class SPNN extends SanPham{
    private int hanSuDung;
    private int giaHienTai;
    private static final int HE_SO = 500;

    public SPNN() {
    }

    public SPNN(int hanSuDung, int giaHienTai, int maSp, String tenSp) {
        super(maSp, tenSp);
        this.hanSuDung = hanSuDung;
        this.giaHienTai = giaHienTai;
    }

    public int getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(int hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public int getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(int giaHienTai) {
        this.giaHienTai = giaHienTai;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap han su dung: ");
        this.hanSuDung= new Scanner(System.in).nextInt();
        System.out.println("Nhap gia hien tai: ");
        this.giaHienTai= new Scanner(System.in).nextInt();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Han su dung: "+ this.hanSuDung);
        System.out.println("Gia hien tai: "+ this.giaHienTai);
        
        
    }

    @Override
    public float giaBan() {
        return this.giaHienTai + this.hanSuDung*HE_SO;
    }
    
    
    
    
    
    
    
}
