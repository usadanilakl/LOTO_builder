package com.loto_builder.executor;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseInputListener;

public class CoordinateOnClick implements NativeMouseInputListener {
    public void nativeMouseClicked(NativeMouseEvent e) {
        System.out.println("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void nativeMousePressed(NativeMouseEvent e) { }
    public void nativeMouseReleased(NativeMouseEvent e) { }
    public void nativeMouseMoved(NativeMouseEvent e) { }
    public void nativeMouseDragged(NativeMouseEvent e) { }

    public static void main(String[] args) {
        try {
            GlobalScreen.registerNativeHook();
        }
        catch (Exception e) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(e.getMessage());
            System.exit(1);
        }

        GlobalScreen.addNativeMouseListener(new CoordinateOnClick());
    }
}

