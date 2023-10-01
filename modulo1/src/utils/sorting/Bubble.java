package utils.sorting;

public class Bubble extends Sorter{
    @Override
    public void sort(int[] N) {
        var len = N.length;
        var swapped = true;
        while(swapped){
            swapped = false;
            for(int i=1; i< len; i++){
                COMPARACIONES++;
                if(N[i-1]>N[i]){
                    swap(N, i-1, i);
                    MOVIMIENTOS++;
                    swapped = true;
                }
            }
        }
    }



}
