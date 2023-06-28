package usuarios;

import java.util.ArrayList;
import java.util.Arrays;

public class Administrador extends Usuario {

    private final boolean ADMIN = true;

    public Administrador(String nombre, int edad, int dni) {
        super(nombre, (byte)edad, dni);
    }
     
    @Override
    public ArrayList getData() {
        ArrayList datos = new ArrayList(Arrays.asList(nombre, edad, dni, ADMIN));
        return datos;
    }
    
    public String isAdmin(){
        return "Es Administrador";
    }

}
