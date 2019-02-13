package com.tools.webfluxdemo.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
public class TaxSearchResponse
{
	@XmlElement(name="TESrchRequestResponse")
    private TESrchRequestResponse TESrchRequestResponse;

    public TESrchRequestResponse getTESrchRequestResponse ()
    {
        return TESrchRequestResponse;
    }

    public void setTESrchRequestResponse (TESrchRequestResponse TESrchRequestResponse)
    {
        this.TESrchRequestResponse = TESrchRequestResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TESrchRequestResponse = "+TESrchRequestResponse+"]";
    }
}
