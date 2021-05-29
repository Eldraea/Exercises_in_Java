/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Challenge
------------------------------------------------------------------------------------------------------------------------
Created on: 28/05/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 28/05/2021
-----------------------------------------------------------------------------------------------------------------------
 */


package myjava.exercises;

import java.util.List;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink=item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }else {
            return -1;
        }
    }
}