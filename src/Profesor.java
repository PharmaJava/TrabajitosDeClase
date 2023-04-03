public class Profesor extends Persona{
    private String titulouniversitario;
    private boolean esbuenprofesor;

    //constructor sin argumentos
    public Profesor(){
        super();
    }
    //constructor con argumentos
    public Profesor(String personalidad, String colordeojos, double altura,boolean estaenferma,
                    String titulouniversitario, boolean esbuenprofesor){
                super(personalidad, colordeojos, altura, estaenferma);
                this.titulouniversitario= titulouniversitario;
                this.esbuenprofesor= esbuenprofesor;
    }

    public String getTitulouniversitario() {
        return titulouniversitario;
    }

    public void setTitulouniversitario(String titulouniversitario) {
        this.titulouniversitario = titulouniversitario;
    }

    public boolean isEsbuenprofesor() {
        return esbuenprofesor;
    }

    public void setEsbuenprofesor(boolean esbuenprofesor) {
        this.esbuenprofesor = esbuenprofesor;
    }

}
