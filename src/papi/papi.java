package papi;

import java.io.*;
import java.util.Scanner;

public class papi {

    public static void main(String[] args) throws IOException {

        // TODO: 10/25/2019 MENU PARA EJECUTAR LOS HIJOS
        Scanner sc = new Scanner(System.in);
        String opcion;
        do{
            System.out.println("EL PARE DIU:---------------------------------------------------");
            System.out.println("EL PARE DIU:-- 1. Ejecuta la suma de dos numeros --------------");
            System.out.println("EL PARE DIU:---------------------------------------------------");
            System.out.println("EL PARE DIU:-- 2. Muestra una frase por pantalla --------------");
            System.out.println("EL PARE DIU:---------------------------------------------------");
            System.out.println("EL PARE DIU:-- 3. Introduce dos numeros y hace 5 iteraciones --");
            System.out.println("EL PARE DIU:---------------------------------------------------");
            System.out.println("EL PARE DIU:-- 4. Salir ---------------------------------------");
            System.out.println("EL PARE DIU:---------------------------------------------------");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    ProcessBuilder pb = new ProcessBuilder("java", "-jar", "PRUTA");
                    Process p = pb.start();
                    break;
                case "2":
                    ProcessBuilder pb2 = new ProcessBuilder("java", "-jar", "PRUTA2");
                    Process p2 = pb2.start();
                    System.out.println("EL PARE DIU: Escribe una frase:");
                    String frase = sc.nextLine();
                    BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( p2.getOutputStream() ) );
                    bw.write(frase);
                    bw.flush();
                    bw.close();
                    break;
                case "3":
                    ProcessBuilder pb3 = new ProcessBuilder("java", "-jar", "PRUTA3");
                    Process p3 = pb3.start();
                    BufferedReader br = new BufferedReader( new InputStreamReader( p3.getInputStream() ) );
                    System.out.println( "EL PARE DIU:" + br.readLine() );
                    break;
                default:
                    System.out.println("EL PARE DIU: \"" + opcion + "\" no es una opcion correcta");
                    break;
            }
        }while( !opcion.equals( "salir" ) );

    }

}
