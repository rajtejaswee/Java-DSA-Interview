# Java-DSA-Interview
Java, Data Structure and Algorithms questions along with solutions for Interviews.

## Linked List 
- A Linked List is a linear data structure in which elements are stored in nodes, and each node points to the next node in the sequence. Unlike arrays, linked lists do not store elements in contiguous memory locations.

### Types of Linked List:
- Singly Linked List – Each node points to the next node.
- Doubly Linked List – Each node points to both the next and previous nodes.
- Circular Linked List – The last node points back to the first node.

### Implementations:
- [Node Class, Singly Linked List](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Linked_List/Node.java)
- [Insertion in Singly Linked List](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Linked_List/Insertion.java)
- [Deletion in Singly Linked List](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Linked_List/Deletion.java)
- [Node Class, Doubly Linked List]()

### Question on Linked List:
**Singly Linked List**
- [Convert Array to Linked List](https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list)
- [Linked List Insertion at the End](https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion)
- [Delete a node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/description/)
- [Count Linked List Nodes](https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list)
- [Search in Linked List](https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326)
- [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/)
- [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/)
- [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/description/)
- [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/description/)

**Doubly Linked List**
- [Introduction to Doubly Linked List](https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-doubly-linked-list)
- [Doubly linked list Insertion at given position
  ](https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insert-a-node-in-doubly-linked-list)
- [Delete in a Doubly Linked List](https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=delete-node-in-doubly-linked-list)
- [Reverse a Doubly Linked List
  ](https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-doubly-linked-list)

## Dynamic Programming
### Dp on Strings:

- [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/description/)

---
## Trees
Tree data structure is a hierarchical structure that is used to represent and organize data in the form of parent child relationship. The following are some real world situations which are naturally a tree.<br>
The topmost node of the tree is called the root, and the nodes below it are called the child nodes. Each node can have multiple child nodes, and these child nodes can also have their own child nodes, forming a recursive structure. <br> 
[**Representation of Trees**](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Trees/TreeNode.java)
### Traversal Techniques:
- [InOrder](), [Articles](https://www.geeksforgeeks.org/inorder-traversal-of-binary-tree/)
- [PreOrder](), [Articles](https://www.geeksforgeeks.org/preorder-traversal-of-binary-tree/)
- [PostOrder](), [Articles](https://www.geeksforgeeks.org/postorder-traversal-of-binary-tree/)
- [LevelOrder](), [Articles](https://www.geeksforgeeks.org/level-order-tree-traversal/)

### Foundational/Easy Problems:
- [Height of the Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/)
## Graphs
### Implementation:
| Feature                | Adjacency Matrix | Adjacency List        |
|------------------------|-----------------|-----------------------|
| **Space Complexity**   | O(V²)           | O(V + E)              |
| **Best for**          | Dense graphs (many edges) | Sparse graphs (few edges) |
| **Edge insertion**     | O(1)             | O(1)                  |
| **Checking edge existence** | O(1)     | O(degree of vertex)   |
| **Traversing neighbors** | O(V)        | O(number of neighbors) |

**Adjacency List** is better for most real-world graphs because it **saves space**.  
**Adjacency Matrix** is better when **frequent edge lookups** are needed.
- [Implementation of Graph using adjacency matrix.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/GraphMatrix.java)
- [Implementation of Graph using adjacency list.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/GraphList.java)
### Graph Conversion:

| Conversion        | Steps |
|-------------------|------------------------------------------------------------------|
| **Matrix → List** | Traverse the matrix and for each `1`, add the corresponding index to the adjacency list. |
| **List → Matrix** | Iterate through the adjacency list and set `matrix[i][j] = 1` if an edge exists. |

This ensures **efficient** graph representations depending on whether the graph is dense (use a matrix) or sparse (use a list).

[Code Implementation](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/GraphConversion.java)
### Connected Components: 
- for any traversal use a visited array of the size node+1.
- pseudocode:
  <pre><code>for(int i = 0; i < node + 1; i++) { 
  if(!vis[i]) { 
      traversal(i); 
     } 
  } </code></pre>

### Breadth-First Search(BFS):
- In BFS, we start with a “starting” node, mark it as visited, and push it into the queue data structure.
  In every iteration, we pop out the node ‘v’ and put it in the solution vector, as we are traversing this node.
  All the unvisited adjacent nodes from ‘v’ are visited next and are pushed into the queue. The list of adjacent neighbors of the node can be accessed from the adjacency list.
- Level breadth wise height.
- We have to see the distance from each node breadth wise.
- [Code Implementation.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/BFS.java)

### Depth-First Search(DFS):
- DFS is a traversal technique which involves the idea of recursion and backtracking. DFS goes in-depth, i.e., traverses all nodes by going ahead, and when there are no further nodes to traverse in the current path, then it backtracks on the same path and traverses other unvisited nodes. 
- Algorithm: Recursion
- [Code Implementation.](https://github.com/rajtejaswee/Java-DSA-Interview/blob/main/src/Graphs/DFS.java)

### Questions on BFS and DFS:
- [Number of Provincess](https://leetcode.com/problems/number-of-provinces/description/)
- [Rotten Oranges](https://leetcode.com/problems/rotting-oranges/description/)
- [Flood Fill Algorithm](https://leetcode.com/problems/flood-fill/description/)
- [Undirected Graph Cycle](https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=detect-cycle-in-an-undirected-graph)