package utils.sorting;

public class Selection extends Sorter {

    @Override
    public void sort(int[] N) {
        for(int i=0; i<N.length-1; i++){
            int minIndex = i;

            for(int j=i+1; j<N.length; j++){
                COMPARACIONES++;
                if(N[minIndex]>N[j]){
                    minIndex = j;
                }
            }

            COMPARACIONES++;
            if(minIndex!=i){
                swap(N, minIndex, i);
                MOVIMIENTOS++;
            }
        }
    }

    @Override
    public int getCOMPARACIONES() {
        return super.getCOMPARACIONES();
    }

    @Override
    public int getMOVIMIENTOS() {
        return super.getMOVIMIENTOS();
    }
}
