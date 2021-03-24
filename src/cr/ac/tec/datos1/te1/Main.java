package cr.ac.tec.datos1.te1;

class Prueba{
    public static void main(String[] args) throws Number2Exception {
        try{
            EjemploExcepciones objeto1 = new EjemploExcepciones();
            //objeto1.dividir();
            objeto1.atraparExcepcion();
            //objeto1.dividir();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}