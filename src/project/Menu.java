package project;

import java.util.List;

public class Menu {

    ReadInput readInput = new ReadInput();
    Methods methods = new Methods();



    public void printOptions() {
        methods.showMenu();
    }

    public boolean chooseOption(int option){

        switch (option){

            case 1:
                methods.addition();
                break;
            case 2:
                methods.diff();
                break;
            case 3:
               methods.temp();
                break;
            case 4:
                methods.compareNo();
                break;
            case 5:
                methods.enterText();
                break;
            case 6:
                methods.compareNoToInterval();
                break;
            case 7:
                methods.printNoAndText();
                break;
            case 8:
                methods.snowThickness();
                break;
            case 9:
                methods.compareNoToOtherNo();
                break;
            case 10:
                    Methods.keyboardInput();
                break;
            case 11:
                methods.evenNumber();
                break;
            case 12:
                methods.votingAge();
                break;
            case 13:
                methods.studentGrade();
                break;
            case 14:
                methods.answerQuestion();
                break;
            case 15:
                methods.printArrayElem();
                break;
            case 16:
                Methods.printDescendingPattern();
                break;
            case 17:
                Methods.printAscendingPattern();
                break;
            case 18:
                Methods.printInterval();
            case 0:
                System.out.println("Exit");
                return false;
            default:
                System.out.println("");
        }
        return true;
    }
    public void runProgram(){
        int option;
        do{
            printOptions();
            System.out.println("Alege optiunea: ");

            option = readInput.readNumber();
        }
        while(chooseOption(option));
    }
}