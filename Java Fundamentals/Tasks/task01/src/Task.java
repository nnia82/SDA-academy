import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //vytvor scener pro vysku
        Scanner scanner= new Scanner(System.in);
        //načteni vysky a vahy od uzivatele
        //System.out.println("Zadej svou výšku v cm");
        int height = scanner.nextInt();
        //System.out.println("Zadej svou váhu v kg");
        float weight= scanner.nextFloat();

        //rozhodnuti podle vyšky
        if (height <=150 || weight> 180){
            System.out.println("I'm sorry you can't go!");
        }else {
            System.out.println("Fasten your seatbelt!");
        }
        scanner.close();
    }
}
