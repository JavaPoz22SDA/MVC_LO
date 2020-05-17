package pl.sda.mvc;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class GiantModelTest {

    @Test
    public void testSetHealth(){
        final GiantModel giantModel = new GiantModel(Health.HEALTHY,
                Fatigue.TIRED, Nourishment.HUNGRY);

        assertEquals(Health.HEALTHY, giantModel.getHealth());

        for(final Health health: Health.values()){
            giantModel.setHealth(health);
            assertEquals(health, giantModel.getHealth());
        }
    }

    @Test
    public void testSetNourishment(){
        
    }

    @Test
    public void testSetFatigue(){

    }

}