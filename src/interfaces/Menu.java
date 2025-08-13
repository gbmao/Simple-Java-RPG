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

                        // metodo de digitar  algo: rowText deve ser inserido aqui
                        // inserido dentro de if para evitar repetir a barra 2x
                        if (!rowText(column, row, 20)) {
                            System.out.printf("%-100s", barra); // ajustar tamanho para se adequar a uma nova criacao de uma barra lateral
                        }
                    }

            }

            System.out.println();

        }

    }
    //boolean para evitar repeticao com o codigo que cria as barras laterais.
    // algum metodo melhor???
    public static boolean rowText(int column, int row, int rowTarget) {

        if (column == 1 && row == rowTarget) {
            System.out.print("| ");
            System.out.printf("%-98s", "testando o metodo de digitao"); // cuidado para nao consumir espaco alem do possivel
            return true;
        }
        return false;
    }


}
