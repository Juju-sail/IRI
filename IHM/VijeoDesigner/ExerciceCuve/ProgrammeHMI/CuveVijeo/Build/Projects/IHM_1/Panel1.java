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

public class Panel1 extends CgpPanel
{
	public Switch_0001 VueCuve;
	public Switch_0001 VueCuve01;
	CgpFont F1;
	CgpFont F2_0;
	private CgpMasterPanel masterPanel = null;
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
		return "MenuPrincipal";
	}
	public int getPanelID()
	{
		return 1;
	}

	public int getBackColor()
	{
		return 0x00c3bfc3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("TCP13x23F", CgpFont.BOLD, (byte)23, (byte)13);

		VueCuve = new Switch_0001(80, 100, 239, 139, panelContext, this);
		VueCuve.frameClr = 0x006e726e;
		VueCuve.foreClr = 0x00ff7f7f;
		VueCuve.backClr = 0x00000000;
		VueCuve.pattern = 1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "-> Vue Cuve";

		F2_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts2[0] = F2_0;

		VueCuve.buzzer = true;

		VueCuve.switchFonts = fonts2;
		VueCuve.labels = labels2;

		int intArray0[] = {0x00ffffff, };
		VueCuve.labelClr = intArray0;
		int intArray1[] = {0x00000000, };
		VueCuve.label3DClr = intArray1;
		VueCuve.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VueCuve.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VueCuve.panelChange0 = 2;
		VueCuve.alwaysDrawBackground = false;

		VueCuve.init();
		VueCuve01 = new Switch_0001(80, 160, 239, 199, panelContext, this);
		VueCuve01.frameClr = 0x006e726e;
		VueCuve01.foreClr = 0x00ff7f7f;
		VueCuve01.backClr = 0x00000000;
		VueCuve01.pattern = 1;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[1];
		labels4 = new String[1];

		labels4[0] = "-> Vue Maintenance";
		fonts4[0] = F2_0;

		VueCuve01.buzzer = true;

		VueCuve01.switchFonts = fonts4;
		VueCuve01.labels = labels4;

		VueCuve01.labelClr = intArray0;
		VueCuve01.label3DClr = intArray1;
		VueCuve01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VueCuve01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VueCuve01.panelChange0 = 3;
		VueCuve01.alwaysDrawBackground = false;

		VueCuve01.init();
		((CgpWindow)owner).drawBack();

		CgpGraphics zOrderList[] = new CgpGraphics[2];
		zOrderList[0] = VueCuve;
		zOrderList[1] = VueCuve01;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			VueCuve01,
			VueCuve,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		VueCuve01.shutdown();

		VueCuve.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Texte01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00000000,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Menu Principal",	// text
			20 + _dx,	// x
			24 + _dy,	// y
			280,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
