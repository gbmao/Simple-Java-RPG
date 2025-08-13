package interfaces;

public class Menu {

    public static void menu() {

        for (int row = 1; row <= 25; row++) {

            for (int column = 1; column <= 100; column++) {

                // print superior and inferior border
                if (row == 1 || row == 25) {
                    System.out.print("-");
                } else

                    //print lateral border
                    if (column == 1 || column == 100) {
                        System.out.print("|");
                    } else
                        System.out.print(" ");
            }

            System.out.println();

        }

    }


}
