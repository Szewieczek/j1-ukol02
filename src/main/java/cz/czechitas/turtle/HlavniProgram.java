package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setPenColor(Color.magenta);
        zofka.setLocation(400, 400);

        Turtle bonifac;
        bonifac = new Turtle();
        bonifac.setPenColor(Color.cyan);
        bonifac.setLocation(800, 400);

        nakresliKolecko(zofka, 400);
        nakresliObdelnik(bonifac, 200, 50);
        nakresliRovnostrannyTrojuhelnik(zofka, 150);
        nakresliCtverec(bonifac, 90);

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

