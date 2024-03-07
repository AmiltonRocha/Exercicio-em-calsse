import java.io.InputStream;
import java.util.Scanner;

public class Main {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Quadrado quadrado = new Quadrado(scanner.nextDouble());
    System.out.println("Quadrado criado! seu lado vale: \n"+quadrado.lado);

    Retangulo retangulo = new Retangulo(scanner.nextDouble(), scanner.nextDouble());
    System.out.println("Quadrado criado! seu lado vale: \n"+retangulo.base+"sua altura vale : \n"+retangulo.altura);


    Trapezio trapezio = new Trapezio(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
    System.out.println("Quadrado criado! sua base menor : \n"+trapezio.baseMenor+"sua Base maior vale : \n"+trapezio.baseMaior+"Sua altura : \n"+trapezio.altura);

    System.out.println("Area : \n"+calculadorageometrica.calculadorArea(trapezio));









}
    
} 
 class Quadrado{
public double lado;

public Quadrado(double lado) {
    this.lado=lado;
    
} 
    
}

 class Retangulo {
public double base;
public double altura;
public Retangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}
    
}

 class Trapezio{
public double baseMaior;
public double baseMenor;
public double altura;
public Trapezio(double baseMaior, double baseMenor, double altura) {
    this.baseMaior = baseMaior;
    this.baseMenor = baseMenor;
    this.altura = altura;
}
}
 class calculadorageometrica{
  public static double calculadorArea(Quadrado quadrado){
    return quadrado.lado * quadrado.lado;
  }
  public static double calculadorArea(Retangulo retangulo){
    return retangulo.base * retangulo.altura;
  }
  public static double calculadorArea(Trapezio trapezio){
     return ((trapezio.baseMaior+trapezio.baseMenor)*trapezio.altura)/2;
  }
}