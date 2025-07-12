package paquete;

public class Clase {

    public static void main(String[] args) {        
        // Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
        System.out.println("Operar Dos Números");
        
	// Declarar variables, constantes y/o arreglos.
	double num01, num02, suma, resta, multiplicacion, division;
                
	// Dimensionar arreglos.
	
	// Iniciar variables, constantes y/o arreglos
	num01 = 4;
	num02 = 5;
        
	// Entrada de Datos: Pueden ser solicitados o no
	
	// Proceso: Determinar los requerimientos y validaciones. Generalmente,	
	//          se usan las estructuras de control: Secuencial, condicional, repetición.
	suma = num01 + num02;
	resta = num01 - num02;
	multiplicacion = num01 * num02;
	division = num01 / num02;
        
	// Salida de Datos. Resultado(s).
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
        
    }
    
}