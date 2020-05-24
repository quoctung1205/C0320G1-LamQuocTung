package DataStructuresAndAlgorithmBasic.testCode;

import java.util.Iterator;

public class MyAbstractList<E> implements myList<E> {
    protected int size = 0;

    protected MyAbstractList(){
        
    }

    protected MyAbstractList(E[] Objects){
        for(int i=0; i< Objects.length; i++){
            add(Objects[i]);
        }
    }


    @Override
    public void add(E e) {
        add(size,e);
    }


    @Override
    public boolean contains(E e) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(E e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int lastIndexOf(E e) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean remove(E e) {
        if(indexOf(e) >= 0){
            return true;
        }else return false;
    }

    @Override
    public Object set(int index, E e) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int index, E e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

}