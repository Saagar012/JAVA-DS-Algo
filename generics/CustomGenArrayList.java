import java.util.List;

public class CustomGenArrayList<T extends Number> {
    private static int DEFAULT_SIZE= 10;
    private Object [] data;
    private  static int [] data1 = new int[4];
    private int size = 0;
    private static int size1 = 0;

    
    public CustomGenArrayList(){
        // so we are going to create the instance of the generic type but we cannot do that in generics.
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(int num){
            if(isFull()){
             resize(); 
            }
            data[size++] = num;
    }

    public void getList( List <? extends Number> list){
        // here we can only send the value of type Number.
        // here we can send the value of type number as well as the subclass of number.

    }

    private void resize() {
        Object temp [] = new Object[data.length *2];
        //copy the current items in the new array.
        for (int i = 0 ; i < data.length; i++){
            temp[i] =  data[i];
        }
        data = temp;
    }

    public T remove (){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    public static void main(String[] args) {
    //    CustomArrayList list = new CustomArrayList();
    //     list.add(1);
    //     list.add(2);
    //     System.out.println(list);
    CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
    for (int i=0 ;i < 17 ; i ++){
        list.add(2*i);
    }
    System.out.println(list.get(4));
        
    }
    
}
