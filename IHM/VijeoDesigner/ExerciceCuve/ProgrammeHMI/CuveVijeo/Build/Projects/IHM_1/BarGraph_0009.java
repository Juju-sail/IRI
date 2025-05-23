package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class BarGraph_0009 extends CgpSmartObject
{
	public CgpTag	variableTag = null;
	public int	variableExpr = -1;
	public int	indicatorColor;
	public int	indicatorBlink = 0;
	public float	minValue = 0;
	public float	maxValue = 100;
	private float	validMinValue;
	private float	validMaxValue;
	private float	currentValue = 0;
	private float	totalRange = 100;
	private CgpCanvas	c;
	public boolean	useLabelSeperator = false;
	public int	foreColor = 0x00df1f1f;
	public int	drawX1 = 0;
	public int	drawY1 = 0;
	public int	drawX2 = 0;
	public int	drawY2 = 0;
	public int	fillWidth = 50;
	public int	fillStartPoint = 0;
	private int	barAreaX;
	private int	barAreaY;
	private int	barAreaWidth;
	private int	barAreaHeight;
	private int	barX;
	private int	barY;
	private int	barWidth;
	private int	barHeight;
	private int quality = CgpTag.TAG_QUALITY_UNKNOWN;
	public int	scaleColor = 0x00ffffff;
	public int	majorScaleDivisions = 10;
	public int	majorScaleWidth = 3;
	public int	majorScaleLength = 25;
	public int	minorScaleDivisions = 2;
	public int	minorScaleWidth = 1;
	public int	minorScaleLength = 10;
	public int	majorScaleLeftAndTopAdj = 0;
	public int	majorScaleRightAndBottomAdj = 0;
	public int	minorScaleLeftAndTopAdj = 0;
	public int	minorScaleRightAndBottomAdj = 0;
	private int	majorScaleX1;
	private int	majorScaleY1;
	private int	majorScaleX2;
	private int	majorScaleY2;
	private int	minorScaleX1;
	private int	minorScaleY1;
	private int	minorScaleX2;
	private int	minorScaleY2;
	public int	textClr = 0x00ffffff;
	public int	text3dClr = 0x00000000;

	// Label related declaration
	public CgpFont[] partFonts;
	public String[] labels;

	public int	direction = CgpText.DISPLAY_DIRECTION_HORIZONTAL;
	public int	vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
	public int	horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;

	public boolean	bDisplayZero = true;
	public boolean	bZeroSupressed = true;
	public int	nLabelsPosX[] ;
	public int	nLabelsPosY[] ;
	public int	nLabelsPosWidth[] ;
	public int	nLabelsPosHeight[] ;

	// Automatic label related declaration
	public int	nNumDigits;

	public int	nNumDecimals;
	public int	numLabels;
	public float	labelValues[];

	private String[]	curLabels;
	private CgpFont[]	curFont;
	public CgpExpressionServer exprServer;

	public BarGraph_0009(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void onInit()
	{

		calculateTotalRange();

		int areaScaleAndBarX1 = drawX1;
		int areaScaleAndBarY1 = drawY1 + majorScaleLeftAndTopAdj;
		int areaScaleAndBarX2 = drawX2;
		int areaScaleAndBarY2 = drawY2 - majorScaleRightAndBottomAdj;
		int nLabelsPosWidthMax = 0;
		int nLabelsPosHeightMax = 0;
		for (int nIndex = 0; nIndex < numLabels; nIndex++)
		{
			if (nLabelsPosWidthMax < nLabelsPosWidth[nIndex])
				nLabelsPosWidthMax = nLabelsPosWidth[nIndex];
			if (nLabelsPosHeightMax < nLabelsPosHeight[nIndex])
				nLabelsPosHeightMax = nLabelsPosHeight[nIndex];
		}

		areaScaleAndBarX1 = areaScaleAndBarX1 + nLabelsPosWidthMax;
		int areaScaleAndBarWidth = areaScaleAndBarX2 - areaScaleAndBarX1 + 1;
		int areaScaleAndBarHeight = areaScaleAndBarY2 - areaScaleAndBarY1 + 1;

		minorScaleDivisions = majorScaleDivisions * minorScaleDivisions;

		barAreaX = (int)(areaScaleAndBarX2 - areaScaleAndBarWidth * fillWidth / 100.0f) + 1;
		barAreaY = areaScaleAndBarY1;
		barAreaWidth = (int)(areaScaleAndBarWidth * fillWidth / 100.0f);
		barAreaHeight = areaScaleAndBarHeight;
		majorScaleY1 = areaScaleAndBarY1;
		majorScaleY2 = areaScaleAndBarY2;
		majorScaleX2 = barAreaX - 1 - majorScaleRightAndBottomAdj;
		majorScaleX1 = (int)(barAreaX - 1 - (areaScaleAndBarWidth - barAreaWidth) * majorScaleLength / 100.0f + 1) + majorScaleLeftAndTopAdj;
		minorScaleY1 = majorScaleY1;
		minorScaleY2 = majorScaleY2;
		minorScaleX2 = barAreaX - 1 - minorScaleRightAndBottomAdj;
		minorScaleX1 = (int)(barAreaX - 1 - (areaScaleAndBarWidth - barAreaWidth) * majorScaleLength / 100.0f * minorScaleLength / 100.0f + 1) + minorScaleLeftAndTopAdj;

		// Calculate the label values for Automatic Label
		for (int label = 0; label < numLabels; label++)
		{
		}

		curFont = partFonts;
		curLabels = labels;
	}

	public void move(int sDelta, boolean bHoriz)
	{
		super.move(sDelta,bHoriz);

		onInit();
	}


	public void drawBackground(CgpCanvas c)
	{
		DD00001.draw(c,x1,y1,x2,y2, foreColor, false, 0);
		c.drawScale(minorScaleX1, minorScaleY1, minorScaleX2, minorScaleY2, true, scaleColor, 0x0, minorScaleWidth, (int)CgpLinePattern.LINE_SOLID, minorScaleDivisions);
		c.drawScale(majorScaleX1, majorScaleY1, majorScaleX2, majorScaleY2, true, scaleColor, 0x0, majorScaleWidth, (int)CgpLinePattern.LINE_SOLID, majorScaleDivisions);

		// Automatic Label Draw
		for (int nLabelNum = 0; nLabelNum < numLabels; nLabelNum++)
		{
			if (!bDisplayZero && labelValues[nLabelNum] == 0)
				continue;

			c.drawNumber(labelValues[nLabelNum], nNumDigits, nNumDecimals, horzAlign, CgpText.DISPLAY_POSITION_MIDDLE, false, useLabelSeperator, !bZeroSupressed, textClr, text3dClr, nLabelsPosX[nLabelNum], nLabelsPosY[nLabelNum], nLabelsPosWidth[nLabelNum], nLabelsPosHeight[nLabelNum], curFont[0]);
		}
	}

	public void draw(int nHandleDC)
	{
		if (c == null)
			c = new CgpCanvas(nHandleDC);

		if(quality == CgpTag.TAG_QUALITY_UNKNOWN)
		{
			c.fillRect(barAreaX, barAreaY, barAreaWidth, barAreaHeight, indicatorColor, 0x0, CgpFillPattern.FILL_DOWNWARD_DIAGONAL, 0);
		}
		else
		{
			c.fillRect(barX, barY, barWidth, barHeight, indicatorColor, 0x0, CgpLinePattern.LINE_SOLID, 0);
		}

	}
	
	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			checkSecurity();
		}
		if (DataChangeEvent != null && variableTag == DataChangeEvent.tag)
		{
			quality = variableTag.getTagDataQuality();
			currentValue = variableTag.getFloatValue(0);
		}
		else if (variableExpr != -1)
		{
			currentValue = exprServer.executeFloatExpression(variableExpr);
			quality = exprServer.quality;
		}

		calculateFill();

		return true;
	}

	private void calculateFill()
	{
		float validValue = currentValue;
		float fillPercentage;
		if (validMinValue == validMaxValue)
		{
			fillPercentage = 0;
		}
		else
		{
			if (currentValue > validMaxValue)
				validValue = validMaxValue;
			else if (currentValue < validMinValue)
				validValue = validMinValue;

			fillPercentage = (validValue - validMinValue) / totalRange;
		}

		barHeight = (int)(barAreaHeight * fillPercentage);
		barX = barAreaX;
		barY = (int)(barAreaY + barAreaHeight - barHeight);
		barWidth = barAreaWidth;
	}

	private void calculateTotalRange()
	{
		validMinValue = minValue;
		validMaxValue = maxValue;
		if (minValue > maxValue)
		{
			validMaxValue = minValue;
			validMinValue = maxValue;
		}

		totalRange = validMaxValue - validMinValue;
	}

	public String FormatInitalValue()
	{
		String initialValue;
		int nKeypadDecimal = nNumDecimals;
		initialValue = CgpNumericDisplay.formatAndRoundDecimal((double)currentValue, nKeypadDecimal, nKeypadDecimal);
		return initialValue;
	}
}

