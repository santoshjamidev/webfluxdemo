package com.tools.webfluxdemo.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TESrch_block")

public class TESrch_block
{

    private TESrch_data[] TESrch_data;

    public TESrch_data[] getTESrch_data ()
    {
        return TESrch_data;
    }

    @XmlElement(name = "TESrch_data")
    public void setTESrch_data (TESrch_data[] TESrch_data)
    {
        this.TESrch_data = TESrch_data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TESrch_data = "+TESrch_data+"]";
    }
}