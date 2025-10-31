public class StringTwoD {
    public static void main(String[] args) {
        String[][] avengers = new String[3][2];
          avengers[0][0] = "Iron Man";
        avengers[0][1] = "Thor";

        avengers[1][0] = "Hulk";
        avengers[1][1] = "Black Widow";

        avengers[2][0] = "Captain America";
        avengers[2][1] = "Hawkeye";
   
    
    for (int i = 0; i < avengers.length; i++) {
    for (int j = 0; j < avengers[i].length; j++) {
        System.out.print(avengers[i][j] + " ");
    }
    System.out.println();
}
    }
}
