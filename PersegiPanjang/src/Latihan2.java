
public class Latihan2 {
    public static void main(String[] args) {

        //nested for => 2x

        //Persegi Panjang Bintang

        // *****
        // *   *
        // *   *
        // *   *
        // *****

        for(int i = 1;i<=5;i++){
            for (int j = 1;j<=5;j++){

                if(i == 1 || i == 5){
                    System.out.print("*");
                }

                if(i >= 2 && i <= 4){
                    if(j == 1 || j == 5){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
    }
}
