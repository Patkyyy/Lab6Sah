public abstract class PiesaSah {

    public String numePiesa;
    public int coordX, coordY;

    public PiesaSah(int coordX,int coordY,String nume){
        this.coordX = coordX;
        this.coordY = coordY;
        this.numePiesa = nume;
    }
    public abstract void mutaPiesa(int coordX, int coordY);

}
