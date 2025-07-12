package paquete;

public class Clase {

    public static void main(String[] args) {
        // Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
        System.out.println("Día de la Semana");
        
	// Declarar variables, constantes y/o arreglos e iniciarlos.
	int dia = 1;
        String nombreDia = "";
	
	// Dimensionar arreglos.	
		
	// Entrada de Datos: Pueden ser solicitados o no
	
	// Proceso: Determinar los requerimientos y validaciones. Generalmente,	
	//          se usan las estructuras de control: Secuencial, condicional, repetición.
	if (dia == 1) {
            nombreDia = "Lunes";
        } else if (dia == 2) {
            nombreDia = "Martes";            
        } else if (dia == 3) {
            nombreDia = "Miércoles";            
        } else if (dia == 4) {
            nombreDia = "Jueves";
        } else if (dia == 5) {
            nombreDia = "Viernes";
        } else if (dia == 6) {
            nombreDia = "Sábado";
        } else if (dia == 7) {
            nombreDia = "Domingo";
        }
        
        // Salida de Datos. Resultado(s).
        System.out.println("El día seleccionado de la semana es: " + nombreDia);
    }
    
}