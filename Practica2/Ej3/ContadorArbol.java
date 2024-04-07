package Practica2.Ej3;

import Practica2.BinaryTree;

public class ContadorArbol{

    public static int numerosPares(BinaryTree<Integer> arbol){
        if (arbol == null) {
            return 0;
        }

        if (arbol.isLeaf() && (arbol.getData()%2 == 0)) {
            return 1;
        }

        int cant = 0;
        if (arbol.getData()%2 == 0) {
            cant++;
        }

        if (arbol.hasLeftChild()) {
            cant += numerosPares(arbol.getLeftChild());
        }

        if (arbol.hasRightChild()) {
            cant += numerosPares(arbol.getRightChild());
        }

        return cant;
    }
}