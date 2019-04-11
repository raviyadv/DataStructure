package edu.array;

public class ArrayList<T> {
    private Object[] array;
    private int currentIndex;
    private static final int DEFAULT_LINKED_LIST_CAPACITY = 10;

    public ArrayList() {
        this.array = new Object[DEFAULT_LINKED_LIST_CAPACITY];
        this.currentIndex = 0;
    }

    public boolean add(T data) {
        array[currentIndex] = data;
        currentIndex++;
        return true;
    }

    public int currentIndexOfList() {
        return currentIndex;
    }

    public boolean insertAtPosition(int index, T data) {
        if (index > currentIndexOfList())
            return false;
        if (index < 0)
            return false;
        if (currentIndexOfList() == array.length - 1) {
            return false;
        }
        int j = currentIndexOfList();
        while (j >= index) {
            array[j + 1] = array[j];
            j--;
        }
        array[index] = data;
        ++currentIndex;
        return true;
    }

    public boolean delete(int index) {
        if (index > array.length || index > currentIndex)
            return false;
        int j = index;
        while (j < this.currentIndexOfList()) {
            array[j] = array[j + 1];
            j++;
        }
        currentIndex--;
        return true;
    }

    public <T> boolean linearSearch(T data) {
        boolean isInstance = array[0].getClass().isInstance(data);
        if (!isInstance)
            return false;
        for (int i = 0; i < this.currentIndexOfList(); i++) {
            //    Class clazz=data.getClass();
            //    if (clazz.cast(array[i]).equals(data))
            if (((T) array[i]).equals(data))
                return true;
        }
        return false;
    }

    public void printList() {
        for (Object data : array) {
            System.out.print(data + "  ");
        }
        System.out.println();
    }

    public static void reverseArray() {
        int[] array = {10, 5, 11, 45, 3, 56, 4, 3, 2, 5, 6, 3};
        int i = 0;
        int j = array.length-1;
        int temp = 0;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        for (int data : array)
            System.out.print(data + " ");
    }

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
       /* System.out.println(arrayList.currentIndexOfList());
        arrayList.printList();
        arrayList.insertAtPosition(2,150);
        arrayList.insertAtPosition(5,50);
        System.out.println(arrayList.currentIndexOfList());
        arrayList.printList();
        arrayList.delete(3);
        arrayList.delete(5);
        arrayList.printList();
        System.out.println(arrayList.currentIndexOfList());
        System.out.println(arrayList.linearSearch(300));
        System.out.println(arrayList.linearSearch(200));*/
        reverseArray();
    }

}
