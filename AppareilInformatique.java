package techstore;

public abstract class AppareilInformatique extends Article implements Garantissable {
    private double resolutionEcran;
    private String processeur;
    private long ram;
    private SystemeExploitation systemeExploitation;

    public AppareilInformatique(int id, String nom, String reference, double prix,
            double resolutionEcran, String processeur, long ram,
            SystemeExploitation systemeExploitation) {
        super(id, nom, reference, prix);
        this.resolutionEcran = resolutionEcran;
        this.processeur = processeur;
        this.ram = ram;
        this.systemeExploitation = systemeExploitation;
    }

    @Override
    public abstract int garantirAppareil();

    // getters et setters générés : Source → Generate Getters and Setters...

    @Override
    public String toString() {
        return super.toString() + ", résolution=" + resolutionEcran
            + ", processeur=" + processeur + ", RAM=" + ram
            + ", système=" + systemeExploitation;
    }
}