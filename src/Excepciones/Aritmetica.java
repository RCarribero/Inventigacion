package Excepciones;

public class Aritmetica {
public static int division(int numerador,int denominador) throws Exception{
    if(denominador==0)
        throw new Exception("/ by zero");
    return numerador/denominador;
}
}
