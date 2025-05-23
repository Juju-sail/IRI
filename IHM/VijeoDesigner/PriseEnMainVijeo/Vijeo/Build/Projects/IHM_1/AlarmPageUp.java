package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class AlarmPageUp
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int foreClr, CgpGraphicFile image, boolean pressed, int lamp)
{
if(pressed)
{
	if(lamp > 0)
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

		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + halfWidth + -18),
				(y1 + halfHeight + -18)
			);

		}
	}
	else
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

		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + halfWidth + -18),
				(y1 + halfHeight + -18)
			);

		}
	}
}
else
{
	if(lamp > 0)
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
			0x00ffffff,	// LineColor
			0x00000000,	// ShadowColor
			1	// line width
		);

		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + halfWidth + -19),
				(y1 + halfHeight + -19)
			);

		}
	}
	else
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
			0x00ffffff,	// LineColor
			0x00000000,	// ShadowColor
			1	// line width
		);

		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + halfWidth + -19),
				(y1 + halfHeight + -19)
			);

		}
	}
}
}
}
