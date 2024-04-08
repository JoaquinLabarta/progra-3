package Practica2.Ej4;

import Practica2.BinaryTree;

public class Test{
    public static void main(String[] args) {
        BinaryTree<Integer> arbol = new BinaryTree<>(1);

        // Nivel 1
        arbol.addLeftChild(new BinaryTree<>(2));
        arbol.addRightChild(new BinaryTree<>(3));

        // Nivel 2
        arbol.getLeftChild().addLeftChild(new BinaryTree<>(4));
        arbol.getLeftChild().addRightChild(new BinaryTree<>(5));
        arbol.getRightChild().addLeftChild(new BinaryTree<>(6));
        arbol.getRightChild().addRightChild(new BinaryTree<>(7));

        // Nivel 3
        arbol.getLeftChild().getLeftChild().addLeftChild(new BinaryTree<>(8));
        arbol.getLeftChild().getLeftChild().addRightChild(new BinaryTree<>(9));
        arbol.getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(10));
        arbol.getLeftChild().getRightChild().addRightChild(new BinaryTree<>(11));
        arbol.getRightChild().getLeftChild().addLeftChild(new BinaryTree<>(12));
        arbol.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(13));
        arbol.getRightChild().getRightChild().addLeftChild(new BinaryTree<>(14));
        arbol.getRightChild().getRightChild().addRightChild(new BinaryTree<>(15));

        arbol.porNiveles(arbol);

        System.out.println("El total de retardo del arbol lleno es: "+RedBinariaLlena.retardoReenvio(arbol));
    }
}
