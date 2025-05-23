package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.util.misc.*;

public class D_DD00001 extends CgpNumericDisplayDraw
{

	public D_DD00001 (int _x1Offset, int _y1Offset, int _x2Offset, int _y2Offset)
	{
		super(_x1Offset, _y1Offset, _x2Offset, _y2Offset);
	}

	public void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2,  int frameClr, int foreClr)
	{
		// 3DRect
		c.drawBevelButton(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0),
			(y2 - 0),
			foreClr,	// ForeColor
			0x00000000,	// BackColor
			1,	// Pattern
			0x00000000,	// LineColor
			0x00ffffff,	// ShadowColor
			1	// line width
		);

	}
	public void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int frameClr, int foreClr)
	{
	}
}
