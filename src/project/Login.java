package project;

public class Login {
    ReadInput readInput = new ReadInput();
     public boolean login(String user, String pass){

        if(user.equals(Constants.USERNAME) && pass.equals(Constants.PASS)){
            return true;
        }
        return false;
    }
    public boolean loginValidation(){
        for(int i = 0; i < Constants.MAX_NUMBER_OF_TRIES; i++){
            System.out.println("Introduceti username-ul: ");
            String username = readInput.readString();
            System.out.println("Introduceti parola: ");
            String password = readInput.readString();
            if(login(username, password)){
                System.out.println("Login cu success!");
                return true;
            }
            else{
                System.out.println("Username-ul sau parola sunt gresite! \n" +
                "Ti-au mai ramas " + (Constants.MAX_NUMBER_OF_TRIES-i-1) + " incercari!");
            }
        }return false;
    }
}
