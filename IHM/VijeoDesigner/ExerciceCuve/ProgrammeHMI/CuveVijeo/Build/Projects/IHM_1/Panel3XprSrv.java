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

public class Panel3XprSrv extends CgpExpressionServer
{
	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
				{
					quality = TagDB.PLC_EquipementModbus01.B5.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.B5.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1001:
				{
					quality = TagDB.PLC_EquipementModbus01.Y1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.Y1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1002:
				{
					quality = TagDB.PLC_EquipementModbus01.M1.getTagDataQuality();
					if ((TagDB.PLC_EquipementModbus01.M1.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
		}
		return 0;
	}

}
