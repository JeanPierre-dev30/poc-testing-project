package com.lolaya.webclient.rxjava3;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.adapter.rxjava.RxJava3Adapter;

public class RxJavaWebClientExample {
    private final WebClient webClient;

    // Constructor para inicializar WebClient
    public RxJavaWebClientExample() {
        this.webClient = WebClient.builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    // Método para obtener todas las publicaciones como Observable
    public Observable<PostEntity> getPosts() {
        return RxJava3Adapter.fluxToObservable(
                webClient.get()
                        .uri("/posts")
                        .retrieve()
                        .bodyToFlux(PostEntity.class)
        );
    }

    // Método para crear una nueva publicación como Single
    public Single<PostEntity> createPost(PostEntity newPost) {
        return RxJava3Adapter.monoToSingle(
                webClient.post()
                        .uri("/posts")
                        .bodyValue(newPost)
                        .retrieve()
                        .bodyToMono(PostEntity.class)
        );
    }
}
