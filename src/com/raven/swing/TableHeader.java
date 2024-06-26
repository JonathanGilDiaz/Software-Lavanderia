package com.raven.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {

    public TableHeader(String text) {
        super(text);
        setOpaque(true);
        setBackground(Color.blue);
        setFont(new Font("sansserif", 1, 13));
        setForeground(Color.white);
        setBorder(new EmptyBorder(10, 5, 10, 5));
        setHorizontalAlignment(SwingConstants.CENTER);
        setPreferredSize(new java.awt.Dimension(0, 20));
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230, 230, 230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
}
