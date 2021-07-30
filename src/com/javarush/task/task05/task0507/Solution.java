package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Вводить с клавиатуры числа и вычислить среднее арифметическое.
        //Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
        //-1 не должно учитываться.
        int numbersCounter = 0;
        int sum = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(reader.readLine());
            if (number == -1){
                System.out.println((double)sum/numbersCounter);
                break;
            }
            numbersCounter++;
            sum += number;
        }
    }
}

