package com.tools.webfluxdemo.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="TESrch_data_summary")
public class TESrch_data_summary
{
	@JacksonXmlProperty(localName="Pstl_cd")
    private String Pstl_cd;

	@JacksonXmlProperty(localName="Tax_exmpt_cust_nm")
    private String Tax_exmpt_cust_nm;

	@JacksonXmlProperty(localName="Status_code")
    private String Status_code;

	@JacksonXmlProperty(localName="Str_nbr")
    private String Str_nbr;

	@JacksonXmlProperty(localName="Status_message")
    private String Status_message;

	@JacksonXmlProperty(localName="RowCount")
    private String RowCount;

	@JacksonXmlProperty(localName="Sls_dt")
    private String Sls_dt;

	@JacksonXmlProperty(localName="DataTruncated")
    private String DataTruncated;

    public String getPstl_cd ()
    {
        return Pstl_cd;
    }

    public void setPstl_cd (String Pstl_cd)
    {
        this.Pstl_cd = Pstl_cd;
    }

    public String getTax_exmpt_cust_nm ()
    {
        return Tax_exmpt_cust_nm;
    }

    public void setTax_exmpt_cust_nm (String Tax_exmpt_cust_nm)
    {
        this.Tax_exmpt_cust_nm = Tax_exmpt_cust_nm;
    }

    public String getStatus_code ()
    {
        return Status_code;
    }

    public void setStatus_code (String Status_code)
    {
        this.Status_code = Status_code;
    }

    public String getStr_nbr ()
    {
        return Str_nbr;
    }

    public void setStr_nbr (String Str_nbr)
    {
        this.Str_nbr = Str_nbr;
    }

    public String getStatus_message ()
    {
        return Status_message;
    }

    public void setStatus_message (String Status_message)
    {
        this.Status_message = Status_message;
    }

    public String getRowCount ()
    {
        return RowCount;
    }

    public void setRowCount (String RowCount)
    {
        this.RowCount = RowCount;
    }

    public String getSls_dt ()
    {
        return Sls_dt;
    }

    public void setSls_dt (String Sls_dt)
    {
        this.Sls_dt = Sls_dt;
    }

    public String getDataTruncated ()
    {
        return DataTruncated;
    }

    public void setDataTruncated (String DataTruncated)
    {
        this.DataTruncated = DataTruncated;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Pstl_cd = "+Pstl_cd+", Tax_exmpt_cust_nm = "+Tax_exmpt_cust_nm+", Status_code = "+Status_code+", Str_nbr = "+Str_nbr+", Status_message = "+Status_message+", RowCount = "+RowCount+", Sls_dt = "+Sls_dt+", DataTruncated = "+DataTruncated+"]";
    }
}
