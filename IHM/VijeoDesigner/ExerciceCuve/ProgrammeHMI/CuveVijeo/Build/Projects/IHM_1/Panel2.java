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

public class Panel2 extends CgpPanel
{
	public Panel2XprSrv exprServer;

	public BarGraph_0003 NiveauCuve;
	public Lamp_0004 H1;
	public Lamp_0004 H02;
	public Lamp_0004 H03;
	public Lamp_0004 H04;
	public Switch_0009 S1;
	public Switch_0008 S02;
	public Switch_0008 S03;
	public Switch_0008 S04;
	public Switch_0008 S00;
	public Lamp_0006 LimiteCuve;
	CgpFont F1_0;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel2XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "VueCuve";
	}
	public int getPanelID()
	{
		return 2;
	}

	public int getBackColor()
	{
		return 0x00c3bfc3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);


		NiveauCuve = new BarGraph_0003(40, 40, 119, 239, panelContext, this);
		NiveauCuve.variableTag = TagDB.PLC_EquipementModbus01.NiveauCuve;
		NiveauCuve.indicatorColor = 0x00ff7f7f;
		NiveauCuve.minValue = 0;
		NiveauCuve.maxValue = 23;
		NiveauCuve.foreColor = 0x00b2b2b2;
		NiveauCuve.drawX1 = 41;
		NiveauCuve.drawX2 = 118;
		NiveauCuve.drawY1 = 41;
		NiveauCuve.drawY2 = 238;
		NiveauCuve.fillWidth = 80;
		NiveauCuve.fillStartPoint = 2;
		NiveauCuve.majorScaleWidth = 1;
		NiveauCuve.majorScaleLength = 50;
		NiveauCuve.minorScaleDivisions = 0;

		CgpFont	fonts1[];
		String	labels1[];
		fonts1 = new CgpFont[1];
		labels1 = new String[1];

		labels1[0] = "";

		F1_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts1[0] = F1_0;

		int	nNumDigits1 = 3;
		int	nBase1 = 10;
		int	nNumDecimals1 = 0;
		int intArray0[] = {41, 41, 41, };
		NiveauCuve.nLabelsPosX = intArray0;
		int intArray1[] = {226, 134, 41, };
		NiveauCuve.nLabelsPosY = intArray1;
		int intArray2[] = {32, 32, 32, };
		NiveauCuve.nLabelsPosWidth = intArray2;
		int intArray3[] = {13, 13, 13, };
		NiveauCuve.nLabelsPosHeight = intArray3;
		NiveauCuve.horzAlign = CgpText.DISPLAY_ALIGNMENT_RIGHT;
		NiveauCuve.labelValues = new int[]{0, 11, 23, };
		NiveauCuve.nBase = nBase1;
		NiveauCuve.nNumDigits = nNumDigits1;
		NiveauCuve.nNumDecimals = nNumDecimals1;
		NiveauCuve.bDisplayZero = true;
		NiveauCuve.bZeroSupressed = true;
		NiveauCuve.numLabels = 3;

		NiveauCuve.partFonts = fonts1;
		NiveauCuve.labels = labels1;

		NiveauCuve.alwaysDrawBackground = false;
		NiveauCuve.init();
		H1 = new Lamp_0004(140, 180, 179, 199, panelContext, this);
		int intArray4[] = {0x006e726e, 0x006e726e, };
		H1.frameClr = intArray4;
		int intArray5[] = {0x0000007f, 0x0000ff7f, };
		H1.foreClr = intArray5;
		int intArray6[] = {0x00000000, 0x00000000, };
		H1.backClr = intArray6;
		int intArray7[] = {1, 1, };
		H1.pattern = intArray7;
		H1.controlTag01 = TagDB.PLC_EquipementModbus01.H1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "H1";
		fonts2[0] = F1_0;

		int intArray8[] = {0x00ffffff, 0x00ffffff, };
		H1.labelClr = intArray8;
		H1.label3DClr = intArray6;

		H1.lampFonts = fonts2;
		H1.labels = labels2;

		H1.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H1.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H1.alwaysDrawBackground = false;

		H1.init();
		H02 = new Lamp_0004(140, 140, 179, 159, panelContext, this);
		H02.frameClr = intArray4;
		H02.foreClr = intArray5;
		H02.backClr = intArray6;
		H02.pattern = intArray7;
		H02.controlTag01 = TagDB.PLC_EquipementModbus01.H2;

		CgpFont	fonts3[];
		String	labels3[];
		fonts3 = new CgpFont[1];
		labels3 = new String[1];

		labels3[0] = "H2";
		fonts3[0] = F1_0;

		H02.labelClr = intArray8;
		H02.label3DClr = intArray6;

		H02.lampFonts = fonts3;
		H02.labels = labels3;

		H02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H02.alwaysDrawBackground = false;

		H02.init();
		H03 = new Lamp_0004(140, 100, 179, 119, panelContext, this);
		H03.frameClr = intArray4;
		H03.foreClr = intArray5;
		H03.backClr = intArray6;
		H03.pattern = intArray7;
		H03.controlTag01 = TagDB.PLC_EquipementModbus01.H3;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[1];
		labels4 = new String[1];

		labels4[0] = "H3";
		fonts4[0] = F1_0;

		H03.labelClr = intArray8;
		H03.label3DClr = intArray6;

		H03.lampFonts = fonts4;
		H03.labels = labels4;

		H03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H03.alwaysDrawBackground = false;

		H03.init();
		H04 = new Lamp_0004(140, 60, 179, 79, panelContext, this);
		H04.frameClr = intArray4;
		H04.foreClr = intArray5;
		H04.backClr = intArray6;
		H04.pattern = intArray7;
		H04.controlTag01 = TagDB.PLC_EquipementModbus01.H4;

		CgpFont	fonts5[];
		String	labels5[];
		fonts5 = new CgpFont[1];
		labels5 = new String[1];

		labels5[0] = "H4";
		fonts5[0] = F1_0;

		H04.labelClr = intArray8;
		H04.label3DClr = intArray6;

		H04.lampFonts = fonts5;
		H04.labels = labels5;

		H04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		H04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		H04.alwaysDrawBackground = false;

		H04.init();
		S1 = new Switch_0009(240, 160, 319, 179, panelContext, this);
		S1.frameClr = intArray4;
		int intArray9[] = {0x0044407f, 0x00447fff, };
		S1.foreClr = intArray9;
		S1.backClr = intArray6;
		S1.pattern = intArray7;

		CgpFont	fonts6[];
		String	labels6[];
		fonts6 = new CgpFont[1];
		labels6 = new String[1];

		labels6[0] = "Ordre : 1";
		fonts6[0] = F1_0;

		S1.buzzer = true;
		S1.lampID = 1000;

		S1.switchFonts = fonts6;
		S1.labels = labels6;

		S1.labelClr = intArray8;
		S1.label3DClr = intArray6;
		S1.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S1.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S1.bit0 = TagDB.PLC_EquipementModbus01.S1;
		S1.exprServer = exprServer;
		S1.alwaysDrawBackground = false;

		S1.init();
		S02 = new Switch_0008(240, 120, 319, 139, panelContext, this);
		S02.frameClr = intArray4;
		S02.foreClr = intArray9;
		S02.backClr = intArray6;
		S02.pattern = intArray7;

		CgpFont	fonts7[];
		String	labels7[];
		fonts7 = new CgpFont[1];
		labels7 = new String[1];

		labels7[0] = "Ordre : 2";
		fonts7[0] = F1_0;

		S02.buzzer = true;
		S02.lampID = 1001;

		S02.switchFonts = fonts7;
		S02.labels = labels7;

		S02.labelClr = intArray8;
		S02.label3DClr = intArray6;
		S02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S02.bit0 = TagDB.PLC_EquipementModbus01.S2;
		S02.exprServer = exprServer;
		S02.alwaysDrawBackground = false;

		S02.init();
		S03 = new Switch_0008(240, 80, 319, 99, panelContext, this);
		S03.frameClr = intArray4;
		S03.foreClr = intArray9;
		S03.backClr = intArray6;
		S03.pattern = intArray7;

		CgpFont	fonts8[];
		String	labels8[];
		fonts8 = new CgpFont[1];
		labels8 = new String[1];

		labels8[0] = "Ordre : 3";
		fonts8[0] = F1_0;

		S03.buzzer = true;
		S03.lampID = 1002;

		S03.switchFonts = fonts8;
		S03.labels = labels8;

		S03.labelClr = intArray8;
		S03.label3DClr = intArray6;
		S03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S03.bit0 = TagDB.PLC_EquipementModbus01.S3;
		S03.exprServer = exprServer;
		S03.alwaysDrawBackground = false;

		S03.init();
		S04 = new Switch_0008(240, 40, 319, 59, panelContext, this);
		S04.frameClr = intArray4;
		S04.foreClr = intArray9;
		S04.backClr = intArray6;
		S04.pattern = intArray7;

		CgpFont	fonts9[];
		String	labels9[];
		fonts9 = new CgpFont[1];
		labels9 = new String[1];

		labels9[0] = "Ordre : 4";
		fonts9[0] = F1_0;

		S04.buzzer = true;
		S04.lampID = 1003;

		S04.switchFonts = fonts9;
		S04.labels = labels9;

		S04.labelClr = intArray8;
		S04.label3DClr = intArray6;
		S04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S04.bit0 = TagDB.PLC_EquipementModbus01.S4;
		S04.exprServer = exprServer;
		S04.alwaysDrawBackground = false;

		S04.init();
		S00 = new Switch_0008(240, 200, 319, 239, panelContext, this);
		S00.frameClr = intArray4;
		S00.foreClr = intArray9;
		S00.backClr = intArray6;
		S00.pattern = intArray7;

		CgpFont	fonts10[];
		String	labels10[];
		fonts10 = new CgpFont[1];
		labels10 = new String[1];

		labels10[0] = "Vider la cuve";
		fonts10[0] = F1_0;

		S00.buzzer = true;
		S00.lampID = 1004;

		S00.switchFonts = fonts10;
		S00.labels = labels10;

		S00.labelClr = intArray8;
		S00.label3DClr = intArray6;
		S00.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		S00.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		S00.bit0 = TagDB.PLC_EquipementModbus01.S0;
		S00.exprServer = exprServer;
		S00.alwaysDrawBackground = false;

		S00.init();
		LimiteCuve = new Lamp_0006(140, 20, 199, 39, panelContext, this);
		int intArray10[] = {0x00c3bfc3, 0x006e726e, };
		LimiteCuve.frameClr = intArray10;
		int intArray11[] = {0x00c3bfc3, 0x0000007f, };
		LimiteCuve.foreClr = intArray11;
		LimiteCuve.backClr = intArray6;
		LimiteCuve.pattern = intArray7;
		LimiteCuve.controlTag01 = TagDB.PLC_EquipementModbus01.B5;

		CgpFont	fonts13[];
		String	labels13[];
		fonts13 = new CgpFont[1];
		labels13 = new String[1];

		labels13[0] = "Limite";
		fonts13[0] = F1_0;

		LimiteCuve.visibID = 1005;
		int intArray12[] = {0x00c3bfc3, 0x00ffffff, };
		LimiteCuve.labelClr = intArray12;
		LimiteCuve.label3DClr = intArray6;

		LimiteCuve.lampFonts = fonts13;
		LimiteCuve.labels = labels13;

		LimiteCuve.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		LimiteCuve.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		LimiteCuve.exprServer = exprServer;
		LimiteCuve.alwaysDrawBackground = false;

		LimiteCuve.init();
		((CgpWindow)owner).drawBack();
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
		TagDB.PLC_EquipementModbus01.S1.addEventListener(S1, 0, panelContext);
		TagDB.PLC_EquipementModbus01.S2.addEventListener(S02, 0, panelContext);
		TagDB.PLC_EquipementModbus01.S3.addEventListener(S03, 0, panelContext);
		TagDB.PLC_EquipementModbus01.S4.addEventListener(S04, 0, panelContext);
		TagDB.PLC_EquipementModbus01.S0.addEventListener(S00, 0, panelContext);
		TagDB.PLC_EquipementModbus01.B5.addEventListener(LimiteCuve, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(LimiteCuve, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[11];
		zOrderList[0] = NiveauCuve;
		zOrderList[1] = H1;
		zOrderList[2] = H02;
		zOrderList[3] = H03;
		zOrderList[4] = H04;
		zOrderList[5] = S1;
		zOrderList[6] = S02;
		zOrderList[7] = S03;
		zOrderList[8] = S04;
		zOrderList[9] = S00;
		zOrderList[10] = LimiteCuve;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			S00,
			S04,
			S03,
			S02,
			S1,
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
		tagListVector.add(TagDB.PLC_EquipementModbus01.H1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H2);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H3);
		tagListVector.add(TagDB.PLC_EquipementModbus01.H4);
		tagListVector.add(TagDB.PLC_EquipementModbus01.NiveauCuve);
		tagListVector.add(TagDB.PLC_EquipementModbus01.S0);
		tagListVector.add(TagDB.PLC_EquipementModbus01.S1);
		tagListVector.add(TagDB.PLC_EquipementModbus01.S2);
		tagListVector.add(TagDB.PLC_EquipementModbus01.S3);
		tagListVector.add(TagDB.PLC_EquipementModbus01.S4);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		LimiteCuve.shutdown();

		S00.shutdown();

		S04.shutdown();

		S03.shutdown();

		S02.shutdown();

		S1.shutdown();

		H04.shutdown();

		H03.shutdown();

		H02.shutdown();

		H1.shutdown();

		NiveauCuve.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		NiveauCuve.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
