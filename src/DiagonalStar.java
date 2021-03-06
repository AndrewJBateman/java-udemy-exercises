public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number<5) {
            System.out.println("Invalid Value");
        } else
            for(int i = 0; i < number; i++) {
                for(int j = 0; j < number; j++) {
                    // print * where i or j = 0 (edges), i = j (down diagonal),
                    // j = no of rows - i + 1
                    if((j==0)||(i==0)||(i==number-1)||(i==j)||(j==number-1)||(j+1==number-i)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
