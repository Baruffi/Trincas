/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trincas;

import java.io.*;

/**
 *
 * @author Raphael
 */
public class TableController {
    
    Table table;
    
    TableController() {
        this.table = new Table();
    }
    
    void readFile(String fileName) {
        
        String line = null;
        
        try {
            
            FileReader fileReader = new FileReader(fileName);

            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((line = bufferedReader.readLine()) != null) {
                    
                    TableEntry tableEntry = new TableEntry(line);
                    
                    table.addEntry(tableEntry);
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
        
        //this will be different in the main program
        table.printEntries();
    };
}
