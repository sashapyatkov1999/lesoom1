package Homework4.advanced;

public class Brand {
    private Store[] stores;
    public Brand(Store[] stores) {
        this.stores = stores;
    }
    public void getTick(){
        for (Store store: stores){
            store.getClick();
        }
    }
}
