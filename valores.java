package Trea8SobrecargaSobreescritura;

class Valores extends operaciones {

    @Override
    public void sumaTotal(int variable, int numero , int numero2, int numero3) {
        int respuesta = variable + numero;
        System.out.println(respuesta);
    }


    @Override
    public void sumaTotal(int variable2, int variable3){
        int result = variable2 + variable3;
        System.out.println("\nEl resultado es: "+result);
    }
}