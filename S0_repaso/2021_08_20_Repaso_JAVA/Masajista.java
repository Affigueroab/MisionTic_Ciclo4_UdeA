public class Masajista extends Seleccion{
    private String universidad;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String universidad, int aniosExperiencia){
        super(id, nombre, apellidos, edad);
        this.universidad = universidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void hacerMasaje(){
        System.out.println(this.universidad + " " + this.aniosExperiencia);

    }

    public void terapiaRecuperacion(){

    }
}