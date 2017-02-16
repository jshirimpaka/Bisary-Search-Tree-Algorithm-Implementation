package myTree;

// Binary Search Tree Algorith Implementation

// In this tree class algorithm,five classes are created
// so that the user can inteface with the tree in 1)insert an item
// 2)finding an item, and 3)preordering, 4)postordering and 5)ordering transversal

public class BinarySearchTree{
	Node root;
	
	//This class returns true if an item is successfully inserted
	// in the tree, otherwise(i.e if there is a duplicate)it returns false
	public boolean inserting (int val){
		if(root == null){
			root = new Node (val);
			return true;
		}else{
			return root.inserting(val);
			
		}
	}
	
	// This class return true if an item is present in the tree,
	// otherwise, it returns false
   public boolean finding(int val){
	   if(root == null){
		   return false;
	   }else{
		   return root.finding(val);
	   }
   }
   
   public void preordering(){
	   if(root != null){
		   System.out.println("Preorder");
		   root.preordering();
	   }
   }
   
   public void postordering(){
	   if(root != null){
		   System.out.println("Postorder");
		   root.postordering();
	   }
   }
   
   public void ordering(){
	   if(root != null){
		   System.out.println("order");
		   root.ordering();
	   }
   }
	
	private class Node{
		private Node leftChild;
		private Node rightChild;
		private int data;
		
		private Node(int Value){
			data = Value;
		}
		
		@SuppressWarnings("unused")
		private boolean inserting(int myval){
			boolean add = false;
			
			if(this == null){
				this.data = myval;
				return true;
			
			}else{ 
				if(myval < this.data){
					if(this.leftChild == null){
						this.leftChild = new Node(myval);
						return true;
					}else{
						add = this.leftChild.inserting(myval);
					
				}
			}
			else if(myval > this. data){
				if (this.rightChild == null){
					this.rightChild = new Node(myval);
					return true;	
				}else{
					add = this.rightChild.inserting(myval);
				}
				
			}
			
		}
			return add;
	}
		@SuppressWarnings("unused")
		private boolean finding(int myval){
			boolean foundNber = false;
			if(this == null){
				return false;
			}else{
				if(myval == this. data){
					return true;
				}else if(myval <this.data && this.leftChild != null){
					foundNber = this.leftChild.finding(myval);
				}else if(myval > this.data && this.rightChild != null){
					foundNber = this.rightChild.finding(myval);
				}
			}
			return foundNber;
		}
		
		private void preordering(){
			if(this != null){
				System.out.println(this.data);
				if(this.leftChild !=null){
					this.leftChild.preordering();
		
				}else if(this.rightChild !=null){
					this.rightChild.preordering();
				}
			}
		}
		
		private void postordering(){
			if(this != null){
				
				if(this.leftChild !=null){
					this.leftChild.postordering();
		
				}else if(this.rightChild !=null){
					this.rightChild.postordering();
				}
				System.out.println(this.data);
			}
		}
		
		private void ordering(){
			if(this != null){
				
				if(this.leftChild !=null){
					this.leftChild.ordering();
					System.out.println(this.data);
			    }else if(this.rightChild !=null){
					this.rightChild.ordering();
				}
				
			}
		}
  }
}


	
