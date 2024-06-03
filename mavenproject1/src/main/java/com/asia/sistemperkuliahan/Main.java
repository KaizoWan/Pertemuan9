/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.sistemperkuliahan;

import com.mycompany.mavenproject1.sistemperkuliahan.ui.TextUI;
import java.util.Scanner;

/**
 *
 * @author A-2
 */
public class Main {
    // private static DataManager dataManager;
        private static Scanner scanner = new Scanner(System.in);
        
        public static void main(String[] args) {
        // Create DataManager instance (specify array sizes)
        //dataManager = new DataManager(100, 50, 20, 200);
        SistemPerkuliahan sistemPerkuliahan = new SistemPerkuliahan();
        TextUI ui = new TextUI();
        ui.run();
    }
}