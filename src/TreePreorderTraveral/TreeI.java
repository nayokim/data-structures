package TreePreorderTraveral;


class Node{
    Node left, right;
    int data;
    public Node (int data){
        this.data = data;
    }
    //insert a node
    public void insert(int value){
        //take in a node and look to the left and right
        if (value <= data){
            if (left == null){
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null){
                right = new Node (value);
            } else {
                right. insert(value);
            }
        }
    }

    //try to find a vlaue
    public boolean contains(int value){
        if (value == data){
            return true;
        } else if(value < data){
            if (left == null){
                return false;
            } else{
                return left.contains(value);
            }
        } else {
            if (right == null){
                return false;
            } else {
                return right.contains(value);
            }
        }
    }
    public void printInOrder(){
        if (left!=null){
            left. printInOrder();
        }
        System.out.println(data);

        if (right !=null){
            right.printInOrder();
        }
        System.out.println(data);
    }
}



public class TreeI {
    //      tree
    //      ----
    //       j    <-- root / top node
    //     /   \  <-- lines are paths
    //    f      k  <-  parent
    //  /   \      \
    // a     h      z    <-- leaves
//Trees: Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures.
//Tree Vocabulary: The topmost node is called root of the tree. The elements that are directly under an element are called its children. The element directly above something is called its parent. For example, ‘a’ is a child of ‘f’, and ‘f’ is the parent of ‘a’. Finally, elements with no children are called leaves.
    //Why Trees?
    //1. One reason to use trees might be because you want to store information that naturally forms a hierarchy. For example, the file system on a computer:
    //
    //file system
    //-----------
    //     /    <-- root
    //  /      \
    //...       home
    //      /          \
    //   ugrad        course
    //    /       /      |     \
    //  ...      cs101  cs112  cs113
    //2. Trees (with some ordering e.g., BST) provide moderate access/search (quicker than Linked List and slower than arrays).
    //3. Trees provide moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists).
    //4. Like Linked Lists and unlike Arrays, Trees don’t have an upper limit on number of nodes as nodes are linked using pointers.
}



    /*traversing
                root
        //      ----
        //       B
        //     /   \
        //    A      C

     - inorder : left, then root, then right (A-> B -> C)
    - preorder ; root, then left then right (B- > A - > C)
    -postorder : left, then right then root (A - > C - B)
     */




