package trees.binary;

import trees.binary.search.BST;

public class Main {
    public static int order = 0;

    public static void main(String[] args) {

        BST tree = new BST();
        tree.add(10);
        tree.add(5);
        tree.add(7);
        tree.add(15);
        tree.add(6);
        System.out.println(tree);
        System.out.println();
        System.out.println(tree.findMin());
        System.out.println();
        System.out.println(tree.findMax());
    }
    //notes from js

    //search tree function/method
//recursive function that goes through itself to build new nodes
    //if a value exists then it goes to the next node
    //if a value does not exist then it creates the node and returns

    // left sided nodes


    //from findmin
    //goes through the tree from the top and because the lower values
    //were put to the left node of the root and previous nodes
    //all we need to do to find the minimum is search all the way to the left

    //Examples of removals
//node has no left children example if number 40
//node has no right children example of number 12
//node has two children example of number 14

    //(parenthesis is what will happen after removal)
    //                            25
    //                14(15)/             \37
    //             12(5)/     \19      29/     \40(69)
    //          5(1)/ \(7)  15/(null)               \69(null)
    // 1(null)/      \7(null)


    //                            My visualization of binary tree FINAL
//
//                                          25
//                                     14/      \37
//                                   12/ \19   29/ \40
//                                  5/  15/         \69
//                                1/ \7              max
//                              min
}
