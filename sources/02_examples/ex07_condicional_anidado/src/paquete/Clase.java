package paquete;

public class Clase {

    public static void main(String[] args) {
        // Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
	System.out.println("N�mero Mayor, Menor o igual");
        
	// Declarar variables, constantes y/o arreglos.
	int num01, num02;
        
	// Dimensionar arreglos.
	
	// Iniciar variables, constantes y/o arreglos
	num01 = 5;
	num02 = 5;
        
	// Entrada de Datos: Pueden ser solicitados o no
	
	// Proceso: Determinar los requerimientos y validaciones. Generalmente,	
	//          se usan las estructuras de control: Secuencial, condicional, repetici�n.
	if (num01 > num02) {
            // Salida de Datos. Resultado(s).	        
            System.out.println("El N�mero Uno es mayor al N�mero Dos");
        } else {
            if (num01 == num02) {
                // Salida de Datos. Resultado(s).	        
                System.out.println("Los n�meros son iguales");
            } else {
                // Salida de Datos. Resultado(s).	        
                System.out.println("El N�mero Dos es mayor al N�mero Uno");
            }
        }
    }
    
}