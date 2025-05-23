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

public class Panel1000001 extends CgpMasterPanel 
{
	public Panel1000001XprSrv exprServer;

	public CgpNumericDisplay DateDuJour;
	public CgpNumericDisplay HeureCourante;
	public Switch_0002 Go_Home;
	public Lamp_0014 Defaut_actif;
	CgpFont F3_0;
	CgpMasterPanelLayer[] masterPanels = new CgpMasterPanelLayer[]
	{
		new CgpMasterPanelLayer(-1, this)
	};

	final int graphicalPanelLayerNum = 1;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel1000001XprSrv();
	}
	public String getPanelName()
	{
		return "BaseCommune";
	}
	public int getPanelID()
	{
		return 1000001;
	}

	public int getBackColor()
	{
		return 0x007f7f7f;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);


		DateDuJour = new CgpNumericDisplay(219, 0, 319, 19, panelContext, this);
		DateDuJour.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDuJour.dateTimeFormat = CgpDate.DD_MM_YYYY;
		DateDuJour.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts1[][] = {
			{ textFont0 },
			};
		DateDuJour.fonts = fonts1;
		DateDuJour.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		DateDuJour.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		DateDuJour.enableInput = false;
		DateDuJour.barcode = false;
		DateDuJour.frameColor = 0x006e726e;
		DateDuJour.foreColor = 0x00b2b2b2;
		DateDuJour.textColor = 0x00ffffff;
		DateDuJour.text3DColor = 0x00000000;
		DateDuJour.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DateDuJour.changeColor = false;
		DateDuJour.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		DateDuJour.drawObject = displayDraw0;
		DateDuJour.alwaysDrawBackground = false;
		DateDuJour.init();

		HeureCourante = new CgpNumericDisplay(0, 0, 79, 19, panelContext, this);
		HeureCourante.dataType = CgpNumericDisplay.DATA_TYPE_TIME;
		HeureCourante.dateTimeFormat = CgpDate.H24_MM;
		HeureCourante.dateTimeListenVariable = TagDB._Minutes;
		HeureCourante.fonts = fonts1;
		HeureCourante.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		HeureCourante.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		HeureCourante.enableInput = false;
		HeureCourante.barcode = false;
		HeureCourante.frameColor = 0x006e726e;
		HeureCourante.foreColor = 0x00b2b2b2;
		HeureCourante.textColor = 0x00ffffff;
		HeureCourante.text3DColor = 0x00000000;
		HeureCourante.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		HeureCourante.changeColor = false;
		HeureCourante.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		HeureCourante.drawObject = displayDraw0;
		HeureCourante.alwaysDrawBackground = false;
		HeureCourante.init();
		Go_Home = new Switch_0002(100, 0, 199, 19, panelContext, this);
		Go_Home.frameClr = 0x006e726e;
		Go_Home.foreClr = 0x00ff7fff;
		Go_Home.backClr = 0x00000000;
		Go_Home.pattern = 1;

		CgpFont	fonts3[];
		String	labels3[];
		fonts3 = new CgpFont[1];
		labels3 = new String[1];

		labels3[0] = "-> Menu";

		F3_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts3[0] = F3_0;

		Go_Home.buzzer = true;

		Go_Home.switchFonts = fonts3;
		Go_Home.labels = labels3;

		int intArray0[] = {0x00000000, };
		Go_Home.labelClr = intArray0;
		Go_Home.label3DClr = intArray0;
		Go_Home.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Go_Home.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Go_Home.panelChange0 = 1;
		Go_Home.alwaysDrawBackground = false;

		Go_Home.init();
		Defaut_actif = new Lamp_0014(0, 200, 79, 239, panelContext, this);
		int intArray1[] = {0x006e726e, 0x006e726e, };
		Defaut_actif.frameClr = intArray1;
		int intArray2[] = {0x00c3bfc3, 0x000000ff, };
		Defaut_actif.foreClr = intArray2;
		int intArray3[] = {0x00000000, 0x00000000, };
		Defaut_actif.backClr = intArray3;
		int intArray4[] = {1, 1, };
		Defaut_actif.pattern = intArray4;
		Defaut_actif.blinkID = 1000;
		Defaut_actif.blinkSpeed = CgpBlinkAnimation.SPEED_SLOW;
		Defaut_actif.controlTag01 = TagDB.PLC_EquipementModbus01.Defaut_actif;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[1];
		labels4 = new String[1];

		labels4[0] = "Defaut(s) actif(s) !";
		fonts4[0] = F3_0;

		Defaut_actif.visibID = 1001;
		int intArray5[] = {0x00ffffff, 0x00ffffff, };
		Defaut_actif.labelClr = intArray5;
		Defaut_actif.label3DClr = intArray3;

		Defaut_actif.lampFonts = fonts4;
		Defaut_actif.labels = labels4;

		Defaut_actif.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Defaut_actif.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Defaut_actif.exprServer = exprServer;
		Defaut_actif.alwaysDrawBackground = false;

		Defaut_actif.init();
		((CgpWindow)owner).drawBack();
		TagDB._Day.addEventListener(DateDuJour, 0, panelContext);
		TagDB._Minutes.addEventListener(HeureCourante, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Defaut_actif, 0, panelContext);
		TagDB.PLC_EquipementModbus01.Defaut_actif.addEventListener(Defaut_actif, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[4];
		zOrderList[0] = DateDuJour;
		zOrderList[1] = HeureCourante;
		zOrderList[2] = Go_Home;
		zOrderList[3] = Defaut_actif;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Go_Home,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB._Day);
		tagListVector.add(TagDB._Minutes);
		tagListVector.add(TagDB.PLC_EquipementModbus01.Defaut_actif);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		Defaut_actif.shutdown();

		Go_Home.shutdown();

		HeureCourante.shutdown();

		DateDuJour.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		DateDuJour.drawBackground(_g);

		HeureCourante.drawBackground(_g);

		return true;
	}
	public CgpMasterPanelLayer[] getMasterPanelList()
	{
		return masterPanels;
	}

	public int getGraphicalPanelLayerNum()
	{
		return graphicalPanelLayerNum;
	}

	public CgpExpressionServer getExpressionServer()
	{
		return exprServer;
	}

}
