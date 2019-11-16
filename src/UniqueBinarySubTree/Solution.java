package UniqueBinarySubTree;

public class Solution {
    //Dynamic Programming
    public int numTrees(int n) {
        int[] numBST = new int[n+1];
        numBST[0] = 1;
        numBST[1] = 1;
        //Catalan's Numbers
        //F(i,n) = G(i-1) * G(n-i)
        //F(i,n) gives the number of possible BST given that i is the root, and n is the total number of nodes
        //which is equal to the total number of BST if (i-1) nodes * total num of BST if (n-i) nodes
        for(int asNode = 2; asNode<=n; ++asNode){
            for(int numNode=1; numNode <= asNode; ++numNode){
                numBST[asNode] += numBST[numNode-1] * numBST[asNode-numNode];
            }

        }
        return numBST[n];
    }
}
