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
	public Lamp_0005 Mode_Auto;
	public Switch_0008 DCY;
	public Switch_0008 Acy;
	CgpFont F1_0;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "ModeAuto";
	}
	public int getPanelID()
	{
		return 2;
	}

	public int getBackColor()
	{
		return 0x007f7f7f;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		Mode_Auto = new Lamp_0005(40, 120, 279, 179, panelContext, this);
		int intArray0[] = {0x006e726e, 0x006e726e, };
		Mode_Auto.frameClr = intArray0;
		int intArray1[] = {0x00c3bfc3, 0x0000ff00, };
		Mode_Auto.foreClr = intArray1;
		int intArray2[] = {0x00000000, 0x00000000, };
		Mode_Auto.backClr = intArray2;
		int intArray3[] = {1, 1, };
		Mode_Auto.pattern = intArray3;
		Mode_Auto.controlTag01 = TagDB.PLC_EquipementModbus01.S_1_2.x;

		CgpFont	fonts1[];
		String	labels1[];
		fonts1 = new CgpFont[1];
		labels1 = new String[1];

		labels1[0] = "Mode auto actif";

		F1_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts1[0] = F1_0;

		int intArray4[] = {0x00ffffff, 0x00ffffff, };
		Mode_Auto.labelClr = intArray4;
		Mode_Auto.label3DClr = intArray2;

		Mode_Auto.lampFonts = fonts1;
		Mode_Auto.labels = labels1;

		Mode_Auto.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Mode_Auto.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Mode_Auto.alwaysDrawBackground = false;

		Mode_Auto.init();
		DCY = new Switch_0008(40, 40, 99, 79, panelContext, this);
		DCY.frameClr = 0x006e726e;
		DCY.foreClr = 0x0000ff00;
		DCY.backClr = 0x00000000;
		DCY.pattern = 1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "Dcy";
		fonts2[0] = F1_0;

		DCY.buzzer = true;

		DCY.switchFonts = fonts2;
		DCY.labels = labels2;

		int intArray5[] = {0x00ffffff, };
		DCY.labelClr = intArray5;
		int intArray6[] = {0x00000000, };
		DCY.label3DClr = intArray6;
		DCY.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		DCY.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		DCY.bit0 = TagDB.PLC_EquipementModbus01.Dcy;
		DCY.alwaysDrawBackground = false;

		DCY.init();
		Acy = new Switch_0008(220, 40, 279, 79, panelContext, this);
		Acy.frameClr = 0x006e726e;
		Acy.foreClr = 0x000000ff;
		Acy.backClr = 0x00000000;
		Acy.pattern = 1;

		CgpFont	fonts3[];
		String	labels3[];
		fonts3 = new CgpFont[1];
		labels3 = new String[1];

		labels3[0] = "Acy";
		fonts3[0] = F1_0;

		Acy.buzzer = true;

		Acy.switchFonts = fonts3;
		Acy.labels = labels3;

		Acy.labelClr = intArray5;
		Acy.label3DClr = intArray6;
		Acy.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Acy.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Acy.bit0 = TagDB.PLC_EquipementModbus01.Acy;
		Acy.alwaysDrawBackground = false;

		Acy.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_EquipementModbus01.S_1_2.x.addEventListener(Mode_Auto, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Mode_Auto, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[3];
		zOrderList[0] = Mode_Auto;
		zOrderList[1] = DCY;
		zOrderList[2] = Acy;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Acy,
			DCY,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB.PLC_EquipementModbus01.S_1_2.x);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		Acy.shutdown();

		DCY.shutdown();

		Mode_Auto.shutdown();
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
