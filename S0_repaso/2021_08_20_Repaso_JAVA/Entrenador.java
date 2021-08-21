public class Entrenador extends Seleccion{
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion){
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
        
    }

    public void dirigirPartido(){
        System.out.println(this.idFederacion);
    }

    public void dirigirEntrenamiento(){
        
    }
}