package clase5.polimorfismo;

public class Condicionales {

    static public void runCondicionales(){
        
        int a = 1;
        int b = 2;
        System.out.println((a == b)? "Los valores son iguales" : "Los valores NO son iguales");

        String x = "numero x";
        String y = "numero y";
        System.out.println(x.equals(y) ? "Los valores son iguales" : "Los valores NO son iguales");
        
        char m = 'a';
        char n = 'b';
        System.out.println((m == n)? "Los valores son iguales" : "Los valores NO son iguales");
        
        System.out.println(x instanceof String);
        System.out.println(x.getClass().getSimpleName().equals("String"));
        
    }
    
}
