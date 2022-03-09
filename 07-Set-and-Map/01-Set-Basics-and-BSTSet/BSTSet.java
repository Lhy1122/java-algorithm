/*
 * @Author: your name
 * @Date: 2022-03-09 22:12:56
 * @LastEditTime: 2022-03-09 22:57:53
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\07-Set-and-Map\01-Set-Basics-and-BSTSet\BSTSet.java
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {
    private BST<E> bst;
    
    public BSTSet(){
        bst = new BST<>();
    }

    @Override
    public int getSize(){
        return bst.size();
    }

    @Override
    public boolean isEmpty(){
        return bst.isEmpty();
    }

    @Override
    public void add(E e){
        bst.add(e);
    }

    @Override
    public boolean contains(E e){
        return bst.contains(e);
    }

    @Override
    public void remove(E e){
        bst.remove(e);
    }
}
