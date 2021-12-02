package com.mirzayogy.pbo2.d;

import com.mirzayogy.pbo2.d.frame.Login;
import com.mirzayogy.pbo2.d.frame.MainPublic;
import com.mirzayogy.pbo2.d.frame.admin.JenisBarangViewFrame;
import com.mirzayogy.pbo2.d.frame.admin.MainAdmin;
import com.mirzayogy.pbo2.d.frame.kasir.MainKasir;
import com.mirzayogy.pbo2.d.libs.Pref;
import com.mirzayogy.pbo2.d.model.JenisBarang;
import com.mirzayogy.pbo2.d.model.Pengguna;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Pref pref = new Pref();
        
        String username = pref.getUsername();
        
        if(username.equals("")){
            Login login = new Login();
            login.setVisible(true);
        } else {
            if (pref.isAdmin()){
                MainAdmin mainAdmin = new MainAdmin();
                mainAdmin.setVisible(true);
            } else {
                MainKasir mainKasir = new MainKasir();
                mainKasir.setVisible(true);
            }
            
        }
                
        
        
    }
}
