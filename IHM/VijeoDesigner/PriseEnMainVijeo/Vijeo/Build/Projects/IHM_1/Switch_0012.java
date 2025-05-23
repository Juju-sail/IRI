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

public class Switch_0012 extends CgpSmartObject
{
	private boolean secured = false;
	public int securityLevel = -1;
	public int	foreClr;
	public CgpGraphicFile	image01;
	public CgpGraphicFile	image02;
	private boolean	pressed = false;
	public boolean	buzzer = false;
	private CgpCanvas	c;
	public CgpAlarmSummary	alarm0;
	public CgpExpressionServer exprServer;
	public CgpGraphicFile overlayImageOff;
	public CgpGraphicFile overlayImageOn;

	public Switch_0012(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
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

		CgpGraphicFile image;
		if(!pressed)
			image = image01;
		else
			image = image02;
		AlarmPageUp.draw(c,x1,y1,x2,y2,
			foreClr,
			image,
			pressed,
			0);

		if (overlayImageOff != null)
		{
			int imageWidth = overlayImageOff.getWidth(overlayImageOff.x1, overlayImageOff.x2);
			int imageHeight = overlayImageOff.getHeight(overlayImageOff.y1, overlayImageOff.y2);
			c.drawImage(
				overlayImageOff,
				x1 + (getWidth(x1, x2) - imageWidth) / 2,
				y1 + (getHeight(y1, y2) - imageHeight) / 2
			);
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
			alarm0.pageUp();
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

