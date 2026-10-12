package Ejercicio19_agendaContactos;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        if (!setTelefono(telefono) || !setEmail(email)) {
            throw new IllegalArgumentException("Teléfono o correo inválidos.");
        }
    }

    public boolean setTelefono(String telefono) {
        if (!telefono.matches("[0-9+ -]{6,20}")) {
            return false;
        }
        this.telefono = telefono;
        return true;
    }

    public boolean setEmail(String email) {
        if (!email.contains("@") || email.startsWith("@") || email.endsWith("@")) {
            return false;
        }
        this.email = email;
        return true;
    }

    public String obtenerFicha() {
        return nombre + " | Tel: " + telefono + " | Email: " + email;
    }
}
