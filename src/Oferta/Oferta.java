package Oferta;

public class Oferta {

    private String nombreOferta, empresa, personaContacto, experiencia, fechaSolicitud ;
    private double sueldo;
    private boolean estaSolicitada, esRemoto;

    //constructor
    public Oferta(String nombreOferta, String empresa, String personaContacto,String experiencia, String fechaSolicitud,
                  double sueldo, boolean estaSolicitada, boolean esRemoto){
        this.nombreOferta = nombreOferta;
        this.empresa = empresa;
        this.personaContacto = personaContacto;
        this.experiencia= experiencia;
        this.fechaSolicitud = fechaSolicitud;
        this.sueldo = sueldo;
        this.estaSolicitada = estaSolicitada;
        this.esRemoto = esRemoto;

    }
    //metodos getter and setter
    public String getNombreOferta() {
        return nombreOferta;
    }

    public void setNombreOferta(String nombreOferta) {
        this.nombreOferta = nombreOferta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEstaSolicitada() {
        return estaSolicitada;
    }

    public void setEstaSolicitada(boolean estaSolicitada) {
        this.estaSolicitada = estaSolicitada;
    }

    public boolean isEsRemoto() {
        return esRemoto;
    }

    public void setEsRemoto(boolean esRemoto) {
        this.esRemoto = esRemoto;
    }

    // método mostrarOferta
    public void mostrarOferta() {
        System.out.println("Nombre de la oferta: " + nombreOferta);
        System.out.println("La empresa: " + empresa);
        System.out.println("El sueldo es Sueldo: " + sueldo);
        System.out.println("La persona de contacto es: " + personaContacto);
        System.out.println("Experiencia requerida: " + experiencia);
        System.out.println("Esta solicitada: " + estaSolicitada);
        System.out.println("Fecha de solicitud: " + fechaSolicitud);
        System.out.println("Es en remoto: " + esRemoto);
    }
}