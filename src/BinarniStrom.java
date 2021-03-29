public class BinarniStrom {
    private  long[] a;
    private int nElems;
    //binarni strom pomocou find() metody

    //Find metoda bude hladať špecifický item po opakovanom delení na polku
    public BinarniStrom(int max){
        a = new long[max];
        nElems = 0;
    }
    public int size(){
        return nElems;
    }
    public int find ( long searchKey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true){
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn]==searchKey)
                return curIn;      //naslo
            else if (lowerBound > upperBound)
                return nElems; // nenaslo
            else {              // dlzka delenia
                if (a[curIn] < searchKey){
                    lowerBound = curIn + 1; // vyzsia polka
                }else {
                    upperBound = curIn - 1; // nizsia polka

                }

            }
        }
    }
    public void insert ( long value){ // da element do arrayu
        int j;
        for (j = 0; j < nElems; j++)  //najde kde ide
            if (a[j] > value)          //linearny nález
                break;
        for (int k = nElems; k > j; k--) // vacšie dava vyžšie
            a[k] = a [k - 1];
        a[j] = value; // vloźí ho
        nElems++;     // zvačší sa velkost
     }
    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems) // neviem ho nast
            return false;
        else // nasiel
        {
            for (int k = j; k < nElems; k++) // vacšie posune dole
                a[k] = a[k + 1];
            nElems--; // znizi velkost
            return true;
        }
    }
    public void display (){

        for (int j = 0; j<nElems; j++)
            System.out.print(a[j] + " ");
            System.out.println();

    }

    public static void main(String[] args) {
        int maxSize = 100;
        BinarniStrom arr;
        arr = new BinarniStrom(maxSize);

        arr.insert(77); // vlozime 10 hodnôt
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        int searchkey = 66;
        if (arr.find(searchkey) != arr.size())
            System.out.println("found " + searchkey);
        else {
            System.out.println("cant find " +searchkey);
        }

        arr.display();

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.size();
        arr.display();
    }
}
