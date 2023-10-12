package org.example;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Loja> lojas = new HashMap<>();

    public static Loja getLoja(Integer nrUnidade){
        return lojas.get(nrUnidade);
    }
    public static void addLoja(Loja loja){
        lojas.put(loja.getNrUnidade(), loja);
    }
}
