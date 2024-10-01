import java.util.Scanner; 
public class ContarPalabras {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String texto = scanner.nextLine();
        
        // Limpiar espacios extras
        texto = texto.trim().replaceAll("\\s+", " ");
        
        // Dividimos el texto en palabras
        String[] palabras = texto.split(" ");
        
        // Contamos las palabras
        int count = palabras.length;

        System.out.println("La frase contiene " + count + " palabras.");
        
        scanner.close();
    }
}

