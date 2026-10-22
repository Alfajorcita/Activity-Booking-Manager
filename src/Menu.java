public class Menu {

    static void welcome(){
        System.out.println("\n---Välkommen till Aktivitetsbokaren---");
        System.out.println("Här kan du registrera bokningar för olika aktiviteter,");
        System.out.println("se dina bokningar och få en sammanställning.");
        System.out.println("---------------------------------------");
    }
    static void showGeneralMenu(){
        System.out.println("---Välj ett alternativ---");
        System.out.println("1. Registrera bokning");
        System.out.println("2. Visa alla bokningar");
        System.out.println("3. Visa sammanställning");
        System.out.println("4. Avsluta");
    }

    static void showActivityMenu(){
        System.out.println("Välj aktivitet:");
        System.out.println("1. Programmeringsworkshop");
        System.out.println("2. Matlagningskurs");
        System.out.println("3. Träningspass");
   }

}

