package Modulo_1.Evidencia_1.utils;

import java.util.Optional;

public class Node<E> {
    public E data;
    public Optional<Node<E>> next;

    public Node(E data) {
        this.data = data;
        next = Optional.empty();

    }


}