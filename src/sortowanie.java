import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class sortowanie {
    public static void main(String[] args) {

    }

    static int sort(int[] tab){
        int flag =0;
        for(int g =0;g<tab.length;g++){
            for(int j=0;j<tab.length-1;j++){
                if(tab[j]>=tab[j+1]){
                    flag = tab[j+1];
                    tab[j+1]=tab[j];
                    tab[j]=flag;
                }
            }
            for(int i=0;i< tab.length;i++){
                System.out.print(tab[i]+" ");
            }
            System.out.println();
        }
        for(int i=0;i< tab.length;i++){
            System.out.print(tab[i]);
        }
        return 0;
    }
    static void silna(){
        Scanner usr_input = new Scanner(System.in);
        System.out.println("Podaj silnie");
        int N = usr_input.nextInt();
        double result = 1;
        int i = 1;
        while (i <= N) {
            result = result * i;
            System.out.print(result+" ");
            i++;
        }
        System.out.print(result);
    }
    static void zawody(){
        String[] names = {
                "Jan", "Piotr", "Michal", "Pawel", "Jakub",
                "Stefan", "Robert", "Mariusz", "Tadeusz", "Konrad"
        };
        int[] times = {
                56, 60, 51, 44, 66, 50, 49, 62, 43, 70
        };
        int[][] wyniki = new int[2][times.length];
        for(int i =0;i< times.length;i++){
            wyniki[1][i]= times[i];
        }
        for(int i =0;i< times.length;i++){
            wyniki[0][i]= i;
        }
        for(int i =0;i< times.length;i++){
            System.out.print(wyniki[1][i]+" ");
        }
        int flag1=0;
        int flag0=0;
        while (true) {
            try {
                System.out.println(
                        "Choose an option: 1 - calculate; 2 - exit program");
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(System.in));
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        for (int i = 0; i <= times.length; i++) {
                            for(int j =0;j<=times.length-2;j++){
                                if(wyniki[1][j]>=wyniki[1][j+1]){
                                    flag1 = wyniki[1][j+1];
                                    flag0 = wyniki[0][j+1];
                                    wyniki[1][j+1]=wyniki[1][j];
                                    wyniki[0][j+1]=wyniki[0][j];
                                    wyniki[1][j]= flag1;
                                    wyniki[0][j]= flag0;
                                }
                            }
                        }
                        break;
                    case 2:
                        return;
                    default:
                        System.out.println("Wrong option choose once again");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("You should write a number!");
            }

            for(int i =0;i< 3;i++){
                System.out.println(names[wyniki[0][i]] + " " + wyniki[1][i]);
            }
        }
    }
}

