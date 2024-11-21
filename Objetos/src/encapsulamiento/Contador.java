package encapsulamiento;

/*
    Crea una clase llamada CONTADOR que contenga un único atributo llamado cont
    La clase tendrá los siguientes constructores: Uno por defecto y otro con parametros para inicializar el
    contador con un valor no negativo. Si el valor inicial que se recibe es negativo el contador tomará el
    valor cero como inicial.
    Constructor copia.
    Métodos: incrementar y decrementar.
*/
public class Contador {
    private int cont;
    
    public Contador(){
        
    }

    public Contador(int cont) {
        if(cont < 0){
            this.cont = 0;
        }
        else{
            this.cont = cont;
        }
    }
    
    public Contador(final Contador c){
        cont = c.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if(cont < 0){
            this.cont = 0;
        }
        else{
            this.cont = cont;
        }
    }
    
    public void incrementar(){
        cont++; //cont = cont + 1;
    }
    
    public void decrementar(){
        cont--; //cont = cont - 1;
        if(cont < 0){
            cont = 0;
        }
    }
}