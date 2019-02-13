package com.tools.webfluxdemo.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TESrch_data")
@XmlAccessorType(XmlAccessType.FIELD)
public class TESrch_data
{
	@XmlElement(name="Pstl_cd")
    private String Pstl_cd;

	@XmlElement(name="Address_line2_txt")
    private String Address_line2_txt;

	@XmlElement(name="Display_flag")
    private String Display_flag;

	@XmlElement(name="Hdiss_tax_exmpt_id")
    private String Hdiss_tax_exmpt_id;

	@XmlElement(name="Sig_first_nm")
    private String Sig_first_nm;

	@XmlElement(name="TE_status_desc")
    private String TE_status_desc;

	@XmlElement(name="Address_line1_txt")
    private String Address_line1_txt;

	@XmlElement(name="TE_status_code")
    private String TE_status_code;

	@XmlElement(name="Sig_last_nm")
    private String Sig_last_nm;

	@XmlElement(name="Phn_locl_nbr")
    private String Phn_locl_nbr;

	@XmlElement(name="Tax_exmpt_cust_nm")
    private String Tax_exmpt_cust_nm;

	@XmlElement(name="Phn_area_city_cd")
    private String Phn_area_city_cd;

	@XmlElement(name="Phn_ext_nbr")
    private String Phn_ext_nbr;

	@XmlElement(name="St_cd")
    private String St_cd;

	@XmlElement(name="City_nm")
    private String City_nm;

	@XmlElement(name="Cntry_cd")
    private String Cntry_cd;

	
    public String getPstl_cd ()
    {
        return Pstl_cd;
    }

    public void setPstl_cd (String Pstl_cd)
    {
        this.Pstl_cd = Pstl_cd;
    }

    public String getAddress_line2_txt ()
    {
        return Address_line2_txt;
    }

    public void setAddress_line2_txt (String Address_line2_txt)
    {
        this.Address_line2_txt = Address_line2_txt;
    }

    public String getDisplay_flag ()
    {
        return Display_flag;
    }

    public void setDisplay_flag (String Display_flag)
    {
        this.Display_flag = Display_flag;
    }

    public String getHdiss_tax_exmpt_id ()
    {
        return Hdiss_tax_exmpt_id;
    }

    public void setHdiss_tax_exmpt_id (String Hdiss_tax_exmpt_id)
    {
        this.Hdiss_tax_exmpt_id = Hdiss_tax_exmpt_id;
    }

    public String getSig_first_nm ()
    {
        return Sig_first_nm;
    }

    public void setSig_first_nm (String Sig_first_nm)
    {
        this.Sig_first_nm = Sig_first_nm;
    }

    public String getTE_status_desc ()
    {
        return TE_status_desc;
    }

    public void setTE_status_desc (String TE_status_desc)
    {
        this.TE_status_desc = TE_status_desc;
    }

    public String getAddress_line1_txt ()
    {
        return Address_line1_txt;
    }

    public void setAddress_line1_txt (String Address_line1_txt)
    {
        this.Address_line1_txt = Address_line1_txt;
    }

    public String getTE_status_code ()
    {
        return TE_status_code;
    }

    public void setTE_status_code (String TE_status_code)
    {
        this.TE_status_code = TE_status_code;
    }

    public String getSig_last_nm ()
    {
        return Sig_last_nm;
    }

    public void setSig_last_nm (String Sig_last_nm)
    {
        this.Sig_last_nm = Sig_last_nm;
    }

    public String getPhn_locl_nbr ()
    {
        return Phn_locl_nbr;
    }

    public void setPhn_locl_nbr (String Phn_locl_nbr)
    {
        this.Phn_locl_nbr = Phn_locl_nbr;
    }

    public String getTax_exmpt_cust_nm ()
    {
        return Tax_exmpt_cust_nm;
    }

    public void setTax_exmpt_cust_nm (String Tax_exmpt_cust_nm)
    {
        this.Tax_exmpt_cust_nm = Tax_exmpt_cust_nm;
    }

    public String getPhn_area_city_cd ()
    {
        return Phn_area_city_cd;
    }

    public void setPhn_area_city_cd (String Phn_area_city_cd)
    {
        this.Phn_area_city_cd = Phn_area_city_cd;
    }

    public String getPhn_ext_nbr ()
    {
        return Phn_ext_nbr;
    }

    public void setPhn_ext_nbr (String Phn_ext_nbr)
    {
        this.Phn_ext_nbr = Phn_ext_nbr;
    }

    public String getSt_cd ()
    {
        return St_cd;
    }

    public void setSt_cd (String St_cd)
    {
        this.St_cd = St_cd;
    }

    public String getCity_nm ()
    {
        return City_nm;
    }

    public void setCity_nm (String City_nm)
    {
        this.City_nm = City_nm;
    }

    public String getCntry_cd ()
    {
        return Cntry_cd;
    }

    public void setCntry_cd (String Cntry_cd)
    {
        this.Cntry_cd = Cntry_cd;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Pstl_cd = "+Pstl_cd+", Address_line2_txt = "+Address_line2_txt+", Display_flag = "+Display_flag+", Hdiss_tax_exmpt_id = "+Hdiss_tax_exmpt_id+", Sig_first_nm = "+Sig_first_nm+", TE_status_desc = "+TE_status_desc+", Address_line1_txt = "+Address_line1_txt+", TE_status_code = "+TE_status_code+", Sig_last_nm = "+Sig_last_nm+", Phn_locl_nbr = "+Phn_locl_nbr+", Tax_exmpt_cust_nm = "+Tax_exmpt_cust_nm+", Phn_area_city_cd = "+Phn_area_city_cd+", Phn_ext_nbr = "+Phn_ext_nbr+", St_cd = "+St_cd+", City_nm = "+City_nm+", Cntry_cd = "+Cntry_cd+"]";
    }
}