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

public class Panel4 extends CgpPanel
{
	public Switch_0008 BP_ACQ;
	public Switch_0014 BannièreAlarme01_Switch_0014;
	public Switch_0010 Historique;
	CgpFont F2_0;
	CgpFont LBBannièreAlarme01Font[];
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	private Panel1000001 masterPanel = new Panel1000001();
	public static CgpAlarmSummary BannièreAlarme01;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		String BannièreAlarme01Strings[];
		CgpFont BannièreAlarme01Fonts[];

		CgpStringDB dbBannièreAlarme01_0;
		BannièreAlarme01Strings = new String[3];
		BannièreAlarme01Strings[0] = "Date";
		BannièreAlarme01Strings[1] = "Heure";
		BannièreAlarme01Strings[2] = "Etat";
		BannièreAlarme01Fonts = new CgpFont[3];
		BannièreAlarme01Fonts[0] = new CgpFont("TCP8x13", CgpFont.BOLD, (byte)13, (byte)8);
		BannièreAlarme01Fonts[1] = BannièreAlarme01Fonts[0];
		BannièreAlarme01Fonts[2] = BannièreAlarme01Fonts[0];
		dbBannièreAlarme01_0 = new CgpStringDB(BannièreAlarme01Strings, BannièreAlarme01Fonts);

		CgpStringDB BannièreAlarme01DBList[] =
		{
			dbBannièreAlarme01_0,
		};

		int LBBannièreAlarme01Widths[] = {
			100,
			100,
			199,
			399,
		};

		int LBBannièreAlarme01Lengths[] = {
			9999,
			9999,
			9999,
			9999,
		};
		LBBannièreAlarme01Font = new CgpFont[1];
		LBBannièreAlarme01Font[0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		int BannièreAlarme01_columns[] = {
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
			CgpAlarmFormatter.COLUMN_STATE,
			CgpAlarmFormatter.COLUMN_MESSAGE,
		};

		CgpAlarmFormatter BannièreAlarme01_formatter = new CgpAlarmFormatter(CgpDate.YY_MM_DD, CgpDate.H24_MM_SS,"",
			BannièreAlarme01_columns, null);
		BannièreAlarme01 = new CgpAlarmSummary(
			0,
			40,
			279,
			69,
			true,
			IgpAlarmGroupConstants.ACTIVE_DISP_MODE,
			TagDB.GroupeAlarmes1,
			BannièreAlarme01_formatter,
			LBBannièreAlarme01Font,
			panelContext
		);
		CgpMultiLineListBox BannièreAlarme01_listbox = new CgpMultiLineListBox(
			0,
			40,
			279,
			69,
			LBBannièreAlarme01Font[0],
			0x00000000,
			3,
			LBBannièreAlarme01Widths,
			LBBannièreAlarme01Lengths,
			true,
			true,
			true,
			0,
			0,
			false,
			false,
			false,
			BannièreAlarme01,
			0,
			panelContext,
			2
		);
		CgpAlarmColorMgr BannièreAlarme01_Colors	= new CgpAlarmColorMgr();
		int[] BannièreAlarme01_DefaultTextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] BannièreAlarme01_DefaultBackColors	= { 0x000000ff, 0x0000ffff, 0x0000ff00, 0x00000000 };
		int[] BannièreAlarme01_DefaultTextBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] BannièreAlarme01_DefaultBackBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };

		BannièreAlarme01_Colors.defaultTextColors	= BannièreAlarme01_DefaultTextColors;
		BannièreAlarme01_Colors.defaultBackColors	= BannièreAlarme01_DefaultBackColors;
		BannièreAlarme01_Colors.defaultTextBlink = BannièreAlarme01_DefaultTextBlink;
		BannièreAlarme01_Colors.defaultBackBlink = BannièreAlarme01_DefaultBackBlink;
		BannièreAlarme01.setColorSet(BannièreAlarme01_Colors);

		BannièreAlarme01_listbox.setFrame(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		BannièreAlarme01_listbox.setRule(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		BannièreAlarme01_listbox.setFixedTextColors(0x00000000, 0x007f7f7f);
		BannièreAlarme01.setListBox(BannièreAlarme01_listbox);
		BannièreAlarme01.setAutoCursorOn(true);
		BannièreAlarme01.setSortBy(CgpAlarmSummary.SORT_BY_STATE_SEVERITY);
		BannièreAlarme01.enableSubDisplay();


		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Defauts";
	}
	public int getPanelID()
	{
		return 4;
	}

	public int getBackColor()
	{
		return 0x007f7f7f;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		BP_ACQ = new Switch_0008(240, 200, 299, 239, panelContext, this);
		BP_ACQ.frameClr = 0x006e726e;
		BP_ACQ.foreClr = 0x0000ffff;
		BP_ACQ.backClr = 0x00000000;
		BP_ACQ.pattern = 1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "ACQ";

		F2_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts2[0] = F2_0;

		BP_ACQ.buzzer = true;

		BP_ACQ.switchFonts = fonts2;
		BP_ACQ.labels = labels2;

		int intArray0[] = {0x00000000, };
		BP_ACQ.labelClr = intArray0;
		BP_ACQ.label3DClr = intArray0;
		BP_ACQ.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		BP_ACQ.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		BP_ACQ.bit0 = TagDB.PLC_EquipementModbus01.Acq;
		BP_ACQ.alwaysDrawBackground = false;

		BP_ACQ.init();
		BannièreAlarme01_Switch_0014 = new Switch_0014(278, 40, 319, 79, panelContext, this);
		BannièreAlarme01_Switch_0014.foreClr = 0x007f7f7f;
		nativeImage0 = new CgpGraphicFile( "Bitmap14.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		BannièreAlarme01_Switch_0014.image01 = nativeImage0;
		BannièreAlarme01_Switch_0014.image02 = nativeImage0;
		BannièreAlarme01_Switch_0014.alarm0 = BannièreAlarme01;
		BannièreAlarme01_Switch_0014.buzzer = true;
		BannièreAlarme01_Switch_0014.alwaysDrawBackground = false;

		Historique = new Switch_0010(120, 200, 179, 239, panelContext, this);
		Historique.foreClr = 0x007f7fff;
		nativeImage1 = new CgpGraphicFile( "Bitmap2.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Historique.image01 = nativeImage1;
		Historique.image02 = nativeImage1;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[1];
		labels4 = new String[1];

		labels4[0] = "Historique defauts";
		fonts4[0] = F2_0;

		Historique.buzzer = true;

		Historique.switchFonts = fonts4;
		Historique.labels = labels4;

		Historique.labelClr = intArray0;
		Historique.label3DClr = intArray0;
		Historique.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Historique.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Historique.panelChange0 = 5;
		Historique.alwaysDrawBackground = false;

		Historique.init();
		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(BannièreAlarme01, contextObject);

		CgpGraphics zOrderList[] = new CgpGraphics[4];
		zOrderList[0] = BP_ACQ;
		zOrderList[1] = BannièreAlarme01_Switch_0014;
		zOrderList[2] = BannièreAlarme01;
		zOrderList[3] = Historique;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Historique,
			BannièreAlarme01,
			BannièreAlarme01_Switch_0014,
			BP_ACQ,
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
		nativeImage0.clean();
		nativeImage1.clean();
		BannièreAlarme01.clean();

		Historique.shutdown();

		BannièreAlarme01_Switch_0014.shutdown();

		BP_ACQ.shutdown();
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
