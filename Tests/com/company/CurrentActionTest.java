package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentActionTest {

    @Test
    public void checkActionCase1() {
        CurrentAction currentAction = new CurrentAction();
        assertEquals("I'm working",currentAction.CheckAction(10));

    }

    @Test
    public void checkActionCase2 () {
        CurrentAction currentAction = new CurrentAction();
        assertEquals("Wrong number",currentAction.CheckAction(30));

    }

    @Test
    public void checkActionCase3 () {
        CurrentAction currentAction = new CurrentAction();
        assertEquals("Wrong number",currentAction.CheckAction(-5));

    }
    @Test
    public void checkActionCase4 () {
        CurrentAction currentAction = new CurrentAction();
        assertEquals("I'm relaxing",currentAction.CheckAction(5));

    }


    @Test
    public void checkActionCase6 () {
        CurrentAction currentAction = new CurrentAction();
        assertEquals("I'm relaxing",currentAction.CheckAction(0));

    }

    @Test
    public void checkActionCase7 () {
        CurrentAction currentAction = new CurrentAction();
        assertEquals("I'm relaxing",currentAction.CheckAction(24));
    }


}