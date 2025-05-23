package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.baseclasses.CgpReferenceTag;
import gpclasses.system.CgpRefTagFactory;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.script.*;
import gpclasses.plugins.illuminatedSwitch.*;
import gpclasses.userScripts.*;
import gpclasses.alarms.*;
import java.text.Format;
import java.util.Vector;

public class Panel3 extends CgpPanel
{
	public Panel3XprSrv exprServer;

	public CgpNumericDisplay DebitPompe;
	public CgpNumericDisplay DebitVanne;
	public BarGraph_0009 NiveauCuve;
	public Lamp_0004 H1;
	public Lamp_0004 H02;
	public Lamp_0004 H03;
	public Lamp_0004 H04;
	public Lamp_0006 LimiteCuve;
	public Switch_0008 S00;
	public Switch_0008 S01;
	CgpFont F3;
	CgpFont F5_0;
	public CgpSmartKeypadDec  decKeypad;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel3XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "VueMaintenance";
	}
	public int getPanelID()
	{
		return 3;
	}

	public int getBackColor()
	{
		return 0x00c3bfc3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F3 = new CgpFont("TCP6x10", CgpFont.PLAIN, (byte)10, (byte)6);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();

		DebitPompe = new CgpNumericDisplay(260, 160, 319, 179, panelContext, this);
		DebitPompe.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		DebitPompe.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		DebitPompe.variable = TagDB.PLC_EquipementModbus01.DebitM1;
		DebitPompe.zeroSuppress = true;
		DebitPompe.zeroDisplay = false;
		DebitPompe.displayDigits = 1;
		DebitPompe.decimalPlaces = 2;
		DebitPompe.unitStrings = null;
		CgpFont	fonts1[][] = {
			{ textFont0 },
			};
		DebitPompe.fonts = fonts1;
		DebitPompe.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		DebitPompe.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		DebitPompe.enableInput = true;
		DebitPompe.displayPopupKeypad = true;
		DebitPompe.keypad = decKeypad;
		DebitPompe.beepOnTouch = false;
		DebitPompe.barcode = false;
		DebitPompe.frameColor = 0x006e726e;
		DebitPompe.foreColor = 0x00b2b2b2;
		DebitPompe.textColor = 0x007f0000;
		DebitPompe.text3DColor = 0x00000000;
		DebitPompe.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DebitPompe.changeColor = false;
		DebitPompe.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_Display01(1,1,1,1);
		DebitPompe.drawObject = displayDraw0;
		DebitPompe.alwaysDrawBackground = false;
		DebitPompe.init();

		DebitVanne = new CgpNumericDisplay(260, 200, 319, 219, panelContext, this);
		DebitVanne.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		DebitVanne.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		DebitVanne.variable = TagDB.PLC_EquipementModbus01.DebitY1;
		DebitVanne.zeroSuppress = false;
		DebitVanne.zeroDisplay = true;
		DebitVanne.displayDigits = 1;
		DebitVanne.decimalPlaces = 2;
		DebitVanne.unitStrings = null;
		DebitVanne.fonts = fonts1;
		DebitVanne.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		DebitVanne.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		DebitVanne.enableInput = true;
		DebitVanne.displayPopupKeypad = true;
		DebitVanne.keypad = decKeypad;
		DebitVanne.beepOnTouch = false;
		DebitVanne.barcode = false;
		DebitVanne.frameColor = 0x006e726e;
		DebitVanne.foreColor = 0x00b2b2b2;
		DebitVanne.textColor = 0x007f0000;
		DebitVanne.text3DColor = 0x00000000;
		DebitVanne.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DebitVanne.changeColor = false;
		DebitVanne.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DebitVanne.drawObject = displayDraw0;
		DebitVanne.alwaysDrawBackground = false;
		DebitVanne.init();

		NiveauCuve = new BarGraph_0009(20, 40, 99, 239, panelContext, this);
		NiveauCuve.variableTag = TagDB.PLC_EquipementModbus01.NiveauCuve;
		NiveauCuve.indicatorColor = 0x00ff7f7f;
		NiveauCuve.minValue = 0f;
		NiveauCuve.maxValue = 23f;
		NiveauCuve.foreColor = 0x00b2b2b2;
		NiveauCuve.drawX1 = 21;
		NiveauCuve.drawX2 = 98;
		NiveauCuve.drawY1 = 41;
		NiveauCuve.drawY2 = 238;
		NiveauCuve.fillWidth = 80;
		NiveauCuve.fillStartPoint = 2;
		NiveauCuve.majorScaleWidth = 1;
		NiveauCuve.majorScaleLength = 50;
		NiveauCuve.minorScaleDivisions = 0;

		CgpFont	fonts5[];
		String	labels5[];
		fonts5 = new CgpFont[1];
		labels5 = new String[1];

		labels5[0] = "";

		F5_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts5[0] = F5_0;

		int	nNumDigits5 = 3;
		int	nNumDecimals5 = 0;
		int intArray0[] = {21, 21, 21, };
		NiveauCuve.nLabelsPosX = intArray0;
		int intArray1[] = {226, 134, 41, };
		NiveauCuve.nLabelsPosY = intArray1;
		int intArray2[] = {32, 32, 32, };
		NiveauCuve.nLabelsPosWidth = intArray2;
		int intArray3[] = {13, 13, 13, };
		NiveauCuve.nLabelsPosHeight = intArray3;
		NiveauCuve.horzAlign = CgpText.DISPLAY_ALIGNMENT_RIGHT;
		float floatArray4[] = {0.000000f, 11.500000f, 23.000000f, };
		NiveauCuve.labelValues = floatArray4;
		NiveauCuve.nNumDigits = nNumDigits5;
		NiveauCuve.nNumDecimals = nNumDecimals5;
		NiveauCuve.bDisplayZero = true;
		NiveauCuve.bZeroSupressed = true;
		NiveauCuve.numLabels = 3;

		NiveauCuve.partFonts = fonts5;
		NiveauCuve.labels = labels5;

		NiveauCuve.alwaysDrawBackground = false;
		NiveauCuve.init();
		H1 = new Lamp_0004(120, 180, 159, 199, panelContext, this);
		int intArray5[] = {0x006e726e, 0x006e726e, };
		H1.frameClr = intArray5;
		int intArray6[] = {0x0000007f, 0x0000ff7f, };
		H1.foreClr = intArray6;
		int intArray7[] = {0x00000000, 0x00000000, };
		H1.backClr = intArray7;
		int intArray8[] = {1, 1, };
		H1.pattern = intArray8;
		H1.controlTag01 = TagDB.PLC_EquipementModbus01.H1;

		CgpFont	fonts6[];
		String	labels6[];
		fonts6 = new CgpFont[1];
		labels6 = new String[1];

		labels6[0] = "H1";
		fonts6[0] = F5_0;

		int intArray9[] = {0x00ffffff, 0x00ffffff, };
		H1.labelClr = intArray9;
		H1.label3DClr = intArray7;

		H1.lampFonts = fonts6;
		H1.labels = labels6;

		H1.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H1.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H1.alwaysDrawBackground = false;

		H1.init();
		H02 = new Lamp_0004(120, 140, 159, 159, panelContext, this);
		H02.frameClr = intArray5;
		H02.foreClr = intArray6;
		H02.backClr = intArray7;
		H02.pattern = intArray8;
		H02.controlTag01 = TagDB.PLC_EquipementModbus01.H2;

		CgpFont	fonts7[];
		String	labels7[];
		fonts7 = new CgpFont[1];
		labels7 = new String[1];

		labels7[0] = "H2";
		fonts7[0] = F5_0;

		H02.labelClr = intArray9;
		H02.label3DClr = intArray7;

		H02.lampFonts = fonts7;
		H02.labels = labels7;

		H02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H02.alwaysDrawBackground = false;

		H02.init();
		H03 = new Lamp_0004(120, 100, 159, 119, panelContext, this);
		H03.frameClr = intArray5;
		H03.foreClr = intArray6;
		H03.backClr = intArray7;
		H03.pattern = intArray8;
		H03.controlTag01 = TagDB.PLC_EquipementModbus01.H3;

		CgpFont	fonts8[];
		String	labels8[];
		fonts8 = new CgpFont[1];
		labels8 = new String[1];

		labels8[0] = "H3";
		fonts8[0] = F5_0;

		H03.labelClr = intArray9;
		H03.label3DClr = intArray7;

		H03.lampFonts = fonts8;
		H03.labels = labels8;

		H03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H03.alwaysDrawBackground = false;

		H03.init();
		H04 = new Lamp_0004(120, 60, 159, 79, panelContext, this);
		H04.frameClr = intArray5;
		H04.foreClr = intArray6;
		H04.backClr = intArray7;
		H04.pattern = intArray8;
		H04.controlTag01 = TagDB.PLC_EquipementModbus01.H4;

		CgpFont	fonts9[];
		String	labels9[];
		fonts9 = new CgpFont[1];
		labels9 = new String[1];

		labels9[0] = "H4";
		fonts9[0] = F5_0;

		H04.labelClr = intArray9;
		H04.label3DClr = intArray7;

		H04.lampFonts = fonts9;
		H04.labels = labels9;

		H04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H04.alwaysDrawBackground = false;

		H04.init();
		LimiteCuve = new Lamp_0006(120, 20, 179, 39, panelContext, this);
		int intArray10[] = {0x00c3bfc3, 0x006e726e, };
		LimiteCuve.frameClr = intArray10;
		int intArray11[] = {0x00c3bfc3, 0x0000007f, };
		LimiteCuve.foreClr = intArray11;
		LimiteCuve.backClr = intArray7;
		LimiteCuve.pattern = intArray8;
		LimiteCuve.controlTag01 = TagDB.PLC_EquipementModbus01.B5;

		CgpFont	fonts10[];
		String	labels10[];
		fonts10 = new CgpFont[1];
		labels10 = new String[1];

		labels10[0] = "Limite";
		fonts10[0] = F5_0;

		LimiteCuve.visibID = 1000;
		int intArray12[] = {0x00c3bfc3, 0x00ffffff, };
		LimiteCuve.labelClr = intArray12;
		LimiteCuve.label3DClr = intArray7;

		LimiteCuve.lampFonts = fonts10;
		LimiteCuve.labels = labels10;

		LimiteCuve.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		LimiteCuve.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		LimiteCuve.exprServer = exprServer;
		LimiteCuve.alwaysDrawBackground = false;

		LimiteCuve.init();
		S00 = new Switch_0008(240, 100, 319, 139, panelContext, this);
		S00.frameClr = intArray5;
		int intArray13[] = {0x0044407f, 0x00447fff, };
		S00.foreClr = intArray13;
		S00.backClr = intArray7;
		S00.pattern = intArray8;

		CgpFont	fonts11[];
		String	labels11[];
		fonts11 = new CgpFont[1];
		labels11 = new String[1];

		labels11[0] = "Vider la cuve";
		fonts11[0] = F5_0;

		S00.buzzer = true;
		S00.lampID = 1001;

		S00.switchFonts = fonts11;
		S00.labels = labels11;

		S00.labelClr = intArray9;
		S00.label3DClr = intArray7;
		S00.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S00.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S00.bit0 = TagDB.PLC_EquipementModbus01.Y1;
		S00.exprServer = exprServer;
		S00.alwaysDrawBackground = false;

		S00.init();
		S01 = new Switch_0008(240, 40, 319, 79, panelContext, this);
		S01.frameClr = intArray5;
		S01.foreClr = intArray13;
		S01.backClr = intArray7;
		S01.pattern = intArray8;

		CgpFont	fonts12[];
		String	labels12[];
		fonts12 = new CgpFont[1];
		labels12 = new String[1];

		labels12[0] = "Remplir la cuve";
		fonts12[0] = F5_0;

		S01.buzzer = true;
		S01.lampID = 1002;

		S01.switchFonts = fonts12;
		S01.labels = labels12;

		S01.labelClr = intArray9;
		S01.label3DClr = intArray7;
		S01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S01.bit0 = TagDB.PLC_EquipementModbus01.M1;
		S01.exprServer = exprServer;
		S01.alwaysDrawBackground = false;

		S01.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_EquipementModbus01.DebitM1.addEventListener(DebitPompe, 0, panelContext);
		TagDB.PLC_EquipementModbus01.DebitY1.addEventListener(DebitVanne, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(NiveauCuve, 0, panelContext);
		TagDB.PLC_EquipementModbus01.NiveauCuve.addEventListener(NiveauCuve, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(H1, 0, panelContext);
		TagDB.PLC_EquipementModbus01.H1.addEventListener(H1, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(H02, 0, panelContext);
		TagDB.PLC_EquipementModbus01.H2.addEventListener(H02, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(H03, 0, panelContext);
		TagDB.PLC_EquipementModbus01.H3.addEventListener(H03, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(H04, 0, panelContext);
		TagDB.PLC_EquipementModbus01.H4.addEventListener(H04, 0, panelContext);
		TagDB.PLC_EquipementModbus01.B5.addEventListener(LimiteCuve, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(LimiteCuve, 0, panelContext);
		TagDB.PLC_EquipementModbus01.Y1.addEventListener(S00, 0, panelContext);
		TagDB.PLC_EquipementModbus01.M1.addEventListener(S01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[11];
		zOrderList[0] = DebitPompe;
		zOrderList[1] = DebitVanne;
		zOrderList[2] = NiveauCuve;
		zOrderList[3] = H1;
		zOrderList[4] = H02;
		zOrderList[5] = H03;
		zOrderList[6] = H04;
		zOrderList[7] = LimiteCuve;
		zOrderList[8] = S00;
		zOrderList[9] = S01;
		zOrderList[10] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			S01,
			S00,
			DebitVanne,
			DebitPompe,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB.PLC_EquipementModbus01.B5);
		tagListVector.add(TagDB.PLC_EquipementModbus01.DebitM1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.DebitY1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H2);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H3);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H4);
		tagListVector.add(TagDB.PLC_EquipementModbus01.M1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.NiveauCuve);
		tagListVector.add(TagDB.PLC_EquipementModbus01.Y1);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();

		S01.shutdown();

		S00.shutdown();

		LimiteCuve.shutdown();

		H04.shutdown();

		H03.shutdown();

		H02.shutdown();

		H1.shutdown();

		NiveauCuve.shutdown();

		DebitVanne.shutdown();

		DebitPompe.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		DebitPompe.drawBackground(_g);

		DebitVanne.drawBackground(_g);

		// Texte01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00000000,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Debit M1 :",	// text
			200 + _dx,	// x
			160 + _dy,	// y
			60,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		// Texte02
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00000000,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Debit Y1 :",	// text
			200 + _dx,	// x
			200 + _dy,	// y
			60,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NiveauCuve.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
