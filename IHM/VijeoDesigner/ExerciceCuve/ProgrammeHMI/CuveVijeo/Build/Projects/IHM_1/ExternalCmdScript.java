package Projects.IHM_1;

import gpclasses.system.*;
import gpclasses.baseclasses.*;
import java.util.StringTokenizer;

public class ExternalCmdScript extends CgpScript
{
	public boolean onDataChange(CgpTag fromTag, int elemNumber)
	{
		int numTokens;
		String rawString, Cmd, argv[];
		StringTokenizer st;
		int windowID;
		CgpWindow oWindow;
		CgpPanel oPanel;
		boolean result = false;

		rawString = fromTag.getStringValue(elemNumber);
		st = new StringTokenizer(rawString);
		numTokens = st.countTokens();

		if (numTokens-- <= 0)
			return false;
		Cmd = st.nextToken();

		try
		{
			if ((numTokens > 0) && !Cmd.equalsIgnoreCase("error"))
				windowID = java.lang.Integer.parseInt(st.nextToken());
			else
				windowID = 0;
		}
		catch (NumberFormatException i)
		{
			return false;
		}

		if (Cmd.equalsIgnoreCase("error"))
		{
			if ( CgpSystem.systemWindow.getStatus() == CgpWindow.SHOWED)
			{
				//the window is visible, thus may be it is displaying
				//configuration panel.  If it is displaying a configuration
				//panel then the the SystemMessage group object to visible;
				if (CgpSystem.systemWindow.getPanel().isConfigPanel())
				{
					TagDB._ShowSystemMessage.write(1);
				}
			}

			if ( numTokens > 0 &&  st.nextToken().equalsIgnoreCase("cleared"))
			{
				// Do not write to _Last Error String if the
				// the error has only been cleared or acked.
				result = true;
			}
			else
			{
				// find the index of where the
				// message starts ... past the last 'r' in error
				CgpTagDB._LastErrorString.write(CgpSystem.getLastEventMessage());
				result = true;
			}
		}
		else if (Cmd.equalsIgnoreCase("redraw"))
		{
			CgpDisplayManager.drawAllObjects(windowID);
			result = true;
		}
		else if (Cmd.equalsIgnoreCase("close"))
		{
			CgpWindow.destroy(windowID);
			result = true;
		}
		else if (Cmd.equalsIgnoreCase("activate"))
		{
			CgpWindow.bringToFront(windowID);
			result = true;
		}
		else if (Cmd.equalsIgnoreCase("shutdown"))
		{
			System.gc();
			CgpThread.SLEEP(100);
			CgpStartup.shutdown();
			result = true;
		}
		else if (Cmd.equalsIgnoreCase("UpdateClock"))
		{
			CgpDateTimeUpdateScript.updateTime(true);
			result = true;
		}
		else if (Cmd.equalsIgnoreCase("syslang"))
		{
			CgpTagDB._SystemLanguage.write(windowID, 0);
			result = true;
		}

		return result;
	}
}
