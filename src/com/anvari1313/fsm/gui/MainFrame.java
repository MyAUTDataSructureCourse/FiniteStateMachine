package com.anvari1313.fsm.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;
import java.util.Vector;


/**
 * Created by Ahmad on 13/01/2017.
 */
public class MainFrame extends JFrame {
    private DefaultTableModel model;
    private JTable table;
    private JScrollPane scrollPane;
    private JTable rowTable;

    public MainFrame(){
        this.setSize(new Dimension(1200, 500));

        model = new DefaultTableModel();
        table = new JTable(model);

        custructTable(13);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void custructTable(int n){
        scrollPane = new JScrollPane(table);
        rowTable = new RowNumberTable(table);
        scrollPane.setRowHeaderView(rowTable);
        scrollPane.setCorner(JScrollPane.UPPER_LEFT_CORNER, rowTable.getTableHeader());

        add(scrollPane, BorderLayout.CENTER);

        for (int i = 0; i < n; i++) {
            model.addColumn(i);
        }
        for (int i = 0; i < n; i++) {
            model.addRow(new Object[] { "" });
        }


    }

    public void showFrame(){
        this.setVisible(true);
    }
}
