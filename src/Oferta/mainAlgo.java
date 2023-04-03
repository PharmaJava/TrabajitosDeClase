package Oferta;

public class mainAlgo {
    public static void main(String[] args) {
        algoparecido nuevoobj1= new algoparecido("Programador", "microsoft", "DARDEEEN", "1.5 años",
        "12/08/2022",25000, true,false);
        System.out.println("La oferta es de : " + nuevoobj1.getEmpresa());
        System.out.println("Está soliciitada: " + (nuevoobj1.isEstaSolicitada() ? "Sin duda": "ni de fly"));

    }


}
