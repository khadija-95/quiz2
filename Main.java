import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("pleas enter a number");
        int size =data.nextInt();

        String[] names = new String[size];
        for (int i = 0; i < size ; i++){
            System.out.println("pleas enter a name");
            names[i] = data.nextLine();
        }
        int number = data.nextInt();
        printShortNames(names,number);

    }
    public static void printShortNames(String[] names, int maxLength){
        for(String name : names){
            if(name.length()< maxLength){
                System.out.println("print names");
            }
        }
    }
}