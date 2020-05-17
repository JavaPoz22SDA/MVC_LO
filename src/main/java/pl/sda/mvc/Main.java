package pl.sda.mvc;

public class Main {

    public static void main(String[] args) {

        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTHY,
                Fatigue.TIRED, Nourishment.HUNGRY);

        /*
              Stworzyć nowy kontroler GiantCollectionController,
              który przyjmnie widok i listę List<GiantModel> modeli
              wszystkie gety i set będą potrzebowały drugiego argumentu
              jakim będzie int index.

              Konieczne może być stworzenie nowego modelu i nowego widoku
         */

        GiantController giantController
                = new GiantController(giantModel, giantView);

        giantController.updateView();
        giantController.setHealth(Health.DEAD);
        giantController.updateView();

    }

}
