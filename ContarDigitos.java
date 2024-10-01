import java.util.Scanner;
public class ContarDigitos{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();

        int count = 0; //contador
        
        for(int i = 0;i <= numero; i++){
            System.out.println(i);
            count ++;
        }
       scanner.close();

       System.out.println("El total de digitos que tiene el numero ingresado es:" + count);
    }
}