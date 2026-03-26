package com.biblio.consola;

public class MenuConsola {
    case 2:
    System.out.print("Título: ");
    String titulo = sc.nextLine();
    System.out.print("Usuario: ");
    String usuario = sc.nextLine();
    catalogo.prestarPublicacion(titulo, usuario);
    break;

case 3:
    System.out.print("Título: ");
    titulo = sc.nextLine();
    catalogo.devolverPublicacion(titulo);
    break;
}
