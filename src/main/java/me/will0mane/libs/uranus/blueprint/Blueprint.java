package me.will0mane.libs.uranus.blueprint;

import me.will0mane.libs.uranus.blueprint.node.BlueprintNode;

import java.util.List;

@SuppressWarnings("unused")
public abstract class Blueprint<T extends BlueprintType> {

    public abstract List<BlueprintNode> getNodes();
    public abstract void execPin();
    public abstract void finishPin();

}
