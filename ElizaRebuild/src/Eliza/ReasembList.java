/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eliza;
import java.util.Vector;

/**
 *
 * @author gcolon
 */
public class ReasembList extends Vector {

    /**
     *  Add an element to the reassembly list.
     */
    public void add(String reasmb) {
        addElement(reasmb);
    }

    /**
     *  Print the reassembly list.
     */
    public void print(int indent) {
        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < indent; j++) System.out.print(" ");
            String s = (String)elementAt(i);
            System.out.println("reasemb: " + s);
        }
    }
}
