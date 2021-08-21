
class Persona{

    String nombre = "";
    String apellido = "";
    int edad = 0;
    String profesion = "";

    // Este es el constructor de la clase, es decir, el que inicializa los valores de la clase
    public Persona(String nombre, String apellido, int edad, String profesion)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.profesion = profesion;
    }

    // Setter, es decir, le asigna un valor al parametro especifico.
    // Note que como el metodo no devuelve nada, entonces el tipo de dato de la función es void
    public void setNombre(nombre){
        this.nombre = nombre;
    }


    // Getter, es decir, devuelve el valor que tenga ese parametro
    // Note que como el metodo siempre devuelve el tipo de dato que es el parametro
    public String getNombre(){
        return nombre;
    }


    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }


    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }


    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getApellido(){
        return apellido;
    }

    // Este es un metodo de la clase, algo así como una función pero de clases.
    public void saludar()
    {
        System.out.println("Hola, mi nombre es "+ this.nombre+" "+this.apellido+" tengo "+this.edad+" años y soy "+this.profesion);
    }
}

class Personas {
    public static void main (String args[]) {
        // Aca estoy creando instancias de la clase persona
        Persona persona1 = new Persona("Julio", "Martinez", 40, "Agronomo");
        Persona persona2 = new Persona("Claudia", "Montes", 29, "Bailarina");
        Persona persona3 = new Persona("Kevin", "Benjumea", 14, "Estudiante");
        Persona persona4 = new Persona("Sandra", "Morales", 34, "Doctora");

        // Creo un arreglo con 3 elementos, cada uno de la clase Persona
        // Note que como tiene 3 posiciones, el index más grande que puede tener es 2. 
        Persona[] miembrosClub = new Persona[3];
        miembrosClub[0]=persona1;
        miembrosClub[1]=persona2;
        miembrosClub[2]=persona3;

        // Estructura de un ciclo for
        // Tiene un inicializador, una condición de parada, y cuanto avanza en cada iteración(paso)
        for(int i=0; i<3; i++)
        {
            miembrosClub[i].saludar();
        }

        // Convertir un string a entero
        int i = Integer.parseInt("200");
        int salida = i*3;
        System.out.println(salida);

    }

}