public class TestSah {
    public static void main(String[] args) {

    for(int i = 0; i < 8; i++){
        for(int j = 0; j < 8; j++){
            Tabla.tabla[i][j] = null;
        }
    }

   for(int j = 0; j < 8; j++){
       Tabla.tabla[1][j] = new Pion(1,j,"p");
       Tabla.tabla[6][j] = new Pion(6,j,"P");
   }

        Tabla.tabla[0][0] = new Tura(0,0,"t");Tabla.tabla[0][7] = new Tura(0,7,"t");
        Tabla.tabla[7][0] = new Tura(7,0,"T");Tabla.tabla[7][7] = new Tura(7,7,"T");
        Tabla.tabla[0][1] = new Cal(0,1,"c");Tabla.tabla[0][6] = new Cal(0,6,"c");
        Tabla.tabla[7][1] = new Cal(7,1,"C");Tabla.tabla[7][6] = new Cal(7,6,"C");
        Tabla.tabla[0][2] = new Nebun(0,2,"n");Tabla.tabla[0][5] = new Nebun(0,5,"n");
        Tabla.tabla[7][2] = new Nebun(7,2,"N");Tabla.tabla[7][5] = new Nebun(7,5,"N");
        Tabla.tabla[0][3] = new Rege(0,3,"k"); Tabla.tabla[7][3] = new Rege(7,3,"K");
        Tabla.tabla[0][4] = new Regina(0,4,"q");Tabla.tabla[7][4] = new Regina(7,4,"Q");

     /*   Tabla.tabla[1][3].mutaPiesa(3,3);
        Tabla.tabla[6][2].mutaPiesa(5,2);
        Tabla.tabla[0][2].mutaPiesa(5,7);
        Tabla.tabla[6][6].mutaPiesa(2,7);*/

        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(Tabla.tabla[i][j] != null){
                    System.out.print(Tabla.tabla[i][j].numePiesa);
                }else{
                    System.out.print("-");
                }

            }
            System.out.println();
        }
    }
}