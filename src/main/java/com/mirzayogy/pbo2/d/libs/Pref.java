package com.mirzayogy.pbo2.d.libs;

import java.util.prefs.Preferences;

public class Pref {
    
    public void reset(){
        Preferences pref = Preferences.userNodeForPackage(Pref.class);
        pref.put("username", "");
        pref.putInt("id", 0);
        pref.putBoolean("isAdmin", false);
    }
    
    public void save(String username, int id, boolean isAdmin){
        Preferences pref = Preferences.userNodeForPackage(Pref.class);
        pref.put("username", username);
        pref.putInt("id", id);
        pref.putBoolean("isAdmin", isAdmin);
    }
    
    public String getUsername(){
        Preferences pref = Preferences.userNodeForPackage(Pref.class);
        return pref.get("username", "");
    }
    
    public boolean isAdmin(){
        Preferences pref = Preferences.userNodeForPackage(Pref.class);
        return pref.getBoolean("isAdmin", false);
    }
}
