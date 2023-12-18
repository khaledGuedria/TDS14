import java.util.Objects;

public sealed class Prestation permits Service, Produit {
    //var
    protected int id;
    protected String nom_projet, nom_client;

    //con

    public Prestation() {
    }

    public Prestation(int id, String nom_projet, String nom_client) {
        this.id = id;
        this.nom_projet = nom_projet;
        this.nom_client = nom_client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_projet() {
        return nom_projet;
    }

    public void setNom_projet(String nom_projet) {
        this.nom_projet = nom_projet;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestation that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom_projet, nom_client);
    }

    @Override
    public String toString() {
        return "Prestation{" +
                "id=" + id +
                ", nom_projet='" + nom_projet + '\'' +
                ", nom_client='" + nom_client + '\'' +
                '}';
    }
}
