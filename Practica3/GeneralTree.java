package Practica3;

import java.util.List;

import Ej8.Queue;

import java.util.LinkedList;


public class GeneralTree<T> {

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>();

	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}

	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}

	public boolean hasChildren() {
		return children != null && !children.isEmpty();
	}

	public boolean isEmpty() {
		return this.data == null && !hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren()) {
			List<GeneralTree<T>> children = this.getChildren();
			if (children.contains(child))
				children.remove(child);
		}
	}

    public List<T> porNiveles(GeneralTree<T> tree) {
        List<T> result = new LinkedList<T>();
        GeneralTree<T> tree_aux;
        Queue<GeneralTree<T>> queue = new Queue<GeneralTree<T>>();
         queue.enqueue(tree);
         while (!queue.isEmpty()) {
         tree_aux = queue.dequeue();
         result.add(tree_aux.getData());
         List<GeneralTree<T>> children = tree_aux.getChildren();
         for (GeneralTree<T> child: children) {
         queue.enqueue(child);
         }
         }
         return result;
    }
}
