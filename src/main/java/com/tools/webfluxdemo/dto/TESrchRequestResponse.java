package com.tools.webfluxdemo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "TESrchRequestResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TESrchRequestResponse {

	@JacksonXmlProperty(localName = "TESrch_data_summary")
	private TESrch_data_summary TESrch_data_summary;

	@JacksonXmlElementWrapper(localName = "TESrch_data", useWrapping = false)
	private List<TESrch_data> TESrch_block;

	public TESrch_data_summary getTESrch_data_summary() {
		return TESrch_data_summary;
	}

	public void setTESrch_data_summary(TESrch_data_summary TESrch_data_summary) {
		this.TESrch_data_summary = TESrch_data_summary;
	}

	public List<TESrch_data> getTESrch_block() {
		return TESrch_block;
	}

	public void setTESrch_block(List<TESrch_data> TESrch_block) {
		this.TESrch_block = TESrch_block;
	}

	@Override
	public String toString() {
        return "ClassPojo [TESrch_data_summary = "+TESrch_data_summary+", TESrch_block = "+TESrch_block+"]";
		//return "ClassPojo [TESrch_data_summary = " + TESrch_data_summary + ", TESrch_block = ]";
	}
}
