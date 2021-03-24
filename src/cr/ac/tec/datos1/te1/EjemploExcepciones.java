package cr.ac.tec.datos1.te1;


/*
Un solo ejemplo que muestra un throw solo "el metodo dividir()" y otro dentro de un bloque try-catch-finally
    que también reinicia el método "atraparExcepcion()" al lanzar una excepcion.

    Ademas tiene una excepcion propia que lanza cuando b iguala a 2.

 */

public class EjemploExcepciones {
    private int a = 14;
    private int b = 0;

    public void atraparExcepcion() throws Number2Exception{
        if (b == 2){
            this.b = 7;
            throw new Number2Exception("No me gusta el numero 2.");
        }
        try {
            System.out.println("Ejecutando instrucciones...");
            int resultado = a/b;

            System.out.println("Resultado: "+ resultado);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            //throw e;
        }
        finally{
            if(b == 0){
                System.out.println("Reiniciando operacion...");
                this.b = 2;
                this.atraparExcepcion();
            }
            else {
                System.out.println("Operacion realilzada correctamente...");
            }
        }
    }

    public void dividir () throws ArithmeticException{
        System.out.println(a/b);
    }
}
