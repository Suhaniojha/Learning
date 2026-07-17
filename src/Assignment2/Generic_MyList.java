package Assignment2;

import java.util.Objects;

public class Generic_MyList<T> {

    private T[] arr;
    private int size;
    private static final int Default_Capacity = 100;

 public Generic_MyList(){
  arr = (T[]) new Object[Default_Capacity];
  size = 0;
 }

    //insert element
    public void add(T value){
     if(size == arr.length){
      grow();
     }
     arr[size] = value;
     size++;
    }

    //get element by index
    public T get(int index){
     checkIndex(index);
     return arr[index];
    }

    private void grow(){
     int newCapacity = arr.length*2;
     T[] newArr = (T[]) new Object[newCapacity];
     for(int i = 0; i< size; i++){
      newArr[i] = arr[i];
     }
     arr = newArr;
    }

    //remove element by index
    public void removeByIndex(int index){
       checkIndex(index);

       for(int i = index; i<size -1; i++){
        arr[i] = arr[i+1];
       }
       size--;

       arr[size] = null;
       shrink();

    }

    public boolean removeByValue(T value){
       for(int i = 0; i< size; i++){
        if(Objects.equals(arr[i], value)){
         removeByIndex(i);
         return true;
        }
       }
       return false;
    }

 public int size() {
  return size;
 }

 // Display elements
 public void display() {

  System.out.print("[ ");

  for (int i = 0; i < size; i++) {

   System.out.print(arr[i]);

   if (i != size - 1) {
    System.out.print(", ");
   }
  }

  System.out.println(" ]");
 }


 private void shrink() {

  if (arr.length <= Default_Capacity) {
   return;
  }

  if (size <= arr.length / 4) {

   int newCapacity = arr.length / 2;

   if (newCapacity < Default_Capacity) {
    newCapacity = Default_Capacity;
   }

   T[] newArr = (T[]) new Object[newCapacity];

   for (int i = 0; i < size; i++) {
    newArr[i] = arr[i];
   }

   arr = newArr;
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
