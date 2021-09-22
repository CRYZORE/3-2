public class Tables extends ABS_furniture {
    char moreSpace;

    public Tables(char moreSpace,String name,String type,int cost) {
        this.moreSpace = moreSpace;
        this.setCost(cost);
        this.setName(name);
        this.setType(type);
    }

    public char getMoreSpace() {
        return moreSpace;
    }

    @Override
    String check() {
        return "\nКачество: "+getName()+"\nМатериал: "+getType()+"\nРасширяемый: "+getMoreSpace()+"\nЦена: "+getCost();
    }
}