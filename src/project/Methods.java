package project;

public class Methods {

    public static void showMenu(){
        System.out.println("Meniul este: \n" +
                "1. Adunarea a doua numere \n" +
                "2. Scaderea a doua numere\n" +
                "3. Convertor Temperatura \n" +
                "4. Compararea a doua numere \n" +
                "5. Introducerea unui text \n" +
                "6. Afisarea unui numar dintr-un anumit interval \n" +
                "7. Afisarea unui numar si a unui text \n" +
                "8. Afisarea grosimii stratului de zapada \n" +
                "9. Compararea unui numar cu un interval dat \n" +
                "10.Afisarea numarului corespunzator tastei apasate \n" +
                "11.Verificarea paritatii unui numar \n" +
                "12.Verificarea eligibilitatii la vot \n" +
                "13.Calcularea mediei unui elev \n" +
                "14.Alegerea unui raspuns corect \n" +
                "15.Afisarea unui numar dintr-un sir \n" +
                "16.Afisarea unui pattern descrescator \n" +
                "17.Afisarea unui pattern crescator \n" +
                "18.Afiseaza un interval \n" +
                " 0. Delogheaza-te!");
    }

    public static void addition(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti doua numere: ");
        int nr1 = readInput.readNumber();
        int nr2 = readInput.readNumber();
        System.out.println("Rezultatul este: " + (nr1 + nr2)+ ".");
    }

    public static void diff(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti 2 numere: ");
        int nr3 = readInput.readNumber();
        int nr4 = readInput.readNumber();
        System.out.println("Rezultatul este: " + (nr3-nr4) + ".");
    }

    public static void temp(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti temperatura(grade Fahrenheit): ");
        double f = readInput.readDouble();
        double c = 5.0/9 * (f - 32);
        System.out.println("Temperatura este: " + c + " grade Celsius.");
    }

    public static void compareNo(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti doua numere: ");
        int nr5 = readInput.readNumber();
        int nr6 = readInput.readNumber();
        if(nr5 > nr6){
            System.out.println("Numarul mai mare este: " + nr5 + ".");
        }else{
            System.out.println("Numarul mai mare este: " + nr6 + ".");
        }

    }

    public static void enterText(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un text: ");
        String s = readInput.readString();
        if(s.equals("Evozon")){
            System.out.println("Yey");
        }else{
            System.out.println("Mai incearca!");
        }
    }

    public static void compareNoToInterval(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un numar: ");
        int nr7 = readInput.readNumber();
        if(nr7 >= 2 && nr7 <= 8){
            System.out.println(nr7);
        }else{
            System.out.println("Mai incearca!");
        }
    }

    public static void printNoAndText(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un text: ");
        String k = readInput.readString();
        System.out.println("Introduceti un numar: ");
        int x = readInput.readNumber();

        if(k.equals("Evozon")&& x <= 3){
            System.out.println(k + " " + x);
        }
        else if(!k.equals("Evozon")&& x >= 4){
            System.out.println(x + " " + k);
        }
        else{
            System.out.println("Mai incearca!");
        }
    }

    public static void snowThickness(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti o valoare: ");
        int a = readInput.readNumber();
        if (a > 8 || a == 6){
            System.out.println("In aceasta iarna, stratul de zapada a masurat " +  a + " cm.");
        }
        else {
            System.out.println("Stratul de zapada va masura aproximativ " + a + " cm.");
        }
    }

    public static void compareNoToOtherNo(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un numar: ");
        int y = readInput.readNumber();

        if(y > 3 && y != 4){
            System.out.println("Numarul este mai mare ca 3 si nu este egal cu 4.");
        }
        else if (y == 4){
            System.out.println("Numarul este egal cu 4.");
        }
        else if (y < 3){
            System.out.println("Numarul este mai mic ca 3.");
        }
    }

    public static void evenNumber(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un numar: ");
        int t = readInput.readNumber() % 2;
        if (t == 0){
            System.out.println("Acesta este un numar par.");
        }
        else {
            System.out.println("Acesta nu este un numar par.");
        }
    }

    public static void votingAge(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti varsta: ");
        int age = readInput.readNumber();
        if(age >= 18){
            System.out.println("Sunteti eligibil sa votati.");
        }
        else{
            System.out.println("Nu sunteti eligibil sa votati.");
        }
    }

    public static void studentGrade(){
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti prima nota: ");
        int quizScore = readInput.readNumber();

        System.out.println("Introduceti a doua nota: ");
        int midTermScore = readInput.readNumber();

        System.out.println("Introduceti a treia nota: ");
        int finalScore = readInput.readNumber();

        int average = (quizScore+midTermScore+finalScore)/3;

        if(average >= 90){
            System.out.println("Prima nota: " + quizScore + "\n" + "A doua nota: " + midTermScore + "\n" + "A treia nota: " + finalScore + "\n" + "Media este A.");
        }
        else if (average >= 70 && average < 90){
            System.out.println("Prima nota: " + quizScore + "\n" + "A doua nota: " + midTermScore + "\n" + "A treia nota: " + finalScore + "\n" + "Media este B.");
        }
        else if (average >= 50 && average < 70){
            System.out.println("Prima nota: " + quizScore + "\n" + "A doua nota: " + midTermScore + "\n" + "A treia nota: " + finalScore + "\n" + "Media este C.");
        }
        else if (average < 50){
            System.out.println("Prima nota: " + quizScore + "\n" + "A doua nota: " + midTermScore + "\n" + "A treia nota: " + finalScore + "\n" + "Media este F.");
        }
    }

    public static void answerQuestion(){
        ReadInput readInput = new ReadInput();
        System.out.println("Cum se declara o variabila care stocheaza date de tip \"integer\" in Java?" + "\n" +
                "a. int 1x=10;"  + "\n" +
                "b. int x=10;" + "\n" +
                "c. float x=10.0f;" + "\n" +
                "d. string x='10';" + "\n");
        System.out.println("Alege raspunsul corect: ");

        String yourChoice = readInput.readString();

        switch(yourChoice){
            case "a":
                System.out.println("Raspuns gresit!");
                break;
            case "b":
                System.out.println("Raspuns corect!");
                break;
            case "c":
                System.out.println("Raspuns gresit!");
                break;
            case "d":
                System.out.println("Raspuns gresit!");
                break;
            default:
                System.out.println("Raspuns invalid!");
        }
    }

    public static void printArrayElem(){
        ReadInput readInput = new ReadInput();
        int[] arrayOfInt = {43,34, 4, 6, 38, 345, 435, 35 ,90, 44};
        System.out.println("Introduceti un numar intre 0 si 9: ");
        int l = readInput.readNumber();
        if(l <= arrayOfInt.length){
            System.out.println("Numarul din sir este: " + arrayOfInt[l]);
        }
        else{
            System.out.println("Invalid!");
        }
    }

    public static void keyboardInput() {
        System.out.println("Apasati o tasta de la 0 la 9: ");
        ReadInput readInput = new ReadInput();
        int z = readInput.readNumber();
        switch (z) {
            case 0:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 1:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 2:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 3:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 4:
                System.out.println("Ati apasat " + z + ".");
            case 5:
                System.out.println("Ati apasat " + z + ".");
            case 6:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 7:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 8:
                System.out.println("Ati apasat " + z + ".");
                break;
            case 9:
                System.out.println("Ati apasat " + z + ".");
                break;
            default:
                System.out.println("Invalid.");
        }
    }

    public static void printDescendingPattern() {
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un numar: ");
        int n = readInput.readNumber();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printAscendingPattern() {
        ReadInput readInput = new ReadInput();
        System.out.println("Introduceti un numar: ");
        int d = readInput.readNumber();
        for (int a = 1; a <= d; a++) {
            for (int b = 1; b <= a; b++)
                System.out.print(b);
            for (int c = d; c > a; c--)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void printInterval(){
        project.List list = new project.List();
        list.addElementsToList();
        list.createList();
        list.removeNthElemAndSort();
    }
}



