public Publicacion buscar(String titulo) {
    for (Publicacion p : publicaciones) {
        if (p.getTitulo().equalsIgnoreCase(titulo)) {
            return p;
        }
    }
    return null;
}

public void prestar(String titulo, String usuario) {
    Publicacion p = buscar(titulo);
    if (p != null) {
        p.prestar(usuario);
    } else {
        System.out.println("No encontrada");
    }
}

public void devolver(String titulo) {
    Publicacion p = buscar(titulo);
    if (p != null) {
        p.devolver();
    } else {
        System.out.println("No encontrada");
    }
}
