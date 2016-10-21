package com.masmiths.greg.knime.nodes;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;

/**
 * <code>NodeDialog</code> for the "NodeFrameworkPlugin" Node.
 * 
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author Greg Smith
 */
public class NodeFrameworkPluginNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring NodeFrameworkPlugin node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected NodeFrameworkPluginNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentNumber(
                new SettingsModelIntegerBounded(
                    NodeFrameworkPluginNodeModel.CFGKEY_COUNT,
                    NodeFrameworkPluginNodeModel.DEFAULT_COUNT,
                    Integer.MIN_VALUE, Integer.MAX_VALUE),
                    "Counter:", /*step*/ 1, /*componentwidth*/ 5));
                    
    }
}

