public class Rege extends PiesaSah{

    public Rege(int i, int j, String nume){
        super(i,j,nume);
    }
    public void mutaPiesa(int new_coordX, int new_coordY){
        if(Tabla.tabla[new_coordX][new_coordY] == null){
            Tabla.tabla[new_coordX][new_coordY] = Tabla.tabla[coordX][coordY];
            Tabla.tabla[coordX][coordY] = null;
            coordX = new_coordX;
            coordY = new_coordY;
        }else{
            Tabla.tabla[new_coordX][new_coordY] = Tabla.tabla[this.coordX][this.coordY];
            Tabla.tabla[this.coordX][this.coordY] = null;
            coordX = new_coordX;
            coordY = new_coordY;

        }
    }
}