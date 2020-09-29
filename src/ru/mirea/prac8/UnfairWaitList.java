package ru.mirea.prac8;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    public void remove(E element){
        content.remove(element);
    }

    public void moveToBack(){
        E elementToBack = content.poll();
        content.add(elementToBack);
    }

    @Override
    public String toString() {
        return "UnfairWaitList{" +
                "content = " + content +
                '}';
    }
}
