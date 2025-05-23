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

	public Lamp_0003 IN_01;
	public Switch_0004 OUT_01_pilot;
	CgpFont F3;
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
		return "ModeManu";
	}
	public int getPanelID()
	{
		return 3;
	}

	public int getBackColor()
	{
		return 0x007f7f7f;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F3 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		IN_01 = new Lamp_0003(115, 55, 139, 79, panelContext, this);
		int intArray0[] = {0x000000ff, 0x0000ff7f, };
		IN_01.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		IN_01.backClr = intArray1;
		int intArray2[] = {1, 1, };
		IN_01.pattern = intArray2;
		IN_01.controlTag01 = TagDB.PLC_EquipementModbus01.IN_01;
		IN_01.alwaysDrawBackground = false;

		IN_01.init();
		OUT_01_pilot = new Switch_0004(180, 55, 204, 79, panelContext, this);
		OUT_01_pilot.foreClr = intArray0;
		OUT_01_pilot.backClr = intArray1;
		OUT_01_pilot.pattern = intArray2;
		OUT_01_pilot.buzzer = true;
		OUT_01_pilot.lampID = 1000;
		OUT_01_pilot.bit0 = TagDB.PLC_EquipementModbus01.OUT_01;
		OUT_01_pilot.exprServer = exprServer;
		OUT_01_pilot.alwaysDrawBackground = false;

		OUT_01_pilot.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_EquipementModbus01.IN_01.addEventListener(IN_01, 0, panelContext);
		TagDB.PLC_EquipementModbus01.OUT_01.addEventListener(OUT_01_pilot, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[2];
		zOrderList[0] = IN_01;
		zOrderList[1] = OUT_01_pilot;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			OUT_01_pilot,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB.PLC_EquipementModbus01.IN_01);
		tagListVector.add(TagDB.PLC_EquipementModbus01.OUT_01);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		OUT_01_pilot.shutdown();

		IN_01.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Texte01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"IN_01 : ",	// text
			0 + _dx,	// x
			60 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_RIGHT,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		// Texte02
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			" : OUT_01",	// text
			220 + _dx,	// x
			60 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_LEFT,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
