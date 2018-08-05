package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class NoRepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
