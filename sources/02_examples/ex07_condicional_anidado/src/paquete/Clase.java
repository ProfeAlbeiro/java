package paquete;

public class Clase {

    public static void main(String[] args) {
        // Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
	System.out.println("Número Mayor, Menor o igual");
        
	// Declarar variables, constantes y/o arreglos.
	int num01, num02;
        
	// Dimensionar arreglos.
	
	// Iniciar variables, constantes y/o arreglos
	num01 = 5;
	num02 = 5;
        
	// Entrada de Datos: Pueden ser solicitados o no
	
	// Proceso: Determinar los requerimientos y validaciones. Generalmente,	
	//          se usan las estructuras de control: Secuencial, condicional, repetición.
	if (num01 > num02) {
            // Salida de Datos. Resultado(s).	        
            System.out.println("El Número Uno es mayor al Número Dos");
        } else {
            if (num01 == num02) {
                // Salida de Datos. Resultado(s).	        
                System.out.println("Los números son iguales");
            } else {
                // Salida de Datos. Resultado(s).	        
                System.out.println("El Número Dos es mayor al Número Uno");
            }
        }
    }
    
}