package org.example;

import com.google.gson.Gson;

public class Main
{
    public static void main(String[] args) {
        //   System.out.println("Hello");
        Gson gson = new Gson();
        String json = gson.toJson(new Person("Luba", "Pika"));
        System.out.println(json);

    }
}
