package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setPenColor(Color.magenta);
        zofka.setLocation(400, 200);

        Turtle bonifac;
        bonifac = new Turtle();
        bonifac.setPenColor(Color.green);
        bonifac.setLocation(800, 200);

        Turtle pankrac;
        pankrac = new Turtle();
        pankrac.setPenColor(Color.blue);
        pankrac.setLocation(1200, 500);

        nakresliZmrzlinu(bonifac);

        nakresliSnehulaka(zofka);

        nakresliMasinku(pankrac);
    }

    private void nakresliMasinku(Turtle pankrac) {
        nakresliObdelnik(pankrac, 200, 150);
        nakresliKolecko(pankrac, 480);
        nakresliObdelnik(pankrac, 100, -200);
        pankrac.penUp();
        pankrac.turnLeft(90);
        pankrac.move(60);
        pankrac.penDown();
        nakresliKolecko(pankrac, -200);
        pankrac.penUp();
        pankrac.move(100);
        pankrac.penDown();
        nakresliKolecko(pankrac, -200);
        pankrac.penUp();
        pankrac.move(40);
        pankrac.turnRight(90);
        pankrac.move(80);
        pankrac.turnLeft(180);
        pankrac.penDown();
        nakresliPravouhlyRovnoramennyTrojuhlenik(pankrac, 100);
    }

    private void nakresliSnehulaka(Turtle zofka) {
        zofka.turnRight(95);
        nakresliKolecko(zofka, 300);
        zofka.penUp();
        nakresliPulkruh(zofka, 300);
        zofka.turnLeft(180);

        zofka.penDown();
        nakresliKolecko(zofka, 500);
        zofka.penUp();
        nakresliPulkruh(zofka, 500);
        zofka.turnLeft(180);

        zofka.penDown();
        nakresliKolecko(zofka, 650);
        zofka.penUp();
        nakresliCtvrtkruh(zofka, -500);

        zofka.penDown();
        nakresliKolecko(zofka, 150);
        zofka.penUp();
        nakresliPulkruh(zofka, -500);

        zofka.penDown();
        nakresliKolecko(zofka, 150);
    }

    private void nakresliZmrzlinu(Turtle bonifac) {
        bonifac.turnRight(90);
        nakresliRovnostrannyTrojuhelnik(bonifac,100);
        bonifac.penUp();
        bonifac.turnLeft(90);
        bonifac.move(15);
        bonifac.turnRight(90);
        bonifac.move(2);
        bonifac.turnLeft(90);
        bonifac.penDown();
        nakresliKolecko(bonifac, 300);
    }

    private void nakresliPravouhlyRovnoramennyTrojuhlenik(Turtle turtle, double rameno) {
        double zakladna = Math.sqrt(2 * rameno * rameno);
        turtle.move(rameno);
        turtle.turnRight(90);
        turtle.move(rameno);
        turtle.turnRight(135);
        turtle.move(zakladna);
    }

    private void nakresliPulkruh(Turtle turtle, double obvod) {
        nakresliCtvrtkruh(turtle, obvod);
        nakresliCtvrtkruh(turtle, obvod);
    }

    private void nakresliCtvrtkruh(Turtle turtle, double obvod) {
        double delkaStrany = obvod / 36;
        for (int i = 0; i < 27; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight (10);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle turtle, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(120);
        }
    }

    private void nakresliCtverec(Turtle turtle, double delkaStrany) {
        for (int i = 0; i < 4; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight(90);
        }
    }

    private void nakresliObdelnik(Turtle turtle, double stranaA, double stranaB) {
        for (int i = 0; i < 2; i++) {
            turtle.move(stranaA);
            turtle.turnRight(90);
            turtle.move(stranaB);
            turtle.turnRight(90);
        }
    }

    private void nakresliKolecko(Turtle turtle, double obvod) {
        double delkaStrany = obvod / 36;
        for (int i = 0; i < 36; i++) {
            turtle.move(delkaStrany);
            turtle.turnRight (10);
            }
        }
    }
