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
public class Menu {

    public int menu() {
        System.out.println("1. nhap thong tin san pham");
        System.out.println("2. hien thong tin");
        System.out.println("3. tim san pham gia ban lon nhat ");
        System.out.println("4. thoat");
        int chon;
        System.out.println("lua chon cua ban la: ");
        chon = new Scanner(System.in).nextInt();
        if (chon < 1 || chon > 4) {
            System.out.println("nhap sai! xin moi nhap lai");
            return menu();
        }
        return chon;
    }

    public void chay() {
        int chon;
        QL ql = new QL();
        ISanPham[] danhSach = null;
        while (true) {            
            chon = menu();
        switch (chon) {
            case 1:
                danhSach = ql.taoDanhSachSP();
                if (danhSach != null) {
                    for (int i = 0; i < danhSach.length; i++) {
                        danhSach[i] = ql.taoSanPham();

                    }
                }
                ql.nhap(danhSach);
                break;
            case 2:
                ql.hien(danhSach);
                break;
            case 3:
                ISanPham sp =  ql.timSanPhamMax(danhSach);
                System.out.println( sp.giaBan());
            case 4:
                System.exit(0);
        }
        }
    }

}
