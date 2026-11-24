
package techstore;

public class TestHeritage {

    public static void main(String[] args) {

        Adulte a1 = new Adulte(
                "Amine", 35, "22123456", "Ingenieur"
        );

        Enfant e1 = new Enfant(
                "Sami", 10, "55123456", "Ecole primaire"
        );

        Bebe b1 = new Bebe(
                "Lina", 1, "99123456", true
        );

        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);

        // Appel de la méthode de l'interface
        a1.afficherIdentite();

        // Question 20
        System.out.println(a1.getNom());
    }
}
