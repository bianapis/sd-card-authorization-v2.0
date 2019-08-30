package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStandInRetrieveOutputModelStandInInstanceReport
 */
public class BQStandInRetrieveOutputModelStandInInstanceReport   {
  private Object standInInstanceReportRecord = null;

  private String standInInstanceReportType = null;

  private String standInInstanceReportParameters = null;

  private Object standInInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return standInInstanceReportRecord
  **/

  public Object getStandInInstanceReportRecord() {
    return standInInstanceReportRecord;
  }

  public void setStandInInstanceReportRecord(Object standInInstanceReportRecord) {
    this.standInInstanceReportRecord = standInInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return standInInstanceReportType
  **/

  public String getStandInInstanceReportType() {
    return standInInstanceReportType;
  }

  public void setStandInInstanceReportType(String standInInstanceReportType) {
    this.standInInstanceReportType = standInInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return standInInstanceReportParameters
  **/

  public String getStandInInstanceReportParameters() {
    return standInInstanceReportParameters;
  }

  public void setStandInInstanceReportParameters(String standInInstanceReportParameters) {
    this.standInInstanceReportParameters = standInInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return standInInstanceReport
  **/

  public Object getStandInInstanceReport() {
    return standInInstanceReport;
  }

  public void setStandInInstanceReport(Object standInInstanceReport) {
    this.standInInstanceReport = standInInstanceReport;
  }


}

