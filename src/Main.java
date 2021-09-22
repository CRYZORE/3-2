import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int console=1;
        FurnitureShop exe=new FurnitureShop();
        Scanner consoleSc =new Scanner(System.in);
        while (console!=0){
            System.out.println("Интерфейс-терминал : :" +
                    "\n\n*1  Посмотреть каталог" +
                    "\n*0  Выход\n");
            console=consoleSc.nextInt();
            if(console==1){
                exe.katalog();
                System.out.println("\n*1   Купить стол" +
                        "\n*2   Купить диван" +
                        "\n*3 Выход");
                console=consoleSc.nextInt();
                if(console==1){
                    System.out.println("\nПокупка///////////////");
                    exe.tabKatalog();
                    System.out.println("Введите номер товара,либо нажмите 4 для возврата\n");
                    console=consoleSc.nextInt();
                    if (console==4){}
                    else {exe.buyTable(console);}
                }
                else if(console==2){
                    System.out.println("\nПокупка///////////////");
                    exe.sofKatalog();
                    System.out.println("\nВведите номер товара,либо нажмите 4 для возврата\n");
                    console=consoleSc.nextInt();
                    if (console==4){}
                    else {exe.byuSofa(console);}
                }

            }
            else console=0;
        }
//        exe.buyTable(3);
//        exe.katalog();
    }

}