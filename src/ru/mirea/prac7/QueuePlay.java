package ru.mirea.prac7;

import java.util.*;

public class QueuePlay {
    private static final int NUM = 5;
    private static Scanner in = new Scanner(System.in);
    private static Queue<Integer> player1;
    private static Queue<Integer> player2;
    private static final List<Integer> CARDS = new LinkedList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    public static void playerCards(boolean isFirst){
        if(isFirst){
            player1 = new LinkedList<>();
            for(int i = 0; i < NUM; i++){
                Integer k = in.nextInt();   //Integer, потому что необхоимо из листа удалять объект
                if(CARDS.contains(k)){
                    player1.add(k);
                    CARDS.remove(k);
                } else {
                    System.out.println("Вы не можете выбрать данную карту. Введите корректное значение");
                    i--;
                }
            }
        } else {
            player2 = new LinkedList<>();
            for(int i = 0; i < NUM; i++){
                Integer k = in.nextInt();
                if(CARDS.contains(k)){
                    player2.add(k);
                    CARDS.remove(k);
                } else {
                    System.out.println("Вы не можете выбрать данную карту.");
                    i--;
                }
            }
        }
    }

    public static void play(){
        int k = 0;
        while(!player1.isEmpty() && !player2.isEmpty() && k < 107){
            int card1 = player1.remove();
            int card2 = player2.remove();

            if(card1 == 0  && card2 == 9){
                player1.add(card1);
                player1.add(card2);
            } else if(card2 == 0 && card1 == 9){
                player2.add(card1);
                player2.add(card2);
            } else if(card1 > card2){
                player1.add(card1);
                player1.add(card2);
            } else {
                player2.add(card1);
                player2.add(card2);
            }
            k++;
        }

        if(k == 107) {
            System.out.println("Botva");
            return;
        } else if(player1.isEmpty()){
            System.out.println("second " + k);
        } else {
            System.out.println("first" + k);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите карты для первого игрока:");
        playerCards(true);
        System.out.println("Введите карты для второго игрока: ");
        playerCards(false);
        play();
    }
}
