/*
 * Copyright (C) 2020 MyLibreLab
 * Based on MyOpenLab by Carmelo Salafia www.myopenlab.de
 * Copyright (C) 2004  Carmelo Salafia cswi@gmx.de
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package MyGraph;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * @author Homer
 */
public class MyGraph extends javax.swing.JPanel {

    public MyGraphX graph = new MyGraphX();
    public Turn90Label labelLeft = new Turn90Label("Y-Axis");

    /**
     * Creates new form MyGraph
     */
    public MyGraph() {
        initComponents();
        add(labelLeft, BorderLayout.WEST);
        add(graph, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify
     * this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        setOpaque(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setOpaque(false);
        jPanel1.add(jPanel2, java.awt.BorderLayout.WEST);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X-Axis");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    // ----------- SETTER ---------
    public void setBackgroundTransparent(Boolean value) {
        graph.back.setBackgroundTransparent(value);
    }

    public void setGridBackgroundColor(Color color) {
        graph.back.setBackground(color);
    }

    public void setGridLineColor(Color color) {
        graph.back.colorGrid = color;
    }

    public void setGridSublineColor(Color color) {
        graph.back.colorSubGrid = color;
    }

    public void setNullLineColor(Color color) {
        graph.back.nullLineColor = color;
    }

    public void setNullLineVisible(Boolean value) {
        graph.back.nullLineVisible = value;
    }

    public void setXYAxisFont(Font font) {
        graph.xaxis.stdFont = font;
        graph.yaxis.stdFont = font;
    }

    public void setXYAxisFontColor(Color color) {
        graph.xaxis.setFontColor(color);
        graph.yaxis.setFontColor(color);
    }

    public void setXYAxisVisible(Boolean value) {
        graph.setXYAxisVisible(value);
        jLabel1.setVisible(value);
        labelLeft.setVisible(value);
    }

    public void setMinX(Double value) {
        graph.xaxis.setMin(value);
    }

    public void setMaxX(Double value) {
        graph.xaxis.setMax(value);
    }

    public void setAutoZoomX(Boolean value) {
        graph.setAutoZoomX(value);
    }

    public void setXAxisFormatString(String value) {
        graph.xaxis.setFormatString(value);
    }

    public void setXAxisText(String text) {
        jLabel1.setText(text);
    }

    public void setXAxisTextFont(Font font) {
        jLabel1.setFont(font);
    }

    public void setXAxisTextFontColor(Color color) {
        jLabel1.setForeground(color);
    }

    public void setMinY(Double value) {
        graph.yaxis.setMin(value);
    }

    public void setMaxY(Double value) {
        graph.yaxis.setMax(value);
    }

    public void setAutoZoomY(Boolean value) {
        graph.setAutoZoomY(value);
    }

    public void setYAxisFormatString(String value) {
        graph.yaxis.setFormatString(value);
    }

    public void setYAxisText(String text) {
        labelLeft.setText(text);
    }

    public void setYAxisTextFont(Font font) {
        labelLeft.setFont(font);
    }

    public void setYAxisTextFontColor(Color color) {
        labelLeft.setForeground(color);
    }

    public void setCoordinatesVisible(Boolean value) {
        graph.back.jLabel1.setVisible(value);
    }

    public void setPointType(Integer value) {
        if (graph.graphRenderer.length > 0) graph.graphRenderer[0].pointType = value;
    } // Dummy!

    public void setbufferLen(Integer value) {
        if (graph.graphRenderer.length > 0) graph.graphRenderer[0].bufferLen = value;
    } // Dummy!

    public void setLineColor(Color color) {
        if (graph.graphRenderer.length > 0) graph.graphRenderer[0].setLineColor(color);
    } // Dummy!

    public void setAutoScroll(Boolean value) {
        graph.autoscroll = value;
    }

    // ----------- GETTER ---------
    public Boolean getBackgroundTransparent() {
        return graph.back.getBackgroundTransparent();
    }

    public Color getGridBackgroundColor() {
        return graph.back.getBackground();
    }

    public Color getGridLineColor() {
        return graph.back.colorGrid;
    }

    public Color getGridSublineColor() {
        return graph.back.colorSubGrid;
    }

    public Boolean getNullLineVisible() {
        return graph.back.nullLineVisible;
    }

    public Color getNullLineColor() {
        return graph.back.nullLineColor;
    }

    public Font getXYAxisFont() {
        return graph.xaxis.stdFont;
    }

    public Color getXYAxisFontColor() {
        return graph.xaxis.getFontColor();
    }

    public Boolean getXYAxisVisible() {
        return graph.xyAxisVisible;
    }

    public Double getMinX() {
        return graph.xaxis.getMin();
    }

    public Double getMaxX() {
        return graph.xaxis.getMax();
    }

    public Boolean getAutoZoomX() {
        return graph.back.autoScaleX;
    }

    public Font getXAxisTextFont() {
        return jLabel1.getFont();
    }

    public Color getXAxisTextFontColor() {
        return jLabel1.getForeground();
    }

    public String getXAxisFormatString() {
        return graph.xaxis.getFormatString();
    }

    public String getXAxisText() {
        return jLabel1.getText();
    }

    public Double getMinY() {
        return graph.yaxis.getMin();
    }

    public Double getMaxY() {
        return graph.yaxis.getMax();
    }

    public Boolean getAutoZoomY() {
        return graph.back.autoScaleY;
    }

    public String getYAxisFormatString() {
        return graph.yaxis.getFormatString();
    }

    public String getYAxisText() {
        return labelLeft.getText();
    }

    public Font getYAxisTextFont() {
        return labelLeft.getFont();
    }

    public Color getYAxisTextFontColor() {
        return labelLeft.getForeground();
    }

    public Boolean getAutoScroll() {
        return graph.autoscroll;
    }

    public Boolean getCoordinatesVisible() {
        return graph.back.jLabel1.isVisible();
    }

    public Integer getPointType() {
        if (graph.graphRenderer.length > 0)
            return graph.graphRenderer[0].pointType;
        else
            return GraphRenderer.P_LINE_VBIG;
    }

    public Integer getbufferLen() {
        if (graph.graphRenderer.length > 0)
            return graph.graphRenderer[0].bufferLen;
        else
            return Integer.valueOf(600);
    }

    public Color getLineColor() {
        if (graph.graphRenderer.length > 0)
            return graph.graphRenderer[0].getLineColor();
        else
            // return Color.BLACK;}
            return new Color(255, 153, 0);
    }

    private void formComponentResized(java.awt.event.ComponentEvent evt)// GEN-FIRST:event_formComponentResized
    {// GEN-HEADEREND:event_formComponentResized
        jPanel2.setPreferredSize(new Dimension(labelLeft.getWidth() + graph.p1.x, jPanel2.getHeight()));
    }// GEN-LAST:event_formComponentResized

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
