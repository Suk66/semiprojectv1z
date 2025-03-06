package com.example.zzyzzy.semiprojectv1.service;

import com.example.zzyzzy.semiprojectv1.domain.*;

import java.util.List;

public interface BoardService {

    BoardListDTO readBoard(int cpg);

    BoardReplyDTO readOneBoardReply(int bno);

    List<BoardDTO> findBoard(int cpg, String findtype, String findkey);

    int countfindBoard(String findtype, String findkey);

//1.1    Board readOneBoard(int bno);

//1.2    void readOneView(int bno);

    boolean newBoard(NewBoardDTO newBoardDTO);

    boolean newReply(NewReplyDTO newReplyDTO);

//1.3    List<Reply> readReply(int pno);

    boolean newComment(NewReplyDTO newReplyDTO);



}
