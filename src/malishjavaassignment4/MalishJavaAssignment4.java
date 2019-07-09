/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malishjavaassignment4;

import java.util.Scanner;

/**
 *
 * @author RedPanda's LapTop
 */
public class MalishJavaAssignment4 {
private static int PlayerWins, ComputerWins, Ties;
private static boolean isRunning;

    public static void main(String[] args){
       
        PlayerWins = 0;
        ComputerWins = 0;
        Ties = 0;
        
        isRunning = true;
        Scanner input = new Scanner(System.in);
        
        while(isRunning){
            System.out.println("This is a game of rock, paper, scissors!");
            System.out.println("Write 1 to pick Rock");
            System.out.println("Write 2 to pick Paper");
            System.out.println("Write 3 to pick Scissors");
            System.out.println("Write 4 to exit the program and get you're score");
            userOptions(input.nextInt());
        }
        System.out.println("Player wins: " + PlayerWins);
        System.out.println("Computer wins: " + ComputerWins);
        System.out.println("Ties: " + Ties);
    }

        

    private static int rollComputerChoice(){
        return (int)(Math.random()*3)+1;
    }
    
    private static int determineWinner(int userInput, int ComputerChoice){
        if(userInput==ComputerChoice){
            return 0;
        }
        else if(userInput == 1 && ComputerChoice== 3){
            return 1;
        }
        else if(userInput == 2 && ComputerChoice == 1){
            return 1;
        }
        else if(userInput == 3 && ComputerChoice == 2){
            return 1;
        }
        else{
            return -1;
        }
    }
    private static void sortScore(int result){
        if(result==1){
            PlayerWins++;
            System.out.println("You won!\n");
        }
        else if(result==0){
            Ties++;
            System.out.println("You tied\n");
        }
        else if(result==-1){
            ComputerWins++;
            System.out.println("The computer won\n");
        }
    }
    private static void userOptions(int userInput){
        switch(userInput){
            case 1:
                System.out.println("You have chosen Rock!");
                sortScore(determineWinner(1,rollComputerChoice()));
                break;
            case 2:
                System.out.println("You have chosen Paper!");
                sortScore(determineWinner(2,rollComputerChoice()));
                break;
            case 3:
                System.out.println("You have chosen Scissors!");
                sortScore(determineWinner(3,rollComputerChoice()));
                break;
            case 4: 
                isRunning = false;
                break;
            default:
                System.out.println("Please pick only numbers 1-2-3-4");
        }
    }
}
