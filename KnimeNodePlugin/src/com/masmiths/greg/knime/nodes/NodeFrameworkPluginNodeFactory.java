package com.masmiths.greg.knime.nodes;

import org.knime.core.node.NodeDialogPane;
import org.knime.core.node.NodeFactory;
import org.knime.core.node.NodeView;

/**
 * <code>NodeFactory</code> for the "NodeFrameworkPlugin" Node.
 * 
 *
 * @author Greg Smith
 */
public class NodeFrameworkPluginNodeFactory 
        extends NodeFactory<NodeFrameworkPluginNodeModel> {

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeFrameworkPluginNodeModel createNodeModel() {
        return new NodeFrameworkPluginNodeModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getNrNodeViews() {
        return 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeView<NodeFrameworkPluginNodeModel> createNodeView(final int viewIndex,
            final NodeFrameworkPluginNodeModel nodeModel) {
        return new NodeFrameworkPluginNodeView(nodeModel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDialog() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NodeDialogPane createNodeDialogPane() {
        return new NodeFrameworkPluginNodeDialog();
    }

}

