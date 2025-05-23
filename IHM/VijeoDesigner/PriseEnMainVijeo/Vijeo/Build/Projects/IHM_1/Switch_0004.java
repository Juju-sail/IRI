package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.userScripts.*;

public class Switch_0004 extends CgpSmartObject
{
	private boolean secured = false;
	public int securityLevel = -1;
	public int[]	foreClr;
	public int[]	backClr;
	public int[]	pattern;
	private boolean	pressed = false;
	public boolean	buzzer = false;
	private CgpCanvas	c;
	private int		lamp = 0;
	public int	lampID;
	private int quality = 0;
	public CgpTag	bit0;
	public CgpExpressionServer exprServer;
	public CgpGraphicFile overlayImageOff;
	public CgpGraphicFile overlayImageOn;

	public Switch_0004(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void drawBackground(CgpCanvas c)
	{
	}

	public void draw(int nHandleDC)
	{
		if (c == null)
			c = new CgpCanvas(nHandleDC);

		Round01.draw(c,x1,y1,x2,y2,
			foreClr[lamp],
			backClr[lamp],
			pattern[lamp],
			pressed,
			lamp);

		CgpGraphicFile overlayImage;
		if (lamp == 0)
		{
			overlayImage = overlayImageOff;
		}
		else
		{
			overlayImage = overlayImageOn;
		}

		if (overlayImage != null)
		{
			int imageWidth = overlayImage.getWidth(overlayImage.x1, overlayImage.x2);
			int imageHeight = overlayImage.getHeight(overlayImage.y1, overlayImage.y2);
			c.drawImage(
				overlayImage,
				x1 + (getWidth(x1, x2) - imageWidth) / 2,
				y1 + (getHeight(y1, y2) - imageHeight) / 2
			);
		}

		if(quality == CgpTag.TAG_QUALITY_UNKNOWN)
		{
			c.fillRectWithBorder(	0x00000000, 1, CgpLinePattern.LINE_NONE, x1, y1,
				x2 - x1 + 1, y2 - y1 + 1, 0x80000000, 0x00000000 ,
				CgpFillPattern.FILL_DOWNWARD_DIAGONAL, CgpRectangle.SQUARE_CORNERS, 1, 1);
		}
	}

	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			if(CgpSecurityControl.securityControl.testSecurityAccess(securityLevel))
			{
				secured = false;
				this.clearSecured();
			}
			else
			{
				secured = true;
				this.setSecured();
			}
		}
		lamp = exprServer.executeIntExpression(lampID);
		quality = exprServer.quality;
		return true;
	}

	public boolean onPointerPress(CgpPointerEvent PointerEvent)
	{
		if(secured)
		{
			if (drawSecuredType != DRAW_SECURED_INVISIBLE)
			{
				if(CgpSecurityControl.securityControl.lockedObjectLoginPanel > -1)
					CgpTagDB._CurPanelID.write(CgpSecurityControl.securityControl.lockedObjectLoginPanel);
				return false;
			}
			else
			{
				return false;
			}
		}
		if(PointerEvent.getRepeatCount() == 0)
		{
			pressed = true;
			if(buzzer)
				CgpSystem.beep(false);

			// When Actions
			bit0.bitToggle();
		}

		// While Actions

		return true;
	}

	public boolean onPointerRelease()
	{
		synchronized (this)
		{
			if (secured)
				return false;
			pressed = false;
		}

		// When Actions

		// While Actions

		// Release Actions
		return true;
	}

	public void onInit()
	{
	}

}

