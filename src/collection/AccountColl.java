package collection;

public class AccountColl<T>{
    private T id;
    private int sum;

    AccountColl(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() {return id;}
    public int getSum() {return sum;}

    public void setSum(int sum) {
        this.sum = sum;
    }
}
