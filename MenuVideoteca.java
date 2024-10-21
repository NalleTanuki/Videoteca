package Base;

import java.util.Scanner;

public class MenuVideoteca
{

    private Videoteca videoteca;
    private Scanner scanner;

    public MenuVideoteca()
    {
        videoteca = new Videoteca();
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu()
    {
        int opcion;
        do
        {
            System.out.println("\n\n** Menú de opciones **");
            System.out.println("1. Añadir película");
            System.out.println("2. Añadir actor");
            System.out.println("3. Añadir director");
            System.out.println("4. Borrar película");
            System.out.println("5. Borrar actor");
            System.out.println("6. Borrar director");
            System.out.println("7. Listar actores");
            System.out.println("8. Listar películas");
            System.out.println("9. Listar directores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción-> ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 1:
                	videoteca.anhadirPelicula();
                    break;
                case 2:
                    videoteca.anhadirActor();
                    break;
                case 3:
                    videoteca.anhadirDirector();
                    break;
                case 4:
                	videoteca.borrarPelicula();
                    break;
                case 5:
                	videoteca.borrarActor();
                    break;
                case 6:
                	videoteca.borrarDirector();
                    break;
                case 7:
                    videoteca.listarActores();
                    break;
                case 8:
                    videoteca.listarPeliculas();
                    break;
                case 9:
                	videoteca.listarDirectores();
                	break;
                case 0:
                    System.out.println("\nFin. El programa se ha cerrado.");
                    break;
                default:
                    System.out.println("\nOpción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
        while (opcion != 0);
    }

    public static void main(String[] args)
    {
        MenuVideoteca menu = new MenuVideoteca();
        menu.mostrarMenu();
        MenuVideoteca inicializar = new MenuVideoteca();
    }
}