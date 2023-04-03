
    public class Persona {

        //atributos
        private String personalidad, colordeojos;
        private double altura;
        private boolean estaenferma;

        //constructor sin argumentos
        public Persona(){
        }
        //constructor con argumentos
        public Persona (String personalidad, String colordeojos, double altura,boolean estaenferma){
                this.personalidad = personalidad;
                this.colordeojos= colordeojos;
                this.altura= altura;
                this.estaenferma= estaenferma;

        }

        public String getPersonalidad() {
            return personalidad;
        }

        public void setPersonalidad(String personalidad) {
            this.personalidad = personalidad;
        }

        public String getColordeojos() {
            return colordeojos;
        }

        public void setColordeojos(String colordeojos) {
            this.colordeojos = colordeojos;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public boolean isEstaenferma() {
            return estaenferma;
        }

        public void setEstaenferma(boolean estaenferma) {
            this.estaenferma = estaenferma;
        }


    }
