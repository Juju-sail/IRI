package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class Lamp_0004 extends CgpSmartObject
{
	public CgpFont[] lampFonts;
	public String[] labels;
	public int[] labelClr;
	public int[] label3DClr;
	public int direction;
	public int vertAlign;
	public int horzAlign;
	private int	curState = 0;

	public int	controlID01 = -1;
	public CgpTag	controlTag01;
	public int[]	frameClr;
	public int[]	foreClr;
	public int[]	backClr;
	public int[]	pattern;
	public CgpExpressionServer exprServer;

	private String[]	curLabels;
	private CgpFont[]	curFont;
	private int quality = 0;
	private CgpCanvas	c;

	public int	statesNum = 2;
	public Lamp_0004(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
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


		int labelX = (x1 + 0);
		int labelY = (y1 + 0);
		int labelWidth = (x2 - 0)-(x1 + 0)+1;
		int labelHeight = (y2 - 0)-(y1 + 0)+1;

		curLabels = labels;
		curFont = lampFonts;
		Square01.draw(c,x1,y1,x2,y2,frameClr[curState],foreClr[curState],backClr[curState],pattern[curState],false,0);

	c.drawStringWithBorder(CgpColor.makeTransparentColor(0), labelClr[curState], CgpColor.makeTransparentColor(0), label3DClr[curState], 1, 1, curLabels[0], labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[0]);

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

		curFont = lampFonts;
		curLabels = labels;
	}

}

