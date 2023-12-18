import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Entreprise {

    //var
    List<Prestation> prestations = new ArrayList<>();

    //Methods
    //TO DO 3
    public void ajouterPrestation(Prestation p) throws PrestationExisteException{
        if(prestations.contains(p)){
            throw new PrestationExisteException("Cette prestation existe deja!");
        }else{
            prestations.add(p);
        }
    }
    //TO DO 4
    public void afficherNbrPrestation(){
        int productCount = 0;
        int serviceCount = 0;
        for (Prestation p: prestations) {
            if(p instanceof Service){
                serviceCount++;
            }
            if (p instanceof Produit ){
                productCount++;
            }
        }
        //diplay
        System.out.println("Services : " + serviceCount + "\nProduits : " + productCount);
    }

    //TO DO 5
    public List<Prestation> prestationparClient(String client){
        List<Prestation> l = new ArrayList<>();
        for (Prestation p: prestations
             ) {
            if (p.nom_client.equals(client)){
                l.add(p);
            }
        }
        return l;
    }

    //TO DO 6
    public Map<String, List<Prestation>> filterParClient(){
        return prestations.stream().collect(Collectors.groupingBy(Prestation::getNom_client));
    }

    //TO DO 7
    public List<String> afficherClient(){
        return prestations.stream().map(e-> e.getNom_client()).distinct().sorted().collect(Collectors.toList());
    }
    //..
    public List<String> afficherProjects(){
        return prestations.stream().map(e-> e.getNom_projet()).distinct().sorted().collect(Collectors.toList());
    }

    //TO DO 8
    public Map<Service, Integer> recupererServices() {

        Map<Service, Integer> services = new HashMap<>();
        Function<Service, Integer> fun = e -> e.getPrix_heure() * e.getNombre_heures();
        for (Prestation p: prestations) {
            if(p instanceof Service s){
               services.put(s, fun.apply(s));
            }
        }

        return services;
    }

    //TO DO 9
    public void totalVentesProduits() {
        int totalVentesProduits = prestations.stream().filter(p -> p instanceof Produit).filter(p-> ((Produit) p).getDate_livraison().endsWith("2023")).mapToInt(p-> ((Produit) p).getPrix_total()).sum();
        System.out.println(totalVentesProduits);
    }

    //TO DO 10
    public void topServiceClient() {
        Prestation prestation = prestations.stream().filter(p -> p instanceof Service).max((s1, s2) ->  - (((Service) s2).getNombre_heures() * ((Service) s2).getPrix_heure())).get();
        System.out.println(prestation.getNom_client());
    }

}
