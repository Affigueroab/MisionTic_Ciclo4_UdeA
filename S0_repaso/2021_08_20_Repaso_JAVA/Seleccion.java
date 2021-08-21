public class Seleccion {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int edad;

    public Seleccion(int id, String nombre, String apellidos, int edad)
    {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.edad = edad;
    }

    public void concentrarse(){
        System.out.println(this.Nombre + " " + this.Apellidos + " está en concentración");

    }
    
}