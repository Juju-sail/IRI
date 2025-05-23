package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.macroobjects.*;
import gpclasses.graphics.*;
import gpclasses.animations.*;
import gpclasses.plugins.script.*;
import gpclasses.util.io.*;
import gpclasses.tags.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.userScripts.*;
import gpclasses.plugins.remoteTargetAlarms.*;
import gpclasses.plugins.illuminatedSwitch.*;



public class Startup extends CgpStartup
{
	public static CgpScript DateTime;
	public static Object DateTimeTimerContext;

	// Dialog table member declaration

	public static void main (String args[])
	{
		enableTimeSync(CgpStartup.NO_SYNC_MODE, -1);
		startupObject = new Startup();
		CgpStartup.main(args);

		CgpSystem.setAppBuildDateAndTimeString("23/05/2025", "11:05:32");
	}

	public String[] getPublishedPanels()
	{
		return null;
	}

	public int getDisplayWidth()
	{
		return 320;
	}

	public int getDisplayHeight()
	{
		return 240;
	}

	public CgpWindow[] getPopupWindows()
	{
		CgpWindow[] windowList =
		{
			// empty
		};
		return windowList;
	}

	protected void preInitProject()
	{
		TagDB.StaticInit();
		new Projects.IHM_1.TagDB();
		CgpSystem.projectName = "Projects/IHM_1";
	}

	protected void postInitProject()
	{
		CgpSmartKeypad.setKeypadProperty( true,
						0x00ffffff,
						0x00ffffff,
						0x009f5f1f,
						0x005f3f1f,
						0x00744e14,
						CgpSmartKeypad.LAYOUT_3PAGE
						);

		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		gpclasses.system.CgpSystem.TM.setMinPeriodicInterval(100);
		Projects.IHM_1.TagDB._ExternalCmdTag.addEventListener(CgpScript.loadScript("Projects/IHM_1/ExternalCmdScript"), 0, iPersistentContext);
		Projects.IHM_1.TagDB._CurPanelID.addEventListener(CgpScript.loadScript("gpclasses/system/CgpChangePanelScript"), 0, iPersistentContext);
		DateTime = new CgpDateTimeUpdateScript();
		DateTimeTimerContext = gpclasses.system.CgpSystem.TM.createContext(CgpThread.MAX_PRIORITY-1);
		gpclasses.system.CgpSystem.TM.addTimerScript(DateTime, 1000, DateTimeTimerContext);
		gpclasses.system.CgpSystem.baseWindow.setPanelHistory(32);
		gpclasses.system.CgpSystem.TEM.setAnyHDATags(false);

		gpclasses.system.CgpSystem.setShowSystemErrorWindow(true);

		char seps[] = {' '};
		CgpLanguageMgr.languageMgr.setSeperators(seps);

		CgpFont fonts[] = {
			new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8),
		};
		CgpLanguageMgr.languageMgr.setApplicationLanguageFonts(fonts);



		if (CgpSystem.isPlatform(CgpSystem.HMI)) CgpHdaHistorian.setAutoFlushTime(0);

		// Protocol info
		CgpCommManager.setStringProperty("EquipementModbus01", "Con_Protocol", "Modbus TCP/IP");

		// Dialog Table Functions

		gpclasses.system.CgpSystem.globalCursor = new CgpCursor("MouseArrow.bmp", "MouseHand.bmp", 20, 25, CgpColor.makeTransparentColor(0x00333333));

		gpclasses.system.CgpSystem.globalCursor.setTimeout(30);
	}

	protected void openScripts()
	{
	}

	protected void shutdownProject()
	{
		TagDB.GroupeAlarmes1.clean();
	}

	public String getRevisionNumber()
	{
		return "7";
	}

	public void setupProjectPersistents()
	{
		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		CgpSystem.TEM.registerTagList(iPersistentContext, null, null);
	}
}
