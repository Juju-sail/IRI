package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import java.lang.System;
import gpclasses.plugins.script.*;
import java.util.Date;
import gpclasses.plugins.diag.*;
import gpclasses.util.misc.*;
import gpclasses.userScripts.*;
import gpclasses.util.io.*;

public class Panel2XprSrv extends CgpExpressionServer
{
	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
				{
					quality = TagDB.PLC_EquipementModbus01.S1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.S1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1001:
				{
					quality = TagDB.PLC_EquipementModbus01.S2.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.S2.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1002:
				{
					quality = TagDB.PLC_EquipementModbus01.S3.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.S3.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1003:
				{
					quality = TagDB.PLC_EquipementModbus01.S4.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.S4.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1004:
				{
					quality = TagDB.PLC_EquipementModbus01.S0.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.S0.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1005:
				{
					quality = TagDB.PLC_EquipementModbus01.B5.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.B5.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
		}
		return 0;
	}

}
