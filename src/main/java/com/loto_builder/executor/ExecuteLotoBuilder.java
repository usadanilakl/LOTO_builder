package com.loto_builder.executor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ExecuteLotoBuilder {
    public static void main(String[] args) {
        List<String> points = BrowserWindow.getPoints();
        // Create a new JFrame
        JFrame frame = new JFrame("Simple UI");

        // Create a new JButton
        JButton button = new JButton("Get LOTO Points");

        // Add the JButton to the JFrame
        frame.getContentPane().add(button);

        // Set the size of the JFrame
        frame.setSize(300, 200);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the JFrame visible
        frame.setVisible(true);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        //DesctopOperations.fillOutData2(points);


                    }
                });

            }
        });
    }
}
