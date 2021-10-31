package com.mirzayogy.pbo2.d.model;

import com.mirzayogy.pbo2.d.db.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JenisBarang {
    private int id;
    private String namaJenisBarang;
    
    public Database database;
    public Connection connection;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaJenisBarang() {
        return namaJenisBarang;
    }

    public void setNamaJenisBarang(String namaJenisBarang) {
        this.namaJenisBarang = namaJenisBarang;
    }
    
    
    public boolean create(){
        String insertSQL = "INSERT INTO jenisbarang VALUES (NULL,?)";
        
        this.database = new Database();
        this.connection = this.database.getConnection();
        
        try {
            PreparedStatement ps = this.connection.prepareStatement(insertSQL);
            ps.setString(1, this.getNamaJenisBarang());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Error SQL");
        }
        
        return false;
    }
    
    public boolean update(){
        return false;
    }
    
    public boolean delete(){
        return false;
    }
    
    public ArrayList<JenisBarang> read(){
        String selectSQL = "SELECT * FROM jenisbarang";
        ArrayList<JenisBarang> list = new ArrayList<>();
        
        this.database = new Database();
        this.connection = this.database.getConnection();
        
        try {
            PreparedStatement ps = this.connection.prepareStatement(selectSQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                JenisBarang jb = new JenisBarang();
                jb.setId(rs.getInt(1));
                jb.setNamaJenisBarang(rs.getString(2));
                
                list.add(jb);
            }
            return list;
        } catch (SQLException ex) {
            System.out.println("Error SQL");
        }
        
        
        return null;
    }

}
