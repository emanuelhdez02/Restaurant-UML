public class Table {
    private String name;
    private MenuItem[] order = new MenuItem[10];
    private int itemCount;

    public Table(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addItem(MenuItem k){
        order[itemCount] = k;
        itemCount++;
    }

    public MenuItem[] getItems() {
        return order;
    }
    public double getTotalPrice(){
        double yaWeeyy = 0;
        for (int i =0; i < itemCount; i++){
            yaWeeyy = yaWeeyy + itemCount;
        }
        return yaWeeyy;
    }
    public int determinePrepTime(){
        int y = 0;
        for(int i = 0; i < itemCount;i++){
            if(order[i].getPrepTime() > y){
                y = order[i].getPrepTime();
            }
        }
        return y;
    }

    public String toString() {
        return ("Table " + name + " Items: " + itemCount + " Total Time: " + determinePrepTime() + " and it cost $" + getTotalPrice());


    }
}

