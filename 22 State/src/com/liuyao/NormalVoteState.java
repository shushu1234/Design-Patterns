package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class NormalVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user,voteItem);
        System.out.println("投票成功");
    }
}
