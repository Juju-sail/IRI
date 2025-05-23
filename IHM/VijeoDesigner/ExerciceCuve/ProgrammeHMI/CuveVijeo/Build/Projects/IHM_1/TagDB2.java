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
		TagDB.PLC_EquipementModbus01.B1 = new CgpDiscreteTag("PLC_EquipementModbus01.B1", 1, TagDB.startNumber + 0, true, false, true);

		TagDB.PLC_EquipementModbus01.B2 = new CgpDiscreteTag("PLC_EquipementModbus01.B2", 1, TagDB.startNumber + 1, true, false, true);

		TagDB.PLC_EquipementModbus01.B3 = new CgpDiscreteTag("PLC_EquipementModbus01.B3", 1, TagDB.startNumber + 2, true, false, true);

		TagDB.PLC_EquipementModbus01.B4 = new CgpDiscreteTag("PLC_EquipementModbus01.B4", 1, TagDB.startNumber + 3, true, false, true);

		TagDB.PLC_EquipementModbus01.B5 = new CgpDiscreteTag("PLC_EquipementModbus01.B5", 1, TagDB.startNumber + 4, true, false, true);

		TagDB.PLC_EquipementModbus01.CTU_1 = new _DDT105();
		TagDB.PLC_EquipementModbus01.CTU_1.CU_OLD = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_1.CU_OLD", 1, TagDB.startNumber + 5, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_1.CU = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_1.CU", 1, TagDB.startNumber + 6, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_1.R = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_1.R", 1, TagDB.startNumber + 7, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_1.PV = new CgpIntTag("PLC_EquipementModbus01.CTU_1.PV", 1, TagDB.startNumber + 8, true, 0, true);
		TagDB.PLC_EquipementModbus01.CTU_1.PV.setMinMaxValues(-32768, 32767, true);
		TagDB.PLC_EquipementModbus01.CTU_1.Q = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_1.Q", 1, TagDB.startNumber + 9, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_1.CV = new CgpIntTag("PLC_EquipementModbus01.CTU_1.CV", 1, TagDB.startNumber + 10, true, 0, true);
		TagDB.PLC_EquipementModbus01.CTU_1.CV.setMinMaxValues(-32768, 32767, true);
		TagDB.PLC_EquipementModbus01.CTU_2 = new _DDT105();
		TagDB.PLC_EquipementModbus01.CTU_2.CU_OLD = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_2.CU_OLD", 1, TagDB.startNumber + 11, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_2.CU = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_2.CU", 1, TagDB.startNumber + 12, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_2.R = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_2.R", 1, TagDB.startNumber + 13, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_2.PV = new CgpIntTag("PLC_EquipementModbus01.CTU_2.PV", 1, TagDB.startNumber + 14, true, 0, true);
		TagDB.PLC_EquipementModbus01.CTU_2.PV.setMinMaxValues(-32768, 32767, true);
		TagDB.PLC_EquipementModbus01.CTU_2.Q = new CgpDiscreteTag("PLC_EquipementModbus01.CTU_2.Q", 1, TagDB.startNumber + 15, true, false, true);
		TagDB.PLC_EquipementModbus01.CTU_2.CV = new CgpIntTag("PLC_EquipementModbus01.CTU_2.CV", 1, TagDB.startNumber + 16, true, 0, true);
		TagDB.PLC_EquipementModbus01.CTU_2.CV.setMinMaxValues(-32768, 32767, true);
		TagDB.PLC_EquipementModbus01.CTUD_1 = new _DDT106();
		TagDB.PLC_EquipementModbus01.CTUD_1.CU_OLD = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.CU_OLD", 1, TagDB.startNumber + 17, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.CD_OLD = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.CD_OLD", 1, TagDB.startNumber + 18, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.CU = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.CU", 1, TagDB.startNumber + 19, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.CD = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.CD", 1, TagDB.startNumber + 20, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.R = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.R", 1, TagDB.startNumber + 21, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.LD = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.LD", 1, TagDB.startNumber + 22, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.PV = new CgpIntTag("PLC_EquipementModbus01.CTUD_1.PV", 1, TagDB.startNumber + 23, true, 0, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.PV.setMinMaxValues(-32768, 32767, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.QU = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.QU", 1, TagDB.startNumber + 24, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.QD = new CgpDiscreteTag("PLC_EquipementModbus01.CTUD_1.QD", 1, TagDB.startNumber + 25, true, false, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.CV = new CgpIntTag("PLC_EquipementModbus01.CTUD_1.CV", 1, TagDB.startNumber + 26, true, 0, true);
		TagDB.PLC_EquipementModbus01.CTUD_1.CV.setMinMaxValues(-32768, 32767, true);
		TagDB.PLC_EquipementModbus01.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.DebitM1", 1, TagDB.startNumber + 27, true, 0.0f, true);

		TagDB.PLC_EquipementModbus01.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.DebitY1", 1, TagDB.startNumber + 28, true, 0.0f, true);

		TagDB.PLC_EquipementModbus01.GestionCuve_0 = new _DDT107();
		TagDB.PLC_EquipementModbus01.GestionCuve_0.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_0.NiveauCuve", 1, TagDB.startNumber + 29, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_0.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_0.MarcheM1", 1, TagDB.startNumber + 30, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_0.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_0.MarcheY1", 1, TagDB.startNumber + 31, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_0.Consigne = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_0.Consigne", 1, TagDB.startNumber + 32, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_1 = new _DDT107();
		TagDB.PLC_EquipementModbus01.GestionCuve_1.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_1.NiveauCuve", 1, TagDB.startNumber + 33, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_1.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_1.MarcheM1", 1, TagDB.startNumber + 34, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_1.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_1.MarcheY1", 1, TagDB.startNumber + 35, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_1.Consigne = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_1.Consigne", 1, TagDB.startNumber + 36, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_2 = new _DDT107();
		TagDB.PLC_EquipementModbus01.GestionCuve_2.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_2.NiveauCuve", 1, TagDB.startNumber + 37, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_2.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_2.MarcheM1", 1, TagDB.startNumber + 38, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_2.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_2.MarcheY1", 1, TagDB.startNumber + 39, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_2.Consigne = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_2.Consigne", 1, TagDB.startNumber + 40, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_3 = new _DDT107();
		TagDB.PLC_EquipementModbus01.GestionCuve_3.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_3.NiveauCuve", 1, TagDB.startNumber + 41, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_3.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_3.MarcheM1", 1, TagDB.startNumber + 42, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_3.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_3.MarcheY1", 1, TagDB.startNumber + 43, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_3.Consigne = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_3.Consigne", 1, TagDB.startNumber + 44, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_4 = new _DDT107();
		TagDB.PLC_EquipementModbus01.GestionCuve_4.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_4.NiveauCuve", 1, TagDB.startNumber + 45, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_4.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_4.MarcheM1", 1, TagDB.startNumber + 46, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_4.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_4.MarcheY1", 1, TagDB.startNumber + 47, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_4.Consigne = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_4.Consigne", 1, TagDB.startNumber + 48, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_5 = new _DDT107();
		TagDB.PLC_EquipementModbus01.GestionCuve_5.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_5.NiveauCuve", 1, TagDB.startNumber + 49, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_5.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_5.MarcheM1", 1, TagDB.startNumber + 50, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_5.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.GestionCuve_5.MarcheY1", 1, TagDB.startNumber + 51, true, false, true);
		TagDB.PLC_EquipementModbus01.GestionCuve_5.Consigne = new CgpFloatTag("PLC_EquipementModbus01.GestionCuve_5.Consigne", 1, TagDB.startNumber + 52, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.H1 = new CgpDiscreteTag("PLC_EquipementModbus01.H1", 1, TagDB.startNumber + 53, true, false, true);

		TagDB.PLC_EquipementModbus01.H2 = new CgpDiscreteTag("PLC_EquipementModbus01.H2", 1, TagDB.startNumber + 54, true, false, true);

		TagDB.PLC_EquipementModbus01.H3 = new CgpDiscreteTag("PLC_EquipementModbus01.H3", 1, TagDB.startNumber + 55, true, false, true);

		TagDB.PLC_EquipementModbus01.H4 = new CgpDiscreteTag("PLC_EquipementModbus01.H4", 1, TagDB.startNumber + 56, true, false, true);

		TagDB.PLC_EquipementModbus01.M1 = new CgpDiscreteTag("PLC_EquipementModbus01.M1", 1, TagDB.startNumber + 57, true, false, true);

		TagDB.PLC_EquipementModbus01.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.NiveauCuve", 1, TagDB.startNumber + 58, true, 0.0f, true);

		TagDB.PLC_EquipementModbus01.RemplissageCuve_0 = new _DDT108();
		TagDB.PLC_EquipementModbus01.RemplissageCuve_0.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.RemplissageCuve_0.NiveauCuve", 1, TagDB.startNumber + 59, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.RemplissageCuve_0.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.RemplissageCuve_0.DebitM1", 1, TagDB.startNumber + 60, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.RemplissageCuve_0.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.RemplissageCuve_0.DebitY1", 1, TagDB.startNumber + 61, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.RemplissageCuve_0.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.RemplissageCuve_0.MarcheM1", 1, TagDB.startNumber + 62, true, false, true);
		TagDB.PLC_EquipementModbus01.RemplissageCuve_0.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.RemplissageCuve_0.MarcheY1", 1, TagDB.startNumber + 63, true, false, true);
		TagDB.PLC_EquipementModbus01.RemplissageCuve_0.Consigne = new CgpFloatTag("PLC_EquipementModbus01.RemplissageCuve_0.Consigne", 1, TagDB.startNumber + 64, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.Reset = new CgpDiscreteTag("PLC_EquipementModbus01.Reset", 1, TagDB.startNumber + 65, true, false, true);

		TagDB.PLC_EquipementModbus01.S0 = new CgpDiscreteTag("PLC_EquipementModbus01.S0", 1, TagDB.startNumber + 66, true, false, true);

		TagDB.PLC_EquipementModbus01.S1 = new CgpDiscreteTag("PLC_EquipementModbus01.S1", 1, TagDB.startNumber + 67, true, false, true);

		TagDB.PLC_EquipementModbus01.S2 = new CgpDiscreteTag("PLC_EquipementModbus01.S2", 1, TagDB.startNumber + 68, true, false, true);

		TagDB.PLC_EquipementModbus01.S3 = new CgpDiscreteTag("PLC_EquipementModbus01.S3", 1, TagDB.startNumber + 69, true, false, true);

		TagDB.PLC_EquipementModbus01.S4 = new CgpDiscreteTag("PLC_EquipementModbus01.S4", 1, TagDB.startNumber + 70, true, false, true);

		TagDB.PLC_EquipementModbus01.S5 = new CgpDiscreteTag("PLC_EquipementModbus01.S5", 1, TagDB.startNumber + 71, true, false, true);

		TagDB.PLC_EquipementModbus01.VidageCuve_0 = new _DDT109();
		TagDB.PLC_EquipementModbus01.VidageCuve_0.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_0.DebitM1", 1, TagDB.startNumber + 72, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_0.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_0.DebitY1", 1, TagDB.startNumber + 73, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_0.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_0.MarcheM1", 1, TagDB.startNumber + 74, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_0.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_0.MarcheY1", 1, TagDB.startNumber + 75, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_0.Consigne = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_0.Consigne", 1, TagDB.startNumber + 76, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_0.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_0.NiveauCuve", 1, TagDB.startNumber + 77, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_1 = new _DDT109();
		TagDB.PLC_EquipementModbus01.VidageCuve_1.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_1.DebitM1", 1, TagDB.startNumber + 78, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_1.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_1.DebitY1", 1, TagDB.startNumber + 79, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_1.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_1.MarcheM1", 1, TagDB.startNumber + 80, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_1.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_1.MarcheY1", 1, TagDB.startNumber + 81, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_1.Consigne = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_1.Consigne", 1, TagDB.startNumber + 82, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_1.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_1.NiveauCuve", 1, TagDB.startNumber + 83, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_2 = new _DDT109();
		TagDB.PLC_EquipementModbus01.VidageCuve_2.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_2.DebitM1", 1, TagDB.startNumber + 84, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_2.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_2.DebitY1", 1, TagDB.startNumber + 85, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_2.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_2.MarcheM1", 1, TagDB.startNumber + 86, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_2.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_2.MarcheY1", 1, TagDB.startNumber + 87, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_2.Consigne = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_2.Consigne", 1, TagDB.startNumber + 88, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_2.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_2.NiveauCuve", 1, TagDB.startNumber + 89, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_3 = new _DDT109();
		TagDB.PLC_EquipementModbus01.VidageCuve_3.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_3.DebitM1", 1, TagDB.startNumber + 90, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_3.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_3.DebitY1", 1, TagDB.startNumber + 91, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_3.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_3.MarcheM1", 1, TagDB.startNumber + 92, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_3.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_3.MarcheY1", 1, TagDB.startNumber + 93, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_3.Consigne = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_3.Consigne", 1, TagDB.startNumber + 94, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_3.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_3.NiveauCuve", 1, TagDB.startNumber + 95, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_4 = new _DDT109();
		TagDB.PLC_EquipementModbus01.VidageCuve_4.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_4.DebitM1", 1, TagDB.startNumber + 96, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_4.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_4.DebitY1", 1, TagDB.startNumber + 97, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_4.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_4.MarcheM1", 1, TagDB.startNumber + 98, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_4.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_4.MarcheY1", 1, TagDB.startNumber + 99, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_4.Consigne = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_4.Consigne", 1, TagDB.startNumber + 100, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_4.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_4.NiveauCuve", 1, TagDB.startNumber + 101, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_5 = new _DDT109();
		TagDB.PLC_EquipementModbus01.VidageCuve_5.DebitM1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_5.DebitM1", 1, TagDB.startNumber + 102, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_5.DebitY1 = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_5.DebitY1", 1, TagDB.startNumber + 103, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_5.MarcheM1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_5.MarcheM1", 1, TagDB.startNumber + 104, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_5.MarcheY1 = new CgpDiscreteTag("PLC_EquipementModbus01.VidageCuve_5.MarcheY1", 1, TagDB.startNumber + 105, true, false, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_5.Consigne = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_5.Consigne", 1, TagDB.startNumber + 106, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.VidageCuve_5.NiveauCuve = new CgpFloatTag("PLC_EquipementModbus01.VidageCuve_5.NiveauCuve", 1, TagDB.startNumber + 107, true, 0.0f, true);
		TagDB.PLC_EquipementModbus01.Y1 = new CgpDiscreteTag("PLC_EquipementModbus01.Y1", 1, TagDB.startNumber + 108, true, false, true);


		new RefTagDB();

		return null;
	}
}
