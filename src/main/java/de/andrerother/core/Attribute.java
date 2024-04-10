package de.andrerother.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Attribute {
    private int value;
    private String name;
    private Status status;
    private List<Boolean> boons;
    private List<Boolean> demons;
}
