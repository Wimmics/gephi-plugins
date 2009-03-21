/*
Copyright 2008 WebAtlas
Authors : Mathieu Bastian, Mathieu Jacomy, Julian Bilcke
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package gephi.visualization.swing;

import gephi.visualization.config.VizConfig;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Polygon;
import javax.media.opengl.GLJPanel;

public class GraphPanel extends GraphDrawable {

	private GLJPanel gljPanel;

	public GraphPanel()
	{
		super();

		//Init GLJPanel as the drawable
		gljPanel = new GLJPanel(getCaps(),null,null)
		{
			@Override
			public void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D)g;
				render2DBackground(g2d);
				super.paintComponent(g2d);
				render2DForeground(g2d);
			}

		};
		//gljPanel.setOpaque(false);
        
		graphComponent = gljPanel;
        gljPanel.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

		super.initDrawable(gljPanel);

		//Basic panel init
		gljPanel.setLayout(null);	
	}




	public GLJPanel getPanel()
	{
		return gljPanel;
	}


	private void render2DBackground(Graphics2D g)
	{

	}


	private void render2DForeground(Graphics2D g)
	{
		g.setColor(Color.red);
		g.drawString(""+fps, 10, 15);

        int[] xP = new int[4];
        xP[0] = (int)engine.getGraphLimits()[0];
        xP[1] = (int)engine.getGraphLimits()[0];
        xP[2] = (int)engine.getGraphLimits()[1];
        xP[3] = (int)engine.getGraphLimits()[1];
        int[] yP = new int[4];
        yP[0] = viewport.get(3) - (int)engine.getGraphLimits()[2];
        yP[1] = viewport.get(3) - (int)engine.getGraphLimits()[3];
        yP[2] = viewport.get(3) - (int)engine.getGraphLimits()[3];
        yP[3] = viewport.get(3) - (int)engine.getGraphLimits()[2];
        g.drawPolygon(xP,yP,4);
	}
}
