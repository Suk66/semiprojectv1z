package com.example.zzyzzy.semiprojectv1.service;

import com.example.zzyzzy.semiprojectv1.domain.*;
import com.example.zzyzzy.semiprojectv1.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardMapper;
    @Value("${board.page-size}") private int pageSize;


    @Override
    public BoardListDTO readBoard(int cpg) {
        // cpg에 따라 시작위치값 계산
        int stnum = (cpg - 1) * pageSize;
        int totalItems = boardMapper.countBoard();
        List<BoardDTO> boards = boardMapper.selectBoard(stnum, pageSize);

<<<<<<< HEAD

        return new BoardListDTO(cpg, totalItems, pageSize, boards);
    }
=======
        return new BoardListDTO(cpg, totalItems, pageSize, boards);
    }

>>>>>>> upstream/master
    @Transactional
    @Override
    public BoardReplyDTO readOneBoardReply(int bno) {
        boardMapper.updateViewOne(bno);
        Board bd = boardMapper.selectOneBoard(bno);
        List<Reply> rps = boardMapper.selectReply(bno);

        return new BoardReplyDTO(bd, rps);
    }

//    @Override
//    public int countBoard() {
//        return boardMapper.countPagesBoard(pageSize);
//    }

    @Override
    public List<BoardDTO> findBoard(int cpg, String findtype, String findkey) {
        Map<String, Object> params = new HashMap<>();
        params.put("stnum", (cpg - 1) * pageSize);
        params.put("pageSize", pageSize);
        params.put("findtype", findtype);
        params.put("findkey", findkey);

        return boardMapper.selectFindBoard(params);
    }

    @Override
    public int countfindBoard(String findtype, String findkey) {
        Map<String, Object> params = new HashMap<>();
        params.put("pageSize", pageSize);
        params.put("findtype", findtype);
        params.put("findkey", findkey);

        return boardMapper.countFindBoard(params);
    }

    //@Override
    //public Board readOneBoard(int bno) {
<<<<<<< HEAD
    //    return boardMapper.selectOneBoard(bno);
    //}

    //@Override
    //public void readOneView(int bno) {
    //    boardMapper.updateViewOne(bno);
    //}

    @Override
    public boolean newBoard(NewBoardDTO newboardDTO) {
        int result = boardMapper.insertBoard(newboardDTO);
=======
    //     return boardMapper.selectOneBoard(bno);
    //}

    //@Override
    //public void readOneView(int bno) {
    //    boardMapper.updateViewOne(bno);
    //}

    @Override
    public boolean newBoard(NewBoardDTO newBoardDTO) {
        int result = boardMapper.insertBoard(newBoardDTO);
>>>>>>> upstream/master
        return result > 0;
    }

    @Override
    public boolean newReply(NewReplyDTO newReplyDTO) {
        int result = boardMapper.insertReply(newReplyDTO);
        return result > 0;
    }

<<<<<<< HEAD
//    @Override
//    public List<Reply> readReply(int pno) {
//        return boardMapper.selectReply(pno);
//    }
=======
    //@Override
    //public List<Reply> readReply(int pno) {
    //    return boardMapper.selectReply(pno);
    //}
>>>>>>> upstream/master

    @Override
    public boolean newComment(NewReplyDTO newReplyDTO) {
        int result = boardMapper.insertComment(newReplyDTO);
        return result > 0;
    }
<<<<<<< HEAD

=======
>>>>>>> upstream/master
}
