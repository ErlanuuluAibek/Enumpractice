import java.util.Scanner;

public class WorkingTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ай жазыныз");
        Winter winter=Winter.valueOf(scanner.nextLine().toUpperCase());
        switch (winter){
            case DECEMBER -> System.out.println("в конце декабря отмечают новый год");
            case JANUARY -> System.out.println("месяц январь - Вершина зимы");
            case FEBRUARY -> System.out.println("Канун весны");
        }
    }
}