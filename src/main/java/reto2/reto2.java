package reto2;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class reto2 {

    public static void main(String[] args) {

        int contador = 0;
        int aux = 0;
        String resultado = "";
        String ciudad = "";
        String ciudadB = "";

        Scanner leer = new Scanner(System.in);
        int canPaciente = parseInt(leer.nextLine());

        String[] listaCiudad = new String[canPaciente];
        String[] listaCiudadB = new String[canPaciente];
        String[] datosPacientes = new String[6];
        String[] cedulas = new String[canPaciente];
        int[] edades = new int[canPaciente];

        for (int i = 0; i < canPaciente; i++) {
            String cadena = leer.nextLine();
            datosPacientes = cadena.split("-");
            listaCiudad[i] = datosPacientes[3];
            listaCiudadB[i] = datosPacientes[3];
            cedulas[i] = datosPacientes[1];
            String CadenaEdad = datosPacientes[2];
            int edad = parseInt(CadenaEdad);
            edades[i] = edad;
        }
        for (int i = 0; i < listaCiudad.length; i++) {
            contador = 0;
            for (int j = 0; j < listaCiudadB.length; j++) {
                if (listaCiudad[i].equalsIgnoreCase(listaCiudadB[j])) {
                    contador++;
                }
                if (contador > aux) {
                    aux = contador;
                    resultado = listaCiudad[i];
                }
            }
        }
        System.out.println(resultado);

        Paciente p = new Paciente();

        for (int z = 0; z < edades.length; z++) {
            p.clasificarEdad(edades[z], cedulas[z]);
        }
    }
}
