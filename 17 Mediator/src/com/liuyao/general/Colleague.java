package com.liuyao.general;

/**
 * @author liuyao 2020/4/23 23:40
 * @version 1.0
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator _mediator){
        this.mediator=_mediator;
    }
}
