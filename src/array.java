public class array {


    public static void main(String[] args) {
        long[] intArray = new long[100];
        int nElems;
        int j;
        long searchKey;


        intArray[0] = 77;
        intArray[1] = 99;
        intArray[2] = 44;
        intArray[3] = 55;
        intArray[4] = 22;
        intArray[5] = 88;
        intArray[6] = 11;
        intArray[7] = 00;
        intArray[8] = 66;
        intArray[9] = 33;
        intArray[10] = 893;
        intArray[11] = 412;
        intArray[12] = 369;
        nElems = 10;

                for (j = 0; j < nElems; j++) {
           System.out.print(intArray[j] + " ");
        }
        System.out.println();
//        searchKey = 66;
//        for (j = 0; j < nElems; j++) {
//            if (intArray[j] == searchKey){
//                break;
//            }
//        }
//        if (j == nElems) {
//            System.out.println("cant find " + searchKey);
//        } else {
//            System.out.println("found " + searchKey);
//        }

        searchKey = 55;
        for (j = 0; j < nElems; j++){
            if (intArray[j] == searchKey){
                break;
            }
        }
        for (int k = j; k < nElems ; k++){
            intArray[k] = intArray[k + 1];
        }

        for (j = 0; j < nElems -1; j++){
            System.out.print(intArray[j] + " ");
        }


        }
    }









