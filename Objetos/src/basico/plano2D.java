package basico;

public class plano2D {
    
    private double x, y;
    
    public plano2D(){
        x = 0.0;
        y = 0.0;
    }
    
    public plano2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double distanciaOrigen(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
    }
    
    public String cuadrante(){
        if(x > 0 && y > 0){
            return "PRIMER CUADRANTE";
        }
        if(x > 0 && y < 0){
            return "SEGUNDO CUDRANTE";
        }
        if(x < 0 && y < 0){
            return "TERCER CUADRANTE";
        }
        if(x < 0 && y > 0){
            return "CUARTO CUADRANTE";
        }
        return "";
    }
}
