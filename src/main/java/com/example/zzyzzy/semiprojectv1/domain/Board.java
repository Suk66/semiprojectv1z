package com.example.zzyzzy.semiprojectv1.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Board {
    private int bno;
    private String title;
    private String userid;
    private LocalDateTime regdate;
    private String thumbs;
    private String views;
    private String contents;
}


