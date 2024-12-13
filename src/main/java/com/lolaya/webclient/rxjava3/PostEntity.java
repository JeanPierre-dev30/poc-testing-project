package com.lolaya.webclient.rxjava3;

import lombok.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PostEntity {

    @Getter @Setter
    private int userId;
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String body;

}
