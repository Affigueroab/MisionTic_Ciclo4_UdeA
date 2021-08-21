public class Main {
    public static void main(String[] args){
        Entrenador entrenador1 = new Entrenador(1, "Juan", "Suarez", 46, "1234");
        Futbolista futbolista1 = new Futbolista(2, "Cristiano", "Ronaldo", 36, "7");
        Masajista masajista1 = new Masajista(3, "Carlos", "Acosta", 28, "UNAL", 5)

        Seleccion[] miembrosClub = new Seleccion[3];
        miembrosClub[0] = entrenador1;
        miembrosClub[1] = futbolista1;
        miembrosClub[2] = masajista1;

        for(int i=0; i<3; i++)
        {
            miembrosClub[i].concentrarse();
        }

    }
}