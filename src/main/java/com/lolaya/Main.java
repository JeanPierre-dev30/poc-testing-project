package com.lolaya;

import com.lolaya.webclient.rxjava3.PostEntity;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PostEntity postExample = new PostEntity(0, 101, "Nuevo Título", "Este es el contenido del nuevo post");
        postExample.setId(55);
        System.out.println(postExample.getId());
    }
}