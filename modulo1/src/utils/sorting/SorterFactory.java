package utils.sorting;


import utils.sorting.sorters.*;

public class SorterFactory {
    public static Sorter getSorter(MetodosDeOrdenamiento method){
        Sorter s;
        switch(method){
            case BUBBLE: s = new Bubble(); break;
            case SELECTION: s= new Selection(); break;
            case INSERTION: s= new Insertion(); break;
            case SHELL: s= new Shell(); break;
            case QUICK: s= new QuickSort(); break;
            case HEAP: s= new HeapSort(); break;
            case MERGE: s= new Merge(); break;
            default: s = null;
        }
        return s;
    }

    public static Sorter getSorterDOs(MetodosDeOrdenamiento method){
        return switch(method){

            case BUBBLE-> new Sorter(){
                public void sort(int[] N){
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
            };

            case SELECTION-> new Sorter(){
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
            };
            case INSERTION-> new Sorter(){
                public void sort(int[] N) {
                    for(int i=1; i<N.length; i++){

                        int j = i-1;
                        int current = N[i];

                        while( j>=0 && N[j]>current){
                            N[j+1] = N[j--];
                            COMPARACIONES++;
                            MOVIMIENTOS++;
                        }
                        N[j+1] = current;
                        MOVIMIENTOS++;
                    }
                }
            };
            case SHELL-> new Sorter(){
                public void sort(int[] N) {
                    int h = 1;
                    while(h < N.length / 3){
                        h = 3*h + 1;
                        COMPARACIONES++;
                    }
                    while(h >= 1){
                        COMPARACIONES++;
                        for(int i=h; i<N.length; i++){
                            int j = i;
                            COMPARACIONES++;
                            while(j >= h && N[j]<N[j-h]){
                                swap(N, j, j-h);
                                i = j-h;
                                COMPARACIONES++;
                                MOVIMIENTOS++;
                            }
                        }
                        h = h/3;
                    }
                }
            };
            case MERGE -> null;
            case QUICK -> null;
            case HEAP -> null;
            default -> throw new IllegalStateException("Unexpected value");


        };
    }
}
