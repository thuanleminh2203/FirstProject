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
public class QL {
    
    private static final int SPS=1;
    private static final int SPCN=2;
    private static final int SPNN=3;
    public ISanPham taoSanPham(){
        int loai;
        loai = chonSanPham();
        switch(loai){
            case 1: 
                return new SPS();
            case 2:
                return new SPCN();
            case 3:
                return new SPNN();
            default:
                return null;
                
        }
    }
    
    public int chonSanPham(){
        int chon;
        System.out.println("1. san pham so");
        System.out.println("2. san pham cong nghiep");
        System.out.println("3. san pham nong nhiep");
        System.out.println("nhap lua chon!");
        chon = new Scanner(System.in).nextInt();
        if(chon>3 || chon<1){
            System.out.println("nhap sai! xin moi nhap lai ");
            return chonSanPham();
        }
        return chon;
    }
    
    public ISanPham[] taoDanhSachSP(){
        ISanPham[] danhSach = null;
        System.out.println("So phan tu can nhap la: ");
        int soPhanTu;
        soPhanTu = new Scanner(System.in).nextInt();
        if(soPhanTu <0){
            System.out.println("nhap sai! xin moi nhap lai ");
            return taoDanhSachSP();
        }
        danhSach = new ISanPham[soPhanTu];
        return danhSach;
    }
    
    public void nhap(ISanPham[] danhSach){
        System.out.println("nhap thong tin san pham ");
        if(danhSach != null){
            for (int i= 0;i< danhSach.length;i++){
                danhSach[i].input();
            }
        }
    }
    
    public void hien(ISanPham[] danhSach){
        System.out.println("thong tin san pham: ");
        if(danhSach != null){
            for(int i = 0;i<danhSach.length; i++){
                danhSach[i].display();
            }
        }
    }
    
    public ISanPham timSanPhamMax(ISanPham[] danhSach){
        ISanPham max = null;
        if(danhSach != null){
            for(int i= 0;i<danhSach.length;i++){
                if(danhSach[i]== null) continue;
                if(max == null||max.giaBan()< danhSach[i].giaBan())
                    max = danhSach[i];
            }
        }
        return max;
    }
}
