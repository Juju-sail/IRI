package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB2
{
	public static Object classFactory3(int tagFieldIdentifier)
	{
		TagDB.PLC_EquipementModbus01.Acq = new CgpDiscreteTag("PLC_EquipementModbus01.Acq", 1, TagDB.startNumber + 0, true, false, true);

		TagDB.PLC_EquipementModbus01.Acy = new CgpDiscreteTag("PLC_EquipementModbus01.Acy", 1, TagDB.startNumber + 1, true, false, true);

		TagDB.PLC_EquipementModbus01.Dcy = new CgpDiscreteTag("PLC_EquipementModbus01.Dcy", 1, TagDB.startNumber + 2, true, false, true);

		TagDB.PLC_EquipementModbus01.Defaut_actif = new CgpDiscreteTag("PLC_EquipementModbus01.Defaut_actif", 1, TagDB.startNumber + 3, true, false, true);
		String[] _Msg_1_48 =
		{
		"conditions initiales NOK", 
				};
		TagDB.PLC_EquipementModbus01.Defaut_actif.alarm = new CgpDiscreteAlarm(1, _Msg_1_48, -1, TagDB.GroupeAlarmes1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.PLC_EquipementModbus01.Defaut_actif.addEventListener(TagDB.GroupeAlarmes1, TagDB.persistentContextObject);

		TagDB.PLC_EquipementModbus01.IN_01 = new CgpDiscreteTag("PLC_EquipementModbus01.IN_01", 1, TagDB.startNumber + 4, true, false, true);

		TagDB.PLC_EquipementModbus01.OUT_01 = new CgpDiscreteTag("PLC_EquipementModbus01.OUT_01", 1, TagDB.startNumber + 5, true, false, true);

		TagDB.PLC_EquipementModbus01.S_1_1 = new _DDT105();
		TagDB.PLC_EquipementModbus01.S_1_1.t = new CgpIntTag("PLC_EquipementModbus01.S_1_1.t", 1, TagDB.startNumber + 6, true, 0, true);
		TagDB.PLC_EquipementModbus01.S_1_1.x = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_1.x", 1, TagDB.startNumber + 7, true, false, true);
		TagDB.PLC_EquipementModbus01.S_1_1.tminErr = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_1.tminErr", 1, TagDB.startNumber + 8, true, false, true);
		TagDB.PLC_EquipementModbus01.S_1_1.tmaxErr = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_1.tmaxErr", 1, TagDB.startNumber + 9, true, false, true);
		TagDB.PLC_EquipementModbus01.S_1_1_VERS_S_1_2 = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_1_VERS_S_1_2", 1, TagDB.startNumber + 10, true, false, true);

		TagDB.PLC_EquipementModbus01.S_1_2 = new _DDT105();
		TagDB.PLC_EquipementModbus01.S_1_2.t = new CgpIntTag("PLC_EquipementModbus01.S_1_2.t", 1, TagDB.startNumber + 11, true, 0, true);
		TagDB.PLC_EquipementModbus01.S_1_2.x = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_2.x", 1, TagDB.startNumber + 12, true, false, true);
		TagDB.PLC_EquipementModbus01.S_1_2.tminErr = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_2.tminErr", 1, TagDB.startNumber + 13, true, false, true);
		TagDB.PLC_EquipementModbus01.S_1_2.tmaxErr = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_2.tmaxErr", 1, TagDB.startNumber + 14, true, false, true);
		TagDB.PLC_EquipementModbus01.S_1_2_VERS_S_1_1 = new CgpDiscreteTag("PLC_EquipementModbus01.S_1_2_VERS_S_1_1", 1, TagDB.startNumber + 15, true, false, true);

		TagDB.PLC_EquipementModbus01.TON_1 = new _DDT106();
		TagDB.PLC_EquipementModbus01.TON_1.STRT_TM = new CgpIntTag("PLC_EquipementModbus01.TON_1.STRT_TM", 1, TagDB.startNumber + 16, true, 0, true);
		TagDB.PLC_EquipementModbus01.TON_1.IN_OLD = new CgpDiscreteTag("PLC_EquipementModbus01.TON_1.IN_OLD", 1, TagDB.startNumber + 17, true, false, true);
		TagDB.PLC_EquipementModbus01.TON_1.IN = new CgpDiscreteTag("PLC_EquipementModbus01.TON_1.IN", 1, TagDB.startNumber + 18, true, false, true);
		TagDB.PLC_EquipementModbus01.TON_1.PT = new CgpIntTag("PLC_EquipementModbus01.TON_1.PT", 1, TagDB.startNumber + 19, true, 0, true);
		TagDB.PLC_EquipementModbus01.TON_1.Q = new CgpDiscreteTag("PLC_EquipementModbus01.TON_1.Q", 1, TagDB.startNumber + 20, true, false, true);
		TagDB.PLC_EquipementModbus01.TON_1.ET = new CgpIntTag("PLC_EquipementModbus01.TON_1.ET", 1, TagDB.startNumber + 21, true, 0, true);

		new RefTagDB();

		return null;
	}
}
