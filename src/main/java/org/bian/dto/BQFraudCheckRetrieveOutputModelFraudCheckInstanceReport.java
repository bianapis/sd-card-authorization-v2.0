package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveOutputModelFraudCheckInstanceReport
 */
public class BQFraudCheckRetrieveOutputModelFraudCheckInstanceReport   {
  private Object fraudCheckInstanceReportRecord = null;

  private String fraudCheckInstanceReportType = null;

  private String fraudCheckInstanceReportParameters = null;

  private Object fraudCheckInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudCheckInstanceReportRecord
  **/

  public Object getFraudCheckInstanceReportRecord() {
    return fraudCheckInstanceReportRecord;
  }

  public void setFraudCheckInstanceReportRecord(Object fraudCheckInstanceReportRecord) {
    this.fraudCheckInstanceReportRecord = fraudCheckInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudCheckInstanceReportType
  **/

  public String getFraudCheckInstanceReportType() {
    return fraudCheckInstanceReportType;
  }

  public void setFraudCheckInstanceReportType(String fraudCheckInstanceReportType) {
    this.fraudCheckInstanceReportType = fraudCheckInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudCheckInstanceReportParameters
  **/

  public String getFraudCheckInstanceReportParameters() {
    return fraudCheckInstanceReportParameters;
  }

  public void setFraudCheckInstanceReportParameters(String fraudCheckInstanceReportParameters) {
    this.fraudCheckInstanceReportParameters = fraudCheckInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudCheckInstanceReport
  **/

  public Object getFraudCheckInstanceReport() {
    return fraudCheckInstanceReport;
  }

  public void setFraudCheckInstanceReport(Object fraudCheckInstanceReport) {
    this.fraudCheckInstanceReport = fraudCheckInstanceReport;
  }


}

