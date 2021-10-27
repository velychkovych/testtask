package main;

public class MyArrayListImpl implements MyArrayList {

    private String[] array;

    private int size;

    public String[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    private final static double COEFICIENT = 1.5;

    public MyArrayListImpl() {
        this.array = new String[0];
        this.size = 0;
    }

    public MyArrayListImpl(String[] array) {
        this.array = array;
        this.size = array.length;
    }

    @Override
    public void addElem(String s) {
        String[] newarray;
        if (size == 0) {
            this.array = new String[1];
        } else if (size + 1 >= (int) (size * COEFICIENT)) {
            newarray = new String[(int) (size * COEFICIENT) + 1];
            for (int i = 0; i < this.array.length; ++i) {
                newarray[i] = this.array[i];
            }
            this.array = newarray;
        }
        this.array[size] = s;
        size++;
    }

    @Override
    public String getElemByIndex(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Incorrect index");
        }
        return this.array[index];
    }

    @Override
    public String deleteElemByIndex(int index) {
        String deleted = this.array[index];
        for (int i = index; i < size - 1; ++i) {
            this.array[i] = this.array[i + 1];
        }
        this.array[size - 1] = null;
        size--;
        return deleted;
    }

    @Override
    public int deleteElemByValue(String elem) {
        int deletedIndex = -1;
        for (int i = 0; i < size; ++i) {
            if (elem.equals(this.array[i])) {
                deletedIndex = i;
                for (int j = i; j < size - 1; ++j) {
                    this.array[j] = this.array[j + 1];
                }
                size--;
                break;
            }
        }
        return deletedIndex;
    }

    @Override
    public int findIndex(String elem) {
        int index = -1;
        for(int i = 0;i < size;++i){
            if(this.array[i].equals(elem)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public boolean exists(String elem) {
        return findIndex(elem) != -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        for(int i = 0;i < size;++i){
            stringBuffer.append(this.array[i]).append(" ");
        }
        return stringBuffer.toString();
    }

    @Override
    public void print(String title) {
        System.out.println();
        System.out.println(title);
        System.out.println(this);
        System.out.println();
    }
}
