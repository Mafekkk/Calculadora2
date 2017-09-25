package calculadora;


public class Calculadora {
    float operando1=1;
    float operando2=0;
    float resultado;
    
    public void sumar (){
        resultado=operando1 + operando2;
    }
    public void restar(){
        resultado=operando1-operando2;
    }
    public void multiplicar (){
        resultado=operando1*operando2;
    }
    public void dividir (){
        if(operando2==0){
            
        }
        else{
            resultado=operando1/operando2;
        }
    }
}
