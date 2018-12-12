package com.pattern;

/**
 * 管理者-管理备份文件
 */
public class CareTaker {
    private Memento memento;//备份对象
    public CareTaker(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
