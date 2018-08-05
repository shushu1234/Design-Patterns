package com.liuyao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuyao
 * @date 2018/08/05
 */
public class VoteManager {
    private VoteState voteState;
    //记录用户投票的结果，Map<String,String>对应Map<用户名称，投票的选项>
    private Map<String ,String > mapVote=new HashMap<>();
    //记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票的次数>
    private Map<String,Integer> mapUserCount=new HashMap<>();
    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user,String voteItem){
        //1.为该用户增加投票次数
        //从记录中取出该用户已有的投票次数
        Integer oldVoteCount=mapUserCount.get(user);
        if (oldVoteCount==null){
            oldVoteCount=0;
        }
        oldVoteCount+=1;
        mapUserCount.put(user,oldVoteCount);

        if (oldVoteCount==1){
            voteState=new NormalVoteState();
        } else if (oldVoteCount > 1 && oldVoteCount < 5){
            voteState=new NoRepeatVoteState();
        }else {
            voteState=new BlackVoteState();
        }

        //然后转调状态对象来进行相应的操作
        voteState.vote(user,voteItem,this);
    }
}
