package org.example;

public class main {
    public static void main(String[] args) {
        cofeeOrder board = new cofeeOrder();

        board.add("Masha");
        board.add("Andrej");
        board.add("Max");
        board.add("Sasha");

        board.draw();

        board.deliver();
        board.draw();

        board.deliver(33);
        board.draw();
    }
}