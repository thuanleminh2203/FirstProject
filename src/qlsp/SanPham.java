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
public abstract class SanPham implements ISanPham{
    private int maSp;
    private String tenSp;

    public SanPham() {
    }

    public SanPham(int maSp, String tenSp) {
        this.maSp = maSp;
        this.tenSp = tenSp;
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    @Override
    public void input() {
        System.out.println("Nhap ma san pham: ");
        this.maSp= new Scanner(System.in).nextInt();
        System.out.println("Nhap ten san pham: ");
        this.tenSp = new Scanner (System.in).nextLine();
        
    }

    @Override
    public void display() {
        System.out.println("Ma san pham: "+ this.maSp);
        System.out.println("Ten san pham: "+ this.tenSp);
    }

    
    @Override
    public abstract float giaBan();
    
    // à rồi rồi. hiểu rồi
    // chưa có. 
    // thì ra imterface phải truy cập vô mấy cái hn có sặn à
    // ko truy cập vô đc mấy cái hàm hn ko à
    
    
    
    
    
}
