public class MainPersona {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Amable", "marron", 1.70, false,
                "Licenciado en empresariales", false);
        Profesor profesor2 = new Profesor("Narcisista", "azul", 1.75, true,
                "Licenciado en Farmacia", true);

        System.out.println("La personalidad del primer profesor es: "+ profesor1.getPersonalidad());
        System.out.println("Su color de ojos es: "+ profesor1.getColordeojos());
        System.out.println("Su altura es de: " + profesor1.getAltura());
        System.out.println("¿Está enfermo?: " + (profesor1.isEstaenferma() ? "Sí": "No"));
        System.out.println("Su título universitario es: " + profesor1.getTitulouniversitario());
        System.out.println("¿Es buen profesor?: "+ (profesor1.isEsbuenprofesor() ? "Sí": "No") );

        System.out.println("La personalidad del segundo profesor es: "+ profesor2.getPersonalidad());
        System.out.println("Su color de ojos es: "+ profesor2.getColordeojos());
        System.out.println("Su altura es de: " + profesor2.getAltura());
        System.out.println("¿Está enfermo?: " + (profesor2.isEstaenferma() ? "Sí": "No"));
        System.out.println("Su título universitario es: " + profesor2.getTitulouniversitario());
        System.out.println("¿Es buen profesor?: " + (profesor2.isEsbuenprofesor() ? "Sí": "No" ));
    }

}
