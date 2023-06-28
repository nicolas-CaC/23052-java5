package clase5.polimorfismo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import usuarios.Administrador;
import usuarios.Regular;
import usuarios.Usuario;

public class Clase5Polimorfismo {

    public static void main(String[] args) {

        // LinkedHashSet
        
        LinkedHashSet set1 = new LinkedHashSet();
        
        set1.add("Hola");
        set1.add(1);
        set1.add(2.35);
        set1.add(true);
        set1.add("Hola");
        set1.add(2.35);
        
        System.out.println(set1);
        
        for(Object item: set1)
            System.out.println("For: " + item);
        
        System.out.println(set1 + " " + set1.size());
        set1.remove(2.35);
        System.out.println(set1);
        
        System.out.println(set1.contains(1));
        
        // TreeSet
        
        TreeSet<Integer> set2 = new TreeSet();
        
        set2.add(5);
        set2.add(1);
        set2.add(2);
        set2.add(7);
        set2.add(2);
        set2.add(0);
        
        for (Object item: set2)
            System.out.println("For (TreeSet): " + item);
        
        System.out.println(set2.size());
        set2.remove(5);
        System.out.println(set2);
        System.out.println(set2.contains(1));
        
        TreeSet<Integer> set2B = new TreeSet<>(Collections.reverseOrder());
        set2B.addAll(set2);
        System.out.println("set2B: " + set2B);
        
        
        
        // Polimorfismo
        
        Administrador user1 = new Administrador("Juan", 25, 123123123);
        System.out.println(user1.getData());
        System.out.println(user1.isAdmin());
        
        Regular user2 = new Regular("Pedro", 20, 456456456);
        System.out.println(user2.getData());
        System.out.println(user2.isUser());
        
        Usuario user3 = new Regular("Sara", 22, 789789789);
        System.out.println(user3.getData());
        
        Usuario user4 = new Administrador("Norma", 28, 123321);
        System.out.println(user4.getData());
        
        ArrayList<Usuario> users = new ArrayList(Arrays.asList(user1, user2, user3, user4));
        
        for(Usuario user: users)
            System.out.println("User: " + user.getData());
        
            
        
        
        
        // CASTING Implicito
        
        byte a = 1;
        short b = 1;
        int c = a;
        c = b;
        
        System.out.println(c);
        
        long d = c;
        System.out.println(d);
        
        int nro1 = 123456;
        long nro2 = 1234567890123456789L;
        
        byte cast1 = (byte)nro1;
        System.out.println(cast1);
        
        short cast2 = (short) nro1;
        System.out.println(cast2);
        
        int cast3 = (int) nro2;
        System.out.println(cast3);
        
        
        // String
        
        char x = 'a';
        char y = 'b';
        
        String z = String.valueOf(x);
        System.out.println(z);
        
        String string = String.valueOf(nro2);
        System.out.println(string + " " + string.getClass().getSimpleName());
        
        // Char
        
        char[] chars = string.toCharArray();
        System.out.println("Char[]: " + chars[0]);
        
        // Float
        
        float float1 = Float.parseFloat(string);
        System.out.println(float1);
        
        int int1 = Integer.parseInt("123456");
        System.out.println(int1);
        
        
        Condicionales.runCondicionales();
    }

}
