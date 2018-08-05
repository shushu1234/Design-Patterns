package com.liuyao;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public interface VoteState {
    public void vote(String user,String voteItem,VoteManager voteManager);
}
