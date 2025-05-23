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
	public Switch_0002 Go_ModeAuto;
	public Switch_0002 Go_ModeManu;
	public Switch_0002 Go_Defauts;
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
		return "MenuNavigation";
	}
	public int getPanelID()
	{
		return 1;
	}

	public int getBackColor()
	{
		return 0x007f7f7f;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		Go_ModeAuto = new Switch_0002(60, 60, 259, 99, panelContext, this);
		Go_ModeAuto.frameClr = 0x006e726e;
		Go_ModeAuto.foreClr = 0x00ff7f7f;
		Go_ModeAuto.backClr = 0x00000000;
		Go_ModeAuto.pattern = 1;

		CgpFont	fonts1[];
		String	labels1[];
		fonts1 = new CgpFont[1];
		labels1 = new String[1];

		labels1[0] = "-> AUTO";

		F1_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts1[0] = F1_0;

		Go_ModeAuto.buzzer = true;

		Go_ModeAuto.switchFonts = fonts1;
		Go_ModeAuto.labels = labels1;

		int intArray0[] = {0x00000000, };
		Go_ModeAuto.labelClr = intArray0;
		Go_ModeAuto.label3DClr = intArray0;
		Go_ModeAuto.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Go_ModeAuto.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Go_ModeAuto.panelChange0 = 2;
		Go_ModeAuto.alwaysDrawBackground = false;

		Go_ModeAuto.init();
		Go_ModeManu = new Switch_0002(60, 120, 259, 159, panelContext, this);
		Go_ModeManu.frameClr = 0x006e726e;
		Go_ModeManu.foreClr = 0x00ff7f7f;
		Go_ModeManu.backClr = 0x00000000;
		Go_ModeManu.pattern = 1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "-> MANU";
		fonts2[0] = F1_0;

		Go_ModeManu.buzzer = true;

		Go_ModeManu.switchFonts = fonts2;
		Go_ModeManu.labels = labels2;

		Go_ModeManu.labelClr = intArray0;
		Go_ModeManu.label3DClr = intArray0;
		Go_ModeManu.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Go_ModeManu.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Go_ModeManu.panelChange0 = 3;
		Go_ModeManu.alwaysDrawBackground = false;

		Go_ModeManu.init();
		Go_Defauts = new Switch_0002(60, 180, 259, 219, panelContext, this);
		Go_Defauts.frameClr = 0x006e726e;
		Go_Defauts.foreClr = 0x00ff7f7f;
		Go_Defauts.backClr = 0x00000000;
		Go_Defauts.pattern = 1;

		CgpFont	fonts3[];
		String	labels3[];
		fonts3 = new CgpFont[1];
		labels3 = new String[1];

		labels3[0] = "-> DEFAUTS";
		fonts3[0] = F1_0;

		Go_Defauts.buzzer = true;

		Go_Defauts.switchFonts = fonts3;
		Go_Defauts.labels = labels3;

		Go_Defauts.labelClr = intArray0;
		Go_Defauts.label3DClr = intArray0;
		Go_Defauts.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Go_Defauts.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Go_Defauts.panelChange0 = 4;
		Go_Defauts.alwaysDrawBackground = false;

		Go_Defauts.init();
		((CgpWindow)owner).drawBack();

		CgpGraphics zOrderList[] = new CgpGraphics[3];
		zOrderList[0] = Go_ModeAuto;
		zOrderList[1] = Go_ModeManu;
		zOrderList[2] = Go_Defauts;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Go_Defauts,
			Go_ModeManu,
			Go_ModeAuto,
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

		Go_Defauts.shutdown();

		Go_ModeManu.shutdown();

		Go_ModeAuto.shutdown();
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
