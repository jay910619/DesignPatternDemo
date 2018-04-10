package com.example.jc.myapplication.state;

/**
 * @author jc
 * @time 2018/3/30 下午3:27
 * @desc
 */

public class PrimaryState implements State {

    int point;
    ForumAccount mAccount;

    public PrimaryState(ForumAccount account) {
        account.setStateName("少侠");
        this.point = account.getPoint();
        this.mAccount = account;
    }

    @Override
    public void downLoadFile(int score) {
        System.out.println("对不起，" + mAccount.getName() + ",您没有下载文件的权限！");
    }

    @Override
    public void posted(int score) {
        System.out.println(mAccount.getName() + "发布留言，增加" + score + "积分");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为" + mAccount.getPoint() + " 当前级别为" + mAccount.getStateName());
    }

    @Override
    public void reply(int score) {
        System.out.println(mAccount.getName() + " 回复留言，增加" + score + "积分");
        this.point += score;
        checkState(score);
        System.out.println("剩余积分为：" + mAccount.getPoint() + " 当前级别为" + mAccount.getStateName());
    }

    @Override
    public void checkState(int score) {
        mAccount.setPoint(point);
        if (point >= 1000) {
            mAccount.setState(new HighState(mAccount));
        } else if (point >= 100) {
            mAccount.setState(new MiddleState(mAccount));
        }

    }
}