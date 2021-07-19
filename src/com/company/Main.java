package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        Gameboard gameboard = new Gameboard();
//        gameboard.a6 = "x";
        for (int i = 0; i < 42; i++) {
            System.out.println(gameboard);
            System.out.println("Pick a column to drop your piece into (1 - 7) : ");
            int input = scan.nextInt();
            if (i % 2 == 0) {
                if (input == 1) {
                    if (gameboard.a6 == "_")
                        gameboard.a6 = "x";
                    else if (gameboard.a5 == "_")
                        gameboard.a5 = "x";
                    else if (gameboard.a4 == "_")
                        gameboard.a4 = "x";
                    else if (gameboard.a3 == "_")
                        gameboard.a3 = "x";
                    else if (gameboard.a2 == "_")
                        gameboard.a2 = "x";
                    else if (gameboard.a1 == "_")
                        gameboard.a1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                }
                if (input == 2) {
                    if (gameboard.b6 == "_")
                        gameboard.b6 = "x";
                    else if (gameboard.b5 == "_")
                        gameboard.b5 = "x";
                    else if (gameboard.b4 == "_")
                        gameboard.b4 = "x";
                    else if (gameboard.b3 == "_")
                        gameboard.b3 = "x";
                    else if (gameboard.b2 == "_")
                        gameboard.b2 = "x";
                    else if (gameboard.b1 == "_")
                        gameboard.b1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                }
                if (input == 3) {
                    if (gameboard.c6 == "_")
                        gameboard.c6 = "x";
                    else if (gameboard.c5 == "_")
                        gameboard.c5 = "x";
                    else if (gameboard.c4 == "_")
                        gameboard.c4 = "x";
                    else if (gameboard.c3 == "_")
                        gameboard.c3 = "x";
                    else if (gameboard.c2 == "_")
                        gameboard.c2 = "x";
                    else if (gameboard.c1 == "_")
                        gameboard.c1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                }
                if (input == 4) {
                    if (gameboard.d6 == "_")
                        gameboard.d6 = "x";
                    else if (gameboard.d5 == "_")
                        gameboard.d5 = "x";
                    else if (gameboard.d4 == "_")
                        gameboard.d4 = "x";
                    else if (gameboard.d3 == "_")
                        gameboard.d3 = "x";
                    else if (gameboard.d2 == "_")
                        gameboard.d2 = "x";
                    else if (gameboard.d1 == "_")
                        gameboard.d1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                }
                if (input == 5) {
                    if (gameboard.e6 == "_")
                        gameboard.e6 = "x";
                    else if (gameboard.e5 == "_")
                        gameboard.e5 = "x";
                    else if (gameboard.e4 == "_")
                        gameboard.e4 = "x";
                    else if (gameboard.e3 == "_")
                        gameboard.e3 = "x";
                    else if (gameboard.e2 == "_")
                        gameboard.e2 = "x";
                    else if (gameboard.e1 == "_")
                        gameboard.e1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                }
                if (input == 6) {
                    if (gameboard.f6 == "_")
                        gameboard.f6 = "x";
                    else if (gameboard.f5 == "_")
                        gameboard.f5 = "x";
                    else if (gameboard.f4 == "_")
                        gameboard.f4 = "x";
                    else if (gameboard.f3 == "_")
                        gameboard.f3 = "x";
                    else if (gameboard.f2 == "_")
                        gameboard.f2 = "x";
                    else if (gameboard.f1 == "_")
                        gameboard.f1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                }
                if (input == 7) {
                    if (gameboard.g6 == "_")
                        gameboard.g6 = "x";
                    else if (gameboard.g5 == "_")
                        gameboard.g5 = "x";
                    else if (gameboard.g4 == "_")
                        gameboard.g4 = "x";
                    else if (gameboard.g3 == "_")
                        gameboard.g3 = "x";
                    else if (gameboard.g2 == "_")
                        gameboard.g2 = "x";
                    else if (gameboard.g1 == "_")
                        gameboard.g1 = "x";
                    else
                        System.out.println("Please choose another column : ");
                } } else if (i % 2 != 0){
                    {
                        if (input == 1) {
                            if (gameboard.a6 == "_")
                                gameboard.a6 = "o";
                            else if (gameboard.a5 == "_")
                                gameboard.a5 = "o";
                            else if (gameboard.a4 == "_")
                                gameboard.a4 = "o";
                            else if (gameboard.a3 == "_")
                                gameboard.a3 = "o";
                            else if (gameboard.a2 == "_")
                                gameboard.a2 = "o";
                            else if (gameboard.a1 == "_")
                                gameboard.a1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                        if (input == 2) {
                            if (gameboard.b6 == "_")
                                gameboard.b6 = "o";
                            else if (gameboard.b5 == "_")
                                gameboard.b5 = "o";
                            else if (gameboard.b4 == "_")
                                gameboard.b4 = "o";
                            else if (gameboard.b3 == "_")
                                gameboard.b3 = "o";
                            else if (gameboard.b2 == "_")
                                gameboard.b2 = "o";
                            else if (gameboard.b1 == "_")
                                gameboard.b1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                        if (input == 3) {
                            if (gameboard.c6 == "_")
                                gameboard.c6 = "o";
                            else if (gameboard.c5 == "_")
                                gameboard.c5 = "o";
                            else if (gameboard.c4 == "_")
                                gameboard.c4 = "o";
                            else if (gameboard.c3 == "_")
                                gameboard.c3 = "o";
                            else if (gameboard.c2 == "_")
                                gameboard.c2 = "o";
                            else if (gameboard.c1 == "_")
                                gameboard.c1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                        if (input == 4) {
                            if (gameboard.d6 == "_")
                                gameboard.d6 = "o";
                            else if (gameboard.d5 == "_")
                                gameboard.d5 = "o";
                            else if (gameboard.d4 == "_")
                                gameboard.d4 = "o";
                            else if (gameboard.d3 == "_")
                                gameboard.d3 = "o";
                            else if (gameboard.d2 == "_")
                                gameboard.d2 = "o";
                            else if (gameboard.d1 == "_")
                                gameboard.d1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                        if (input == 5) {
                            if (gameboard.e6 == "_")
                                gameboard.e6 = "o";
                            else if (gameboard.e5 == "_")
                                gameboard.e5 = "o";
                            else if (gameboard.e4 == "_")
                                gameboard.e4 = "o";
                            else if (gameboard.e3 == "_")
                                gameboard.e3 = "o";
                            else if (gameboard.e2 == "_")
                                gameboard.e2 = "o";
                            else if (gameboard.e1 == "_")
                                gameboard.e1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                        if (input == 6) {
                            if (gameboard.f6 == "_")
                                gameboard.f6 = "o";
                            else if (gameboard.f5 == "_")
                                gameboard.f5 = "o";
                            else if (gameboard.f4 == "_")
                                gameboard.f4 = "o";
                            else if (gameboard.f3 == "_")
                                gameboard.f3 = "o";
                            else if (gameboard.f2 == "_")
                                gameboard.f2 = "o";
                            else if (gameboard.f1 == "_")
                                gameboard.f1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                        if (input == 7) {
                            if (gameboard.g6 == "_")
                                gameboard.g6 = "o";
                            else if (gameboard.g5 == "_")
                                gameboard.g5 = "o";
                            else if (gameboard.g4 == "_")
                                gameboard.g4 = "o";
                            else if (gameboard.g3 == "_")
                                gameboard.g3 = "o";
                            else if (gameboard.g2 == "_")
                                gameboard.g2 = "o";
                            else if (gameboard.g1 == "_")
                                gameboard.g1 = "o";
                            else
                                System.out.println("Please choose another column : ");
                        }
                    }
                }
            }
        }
    }

