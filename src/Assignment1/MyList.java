package Assignment1;

public class MyList {

    private int[] data;
    private int size;
    private static final int default_capacity = 100;


    public MyList(){
         data = new int[default_capacity];
         size = 0;
    }

    //Add ele
    public void add(int value){
         if(size == data.length){
             grow();
         }

         data[size] = value;
         size++;

    }

    private void grow(){
        int newCapacity = data.length*2;
        int[] newArray = new int[newCapacity];
        for(int i = 0; i<size; i++){
            newArray[i] = data[i];
        }
        data = newArray;
    }

    //get element by index
    public int get(int index){

        checkIndex(index);

         return data[index];
    }

    void removeByIndex(int index){
        checkIndex(index);

        for(int i = index; i<size - 1; i++){
            data[i] = data[i+1];
        }
       size--;

        data[size] = 0;

        shrink();
    }

    public boolean removeByValue(int value){
        for(int i = 0; i< size; i++){
            if(data[i] == value){
                removeByIndex(i);
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void display(){
        System.out.print("[ ");

        for (int i = 0; i < size; i++) {
            System.out.print(data[i]);

            if (i != size - 1)
                System.out.print(", ");
        }

        System.out.println(" ]");
    }

    private void shrink(){
        if(data.length<=default_capacity){
            return;
        }
        if(size<=data.length/4){
            int newCapacity = data.length/2;

            if(newCapacity < default_capacity)
                newCapacity = default_capacity;

            int[] newArray = new int[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = data[i];
            }

            data = newArray;
        }
    }

    private void checkIndex(int index){
        if(index<0 || index >= size){
            throw new IndexOutOfBoundsException(
                    "Invalid Index:" + index
            );
        }
    }
}
