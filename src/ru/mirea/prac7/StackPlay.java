package ru.mirea.prac7;

import java.util.*;

public class StackPlay {
    private static final int NUM = 5;
    private static Scanner in = new Scanner(System.in);
    private static Stack<Integer> player1;
    private static Stack<Integer> player2;
    private static final List<Integer> CARDS = new LinkedList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

    public static boolean playerCards(boolean isFirst){
        boolean result;
        if(isFirst){
           player1 = new Stack<>();
           String line = in.nextLine();
           result = checkAndPush(line.replaceAll(" ",""),isFirst);
        } else {
           player2 = new Stack<>();
           String line = in.nextLine();
           result = checkAndPush(line.replaceAll(" ",""),isFirst);
        }
        return result;
    }

    public static boolean checkAndPush(String s, boolean isFirst){
        String replacedStr = "";
        for(int i = s.length()-1; i >= 0; i--){
            replacedStr+=s.charAt(i);
        }

        if(isFirst){
            for(Character ch:replacedStr.toCharArray()){
                Integer charInInt = Integer.parseInt(String.valueOf(ch));
                if(CARDS.contains(charInInt)){
                    player1.add(charInInt);
                    CARDS.remove(charInInt);
                } else{
                    System.out.println("Вы не можете выбрать данную карту");
                    return false;
                }
            }
        } else {
            for(Character ch:replacedStr.toCharArray()){
                Integer charInInt = Integer.parseInt(String.valueOf(ch));
                if(CARDS.contains(charInInt)){
                    player2.add(charInInt);
                    CARDS.remove(charInInt);
                } else{
                    System.out.println("Вы не можете выбрать данную карту");
                    return false;
                }
            }
        }
        return true;
    }

    public static void play(){
        int k = 0;
        while(!player1.isEmpty() && !player2.isEmpty() && k < 107){
            int card1 = player1.pop();
            int card2 = player2.pop();

            if(card1 == 0  && card2 == 9){
                player1.add(0,card1); //Добавление по нулевому индексу, в противном случае мы будем работать с одними
                player1.add(0,card2);  //и теми же картами
            } else if(card2 == 0 && card1 == 9){
                player2.add(0,card1);
                player2.add(card2);
            } else if(card1 > card2){
                player1.add(0,card1);
                player1.add(0,card2);
            } else {
                player2.add(0,card1);
                player2.add(0,card2);
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
        System.out.println("Введите карты для первого игрока.");
        if(playerCards(true)){
            System.out.println("Была введена корректная колода карт.");
        } else {
            System.out.println("Была введена некорректная колода карт.");
            return;
        }

        if(playerCards(false)){
            System.out.println("Была введена корректная колода карт.");
        } else {
            System.out.println("Была введена некорректная колода карт.");
            return;
        }
        play();
    }
}
