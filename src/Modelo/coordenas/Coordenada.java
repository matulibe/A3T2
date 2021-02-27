package Modelo.coordenas;

//package tp2_entrega1;
public class Coordenada {
    private int x;
    private int y;

    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    // Constructor para pruebas debe desaparecer
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coordenada (Coordenada coordenada){
        this.x = coordenada.getX();
        this.y = coordenada.getY();
    }

    public void moverIzquierda(){
        this.x -= 1;
    }

    public void moverDerecha(){
        this.x += 1;
    }

    public void moverArriba(){
        this.y += 1;
    }

    public void moverAbajo(){
        this.y -= 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
