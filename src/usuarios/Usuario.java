package usuarios;

import java.util.ArrayList;

public abstract class Usuario {
    
    protected String nombre;
    protected byte edad;
    protected int dni;

    public Usuario(String nombre, byte edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    abstract public ArrayList getData();
}
