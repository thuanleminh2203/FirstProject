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
public class SPCN extends SanPham{
    private int thoiGianBaoHanh;
    private int giaXuatXuong;
    private static final int HE_SO= 1000;

    public SPCN() {
    }

    public SPCN(int thoiGianBaoHanh, int giaXuatXuong, int maSp, String tenSp) {
        super(maSp, tenSp);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.giaXuatXuong = giaXuatXuong;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getGiaXuatXuong() {
        return giaXuatXuong;
    }

    public void setGiaXuatXuong(int giaXuatXuong) {
        this.giaXuatXuong = giaXuatXuong;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh= new Scanner(System.in).nextInt();
        System.out.println("Nhap gia xuat xuong: ");
        this.giaXuatXuong = new Scanner(System.in).nextInt();
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Thoi gian bao hanh: "+ this.thoiGianBaoHanh);
        System.out.println("Gia xuat xuong: "+ this.giaXuatXuong);
    }

    @Override
    public float giaBan() {
        return giaXuatXuong + this.thoiGianBaoHanh*HE_SO;
    }
    
    
    
    
}
