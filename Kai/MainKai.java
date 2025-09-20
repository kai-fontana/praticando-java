package TimeSkillo02.Kai;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainKai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();

        int userOption;

        //Loop menu
        do {
            System.out.println("""
                ==============  MENU  ===============
        
                         1 - Add name;
                         2 - Edit name;
                         3 - Remove name;
                         4 - Show the name list;
                         5 - Search something;
                         6 - Save changes;
                         0 - Quit.
        
                =====================================
                """);
            userOption = scan.nextInt();
            scan.nextLine(); //Isso é para consertar o erro de leitura no próximo "scan.nextLine()"

            switch(userOption) {
                case 1:
                    System.out.println("You chose to add a name!");
                    System.out.println("Which name do you  want to add to the list?");
                    String userAdd = scan.nextLine();
                    listOfNames.add(userAdd);
                    System.out.println("'" + userAdd + "' has been added to the list. ✅");

                    System.out.println("Wanna return to menu? Press Enter ");
                    scan.nextLine();
                    break;
                case 2:
                    System.out.println("You chose to edit the list!");

                    System.out.println("Which name do you want to edit by the index? ");
                    int userEdit = scan.nextInt();
                    System.out.println("Which name do you want to add? ");
                    scan.nextLine(); //Isso é para consertar o erro de leitura no próximo "scan.nextLine()"
                    String userName = scan.nextLine();
                    listOfNames.set(userEdit, userName);
                    System.out.println("'" + userName + "' has been edited in the list. ✅");

                    System.out.println("Wanna return to menu? Press Enter ");
                    scan.nextLine();
                    break;
                case 3:
                    System.out.println("You chose to remove a name!");

                    carregarArquivo((listOfNames)); //Metodo que carrega o que está no arquivo 'dados.txt'
                    if (listOfNames.isEmpty()) {
                        System.out.println("The list is empty!");
                    } else {
                        for (int i = 0; i < listOfNames.size(); i++) {
                            System.out.println("Index " + i + ": " + listOfNames.get(i) + ";");
                        }
                    }

                    System.out.println("Which name do you want to remove by the index? ");
                    int userRemove = scan.nextInt();
                    listOfNames.remove(userRemove);
                    System.out.println("Index " + userRemove + ": has been removed from the list. ✅");

                    System.out.println("Wanna return to menu? Press Enter ");
                    scan.nextLine();//Isso é para consertar o erro de leitura no próximo "scan.nextLine()"
                    scan.nextLine();
                    break;
                case 4:
                    System.out.println("You chose to show the list!");
                    carregarArquivo(listOfNames); //Metodo que carrega o que está no arquivo 'dados.txt'

                    if (listOfNames.isEmpty()) {
                        System.out.println("The list is empty!");
                    } else {
                        for (int i = 0; i < listOfNames.size(); i++) {
                            System.out.println("Index " + i + ": " + listOfNames.get(i) + ";");
                        }
                    }

                    System.out.println("Wanna return to menu? Press Enter ");
                    scan.nextLine();
                    break;
                case 5:
                    System.out.println("You chose to search.");
                    System.out.println("Searching...");
                    String enterUser = scan.nextLine();

                    if (listOfNames.contains(enterUser)) {
                        System.out.println("The list contains " + enterUser);
                    } else {
                        System.out.println("We couldn't reach your search! Try again.");
                        break;
                    }

                    System.out.println("Wanna return to menu? Press Enter ");
                    scan.nextLine();
                    break;
                case 6:
                    System.out.println("You chose to save your changes!");
                    salvarArquivo(listOfNames);
                    break;
                case 0:
                    System.out.println("Okay! Quiting now... ✨");
                    break;
                default:
                    System.out.println("Invalid entry. Please, try it again! \uD83D\uDC40");
                    scan.nextLine();
                    break;
            }
        } while (userOption != 0);

        scan.close(); //Fechar o scanner
    }

    public static void salvarArquivo(ArrayList<String> listOfNames) {
        String fileWay = "data/data.txt";

        try (PrintWriter write =  new PrintWriter(new FileWriter(fileWay))) {
            for (String name : listOfNames) {
                write.println(name);
            }
            System.out.println("The name list has been saved in: 'data.txt'.");
        } catch (IOException e) {
            System.out.println("An error occured while trying saving file: " + e.getMessage());
        }
    }

    public static void carregarArquivo(ArrayList<String> listOfNames) {
        try {
            String fileWay = "data/data.txt";

            File dataFile = new File(fileWay);
            Scanner fileScan = new Scanner(dataFile);

            listOfNames.clear();

            while (fileScan.hasNextLine()) {
                String name = fileScan.nextLine();
                listOfNames.add(name);
            }

            fileScan.close(); //Fechar o scanner
        } catch (FileNotFoundException e) {
            System.out.println("We couldn't reach the data base.");
        }
    }
}