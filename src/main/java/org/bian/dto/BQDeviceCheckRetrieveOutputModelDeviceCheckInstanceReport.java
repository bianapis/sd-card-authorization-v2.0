package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceReport
 */
public class BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceReport   {
  private Object deviceCheckInstanceReportRecord = null;

  private String deviceCheckInstanceReportType = null;

  private String deviceCheckInstanceReportParameters = null;

  private Object deviceCheckInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return deviceCheckInstanceReportRecord
  **/

  public Object getDeviceCheckInstanceReportRecord() {
    return deviceCheckInstanceReportRecord;
  }

  public void setDeviceCheckInstanceReportRecord(Object deviceCheckInstanceReportRecord) {
    this.deviceCheckInstanceReportRecord = deviceCheckInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return deviceCheckInstanceReportType
  **/

  public String getDeviceCheckInstanceReportType() {
    return deviceCheckInstanceReportType;
  }

  public void setDeviceCheckInstanceReportType(String deviceCheckInstanceReportType) {
    this.deviceCheckInstanceReportType = deviceCheckInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return deviceCheckInstanceReportParameters
  **/

  public String getDeviceCheckInstanceReportParameters() {
    return deviceCheckInstanceReportParameters;
  }

  public void setDeviceCheckInstanceReportParameters(String deviceCheckInstanceReportParameters) {
    this.deviceCheckInstanceReportParameters = deviceCheckInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return deviceCheckInstanceReport
  **/

  public Object getDeviceCheckInstanceReport() {
    return deviceCheckInstanceReport;
  }

  public void setDeviceCheckInstanceReport(Object deviceCheckInstanceReport) {
    this.deviceCheckInstanceReport = deviceCheckInstanceReport;
  }


}

