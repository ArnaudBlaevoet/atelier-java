/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * couCOU
 *
 * @author Administrateur
 */
public class VariablesTest {

    @Test

    public void testVariablesObjets() {

        String txt1 = new String("COUcou");

        String txt2 = txt1.toUpperCase();

        System.out.println(txt2);

    }

    @Test
    public void test() {
        String a = "Jamaique";

        String b = "Kingston";

        String c = b.toUpperCase() + ", " + a.toUpperCase();

        System.out.println(c);
    }

    @Test
    public void test3() {

        Integer a = 10;

        String b = "20";

        int b1 = Integer.parseInt(b);

        System.out.println(a + b1);
    }

    public int carre(int nb) {

        return (nb * nb);
    }

    @Test
    public void test4() {

        System.out.println(carre(8));
    }

    public int puissance(int nb, int p) {
//         int res = 1;
//         
//         System.out.println(puissance);
        return 0;
    }
}
