package Projects.IHM_1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import java.lang.System;
import java.util.Date;
import gpclasses.util.misc.*;
import gpclasses.plugins.script.*;
import gpclasses.util.io.*;


public class XprSrv extends CgpExpressionServer
{
	public void executeExpression(int DoNotRedefineMePls)
	{
		if (DoNotRedefineMePls == 1)
		{
			if (CgpSystem.systemWindow != null)
			{			
				if (CgpSystem.systemWindow.getPanel().isConfigPanel())
				{
			 		CgpTagDB._ShowSystemMessage.write(0, 0);
				}
				else
				{
					CgpSystem.systemWindow.show(false);
				}
			}
		}

		if (DoNotRedefineMePls == 2) {CgpSystem.showHelp();}

		if (DoNotRedefineMePls == 3)
		{
			if (CgpSystem.systemWindow.getYOffset() != CgpSystem.baseWindow.getYOffset())
			{
				CgpSystem.systemWindow.move(0,-CgpSystem.baseWindow.getHeight() + CgpSystem.systemWindow.getHeight());
				CgpSystem.sysWinTop = !CgpSystem.sysWinTop;
			}
		}

		if (DoNotRedefineMePls == 4)
		{
			if (CgpSystem.systemWindow.getYOffset() == CgpSystem.baseWindow.getYOffset())
			{
				CgpSystem.systemWindow.move(0,CgpSystem.baseWindow.getHeight() - CgpSystem.systemWindow.getHeight());
				CgpSystem.sysWinTop = !CgpSystem.sysWinTop;
			}
		}

	}


	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1: return CgpSystem.getSecond();
			case 2: return CgpSystem.getMinute();
			case 3: return CgpSystem.getHour();
			case 4: return CgpSystem.getDay();
			case 5: return CgpSystem.getDayOfWeek() + 1;
			case 6: return CgpSystem.getMonth() + 1;
			case 7: return CgpSystem.getYear() % 100;
			case 8: return CgpSystem.getYear() + 1900;
			case 9: return -CgpSystem.getTimeZoneOffset();
		}
		return 0;
	}
}
