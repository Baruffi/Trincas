/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trincas;

import java.util.*;

/**
 *
 * @author Raphael
 */
public class Table {
    
    List<TableEntry> entries;
    
    Table() {
        this.entries = new ArrayList<>();
    }
    
    void addEntry(TableEntry e) {
        this.entries.add(e);
    }
    
    void printEntries() {
        
        for (TableEntry e : entries) {
            System.out.println(e.N + " " + e.L1 + " " + e.L2);
        }
    }
}
