/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteka;

import java.util.ArrayList;
/**
 *
 * @author karol
 */
public class Biblioteka {

    private static ArrayList<Zasob> _zasoby = new ArrayList<Zasob>();
    public static void main(String[] args) {
        
        initZasoby();
        for (Zasob zasob : _zasoby) {
            System.out.println(zasob.getAutor());
        }
    }
    private static void initZasoby(){
        for (int i = 0; i < 5; i++) {
            Zasob z = Zasob.UttworzZasob(
                    false,
                    "test",
                    30,
                    "ja",
                    2020
            );
            _zasoby.add(z);
        }
    }
    
}
