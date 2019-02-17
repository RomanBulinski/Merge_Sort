public class Main {

    public static void main(String[] args) {

        int[] array = {9,8,7,5,1,2,9,8,7,5,6,2};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort( array,0, array.length-1 );

        for( int number : array){
            System.out.print( number  + " ");
        }
    }
}
