package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveOutputModelCreditCheckInstanceReport
 */
public class BQCreditCheckRetrieveOutputModelCreditCheckInstanceReport   {
  private Object creditCheckInstanceReportRecord = null;

  private String creditCheckInstanceReportType = null;

  private String creditCheckInstanceReportParameters = null;

  private Object creditCheckInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditCheckInstanceReportRecord
  **/

  public Object getCreditCheckInstanceReportRecord() {
    return creditCheckInstanceReportRecord;
  }

  public void setCreditCheckInstanceReportRecord(Object creditCheckInstanceReportRecord) {
    this.creditCheckInstanceReportRecord = creditCheckInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditCheckInstanceReportType
  **/

  public String getCreditCheckInstanceReportType() {
    return creditCheckInstanceReportType;
  }

  public void setCreditCheckInstanceReportType(String creditCheckInstanceReportType) {
    this.creditCheckInstanceReportType = creditCheckInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditCheckInstanceReportParameters
  **/

  public String getCreditCheckInstanceReportParameters() {
    return creditCheckInstanceReportParameters;
  }

  public void setCreditCheckInstanceReportParameters(String creditCheckInstanceReportParameters) {
    this.creditCheckInstanceReportParameters = creditCheckInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditCheckInstanceReport
  **/

  public Object getCreditCheckInstanceReport() {
    return creditCheckInstanceReport;
  }

  public void setCreditCheckInstanceReport(Object creditCheckInstanceReport) {
    this.creditCheckInstanceReport = creditCheckInstanceReport;
  }


}

