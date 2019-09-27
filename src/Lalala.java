import java.util.Scanner;

public class Lalala {
    public static void main(String[] args) {
        String[] names = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name: ");
        Scanner input = new Scanner(System.in);
        String input_name = input.nextLine();
        boolean check=false;
        for (int i=0; i < names.length; i++) {
            if(input_name.equals(names[i])){
                check=true;
                System.out.println("Position of "+input_name+" = "+i);
                break;
            }
        }
        if(!check){
            System.out.println("Not found "+input_name);
        }
    }

}
