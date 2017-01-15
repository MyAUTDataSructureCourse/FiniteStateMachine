package com.anvari1313.fsm.ds;

import java.util.ArrayList;

/**
 * This class can store the description of the graph in itself and manipulate with it
 */
public class Graph {
    private ArrayList<GraphVertexConnection> connections;
    private static Graph instance = new Graph();

    private Graph(){
        connections = new ArrayList<>();
    }

    public static Graph getInstance(){
        return instance;
    }

    public void addConnection(int src, int dest, char label){
        connections.add(new GraphVertexConnection(src, dest, label));
    }
}
