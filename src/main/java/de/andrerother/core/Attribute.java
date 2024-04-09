package de.andrerother.core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Attribute {
    private int value;
    private String name;
    private Status status;
    private List<Boolean> boons;
    private List<Boolean> demons;
}
