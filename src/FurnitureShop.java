public class FurnitureShop {
    int sofN=3;
    int tabN=3;
    Sofas[] sofasKat = new Sofas[sofN];
    Tables[] tablesKat = new Tables[tabN];
    public FurnitureShop() {
        sofasKat[0]=new Sofas(3,"Синий диван","Металл",20999);
        sofasKat[1]=new Sofas(5,"Изысканый диван","Красное дерево",100000);
        sofasKat[2]=new Sofas(1,"Дешевый диван","Фанера",9999);
        tablesKat[0]=new Tables('N',"Круглый стол","Металл",7999);
        tablesKat[1]=new Tables('N',"Изысканный стол","Красное дерево",73000);
        tablesKat[2]=new Tables('Y',"Iстол","Алюмиинй",80999);
    }
    public void sofKatalog(){
        System.out.println("\nДиваны:");
        for (int i = 0; i < sofN; i++) {
            System.out.print("\n"+(i+1)+") Название: "+sofasKat[i].getName()+"   Материал: "+sofasKat[i].getType()+"   Уровень мягкости 1-5: "+sofasKat[i].getSoftness1to5()+"   Цена: "+sofasKat[i].getCost());
        }
    }
    public void tabKatalog(){
        System.out.print("\nСтолы:\n");
        for (int i = 0; i < tabN; i++) {
            System.out.print("\n"+(i+1)+") Название: "+tablesKat[i].getName()+"   Материал: "+tablesKat[i].getType()+"   Возможность расширения: "+tablesKat[i].getMoreSpace()+"   Цена: "+tablesKat[i].getCost());
        }
    }
    public void katalog(){
        System.out.println("Каталог : :");
        sofKatalog();
        tabKatalog();
    }
    public void byuSofa(int n){
        n--;
        for (; n < sofasKat.length-1; n++) {
            sofasKat[n]=sofasKat[n+1];
        }
        sofasKat[sofasKat.length-1]=null;
        this.sofN--;
    }
    public void buyTable(int n){
        n--;
        for (; n < tablesKat.length-1; n++) {
            tablesKat[n]=tablesKat[n+1];
        }
        tablesKat[tablesKat.length-1]=null;
        this.tabN--;
    }
}