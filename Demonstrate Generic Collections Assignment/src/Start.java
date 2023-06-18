import java.util.Collections;

import java.util.Random;

import java.util.LinkedList;

class Main {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<Integer>();

        Random rand = new Random();

        int randnum;

        int sum = 0;

        for(int i = 0;i<25;i++)     {

            randnum = rand.nextInt(101);

            myList.add(new Integer(randnum));

            sum+=randnum;

        }

        Collections.sort(myList);

        System.out.println(myList);

        System.out.println("Average: "+(float)sum/25);

    }

}

