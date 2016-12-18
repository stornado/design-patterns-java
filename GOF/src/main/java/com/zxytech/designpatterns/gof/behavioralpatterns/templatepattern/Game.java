package com.zxytech.designpatterns.gof.behavioralpatterns.templatepattern;

/**
 * Created by ryan on 2016/12/18.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // 模板
    public final void play() {
        // 初始化游戏
        initialize();

        // 开始游戏
        startPlay();

        // 结束游戏
        endPlay();
    }
}
