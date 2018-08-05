package com.liuyao;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VoteManager vm = new VoteManager();
        for(int i=0;i<5;i++){
            vm.vote("u1","A");
        }
    }
}

//投票成功
//请不要重复投票
//请不要重复投票
//请不要重复投票
//进入黑名单