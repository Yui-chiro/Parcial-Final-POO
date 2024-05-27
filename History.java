/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.history;

import core.models.Operation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Cher
 */
public class History {
    private List<Operation> operations;

    public History() {
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public List<Operation> getOperations() {
        return Collections.unmodifiableList(operations);
    }
}