/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eliza;

/**
 *
 * @author gcolon
 
 *  Eliza pre-post entry (two words).
 *  This is used to store pre transforms or post transforms.
 */
public class PrePost {
     /** The words */
    String src;
    String dest;

    /**
     *  Initialize the pre-post entry.
     */
    PrePost(String src, String dest) {
        this.src = src;
        this.dest = dest;
    }

    /**
     *  Print the pre-post entry.
     */
    public void print(int indent) {
        for (int i = 0; i < indent; i++) System.out.print(" ");
        System.out.println("pre-post: " + src + "  " + dest);
    }

    /**
     *  Get src.
     */
    public String src() {
        return src;
    }

    /**
     *  Get dest.
     */
    public String dest() {
        return dest;
    }
}
