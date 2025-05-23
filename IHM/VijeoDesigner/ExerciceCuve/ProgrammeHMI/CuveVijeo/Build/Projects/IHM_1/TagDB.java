package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.macroobjects.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.plugins.remoteTargetAlarms.*;

import gpclasses.plugins.illuminatedSwitch.*;

import java.util.Hashtable;

import Projects.ConfigurationMenu.ConfigTagDB;

public class TagDB extends ConfigTagDB
{
	public static int startNumber = CgpTagDB.NUM_SYSTEM_TAGS;
	public static Integer persistentContextObject = new Integer(CgpTagEventManager.getContextID(0));
	private static byte errorHandle = (byte)0;

	public static _Folder1_1 PLC_EquipementModbus01;

	// Dialog table members decalration

	public static CgpBaseAlarmGroup GroupeAlarmes1;


	static void StaticInit()
	{
		errorHandle = CgpSystem.configureErrorHandling("UserInputMgr.txt");

		CgpHdaHistorian.setTopOfDay(0);

		CgpAlarmBuffer.setTrackUsersACK(false);

		String[] GroupeAlarmes1TypeMsgs_0 = { "Très bas", };
		String[] GroupeAlarmes1TypeMsgs_1 = { "Bas", };
		String[] GroupeAlarmes1TypeMsgs_2 = { "NRML", };
		String[] GroupeAlarmes1TypeMsgs_3 = { "Haut", };
		String[] GroupeAlarmes1TypeMsgs_4 = { "Très haut", };
		String[] GroupeAlarmes1TypeMsgs_5 = { "Min. (%)", };
		String[] GroupeAlarmes1TypeMsgs_6 = { "Max. (%)", };
		String[] GroupeAlarmes1TypeMsgs_7 = { "Min. (F)", };
		String[] GroupeAlarmes1TypeMsgs_8 = { "Max. (F)", };
		String[] GroupeAlarmes1StateMsgs_0 = { "ACTIF", };
		String[] GroupeAlarmes1StateMsgs_1 = { "ACQ", };
		String[] GroupeAlarmes1StateMsgs_2 = { "Retombée", };
		String[] GroupeAlarmes1StateMsgs_3 = { "", };
		String[] GroupeAlarmes1Labels	= { "GroupeAlarmes1", };

		GroupeAlarmes1 = CgpAlarmGroup.createAlarmGroup(1, 0, 100, 100, false, IgpAlarmGroupConstants.OPTIONAL_ACK_MODE);
		GroupeAlarmes1.setGroupName("GroupeAlarmes1");
		GroupeAlarmes1.setTypeMessage(
				GroupeAlarmes1TypeMsgs_0,
				GroupeAlarmes1TypeMsgs_1,
				GroupeAlarmes1TypeMsgs_2,
				GroupeAlarmes1TypeMsgs_3,
				GroupeAlarmes1TypeMsgs_4,
				GroupeAlarmes1TypeMsgs_5,
				GroupeAlarmes1TypeMsgs_6,
				GroupeAlarmes1TypeMsgs_7,
				GroupeAlarmes1TypeMsgs_8);
		GroupeAlarmes1.setStateMessage(
				GroupeAlarmes1StateMsgs_0,
				GroupeAlarmes1StateMsgs_1,
				GroupeAlarmes1StateMsgs_2,
				GroupeAlarmes1StateMsgs_3);
		GroupeAlarmes1.setGroupLabels( GroupeAlarmes1Labels );

		GroupeAlarmes1.setSharing(IgpAlarmEventDsConstants.SHARING_NONE);


		CgpExpressionServer.expressionServer = new XprSrv();
	}

	public TagDB()
	{
		super(109);
		//buildClassFactory();
		//super.buildClassFactory();
	}

	public void instantiate(int tagId)
	{
		classFactory(tagId);
	}

	public void buildClassFactory()
	{
		CgpSystem.buildClassFactory(getClass(), null, startNumber);
	}


	public static Object classFactory(int tagFieldIdentifier)
	{
		return TagDB0.classFactory1(tagFieldIdentifier);
	}

}
