package core.basesyntax.service.operationtypes;

import core.basesyntax.db.FruitsDao;
import core.basesyntax.db.FruitsDaoImpl;
import core.basesyntax.model.Fruit;

public class SupplyOperationHandler implements OperationTypeHandler {
    private FruitsDao fruitsDao = new FruitsDaoImpl();

    @Override
    public void makeOperation(String fruitType, int amount) {
        Fruit someFruit = fruitsDao.get(fruitType);
        someFruit.setAmount(someFruit.getAmount() + amount);
    }
}
