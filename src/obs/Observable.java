package obs;


/**
 * interface qui doit etre implementé par
 * tous les classes qui souhaite etre observer .
 */
public interface Observable {
    /**
     * methode permettant à l'observateur de s'inscrire/s'enregistrer
     */
    void addObserver(Observer observer);
    /**
     * methode permettant à l'observateur de se desinscrire/desabonner
     */
    void deleteObserver(Observer observer);
    /**
     * methode permettant à l'observeur de notifier tous les Observateurs
     * a chaque fois que son etat va changer
     */
    void notifyObservers();

}
