package com.anvari1313.fsm.ds;

/**
 * Created by Ahmad on 15/01/2017.
 */
public class GraphVertexConnection {
    private int sourceVertexId;
    private int destVertexId;
    private char label;

    public GraphVertexConnection(int src, int dest, char label){
        this.sourceVertexId = src;
        this.destVertexId = dest;
        this.label = label;
    }


    public int getSourceVertexId() {
        return sourceVertexId;
    }

    public void setSourceVertexId(int sourceVertexId) {
        this.sourceVertexId = sourceVertexId;
    }

    public int getDestVertexId() {
        return destVertexId;
    }

    public void setDestVertexId(int destVertexId) {
        this.destVertexId = destVertexId;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
