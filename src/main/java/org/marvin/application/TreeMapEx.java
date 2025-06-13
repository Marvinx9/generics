package org.marvin.application;

import java.util.Map;
import java.util.TreeMap;

// mais lento, acessa chave, valor. não permite chaves repetidas(sob-escreve o valor anterior). ordena os valores pela chave
public class TreeMapEx {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");

        cookies.put("phone", "988564455");

        cookies.remove("email");
        cookies.put("phone", "595798754");

        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("All cookies");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
