import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class  Main{
    public static void main(String[] args) {

        int op = 0;

        Scanner tcl = new Scanner(System.in);
        List<Persona> ps1 = new ArrayList<>();
        List<Perro> perDisp = new ArrayList<>();

        while (op != 7) {
            System.out.println("""
                    ********MENU********
                    
                    Elija una opción
                    
                    1. Registrar persona
                    2. Registrar perro
                    3. Mostrar personas
                    4. Mostrar perros
                    5. Adoptar perro
                    6. Mostrar perro mas viejo de una persona
                    7. Salir
                    """);

                op = tcl.nextInt();
               tcl.nextLine();

            switch (op) {
                case 1 -> {
                    Persona p1 = new Persona();
                    System.out.print("Nombre del usuario: ");
                    p1.setNom(tcl.nextLine());
                    System.out.print("Apellido del usuario: ");
                    p1.setAp(tcl.nextLine());
                    System.out.print("Edad: ");
                    p1.setEdad(tcl.nextInt());
                    tcl.nextLine();
                    System.out.print("Documento: ");
                    p1.setDoc(tcl.nextLine());
                    ps1.add(p1);
                    System.out.println("Persona registrada");
                }
                case 2 -> {
                    Perro pr1 = new Perro();
                    System.out.print("Placa: ");
                    pr1.setPlc(tcl.nextLine());
                    System.out.print("Nombre: ");
                    pr1.setNomp(tcl.nextLine());
                    System.out.print("Raza: ");
                    pr1.setRaza(tcl.nextLine());
                    System.out.print("Edad: ");
                    pr1.setEdad(tcl.nextInt());
                    tcl.nextLine();
                    System.out.print("Tamaño: ");
                    pr1.setTam(tcl.nextLine());
                    perDisp.add(pr1);
                    System.out.println("Perro registrado");
                }
                case 3 -> {
                    if (ps1.isEmpty()) {
                        System.out.println("No hay personas registradas");
                    } else {
                        for (Persona p : ps1) {
                            System.out.println(p);
                        }
                    }
                }
                case 4 -> {
                    if (perDisp.isEmpty()) {
                        System.out.println("No hay perros disponibles");
                    } else {
                        for (Perro p : perDisp) {
                            System.out.println(p);
                        }
                    }
                }
                case 5 -> {
                    System.out.print("Documento: ");
                    String doc = tcl.nextLine();
                    Persona p1 = null;
                    for (Persona p : ps1) {
                        if (p.getDoc().equals(doc)) {
                            p1 = p;
                            break;
                        }
                    }

                    if (p1 == null) {
                        System.out.println("Persona no encontrada");
                        return;
                    }

                    System.out.print("Placa del perro: ");
                    String plc = tcl.nextLine();
                    Perro pr1 = null;
                    for (Perro p : perDisp) {
                        if (p.getPlc().equals(plc)) {
                            pr1 = p;
                            break;
                        }
                    }

                    if (pr1 == null) {
                        System.out.println("Perro no encontrado o ya adoptado");
                        return;
                    }

                    if (p1.adopPrr(pr1)) {
                        perDisp.remove(pr1);
                        System.out.println("Perro adoptado con éxito");
                    } else {
                        System.out.println("Esta persona ya adoptó 3 perros");
                    }
                }
                case 6 -> {
                    System.out.print("Documento: ");
                    String doc = tcl.nextLine();
                    Persona persona = null;
                    for (Persona p : ps1) {
                        if (p.getDoc().equals(doc)) {
                            persona = p;
                            break;
                        }
                    }

                    if (persona == null) {
                        System.out.println("Persona no encontrada");
                        return;
                    }

                    Perro vjo = persona.prrGnd();
                    if (vjo == null) {
                        System.out.println("No ha adoptado perros");
                    } else {
                        System.out.println("Perro más viejo adoptado: " + vjo);
                    }
                }
                case 7 -> System.out.println(" Gracias por usar el sistema de adopción, saliendo");
                default -> System.out.println("Opción inválida.");
            }
        }
    }
}
