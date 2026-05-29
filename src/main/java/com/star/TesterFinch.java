package com.star;

public class TesterFinch {
    public static void main(String[] args) {
    FinalFinch bird = new FinalFinch("A");

    int Speed = 150;
    int Side = 1200;
    int SharpTurn = 850;
    int WideTurn = 450;

    // birdcl.setWheelVelocities (Speed, Speed, Side);

    // bird.setWheelVelocities (Speed, -Speed, SharpTurn);

bird.setMove("F", 15, 50);
bird.setTurn ("R", 120, 50);
bird.setMove("F", 20, 50);
bird.setTurn ("R", 75, 50);
bird.setMove("F", 15, 50);
bird.setTurn ("R", 100, 50);
bird.setMove("F", 15, 50);
}
}