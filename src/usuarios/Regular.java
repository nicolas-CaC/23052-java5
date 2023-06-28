package usuarios;

import java.util.ArrayList;
import java.util.Arrays;

public class Regular extends Usuario {

    private final boolean USER = true;

    public Regular(String nombre, int edad, int dni) {
        super(nombre, (byte)edad, dni);
    }
    
    
    
    @Override
    public ArrayList getData() {
        ArrayList datos = new ArrayList(Arrays.asList(nombre, edad, dni, USER));
        return datos;
    }

    public String isUser(){
        return "Es un usuario regular";
    }
}
