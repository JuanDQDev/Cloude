package model;

public interface IGestionanbleEmpleados {

    public int buscarByIdentificacion(String indentificacion);

    public boolean agregarPersona(Persona persona);

    public boolean actualizarPersona(Persona persona);
    public boolean eliminarPersona(Persona persona);
    public String mostrarPersona(Persona persona);
}
