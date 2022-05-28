
package reto2;

    public class Paciente {

        private String nombre;
        private String numeroCedula;
        private int edad;
        private String ciudad;
        private String eps;
        private String enfermedad;

        public Paciente() {

        }
        public Paciente(String nombre, String numeroCedula, int edad, String ciudad, String eps, String enfermedad) {
            this.nombre = nombre;
            this.numeroCedula = numeroCedula;
            this.edad = edad;
            this.ciudad = ciudad;
            this.eps = eps;
            this.enfermedad = enfermedad;
        }
                
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNumeroCedula() {
            return numeroCedula;
        }

        public void setNumeroCedula(String numeroCedula) {
            this.numeroCedula = numeroCedula;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getCiudad() {
            return ciudad;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public String getEps() {
            return eps;
        }

        public void setEps(String eps) {
            this.eps = eps;
        }

        public String getEnfermedad() {
            return enfermedad;
        }

        public void setEnfermedad(String enfermedad) {
            this.enfermedad = enfermedad;
        }

        public void clasificarEdad(int edadConsulta, String cedula) {
            String salida = "";
            if (edadConsulta >= 21 && edadConsulta <= 30) {
                salida = cedula + " Joven adulto";
                System.out.println(salida);
            } else if (edadConsulta > 30 && edadConsulta <= 60) {
                salida = cedula + " Adulto";
                System.out.println(salida);
            } else {
                salida = cedula + " Tercera edad";
                System.out.println(salida);
            }
            
        }        
    }

