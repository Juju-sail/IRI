package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class Round01
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int foreClr, int backClr, int pattern, boolean pressed, int lamp)
{
if(pressed)
{
	if(lamp > 0)
	{
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			foreClr	// LineColor
		);

		}
		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + (width * 25 + 50) / 100),
			(y1 + (height * 25 + 50) / 100),
			(x1 + halfWidth + 0)-(x1 + (width * 25 + 50) / 100)+1,
			(y1 + halfHeight + 0)-(y1 + (height * 25 + 50) / 100)+1,
			0x00ffffff,	// ForeColor
			backClr,	// BackColor
			1,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			0x00ffffff	// LineColor
		);

		}
	}
	else
	{
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			foreClr	// LineColor
		);

		}
		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + (width * 25 + 50) / 100),
			(y1 + (height * 25 + 50) / 100),
			(x1 + halfWidth + 0)-(x1 + (width * 25 + 50) / 100)+1,
			(y1 + halfHeight + 0)-(y1 + (height * 25 + 50) / 100)+1,
			0x00ffffff,	// ForeColor
			backClr,	// BackColor
			1,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			0x00ffffff	// LineColor
		);

		}
	}
}
else
{
	if(lamp > 0)
	{
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			foreClr	// LineColor
		);

		}
		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + (width * 25 + 50) / 100),
			(y1 + (height * 25 + 50) / 100),
			(x1 + halfWidth + 0)-(x1 + (width * 25 + 50) / 100)+1,
			(y1 + halfHeight + 0)-(y1 + (height * 25 + 50) / 100)+1,
			0x00ffffff,	// ForeColor
			backClr,	// BackColor
			1,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			0x00ffffff	// LineColor
		);

		}
	}
	else
	{
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			foreClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			foreClr	// LineColor
		);

		}
		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		{
		// Ellipse
		c.fillOvalWithBorder(
			(x1 + (width * 25 + 50) / 100),
			(y1 + (height * 25 + 50) / 100),
			(x1 + halfWidth + 0)-(x1 + (width * 25 + 50) / 100)+1,
			(y1 + halfHeight + 0)-(y1 + (height * 25 + 50) / 100)+1,
			0x00ffffff,	// ForeColor
			backClr,	// BackColor
			1,	// Pattern
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			0x00ffffff	// LineColor
		);

		}
	}
}
}
}
