package techstore;

public class Mobile extends AppareilInformatique {
    private double appareilPhotoArriere;
    private double appareilPhotoFrontal;
    private int nbSim;
    private long capaciteBatterie;

    public Mobile(int id, String nom, String reference, double prix,
            double resolutionEcran, String processeur, long ram,
            SystemeExploitation systemeExploitation,
            double appareilPhotoArriere, double appareilPhotoFrontal,
            int nbSim, long capaciteBatterie) {
        super(id, nom, reference, prix, resolutionEcran, processeur, ram, systemeExploitation);
        this.appareilPhotoArriere = appareilPhotoArriere;
        this.appareilPhotoFrontal = appareilPhotoFrontal;
        this.nbSim = nbSim;
        this.capaciteBatterie = capaciteBatterie;
    }

    @Override
    public int garantirAppareil() {
        return (getPrix() > 1000) ? 2 : 1;
    }

    // getters et setters générés par Eclipse

    @Override
    public String toString() {
        return super.toString() + ", photo arrière=" + appareilPhotoArriere
            + ", photo frontale=" + appareilPhotoFrontal + ", SIM=" + nbSim
            + ", batterie=" + capaciteBatterie;
    }
}