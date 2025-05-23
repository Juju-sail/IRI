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

public class Panel5 extends CgpPanel
{
	public Switch_0011 Historique_Switch_0011;
	public Switch_0012 Historique_Switch_0012;
	public Switch_0013 Historique_Switch_0013;
	CgpFont LBHistoriqueFont[];
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile nativeImage2;
	private Panel1000001 masterPanel = new Panel1000001();
	public static CgpAlarmSummary Historique;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		String HistoriqueStrings[];
		CgpFont HistoriqueFonts[];

		CgpStringDB dbHistorique_0;
		HistoriqueStrings = new String[4];
		HistoriqueStrings[0] = "Message";
		HistoriqueStrings[1] = "Date";
		HistoriqueStrings[2] = "Heure";
		HistoriqueStrings[3] = "Etat";
		HistoriqueFonts = new CgpFont[4];
		HistoriqueFonts[0] = new CgpFont("TCP8x13", CgpFont.BOLD, (byte)13, (byte)8);
		HistoriqueFonts[1] = HistoriqueFonts[0];
		HistoriqueFonts[2] = HistoriqueFonts[0];
		HistoriqueFonts[3] = HistoriqueFonts[0];
		dbHistorique_0 = new CgpStringDB(HistoriqueStrings, HistoriqueFonts);

		CgpStringDB HistoriqueDBList[] =
		{
			dbHistorique_0,
		};

		int LBHistoriqueWidths[] = {
			150,
			100,
			100,
			100,
		};

		int LBHistoriqueLengths[] = {
			9999,
			9999,
			9999,
			9999,
		};
		LBHistoriqueFont = new CgpFont[1];
		LBHistoriqueFont[0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		int Historique_columns[] = {
			CgpAlarmFormatter.COLUMN_MESSAGE,
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
			CgpAlarmFormatter.COLUMN_STATE,
		};

		CgpAlarmFormatter Historique_formatter = new CgpAlarmFormatter(CgpDate.YY_MM_DD, CgpDate.H24_MM_SS,"",
			Historique_columns, null);
		Historique = new CgpAlarmSummary(
			20,
			80,
			299,
			199,
			false,
			IgpAlarmGroupConstants.HISTORY_DISP_MODE,
			TagDB.GroupeAlarmes1,
			Historique_formatter,
			LBHistoriqueFont,
			panelContext
		);
		CgpListBox Historique_listbox = new CgpListBox (
			20,
			80,
			299,
			199,
			LBHistoriqueFont[0],
			0x00000000,
			1,
			LBHistoriqueWidths,
			LBHistoriqueLengths,
			true,
			false,
			true,
			20,
			20,
			true,
			true,
			false,
			Historique,
			0,
			panelContext
		);
		CgpAlarmColorMgr Historique_Colors	= new CgpAlarmColorMgr();
		int[] Historique_DefaultTextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] Historique_DefaultBackColors	= { 0x000000ff, 0x0000ffff, 0x0000ff00, 0x00000000 };
		int[] Historique_DefaultTextBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] Historique_DefaultBackBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };

		Historique_Colors.defaultTextColors	= Historique_DefaultTextColors;
		Historique_Colors.defaultBackColors	= Historique_DefaultBackColors;
		Historique_Colors.defaultTextBlink = Historique_DefaultTextBlink;
		Historique_Colors.defaultBackBlink = Historique_DefaultBackBlink;
		int[] Historique_Severity1_TextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] Historique_Severity1_BackColors	= { 0x000000ff, 0x0000ffff, 0x0000ff00, 0x0000ff00 };
		int[] Historique_Severity1_TextBlink	= { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] Historique_Severity1_BackBlink	= { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		Historique_Colors.setColorsForSeverity(1, Historique_Severity1_TextColors, Historique_Severity1_BackColors, Historique_Severity1_TextBlink, Historique_Severity1_BackBlink );
		Historique.setColorSet(Historique_Colors);

		Historique_listbox.setTitle(HistoriqueDBList, 0x00ffffff, 0x00000000);
		Historique_listbox.setFrame(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		Historique_listbox.setRule(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		Historique.setListBox(Historique_listbox);
		Historique.setAutoCursorOn(true);


		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Historique_Defauts";
	}
	public int getPanelID()
	{
		return 5;
	}

	public int getBackColor()
	{
		return 0x007f7f7f;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		Historique_Switch_0011 = new Switch_0011(20, 40, 59, 79, panelContext, this);
		Historique_Switch_0011.foreClr = 0x007f7f7f;
		nativeImage0 = new CgpGraphicFile( "Bitmap17.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Historique_Switch_0011.image01 = nativeImage0;
		Historique_Switch_0011.image02 = nativeImage0;
		Historique_Switch_0011.alarm0 = Historique;
		Historique_Switch_0011.buzzer = true;
		Historique_Switch_0011.alwaysDrawBackground = false;

		Historique_Switch_0012 = new Switch_0012(60, 40, 99, 79, panelContext, this);
		Historique_Switch_0012.foreClr = 0x007f7f7f;
		nativeImage1 = new CgpGraphicFile( "Bitmap16.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Historique_Switch_0012.image01 = nativeImage1;
		Historique_Switch_0012.image02 = nativeImage1;
		Historique_Switch_0012.alarm0 = Historique;
		Historique_Switch_0012.buzzer = true;
		Historique_Switch_0012.alwaysDrawBackground = false;

		Historique_Switch_0013 = new Switch_0013(100, 40, 139, 79, panelContext, this);
		Historique_Switch_0013.foreClr = 0x007f7f7f;
		nativeImage2 = new CgpGraphicFile( "Bitmap15.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Historique_Switch_0013.image01 = nativeImage2;
		Historique_Switch_0013.image02 = nativeImage2;
		Historique_Switch_0013.alarm0 = Historique;
		Historique_Switch_0013.buzzer = true;
		Historique_Switch_0013.alwaysDrawBackground = false;

		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(Historique, contextObject);

		CgpGraphics zOrderList[] = new CgpGraphics[4];
		zOrderList[0] = Historique_Switch_0011;
		zOrderList[1] = Historique_Switch_0012;
		zOrderList[2] = Historique_Switch_0013;
		zOrderList[3] = Historique;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Historique,
			Historique_Switch_0013,
			Historique_Switch_0012,
			Historique_Switch_0011,
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
		nativeImage2.clean();
		Historique.clean();

		Historique_Switch_0013.shutdown();

		Historique_Switch_0012.shutdown();

		Historique_Switch_0011.shutdown();
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
