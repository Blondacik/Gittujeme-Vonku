public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {//constructor
        a = new long[max];
        nElems = 0;
    }
    public long max (){
        int j;
        long max = a[6];
        for (j = 0; j < nElems; j++){
            if (a[j] > max){
                max = a[j];
            }
        }
        return max;
    }
    public long removeMax() {
        int j;
        long max = a[6];
        for ( j = 0; j < nElems; j++){
            if (a[j] > max){
                max = a[j];
            }
        }
        return max;
    }


    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey)
                break;
        }
        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;

        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++)
            {
            a[k] = a[k + 1];
            }
            nElems--;
                return true;

        }
    }
    public void display(){
        for (int j = 0; j <nElems; j++){
            System.out.print(a[j] + " ");
            System.out.print("");
        }
    }






    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        int searchKey = 35;
        if (arr.find(searchKey)){
            System.out.println("found " +searchKey);
        }else {
            System.out.println("cant find " +searchKey);
        }

        arr.delete(00);
        arr.delete(arr.max());
        arr.delete(99);

        arr.display();
        System.out.println();
        System.out.println("najvačšie číslo je " +arr.max());


        arr.delete(arr.removeMax());
        arr.display();
        arr.delete(arr.removeMax());
        System.out.println(" ");
        arr.display();
    }
}


