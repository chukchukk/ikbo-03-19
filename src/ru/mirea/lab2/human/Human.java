package ru.mirea.lab2.human;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(){}

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Human {" +
                "параметры головы: " + head +
                "," + "\nноги: " + leg +
                "," + "\nрук: " + hand +
                '}';
    }
}
