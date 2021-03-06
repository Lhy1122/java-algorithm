public class ArrayStack<E> implements Stack<E>{
    Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getsize(){
        return array.getsize();
    }

    @Override
    public boolean isEmpty(){
        return array.isempty();
    }

    public int getcapacity(){
        return array.getcapacity();
    }

    @Override
    public void push(E e){
        array.addLast(e);
    }

    @Override
    public E pop(){
        return array.deleteLast();
    }

    @Override
    public E peek(){
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack : ");
        res.append('[');
        for(int i = 0; i < array.getsize(); i++){
            res.append(array.get(i));
        if(i != array.getsize() - 1)
            res.append(", ");
        }
        res.append("] top");
        return res.toString();
    }

}