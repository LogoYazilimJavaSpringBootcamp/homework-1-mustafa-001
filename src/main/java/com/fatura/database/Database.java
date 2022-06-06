package com.fatura.database;

import java.util.List;

public abstract class Database<T> {
    private final List<T> items;

    protected Database(List<T> items) {
        this.items = items;
    }

    public void add(T item){
       items.add(item);
    }
    public T get(int index){
       return items.get(index);
    }
    public List<T> getAll(){
        return this.items;
    }

    public void remove(T item){
        items.remove(item);
    }
}
