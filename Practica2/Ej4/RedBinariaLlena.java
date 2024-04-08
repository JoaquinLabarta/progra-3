package Practica2.Ej4;

import Practica2.BinaryTree;

public class RedBinariaLlena {
    public static int retardoReenvio(BinaryTree<Integer> arbol){
        if (arbol.isEmpty()) {
            return 0;
        }

        int total = 0;

        if (arbol.hasLeftChild() && arbol.hasRightChild()) {
            if (arbol.getLeftChild().getData() > arbol.getRightChild().getData()) {
                total += retardoReenvio(arbol.getLeftChild());
            } else total+= retardoReenvio(arbol.getRightChild());
        }

        total += arbol.getData();

        return total;
    }
}
