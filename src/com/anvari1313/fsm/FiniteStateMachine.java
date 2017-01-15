package com.anvari1313.fsm;

import com.anvari1313.fsm.ds.Graph;
import org.graphviz.GraphDrawer;

/**
 * Created by Ahmad on 14/01/2017.
 */
public class FiniteStateMachine {
    public static void main(String[] args) {
        GraphDrawer gd = new GraphDrawer();

        gd.draw("temp","{ 0->1 [label = a] ; 1->1 [label = b]; 1->1 [label = a] ;}");

        Graph.getInstance().addConnection(0, 1, 'a');
        //gd.draw("temp","digraph G {\n" + " a -> b [ label=\"a to b\" ];\n" + " b -> c [ label=\"another label\"];\n" + "}");
        //gd.draw("temp","digraph G {\n" + " a -> b [ label=\"a to b\" ];\n" + " b -> c [ label=\"another label\"];\n" + "}");
//        MainFrame mainFrame = new MainFrame();
//
//        mainFrame.showFrame();
    }
}
