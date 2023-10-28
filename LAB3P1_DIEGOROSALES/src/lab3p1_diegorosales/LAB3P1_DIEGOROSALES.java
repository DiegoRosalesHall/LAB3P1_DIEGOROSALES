package lab3p1_diegorosales;

import java.util.Scanner;

public class LAB3P1_DIEGOROSALES {

    public static void main(String[] args) {
        int contador_menu = 1;
        Scanner mcgregor = new Scanner(System.in);
        while (contador_menu == 1) {
            System.out.println("Ingrese el numero de programa que quiera iniciar del 1-3 || 4 finalizara el menu");
            int opcion_menu = mcgregor.nextInt();
            switch (opcion_menu) {
                case 1: {
                    System.out.println("Inserte el inicial: ");
                    int inicial = mcgregor.nextInt();
                    System.out.println("Inserte la diferencia: ");
                    int diferencia = mcgregor.nextInt();
                    System.out.println("Inserte la cantidad: ");
                    int cantidad = mcgregor.nextInt() - 1;
                    int numero = 0;
                    int inicial2 = inicial;
                    int diferencia2 = diferencia;
                    int cantidad2 = cantidad;
                    for (int x = 0; x < cantidad; x++) {
                        System.out.print(inicial + ", ");
                        inicial += diferencia;
                        diferencia += 1;
                    }
                    System.out.println(inicial);
                    System.out.println("Que numero desea ver mas adelante en la sucesion?: ");
                    int sucesion = mcgregor.nextInt() - 1;
                    for (int x = 0; x < sucesion; x++) {
                        inicial2 += diferencia2;
                        diferencia2 += 1;
                    }
                    System.out.println(inicial2);

                    break;
                }// CASO 1 SUCESIONES
                case 2: {
                    System.out.println("Ingrese el modo que desea: ");
                    System.out.println("1. ~ Hasta la muerte ");
                    System.out.println("2. ~ Por rondas");
                    int modo_juego = mcgregor.nextInt();

                    System.out.println("Sylveon || vida: 280 || Ataque:80 || Defensa: 15% ");
                    float vida_sylveon = 280;
                    float ataque_sylveon = 80;
                    float defensa_sylveon = 15;

                    System.out.println("Gyarados || vida: 300 || Ataque:50 || Defensa: 10% ");
                    float vida_gyarados = 300;
                    float ataque_gyarados = 50;
                    float defensa_gyarados = 10;

                    System.out.println("Giratina || vida: 300 || Ataque:70 || Defensa: 25% ");
                    float vida_giratina = 300;
                    float ataque_giratina = 70;
                    float defensa_giratina = 25;

                    System.out.println("Dragonite || vida: 250 || Ataque:75 || Defensa: 20% ");
                    float vida_dragonite = 250;
                    float ataque_dragonite = 75;
                    float defensa_dragonite = 20;

                    System.out.println("");
                    System.out.println("Ingresa una pelea predeterminada");
                    System.out.println("1.~ Sylveon vs Dragonite");
                    System.out.println("2.~ Gyarados vs Giratina");
                    System.out.println("3.~ Dragonite vs Giratina");
                    System.out.println("4.~ Giratina vs Sylveon");
                    int opcion_pelea = mcgregor.nextInt();
                    switch (opcion_pelea) {
                        case 1:
                            if (modo_juego == 1) {
                                int i = 0;
                                while (vida_sylveon > 0 || vida_dragonite > 0) {
                                    System.out.println("------- Ronda " + (i + 1) + " -------");
                                    System.out.println("Sylveon ha atacado!");
                                    vida_dragonite = vida_dragonite - (ataque_sylveon - (ataque_sylveon * (defensa_dragonite / 100)));
                                    if (vida_dragonite <= 0) {
                                        vida_dragonite = 0;
                                        System.out.println("Vida de Dragonite: " + vida_dragonite);
                                        System.out.println("Vida de Sylveon: " + vida_sylveon);
                                        break;
                                    }
                                    System.out.println("Dragonite ha atacado!");
                                    vida_sylveon = vida_sylveon - (ataque_dragonite - (ataque_dragonite * (defensa_sylveon / 100)));
                                    System.out.println("");
                                    if (vida_dragonite < 0) {
                                        vida_dragonite = 0;
                                    } else if (vida_sylveon < 0) {
                                        vida_sylveon = 0;
                                    }
                                    System.out.println("Vida de Dragonite: " + vida_dragonite);
                                    System.out.println("Vida de Sylveon: " + vida_sylveon);

                                    if (vida_dragonite == 0 || vida_sylveon == 0) {

                                        break;
                                    }
                                }

                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_dragonite > vida_sylveon) {
                                    System.out.println("****** EL GANADOR ES DRAGONITE ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES SYLVEON ******");
                                }
                                break;

                            }// PELEA HASTA LA MUERTE
                            else if (modo_juego == 2) {
                                int contador = 1;
                                int rondas = 0;

                                while (contador == 1) {
                                    System.out.println("Inserte la cantidad de rondas");
                                    rondas = mcgregor.nextInt();

                                    if (rondas > 0 && rondas <= 10) {
                                        contador = 0;
                                    } else {
                                        System.out.println("Las rondas no pueden ser menor que 10");
                                        contador = 1;
                                    }

                                }
                                for (int i = 0; i < rondas; i++) {
                                    System.out.println("------- Ronda " + (i + 1) + " -------");
                                    System.out.println("Sylveon ha atacado!");
                                    vida_dragonite = vida_dragonite - (ataque_sylveon - (ataque_sylveon * (defensa_dragonite / 100)));
                                    if (vida_dragonite <= 0) {
                                        vida_dragonite = 0;
                                        System.out.println("Vida de Dragonite: " + vida_dragonite);
                                        System.out.println("Vida de Sylveon: " + vida_sylveon);
                                        break;
                                    }
                                    System.out.println("Dragonite ha atacado!");
                                    vida_sylveon = vida_sylveon - (ataque_dragonite - (ataque_dragonite * (defensa_sylveon / 100)));
                                    System.out.println("");
                                    if (vida_dragonite < 0) {
                                        vida_dragonite = 0;
                                    } else if (vida_sylveon < 0) {
                                        vida_sylveon = 0;
                                    }
                                    System.out.println("Vida de Dragonite: " + vida_dragonite);
                                    System.out.println("Vida de Sylveon: " + vida_sylveon);

                                    if (vida_dragonite == 0 || vida_sylveon == 0) {

                                        break;
                                    }

                                }
                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_dragonite > vida_sylveon) {
                                    System.out.println("****** EL GANADOR ES DRAGONITE ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES SYLVEON ******");
                                }
                                break;

                            }// PELEA TURNOS (10 MAXIMO)
                        case 2:
                            if (modo_juego == 1) {
                                int i = 0;
                                while (vida_gyarados > 0 || vida_giratina > 0) {
                                    System.out.println("------- Ronda " + (i += 1) + " -------");
                                    System.out.println("Gyarados ha atacado!");
                                    vida_giratina = vida_giratina - (ataque_gyarados - (ataque_gyarados * (defensa_giratina / 100)));
                                    vida_gyarados = vida_gyarados - (ataque_giratina - (ataque_giratina * (defensa_gyarados / 100)));
                                    if (vida_giratina <= 0) {
                                        vida_giratina = 0;
                                        System.out.println("Vida de Gyarados: " + vida_gyarados);
                                        System.out.println("Vida de Giratina: " + vida_giratina);
                                        break;
                                    }
                                    System.out.println("Giratina ha atacado!");
                                    vida_gyarados = vida_gyarados - (ataque_giratina - (ataque_giratina * (defensa_gyarados / 100)));
                                    System.out.println("");
                                    if (vida_gyarados < 0) {
                                        vida_gyarados = 0;
                                    } else if (vida_giratina < 0) {
                                        vida_giratina = 0;
                                    }
                                    System.out.println("Vida de Gyarados: " + vida_gyarados);
                                    System.out.println("Vida de Giratina: " + vida_giratina);

                                    if (vida_giratina == 0 || vida_gyarados == 0) {

                                        break;
                                    }
                                }

                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_gyarados > vida_giratina) {
                                    System.out.println("****** EL GANADOR ES GYARADOS ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES GIRATINA ******");
                                }
                                break;

                            } else if (modo_juego == 2) {
                                int contador = 1;
                                int rondas = 0;

                                while (contador == 1) {
                                    System.out.println("Inserte la cantidad de rondas");
                                    rondas = mcgregor.nextInt();

                                    if (rondas > 0 && rondas <= 10) {
                                        contador = 0;
                                    } else {
                                        System.out.println("Las rondas no pueden ser menor que 10");
                                        contador = 1;
                                    }

                                }
                                for (int i = 0; i < rondas; i++) {
                                    System.out.println("------- Ronda " + (i + 1) + " -------");
                                    System.out.println("Gyarados ha atacado!");
                                    vida_giratina = vida_giratina - (ataque_gyarados - (ataque_gyarados * (defensa_giratina / 100)));
                                    if (vida_giratina <= 0) {
                                        vida_giratina = 0;
                                        System.out.println("Vida de Gyarados: " + vida_gyarados);
                                        System.out.println("Vida de Giratina: " + vida_giratina);
                                        break;
                                    }
                                    System.out.println("Giratina ha atacado!");
                                    vida_gyarados = vida_gyarados - (ataque_giratina - (ataque_giratina * (defensa_gyarados / 100)));

                                    System.out.println("");
                                    if (vida_gyarados < 0) {
                                        vida_gyarados = 0;
                                    } else if (vida_giratina < 0) {
                                        vida_giratina = 0;
                                    }
                                    System.out.println("Vida de Gyarados: " + vida_gyarados);
                                    System.out.println("Vida de Giratina: " + vida_giratina);

                                    if (vida_gyarados == 0 || vida_giratina == 0) {

                                        break;
                                    }

                                }
                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_gyarados > vida_giratina) {
                                    System.out.println("****** EL GANADOR ES GYARADOS ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES GIRATINA ******");
                                }
                                break;
                            }
                        case 3:
                            if (modo_juego == 1) {
                                int i = 0;
                                while (vida_dragonite > 0 || vida_giratina > 0) {
                                    System.out.println("------- Ronda " + (i += 1) + " -------");
                                    System.out.println("Dragonite ha atacado!");
                                    vida_giratina = vida_giratina - (ataque_dragonite - (ataque_dragonite * (defensa_giratina / 100)));
                                    if (vida_giratina <= 0) {
                                        vida_giratina = 0;
                                        System.out.println("Vida de Dragonite: " + vida_dragonite);
                                        System.out.println("Vida de Giratina: " + vida_giratina);
                                        break;
                                    }
                                    System.out.println("Giratina ha atacado!");
                                    vida_dragonite = vida_dragonite - (ataque_giratina - (ataque_giratina * (defensa_dragonite / 100)));

                                    System.out.println("");
                                    if (vida_dragonite < 0) {
                                        vida_dragonite = 0;
                                    } else if (vida_giratina < 0) {
                                        vida_giratina = 0;
                                    }
                                    System.out.println("Vida de Dragonite: " + vida_dragonite);
                                    System.out.println("Vida de Giratina: " + vida_giratina);

                                    if (vida_giratina == 0 || vida_dragonite == 0) {

                                        break;
                                    }
                                }

                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_dragonite > vida_giratina) {
                                    System.out.println("****** EL GANADOR ES DRAGONITE ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES GIRATINA ******");
                                }
                                break;

                            } else if (modo_juego == 2) {
                                int contador = 1;
                                int rondas = 0;

                                while (contador == 1) {
                                    System.out.println("Inserte la cantidad de rondas");
                                    rondas = mcgregor.nextInt();

                                    if (rondas > 0 && rondas <= 10) {
                                        contador = 0;
                                    } else {
                                        System.out.println("Las rondas no pueden ser menor que 10");
                                        contador = 1;
                                    }

                                }
                                for (int i = 0; i < rondas; i++) {
                                    System.out.println("------- Ronda " + (i + 1) + " -------");
                                    System.out.println("Giratina ha atacado!");
                                    vida_dragonite = vida_dragonite - (ataque_giratina - (ataque_giratina * (defensa_dragonite / 100)));
                                    if (vida_dragonite <= 0) {
                                        vida_dragonite = 0;
                                        System.out.println("Vida de Dragonite: " + vida_dragonite);
                                        System.out.println("Vida de Giratina: " + vida_giratina);
                                        break;
                                    }
                                    System.out.println("Dragonite ha atacado!");
                                    vida_giratina = vida_giratina - (ataque_dragonite - (ataque_dragonite * (defensa_giratina / 100)));
                                    System.out.println("");
                                    if (vida_dragonite < 0) {
                                        vida_dragonite = 0;
                                    } else if (vida_giratina < 0) {
                                        vida_giratina = 0;
                                    }
                                    System.out.println("Vida de Dragonite: " + vida_dragonite);
                                    System.out.println("Vida de Giratina: " + vida_giratina);

                                    if (vida_dragonite == 0 || vida_giratina == 0) {

                                        break;
                                    }

                                }
                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_dragonite > vida_sylveon) {
                                    System.out.println("****** EL GANADOR ES DRAGONITE ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES GIRATINA ******");
                                }
                                break;
                            }
                        case 4:
                            if (modo_juego == 1) {
                                int i = 0;
                                while (vida_sylveon > 0 || vida_giratina > 0) {
                                    System.out.println("------- Ronda " + (i += 1) + " -------");
                                    System.out.println("Sylveon ha atacado!");
                                    vida_giratina = vida_giratina - (ataque_sylveon - (ataque_sylveon * (defensa_giratina / 100)));
                                    if (vida_giratina <= 0) {
                                        vida_giratina = 0;
                                        System.out.println("Vida de Sylveon: " + vida_sylveon);
                                        System.out.println("Vida de Giratina: " + vida_giratina);
                                        break;
                                    }
                                    System.out.println("Giratina ha atacado!");
                                    vida_sylveon = vida_sylveon - (ataque_giratina - (ataque_giratina * (defensa_sylveon / 100)));

                                    System.out.println("");
                                    if (vida_sylveon < 0) {
                                        vida_sylveon = 0;
                                    } else if (vida_giratina < 0) {
                                        vida_giratina = 0;
                                    }
                                    System.out.println("Vida de Sylveon: " + vida_sylveon);
                                    System.out.println("Vida de Giratina: " + vida_giratina);

                                    if (vida_giratina == 0 || vida_sylveon == 0) {

                                        break;
                                    }
                                }

                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_sylveon > vida_giratina) {
                                    System.out.println("****** EL GANADOR ES SYLVEON ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES GIRATINA ******");
                                }
                                break;

                            } else if (modo_juego == 2) {
                                int contador = 1;
                                int rondas = 0;

                                while (contador == 1) {
                                    System.out.println("Inserte la cantidad de rondas");
                                    rondas = mcgregor.nextInt();

                                    if (rondas > 0 && rondas <= 10) {
                                        contador = 0;
                                    } else {
                                        System.out.println("Las rondas no pueden ser menor que 10");
                                        contador = 1;
                                    }

                                }
                                for (int i = 0; i < rondas; i++) {
                                    System.out.println("------- Ronda " + (i + 1) + " -------");
                                    System.out.println("Sylveon ha atacado!");
                                    vida_giratina = vida_giratina - (ataque_sylveon - (ataque_sylveon * (defensa_giratina / 100)));
                                    if (vida_giratina <= 0) {
                                        vida_giratina = 0;
                                        System.out.println("Vida de Giratina: " + vida_giratina);
                                        System.out.println("Vida de Sylveon: " + vida_sylveon);
                                        break;
                                    }
                                    System.out.println("Giratina ha atacado!");
                                    vida_sylveon = vida_sylveon - (ataque_giratina - (ataque_giratina * (defensa_sylveon / 100)));
                                    System.out.println("");
                                    if (vida_giratina < 0) {
                                        vida_giratina = 0;
                                    } else if (vida_sylveon < 0) {
                                        vida_sylveon = 0;
                                    }
                                    System.out.println("Vida de Giratina: " + vida_giratina);
                                    System.out.println("Vida de Sylveon: " + vida_sylveon);

                                    if (vida_giratina == 0 || vida_sylveon == 0) {

                                        break;
                                    }

                                }
                                System.out.println("------- FIN DE LA BATALLA -------");
                                if (vida_giratina > vida_sylveon) {
                                    System.out.println("****** EL GANADOR ES GIRATINA ******");
                                } else {
                                    System.out.println("****** EL GANADOR ES SYLVEON ******");
                                }
                                break;
                            }
                    }// SWITCH PELEAS

                }// POKEMONES PUE
                case 3: {
                    System.out.println("Ingrese un numero impar y mayor a 7: ");

                    int numero = mcgregor.nextInt();
                    while (numero % 2 != 0 && numero >= 7) {
                        for (int i = 1; i <= numero; i++) {
                            for (int j = 1; j <= numero; j++) {
                                if (i == 1 || i == numero || j == numero || j == 1) {
                                    System.out.print(" * ");
                                } else if (j == numero / 2 + 1) {
                                    System.out.print(" | ");
                                } else if (i == j || i + j == numero + 1) {
                                    System.out.print(" > ");
                                } else {
                                    System.out.print("   ");
                                }
                            }
                            System.out.println("");

                        }
                        System.out.println("Ingrese un numero impar y mayor a 7: ");

                        numero = mcgregor.nextInt();
                        

                    }
                    System.out.println("El numero ingresado es par o menor que 7");

                }// FIGURAS :(
                
                case 4:
                    System.out.println("Finalizo el programa");
                    contador_menu=0;
                    
                    
                   
                   
                    

            }// FIN SWITCH 

        }// FIN MENU

    }// FIN MAIN

}// FIN CLASS
