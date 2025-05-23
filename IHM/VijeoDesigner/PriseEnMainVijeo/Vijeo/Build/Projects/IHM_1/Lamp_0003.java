package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class Lamp_0003 extends CgpSmartObject
{
	private int	curState = 0;

	public int	controlID01 = -1;
	public CgpTag	controlTag01;
	public int[]	foreClr;
	public int[]	backClr;
	public int[]	pattern;
	public CgpExpressionServer exprServer;
	private int quality = 0;
	private CgpCanvas	c;

	public int	statesNum = 2;
	public Lamp_0003(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
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

		Round01.draw(c,x1,y1,x2,y2,foreClr[curState],backClr[curState],pattern[curState],false,0);
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
			checkSecurity();
		}
		if(controlID01 != -1)
		{
			curState = (exprServer.executeIntExpression(controlID01) != 0)?1:0;
			quality = exprServer.quality;
		}
		else
		{
			curState = (controlTag01.getIntValue(0) != 0)?1:0;
			quality = controlTag01.getTagDataQuality();
		}
		if(curState > statesNum - 1 || curState < 0)
			curState = statesNum;
		return true;
	}

	public void onInit()
	{
	}

}

