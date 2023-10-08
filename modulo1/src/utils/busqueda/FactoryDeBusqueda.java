package utils.busqueda;

import utils.sorting.sorters.Sorter;

public class FactoryDeBusqueda {
    public static Sorter getSearcher(MetodosDeBusqueda method) {
        Sorter s;
        switch (method) {
            case LINEAR:
                s = new Lineal();
                break;
            case BINARY:
                s = new Binaria();
                break;
            default:
                s = null;
        }
        return s;
    }
}
