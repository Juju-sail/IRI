package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class BarGraph_0003 extends CgpSmartObject
{
	public CgpTag	variableTag = null;
	public int	variableExpr = -1;
	public int	indicatorColor;
	public int	indicatorBlink = 0;
	public int	minValue = 0;
	public int	maxValue = 100;
	private int	validMinValue;
	private int	validMaxValue;
	private int	currentValue = 0;
	private long	totalRange = 100;
	private int	threshold;
	private boolean	useFloat = false;
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

	public int	nBase;
	public int	nNumDecimals;
	public int	numLabels;
	public int	labelValues[];

	private String[]	curLabels;
	private CgpFont[]	curFont;
	public CgpExpressionServer exprServer;

	public BarGraph_0003(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void onInit()
	{

		threshold = 2147483647;
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

			c.drawNumber(labelValues[nLabelNum], nBase, nNumDigits, nNumDecimals, horzAlign, CgpText.DISPLAY_POSITION_MIDDLE, false, useLabelSeperator, !bZeroSupressed, textClr, text3dClr, nLabelsPosX[nLabelNum], nLabelsPosY[nLabelNum], nLabelsPosWidth[nLabelNum], nLabelsPosHeight[nLabelNum], curFont[0]);
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
			currentValue = variableTag.getIntValue(0);
		}
		else if (variableExpr != -1)
		{
			currentValue = exprServer.executeIntExpression(variableExpr);
			quality = exprServer.quality;
		}

		calculateFill();

		return true;
	}

	private void calculateFill()
	{
		int validValue = currentValue;
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

			if (useFloat)
				fillPercentage = ((float)validValue - (float)validMinValue) / (float)totalRange;
			else
				fillPercentage = (float)(validValue - validMinValue) / (validMaxValue - validMinValue);
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

		totalRange = (long)validMaxValue - (long)validMinValue;

		if (totalRange > threshold)
			useFloat = true;
		else
			useFloat = false;
	}

	public String FormatInitalValue()
	{
		String initialValue;
		int nKeypadDecimal = nNumDecimals;
		initialValue = Integer.toString(currentValue);
		if (nKeypadDecimal > 0)
		{
			boolean neg = false;
			if (currentValue < 0)
			{
				neg = true;
				initialValue = Integer.toString(Math.abs(currentValue));
			}
			int initialLength = initialValue.length();
			if (initialLength <= nKeypadDecimal)
			{
				String decValue = "0" + CgpLocater.Decimal_Symbol;
				for (int i=0; i < nKeypadDecimal; i++)
				{
					if (i >= nKeypadDecimal - initialLength)
					{
						decValue = decValue + initialValue;
						break;
					}
					else
					{
						decValue = decValue + "0";
					}
				}
				initialValue = decValue;
			}

			if (neg && initialValue.indexOf("-") == -1)
				initialValue = "-" + initialValue;
		}
		return initialValue;
	}
}

