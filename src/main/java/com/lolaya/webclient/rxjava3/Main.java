package com.lolaya.webclient.rxjava3;

public class Main {

    public static void main(String[] args) {
        RxJavaWebClientExample example = new RxJavaWebClientExample();

        // Obtener todas las publicaciones
        System.out.println("Fetching posts...");
        example.getPosts().blockingSubscribe(
                post -> System.out.println("Post: " + post),
                throwable -> System.err.println("Error fetching posts: " + throwable.getMessage())
        );

        // Crear una nueva publicación
        PostEntity newPost = new PostEntity(0, 101, "Nuevo Título", "Este es el contenido del nuevo post");
        System.out.println("\nCreating a new post...");
        example.createPost(newPost).blockingSubscribe(
                post -> System.out.println("Created Post: " + post),
                throwable -> System.err.println("Error creating post: " + throwable.getMessage())
        );

    }
}
