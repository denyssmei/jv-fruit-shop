package core.basesyntax.dto.handlers;

import core.basesyntax.dao.DAoService;
import core.basesyntax.models.FruitRecord;

public interface OperationsHandler {
    void apply(DAoService dAoService, FruitRecord fruitRecord);
}
