package org.marvin.application;

import java.util.*;

public class electionProblem {
    public static void main(String[] args) {
        Map<String, Integer> votacao = new HashMap<>();

        votacao.merge("Ana", 20, Integer::sum);
        votacao.merge("Pedro", 5, Integer::sum);
        votacao.merge("Ana", 15, Integer::sum);
        votacao.merge("Pedro", 10, Integer::sum);

        for(String key : votacao.keySet()) {
            System.out.println(votacao.get(key));
        }
    }
}
