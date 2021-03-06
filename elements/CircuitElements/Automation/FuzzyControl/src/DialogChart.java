//*****************************************************************************
//* Element of MyOpenLab Library                                              *
//*                                                                           *
//* Copyright (C) 2004  Carmelo Salafia (cswi@gmx.de)                         *
//*                                                                           *
//* This library is free software; you can redistribute it and/or modify      *
//* it under the terms of the GNU Lesser General Public License as published  *
//* by the Free Software Foundation; either version 2.1 of the License,       *
//* or (at your option) any later version.                                    *
//* http://www.gnu.org/licenses/lgpl.html                                     *
//*                                                                           *
//* This library is distributed in the hope that it will be useful,           *
//* but WITHOUTANY WARRANTY; without even the implied warranty of             *
//* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                      *
//* See the GNU Lesser General Public License for more details.               *
//*                                                                           *
//* You should have received a copy of the GNU Lesser General Public License  *
//* along with this library; if not, write to the Free Software Foundation,   *
//* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA                  *
//*****************************************************************************
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import org.jfree.chart.JFreeChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;
/*
 * DialogChart.java
 *
 * Created on 19. Mai 2007, 20:22
 */

/**
 *
 * @author  Carmelo
 */

class MyPanel extends JPanel
{
    public JFreeChart chart;
    public MyPanel(JFreeChart chart)
    {
        this.chart=chart;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;

        if (chart!=null)
        {
          chart.draw(g2,getBounds());
        }

    }
}

public class DialogChart extends javax.swing.JDialog
{

    public  Variable var;
    public  MyNode node;
    private MyPanel panel;


    /** Creates new form DialogChart */
    public DialogChart(java.awt.Frame parent, boolean modal, String title)
    {
        super(parent, modal);
        initComponents();
        setLocationByPlatform(true);
        setTitle(title);
    }
    
    public void close()
    {
      var=null;
      node=null;
      dispose();
    }


    public void init(JFreeChart chart, Variable var, MyNode node)
    {
      this.node=node;
      this.var=var;
      panel=new MyPanel(chart);
      getContentPane().add(panel, BorderLayout.CENTER);
    }
    
    public void updateChart(JFreeChart chart, Variable var, MyNode node)
    {
      this.node=node;
      this.var=var;
      panel.chart=chart;
      
      panel.updateUI();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">
    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        //setBounds((screenSize.width-408)/2, (screenSize.height-327)/2, 408, 327);
        setSize(400,320);

    }// </editor-fold>


}

