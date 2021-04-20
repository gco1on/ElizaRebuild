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
public class DecompList extends Vector{
    /**
     *  Add another decomp rule to the list.
     */
    public void add(String word, boolean mem, ReasembList reasmb) {
        addElement(new Decomp(word, mem, reasmb));
    }

    /**
     *  Print the whole decomp list.
     */
    public void print(int indent) {
        for (int i = 0; i < size(); i++) {
            Decomp d = (Decomp)elementAt(i);
            d.print(indent);
        }
    }
}
