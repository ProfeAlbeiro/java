package paquete;

public class Clase {

    public static void main(String[] args) {
        // Objetivo del Algoritmo: Analizar el Objetivo / Problema como un Sistema [Entradas, Proceso y Salidas]
        System.out.println("Día de la Semana");
        
	// Declarar variables, constantes y/o arreglos e iniciarlos.
	int dia = 3;
        String nombreDia = "";
	
	// Dimensionar arreglos.	
		
	// Entrada de Datos: Pueden ser solicitados o no
	
	// Proceso: Determinar los requerimientos y validaciones. Generalmente,	
	//          se usan las estructuras de control: Secuencial, condicional, repetición.
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:                
                nombreDia = "Martes";            
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "No es un día de la Semana";;
        }	
        
        // Salida de Datos. Resultado(s).
        System.out.println("El día seleccionado de la semana es: " + nombreDia);
    }
    
}
