public final class Service extends Prestation{
    //var
    private int nombre_heures;
    private int prix_heure;
    //con
    public Service(){

    }
    public Service(int id, String nom_projet, String nom_client, int prix_heure, int nombre_heures){
        super(id, nom_projet, nom_client);
        this.prix_heure = prix_heure;
        this.nombre_heures = nombre_heures;
    }

    public int getNombre_heures() {
        return nombre_heures;
    }

    public void setNombre_heures(int nombre_heures) {
        this.nombre_heures = nombre_heures;
    }

    public int getPrix_heure() {
        return prix_heure;
    }

    public void setPrix_heure(int prix_heure) {
        this.prix_heure = prix_heure;
    }

    @Override
    public String toString() {
        return "Service{" +
                "nombre_heures=" + nombre_heures +
                ", prix_heure=" + prix_heure +
                ", id=" + id +
                ", nom_projet='" + nom_projet + '\'' +
                ", nom_client='" + nom_client + '\'' +
                '}';
    }
}
