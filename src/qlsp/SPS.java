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
public class SPS extends SanPham{
    private int dungLuong;
    private static final int HE_SO= 1000;

    public SPS() {
    }

    public SPS(int dungLuong, int maSp, String tenSp) {
        super(maSp, tenSp);
        this.dungLuong = dungLuong;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap dung luong: ");
        this.dungLuong= new Scanner(System.in).nextInt();
        
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Dung luong san pham: "+ this.dungLuong);
        
    }

    @Override
    public float giaBan() {
        return this.dungLuong*HE_SO;
    }
    
    
    
    
    
    
    
}
