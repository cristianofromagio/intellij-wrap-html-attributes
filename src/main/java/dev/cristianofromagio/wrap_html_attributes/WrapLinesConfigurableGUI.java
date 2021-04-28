package dev.cristianofromagio.wrap_html_attributes;

import javax.swing.*;

public class WrapLinesConfigurableGUI {

    private JPanel rootPanel;
    private JCheckBox wrapTextNodesOnCheckBox;
    private JCheckBox firstAttributeOnNewCheckBox;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JCheckBox getWrapTextNodesOnCheckBox() {
        return wrapTextNodesOnCheckBox;
    }

    public JCheckBox getFirstAttributeOnNewCheckBox() {
        return firstAttributeOnNewCheckBox;
    }
}
