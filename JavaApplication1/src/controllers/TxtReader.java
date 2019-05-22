/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.io.*;
import model.Txt;

/**
 *
 * @author rapha
 */
public class TxtReader {
        
    private static Txt txt = new Txt();
    
    public static void readFile(File file) {
        
        String line = null;
        
        try {
            
            FileReader fileReader = new FileReader(file);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    txt.addTexto(line);
                }
            }
        }
        
        catch(FileNotFoundException e) {
            //use a logger
            e.printStackTrace();
        }
        
        catch(IOException | NullPointerException e) {
            //use a logger
            e.printStackTrace();
        }
    };   
}
