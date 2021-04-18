package Exercices;

import java.io.Console;

public class Exercise42 {

        public static void main(String[] args) {
            Console cons;
            if ((cons = System.console()) != null) {
                char[] password = null;
                try {
                    password = cons.readPassword("Input your Password:");
                    System.out.println("Your password was: " + new String(password));
                } finally {
                    if (password != null) {
                        java.util.Arrays.fill(password, ' ');
                    }
                }
            } else {
                throw new RuntimeException("Can't get password...No console");
            }
        }
    }

