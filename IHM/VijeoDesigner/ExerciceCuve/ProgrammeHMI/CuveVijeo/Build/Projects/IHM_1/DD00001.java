package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class DD00001
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int foreClr, boolean pressed, int lamp)
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
}
