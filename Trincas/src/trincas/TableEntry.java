/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trincas;

import static java.lang.Float.parseFloat;

/**
 *
 * @author Raphael
 */
public class TableEntry {

    float N, L1, L2;
    
    TableEntry(String line) {
        
        String[] split = line.split(" ");
        
        this.N = parseFloat(split[0]);
        this.L1 = parseFloat(split[1]);
        this.L2 = parseFloat(split[2]);
    }
    
}
