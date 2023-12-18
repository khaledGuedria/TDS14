import java.util.Objects;

public final class Produit extends Prestation{
    //var
    private int prix_total;
    private String date_livraison;

    //con
    public Produit(){

    }
    public Produit(int id, String nom_projet, String nom_client, int prix_total, String date_livraison){
        super(id, nom_projet, nom_client);
        this.prix_total = prix_total;
        this.date_livraison = date_livraison;
    }

    public int getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(int prix_total) {
        this.prix_total = prix_total;
    }

    public String getDate_livraison() {
        return date_livraison;
    }

    public void setDate_livraison(String date_livraison) {
        this.date_livraison = date_livraison;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "prix_total=" + prix_total +
                ", date_livraison='" + date_livraison + '\'' +
                ", id=" + id +
                ", nom_projet='" + nom_projet + '\'' +
                ", nom_client='" + nom_client + '\'' +
                '}';
    }
}
