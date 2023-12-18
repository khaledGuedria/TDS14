public class Main {
    public static void main(String[] args) {


        //var
        Entreprise entreprise = new Entreprise();

        //Data
        entreprise.prestations.add(new Prestation(1, "Bolt App", "Bolt Inc"));
        entreprise.prestations.add(new Service(2, "Formation Flutter", "Orange Tunisie", 36, 100));
        entreprise.prestations.add(new Service(3,"Consulting Architecture", "Avaxia", 87, 150));
        entreprise.prestations.add(new Produit(4, "E-learning Platform", "MSB", 15200, "12/2022"));
        entreprise.prestations.add(new Produit(5,"Social Network App", "Orange Tunisie", 8800, "03/2023"));
        entreprise.prestations.add(new Produit(6,"Scanner de cheque", "BNA", 12600, "12/2023"));

        //Methods testing...
        System.out.println("TO DO 3 : *********************");
        //TO DO 3
        System.out.println("Expected result : 7");
        try {
            entreprise.ajouterPrestation(new Prestation(7, "Bolt App clone", "TunTaxi Inc"));
        }catch (PrestationExisteException pex){
            pex.printStackTrace();
        }
        System.out.println(entreprise.prestations.size());
        System.out.println("TO DO 4 : *********************");
        //TO DO 4
        System.out.println("Expected result : 2 | 3");
        entreprise.afficherNbrPrestation();
        System.out.println("TO DO 5 : *********************");
        //TO DO 5
        System.out.println("Expected result : 2 Prestations");
        System.out.println(entreprise.prestationparClient("Orange Tunisie").size());
        System.out.println("TO DO 6 : *********************");
        //TO DO 6
        System.out.println(entreprise.filterParClient());

        System.out.println("TO DO 7 : Clients | Projects *********************");
        //TO DO 7
        System.out.println(entreprise.afficherClient());
        System.out.println(entreprise.afficherProjects());

        System.out.println("TO DO 8 : Recuperer services | total *********************");
        //TO DO 8
        System.out.println("Expected result : Avaxia [13050] | Orange[3600]");
        System.out.println(entreprise.recupererServices());

        System.out.println("TO DO 9 : *********************");
        //TO DO 9 :
        System.out.println("Expected result : 21400");
        entreprise.totalVentesProduits();

        System.out.println("TO DO 10 : *********************");
        //TO DO 10
        System.out.println("Expected result : Avaxia");
        entreprise.topServiceClient();

        System.out.println("TO DO 3 Exception : *********************");
        try {
            entreprise.ajouterPrestation(new Prestation(1, "Bolt App", "Bolt Inc"));
        }catch (PrestationExisteException pex){
            pex.printStackTrace();
        }
    }
}