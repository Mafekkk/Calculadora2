package calculadora;


public class Principal {


    public static void main(String[] args) {
        Ventana miVentana=new Ventana();
        miVentana.setVisible(true);
        Calculadora miCalc= new Calculadora();
        double num=90*Math.PI/180;
        System.out.println(Math.sin(num));
    }
    
}
