package core.basesyntax.service.operationtypes;

public interface OperationStrategy {
    OperationTypeHandler get(String operation);
}