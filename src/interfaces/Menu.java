package interfaces;

public class Menu {

    public static void menu() {

        for (int row = 1; row <= 25; row++) {

            for (int column = 1; column <= 100; column++) {

                String barra = "|";
                // print superior and inferior border
                if (row == 1 || row == 25) {
                    System.out.print("-");
                } else

                    //print lateral border
                    if (column == 1 || column == 100) {

                        // metodo de digitar algo
                        if(column == 1 && row == 20){
                            System.out.print("| ");
                            System.out.printf("%-98s", "testando o metodo de digitao"); // cuidado para nao consumir espaco alem do possivel
                        }else
                        System.out.printf("%-100s", barra);
                    }

//                    else
//                        System.out.print(" ");
            }

            System.out.println();

        }

    }


}
