package ui;

import services.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag;

        ArrayList<SpaceVehicles> listSpaceVehicles = new ArrayList<>();
        int add;

        do {
            Scanner dato = new Scanner(System.in);
            System.out.println("""
                    Digite el numero que corresponde al tipo de nave que desea crear.
                    Las opciones son:
                    1.Nave espacial tripulada.
                    2.Vehiculo lanzadera
                    3.Nave espacial no trpulada.
                    4.Nave Artificial""");
            int spaceVehicle = Integer.parseInt(dato.nextLine());
            System.out.println("nombre del creator de la nave. ");
            String creator = dato.nextLine();
            System.out.println("Indique el nombre de la nave. ");
            String name = dato.nextLine();

            System.out.println("Indique el peso de la nave.");
            int weight = Integer.parseInt(dato.nextLine());

            System.out.println("Si la nave espacial se encuentra activa digite 1, de lo contrario digite 0. ");
            int asset = Integer.parseInt(dato.nextLine());

            flag= asset != 0;

            switch (spaceVehicle) {
                case 1 -> {
                    System.out.println("Indique la capacidad de Tripulante de la nave");
                    int crewCapacity = Integer.parseInt(dato.nextLine());

                    var mannedShip = new MannedSpacecraft(creator, name, weight, flag, crewCapacity);
                    listSpaceVehicles.add(mannedShip);
                    break;
                }
                case 2 -> {
                    System.out.println("Indique la capacidad de Carga Total de la nave");
                    int fullLoad = Integer.parseInt(dato.nextLine());
                    System.out.println("Numero Colchones del Vehiculo");
                    int vehicleMattresses = Integer.parseInt(dato.nextLine());

                    var shuttleVehicle = new ShuttleVehicle(creator, name, weight, (asset != 0), fullLoad, vehicleMattresses);
                    listSpaceVehicles.add(shuttleVehicle);
                    break;
                }
                case 3 -> {
                    System.out.println("Indique cantida total de antena que tiene la nave");
                    int totalAntenna = Integer.parseInt(dato.nextLine());
                    System.out.println("Indique la cantidad total de camara que tiene la nave");
                    int fullCamera = Integer.parseInt(dato.nextLine());

                    var unmannedShip = new UnmannedSpacecraft(creator, name, weight, (asset != 0), totalAntenna, fullCamera);

                    listSpaceVehicles.add(unmannedShip);
                    unmannedShip.message();
                    break;

                }
                case 4 -> {
                    System.out.println("Indique la posicion de la nave. ");
                    String position = dato.nextLine();
                    System.out.println("Digite la frecuencia unidad Medida Frecuencia");
                    int frequencyMeasurement = Integer.parseInt(dato.nextLine());

                    ArtificialShip artificialShip = new ArtificialShip(creator, name, weight, (asset != 0), position, frequencyMeasurement);
                    listSpaceVehicles.add(artificialShip);

                    break;

                }
                default -> System.out.println("\nInformación no existente");

            }
            System.out.println("Si desea agregar otra nave digite 1, de lo contrario digite 0. ");
            add = Integer.parseInt(dato.nextLine());
        } while (add != 0);
        System.out.println(listSpaceVehicles);


    }
}