package com.mirzayogy.pbo2.d;

import com.mirzayogy.pbo2.d.frame.Login;
import com.mirzayogy.pbo2.d.frame.MainPublic;
import com.mirzayogy.pbo2.d.frame.admin.JenisBarangViewFrame;
import com.mirzayogy.pbo2.d.model.JenisBarang;
import com.mirzayogy.pbo2.d.model.Pengguna;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Login login = new Login();
//        login.setVisible(true);

        JenisBarang jenisBarang = new JenisBarang();
        
//        ArrayList<JenisBarang> list = jenisBarang.read();
//        
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getNamaJenisBarang());
//        }

//        jenisBarang.setNamaJenisBarang("Tes dari Main yang ketiga");
//        if(jenisBarang.create()){
//            System.out.println("Simpan berhasil");    
//        } else {
//            System.out.println("Simpan gagal");
//        }

        JenisBarangViewFrame jenisBarangViewFrame = new JenisBarangViewFrame();
        jenisBarangViewFrame.setVisible(true);
    }
}
