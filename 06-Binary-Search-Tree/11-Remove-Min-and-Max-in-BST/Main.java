/*
 * @Author: your name
 * @Date: 2022-03-08 18:20:46
 * @LastEditTime: 2022-03-08 18:39:13
 * @LastEditors: Please set LastEditors
 * @Description: 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 * @FilePath: \java-algorithm\06-Binary-Search-Tree\11-Remove-Min-and-Max-in-BST\Main.java
 */
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args){

        BST<Integer> bst = new BST<>();
        Random random = new Random();

        int n = 100;

        for(int i = 0; i < n; i++)
            bst.add(random.nextInt(10000));

        ArrayList<Integer> nums = new ArrayList<>();
        while(!bst.isEmpty()){
            nums.add(bst.removeMin());
        }

        System.out.println(nums);

        for(int i = 1; i < nums.size(); i++)
            if(nums.get(i - 1) > nums.get(i))
                throw new IllegalArgumentException("Error");

        System.out.println("removeMin test completed.");


        for(int i = 0; i < n; i++){
            bst.add(random.nextInt(10000));
        }

        nums = new ArrayList<>();
        while(!bst.isEmpty()){
            nums.add(bst.removeMax());
        }

        System.out.println(nums);
        for(int i = 1; i < nums.size(); i++){
            if(nums.get(i - 1) < nums.get(i))
                throw new IllegalArgumentException("Error!");
        }
        System.out.println("removeMax test completed.");
    }
}
