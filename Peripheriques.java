package techstore;

public class Peripheriques extends Article {
    private String technologieDeConnexion;
    private String interfaceAvecOrdinateur;

    public Peripheriques(int id, String nom, String reference, double prix,
            String technologieDeConnexion, String interfaceAvecOrdinateur) {
        super(id, nom, reference, prix);
        this.technologieDeConnexion = technologieDeConnexion;
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
    }

    public String getTechnologieDeConnexion() { return technologieDeConnexion; }
    public void setTechnologieDeConnexion(String t) { this.technologieDeConnexion = t; }
    public String getInterfaceAvecOrdinateur() { return interfaceAvecOrdinateur; }
    public void setInterfaceAvecOrdinateur(String i) { this.interfaceAvecOrdinateur = i; }

    @Override
    public String toString() {
        return super.toString() + ", connexion=" + technologieDeConnexion
            + ", interface=" + interfaceAvecOrdinateur;
    }
}