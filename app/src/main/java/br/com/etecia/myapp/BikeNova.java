package br.com.etecia.myapp;

public class BikeNova {
    private String titulo;
    private int image;

    //construtor da classe

    public BikeNova(String titulo, int image) {
        this.titulo = titulo;
        this.image = image;
    }

    //metodo de acesso get e set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
