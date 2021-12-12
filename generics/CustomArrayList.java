import java.util.ArrayList;

public class CustomArrayList {
    
    private static int DEFAULT_SIZE= 10;
    private int [] data;
    private  static int [] data1 = new int[4];
    private int size = 0;
    private static int size1 = 0;

    
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
            if(isFull()){
             resize(); 
            }
            data[size++] = num;
    }

    private void resize() {
        int temp [] = new int[data.length *2];
        //copy the current items in the new array.
        for (int i = 0 ; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove (){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
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
       CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        //working with the generics.
        
    }
}

    