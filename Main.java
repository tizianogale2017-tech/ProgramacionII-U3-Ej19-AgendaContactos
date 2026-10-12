package Ejercicio19_agendaContactos;

public class Main {
    public static void main(String[] args) {
        Contacto contacto = new Contacto("Marcos Vega", "261 555-1234", "marcos@mail.com");
        System.out.println(contacto.obtenerFicha());

        System.out.println("Teléfono 'abc123': " + (contacto.setTelefono("abc123") ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Teléfono '2616789000': " + (contacto.setTelefono("2616789000") ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Email 'sin-arroba.com': " + (contacto.setEmail("sin-arroba.com") ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Email 'nuevo@correo.com': " + (contacto.setEmail("nuevo@correo.com") ? "ACEPTADO" : "RECHAZADO"));

        System.out.println(contacto.obtenerFicha());
    }
}
