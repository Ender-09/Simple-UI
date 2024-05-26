package com.ender09.simple_ui.screens;

import net.minecraft.network.chat.Component;

public abstract class StateScreen extends SimpleScreen {
    ScreenStateMachine stateMachine;

    protected StateScreen(Component pTitle) {
        super(pTitle);
        stateMachine = new ScreenStateMachine();
    }



    public class ScreenStateMachine {
        private ScreenBaseState currentState;

        public void changeState(ScreenBaseState newState) {
            currentState.exitState();
            currentState = newState;
            currentState.enterState();
        }
        public ScreenBaseState getState() {
            return currentState;
        }
    }

    public abstract class ScreenBaseState {
        protected final ScreenStateMachine stateMachine;
        protected final StateScreen screen;
        public ScreenBaseState(ScreenStateMachine stateMachine, StateScreen screen) {
            this.stateMachine = stateMachine;
            this.screen = screen;
        }

        public abstract void enterState();
        public abstract void exitState();
        public abstract void tick();
    }
}
