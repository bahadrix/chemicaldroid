package me.bahadir.chemicaldroid.models;

import android.database.Cursor;

public class Chemical extends LeModel {


	public int 	id;
	public String 	name;
	public String 	description;
	public String 	health_haz;
	public String 	first_aid;
	public String 	fire_haz;
	public String 	fire_fight;
	public String 	non_fire_resp;
	public String 	prot_clothing;
	public String 	air_water_reactions;
	public String 	chemical_profile;
	public String 	special_hazards;
	public String 	isolation;
	public int 	nfpa_flam;
	public int 	nfpa_health;
	public int 	nfpa_react;
	public String 	nfpa_special;
	public String 	fp_source;
	public String 	fp_note;
	public float 	fp_value;
	public String 	fp_range;
	public String 	lel_source;
	public String 	lel_note;
	public float 	lel_value;
	public String 	lel_range;
	public String 	lel_unit;
	public String 	uel_source;
	public String 	uel_note;
	public float 	uel_value;
	public String 	uel_range;
	public String 	uel_unit;
	public String 	ai_source;
	public String 	ai_note;
	public float 	ai_value;
	public String 	ai_range;
	public String 	mp_source;
	public String 	mp_note;
	public float 	mp_value;
	public String 	mp_range;
	public String 	vp_source;
	public String 	vp_note;
	public float 	vp_value;
	public String 	vp_range;
	public float 	vp_value_tempDegF;
	public String 	vp_range_tempDegF;
	public String 	vp_unit;
	public String 	vd_source;
	public String 	vd_note;
	public float 	vd_value;
	public String 	vd_range;
	public float 	vd_value_tempDegF;
	public String 	vd_range_tempDegF;
	public String 	sg_source;
	public String 	sg_note;
	public float 	sg_value;
	public String 	sg_range;
	public float 	sg_value_tempDegF;
	public String 	sg_range_tempDegF;
	public String 	bp_source;
	public String 	bp_note;
	public float 	bp_value;
	public String 	bp_range;
	public float 	bp_value_presMMHG;
	public String 	bp_range_presMMHG;
	public String 	molwgt_source;
	public String 	molwgt_note;
	public float 	molwgt_value;
	public String 	molwgt_range;
	public String 	idlh_source;
	public String 	idlh_note;
	public float 	idlh_value;
	public String 	idlh_unit;
	public String 	solblty_source;
	public String 	solblty_note;
	public float 	solblty_value;
	public String 	solblty_range;
	public String 	solblty_unit;
	public String 	synonyms;
	public String 	chris_codes;
	public String 	dot_labels;
	public String 	formulas;

	public Chemical(Cursor cursor) {
		super(cursor);
		
		
	}

	@Override
	public void setField(String columnName, int columnIndex) {
		// TODO Auto-generated method stub
		if(columnName.equals("id"))this.id=cursor.getInt(columnIndex);
		else if(columnName.equals("name"))this.name=cursor.getString(columnIndex);
		else if(columnName.equals("description"))this.description=cursor.getString(columnIndex);
		else if(columnName.equals("health_haz"))this.health_haz=cursor.getString(columnIndex);
		else if(columnName.equals("first_aid"))this.first_aid=cursor.getString(columnIndex);
		else if(columnName.equals("fire_haz"))this.fire_haz=cursor.getString(columnIndex);
		else if(columnName.equals("fire_fight"))this.fire_fight=cursor.getString(columnIndex);
		else if(columnName.equals("non_fire_resp"))this.non_fire_resp=cursor.getString(columnIndex);
		else if(columnName.equals("prot_clothing"))this.prot_clothing=cursor.getString(columnIndex);
		else if(columnName.equals("air_water_reactions"))this.air_water_reactions=cursor.getString(columnIndex);
		else if(columnName.equals("chemical_profile"))this.chemical_profile=cursor.getString(columnIndex);
		else if(columnName.equals("special_hazards"))this.special_hazards=cursor.getString(columnIndex);
		else if(columnName.equals("isolation"))this.isolation=cursor.getString(columnIndex);
		else if(columnName.equals("nfpa_flam"))this.nfpa_flam=cursor.getInt(columnIndex);
		else if(columnName.equals("nfpa_health"))this.nfpa_health=cursor.getInt(columnIndex);
		else if(columnName.equals("nfpa_react"))this.nfpa_react=cursor.getInt(columnIndex);
		else if(columnName.equals("nfpa_special"))this.nfpa_special=cursor.getString(columnIndex);
		else if(columnName.equals("fp_source"))this.fp_source=cursor.getString(columnIndex);
		else if(columnName.equals("fp_note"))this.fp_note=cursor.getString(columnIndex);
		else if(columnName.equals("fp_value"))this.fp_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("fp_range"))this.fp_range=cursor.getString(columnIndex);
		else if(columnName.equals("lel_source"))this.lel_source=cursor.getString(columnIndex);
		else if(columnName.equals("lel_note"))this.lel_note=cursor.getString(columnIndex);
		else if(columnName.equals("lel_value"))this.lel_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("lel_range"))this.lel_range=cursor.getString(columnIndex);
		else if(columnName.equals("lel_unit"))this.lel_unit=cursor.getString(columnIndex);
		else if(columnName.equals("uel_source"))this.uel_source=cursor.getString(columnIndex);
		else if(columnName.equals("uel_note"))this.uel_note=cursor.getString(columnIndex);
		else if(columnName.equals("uel_value"))this.uel_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("uel_range"))this.uel_range=cursor.getString(columnIndex);
		else if(columnName.equals("uel_unit"))this.uel_unit=cursor.getString(columnIndex);
		else if(columnName.equals("ai_source"))this.ai_source=cursor.getString(columnIndex);
		else if(columnName.equals("ai_note"))this.ai_note=cursor.getString(columnIndex);
		else if(columnName.equals("ai_value"))this.ai_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("ai_range"))this.ai_range=cursor.getString(columnIndex);
		else if(columnName.equals("mp_source"))this.mp_source=cursor.getString(columnIndex);
		else if(columnName.equals("mp_note"))this.mp_note=cursor.getString(columnIndex);
		else if(columnName.equals("mp_value"))this.mp_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("mp_range"))this.mp_range=cursor.getString(columnIndex);
		else if(columnName.equals("vp_source"))this.vp_source=cursor.getString(columnIndex);
		else if(columnName.equals("vp_note"))this.vp_note=cursor.getString(columnIndex);
		else if(columnName.equals("vp_value"))this.vp_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("vp_range"))this.vp_range=cursor.getString(columnIndex);
		else if(columnName.equals("vp_value_tempDegF"))this.vp_value_tempDegF=cursor.getFloat(columnIndex);
		else if(columnName.equals("vp_range_tempDegF"))this.vp_range_tempDegF=cursor.getString(columnIndex);
		else if(columnName.equals("vp_unit"))this.vp_unit=cursor.getString(columnIndex);
		else if(columnName.equals("vd_source"))this.vd_source=cursor.getString(columnIndex);
		else if(columnName.equals("vd_note"))this.vd_note=cursor.getString(columnIndex);
		else if(columnName.equals("vd_value"))this.vd_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("vd_range"))this.vd_range=cursor.getString(columnIndex);
		else if(columnName.equals("vd_value_tempDegF"))this.vd_value_tempDegF=cursor.getFloat(columnIndex);
		else if(columnName.equals("vd_range_tempDegF"))this.vd_range_tempDegF=cursor.getString(columnIndex);
		else if(columnName.equals("sg_source"))this.sg_source=cursor.getString(columnIndex);
		else if(columnName.equals("sg_note"))this.sg_note=cursor.getString(columnIndex);
		else if(columnName.equals("sg_value"))this.sg_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("sg_range"))this.sg_range=cursor.getString(columnIndex);
		else if(columnName.equals("sg_value_tempDegF"))this.sg_value_tempDegF=cursor.getFloat(columnIndex);
		else if(columnName.equals("sg_range_tempDegF"))this.sg_range_tempDegF=cursor.getString(columnIndex);
		else if(columnName.equals("bp_source"))this.bp_source=cursor.getString(columnIndex);
		else if(columnName.equals("bp_note"))this.bp_note=cursor.getString(columnIndex);
		else if(columnName.equals("bp_value"))this.bp_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("bp_range"))this.bp_range=cursor.getString(columnIndex);
		else if(columnName.equals("bp_value_presMMHG"))this.bp_value_presMMHG=cursor.getFloat(columnIndex);
		else if(columnName.equals("bp_range_presMMHG"))this.bp_range_presMMHG=cursor.getString(columnIndex);
		else if(columnName.equals("molwgt_source"))this.molwgt_source=cursor.getString(columnIndex);
		else if(columnName.equals("molwgt_note"))this.molwgt_note=cursor.getString(columnIndex);
		else if(columnName.equals("molwgt_value"))this.molwgt_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("molwgt_range"))this.molwgt_range=cursor.getString(columnIndex);
		else if(columnName.equals("idlh_source"))this.idlh_source=cursor.getString(columnIndex);
		else if(columnName.equals("idlh_note"))this.idlh_note=cursor.getString(columnIndex);
		else if(columnName.equals("idlh_value"))this.idlh_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("idlh_unit"))this.idlh_unit=cursor.getString(columnIndex);
		else if(columnName.equals("solblty_source"))this.solblty_source=cursor.getString(columnIndex);
		else if(columnName.equals("solblty_note"))this.solblty_note=cursor.getString(columnIndex);
		else if(columnName.equals("solblty_value"))this.solblty_value=cursor.getFloat(columnIndex);
		else if(columnName.equals("solblty_range"))this.solblty_range=cursor.getString(columnIndex);
		else if(columnName.equals("solblty_unit"))this.solblty_unit=cursor.getString(columnIndex);
		else if(columnName.equals("synonyms"))this.synonyms=cursor.getString(columnIndex);
		else if(columnName.equals("chris_codes"))this.chris_codes=cursor.getString(columnIndex);
		else if(columnName.equals("dot_labels"))this.dot_labels=cursor.getString(columnIndex);
		else if(columnName.equals("formulas"))this.formulas=cursor.getString(columnIndex);


		
	}
	


}
