package org.example;

import java.util.*;

public class Problem3 {

    /*
    Given the root to a binary tree, implement serialize(root), which serializes the tree into a string,
    and deserialize(s), which deserializes the string back into the tree.
     */

    String v2() {
        String s = "car";
        String substring = s.substring(0, 1);
        String substringEnd = s.substring(1);
        return substring.toUpperCase() + substringEnd;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String noSp = s.replaceAll(" +", " ");
        String rep = noSp.replaceAll(" ?('|,|!|\\?|\\.|_|@) ?", " ");
        String be = rep.replaceAll("^ | $", "");
        String[] strings = be.split(" ");

        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
        scan.close();
    }
}
