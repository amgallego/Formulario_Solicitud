/*Ana Marcela Gallego Gomez, Miguel Angel Muñoz Lopez, David Quiroz Gonzales (Lógica miercoles 6:00pm) 
Ana Maria Zapata Pinillos (Lógica sábado 10:00am) */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double NumeroDocumento =0, Edad =0, Telefono=0;
        String NombreCompleto ="", CorreoElectronico ="", ProgramaInteres ="";
        System.out.println("Por favor ingrese su nombre completo: ");
        NombreCompleto = sc.nextLine();
        System.out.println("Por favor ingrese su número de identificación:");
        NumeroDocumento = sc.nextDouble();
        System.out.println("Por favor ingrese su edad: ");
        Edad = sc.nextDouble();
        System.out.println("Por favor ingrese su correo electrónico: ");
        CorreoElectronico = sc.next();
        System.out.println("Por favor ingrese su número de contacto: ");
        Telefono = sc.nextDouble();
        System.out.println("Por favor escriba el programa por el cual se encuentra interesado: ");
        ProgramaInteres = sc.next();
        if (Edad > 16 && CorreoElectronico.contains("@")) {
            System.out.println("La inscripción se ha realizado con exito.");
        } else {
            System.out.println("Valide los datos ingresados e intente nuevamente.");
        }
    }
}
