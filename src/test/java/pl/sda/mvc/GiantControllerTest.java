package pl.sda.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GiantControllerTest {

    private GiantModel giantModel;
    private GiantView giantView;
    private GiantController giantController;

    @BeforeEach
    public void setUp(){
        System.out.println("PRZED");
        giantModel = Mockito.mock(GiantModel.class);
        giantView = Mockito.mock(GiantView.class);
        giantController = new GiantController(giantModel, giantView);
    }


    @Test
    public void testSetHealth(){

//        Mockito.verify(giantModel,
//                Mockito.times(2));

//        giantController.setHealth(Health.HEALTHY);
//        System.out.println(giantController.getHealth());
//        Mockito.when(giantController.getHealth()).thenReturn(Health.HEALTHY);
//        assertEquals(giantController.getHealth(), Health.HEALTHY);


        for (final Health health: Health.values()){
            giantController.setHealth(health);
            Mockito.verify(giantModel,
                    Mockito.times(1))
                    .setHealth(health);
        }
        giantController.getHealth();
        Mockito.verify(giantModel).getHealth();
//
    }

    @Test
    public void setSetFatigue(){
        assertEquals(1,1);
    }


}