package com.example.zzyzzy.semiprojectv1.domain;

<<<<<<< HEAD
import lombok.Builder;
import lombok.Data;
=======
import lombok.Data;
import lombok.Builder;
>>>>>>> upstream/master

@Data
@Builder
public class NewReplyDTO {
    private String comments;
    private String userid;
<<<<<<< HEAD
    private Integer ref;
    private Integer pno;


=======
    private Long ref;
    private Long pno;
>>>>>>> upstream/master
}
