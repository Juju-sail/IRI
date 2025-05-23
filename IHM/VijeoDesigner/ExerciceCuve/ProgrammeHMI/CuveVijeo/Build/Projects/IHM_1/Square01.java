package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class Square01
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int frameClr, int foreClr, int backClr, int pattern, boolean pressed, int lamp)
{
if(pressed)
{
	if(lamp > 0)
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
	else
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
}
else
{
	if(lamp > 0)
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
	else
	{
		// Rectangle
		c.fillRectWithBorder(
			frameClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
}
}
}
