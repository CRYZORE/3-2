public class Sofas extends ABS_furniture {
    int softness1to5 ;

    public int getSoftness1to5() {
        return softness1to5;
    }

    public Sofas(int softness1to5,String name,String type,int cost) {
        this.softness1to5 = softness1to5;
        this.setCost(cost);
        this.setName(name);
        this.setType(type);
    }

    @Override
    String check() {
        return "\nКачество: "+getName()+"\nМатериал: "+getType()+"\nМягкость 1-5: "+getSoftness1to5()+"\nЦена: "+getCost();
    }
}