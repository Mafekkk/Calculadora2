package calculadora;


public class Trigonometrica extends Calculadora{
    double numero1=0;
    double respuesta=0;
    
    
    public void seno(){
        numero1=numero1*Math.PI/180;
        respuesta=Math.sin(numero1);
    }
    public void coseno(){
        numero1=numero1*Math.PI/180;
        respuesta=Math.cos(numero1);
    }
    public void tangente(){
        numero1=numero1*Math.PI/180;
        respuesta=Math.tan(numero1);
    }
}
