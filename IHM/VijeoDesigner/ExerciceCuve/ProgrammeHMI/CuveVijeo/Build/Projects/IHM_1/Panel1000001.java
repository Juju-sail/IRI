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
	public Switch_0001 RetourMenu;
	CgpFont F1_0;
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
		return 0x00c3bfc3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		RetourMenu = new Switch_0001(20, 0, 279, 19, panelContext, this);
		RetourMenu.frameClr = 0x006e726e;
		RetourMenu.foreClr = 0x00ff7fff;
		RetourMenu.backClr = 0x00000000;
		RetourMenu.pattern = 1;

		CgpFont	fonts1[];
		String	labels1[];
		fonts1 = new CgpFont[1];
		labels1 = new String[1];

		labels1[0] = "-> Menu Principal";

		F1_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts1[0] = F1_0;

		RetourMenu.buzzer = true;

		RetourMenu.switchFonts = fonts1;
		RetourMenu.labels = labels1;

		int intArray0[] = {0x00ffffff, };
		RetourMenu.labelClr = intArray0;
		int intArray1[] = {0x00000000, };
		RetourMenu.label3DClr = intArray1;
		RetourMenu.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		RetourMenu.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		RetourMenu.panelChange0 = 1;
		RetourMenu.alwaysDrawBackground = false;

		RetourMenu.init();
		((CgpWindow)owner).drawBack();

		CgpGraphics zOrderList[] = new CgpGraphics[1];
		zOrderList[0] = RetourMenu;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			RetourMenu,
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

		RetourMenu.shutdown();
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
		return null;
	}

}
