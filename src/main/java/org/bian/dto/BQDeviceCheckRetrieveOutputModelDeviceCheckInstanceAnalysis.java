package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceAnalysis
 */
public class BQDeviceCheckRetrieveOutputModelDeviceCheckInstanceAnalysis   {
  private Object deviceCheckInstanceAnalysisRecord = null;

  private String deviceCheckInstanceAnalysisReportType = null;

  private String deviceCheckInstanceAnalysisParameters = null;

  private Object deviceCheckInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return deviceCheckInstanceAnalysisRecord
  **/

  public Object getDeviceCheckInstanceAnalysisRecord() {
    return deviceCheckInstanceAnalysisRecord;
  }

  public void setDeviceCheckInstanceAnalysisRecord(Object deviceCheckInstanceAnalysisRecord) {
    this.deviceCheckInstanceAnalysisRecord = deviceCheckInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return deviceCheckInstanceAnalysisReportType
  **/

  public String getDeviceCheckInstanceAnalysisReportType() {
    return deviceCheckInstanceAnalysisReportType;
  }

  public void setDeviceCheckInstanceAnalysisReportType(String deviceCheckInstanceAnalysisReportType) {
    this.deviceCheckInstanceAnalysisReportType = deviceCheckInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return deviceCheckInstanceAnalysisParameters
  **/

  public String getDeviceCheckInstanceAnalysisParameters() {
    return deviceCheckInstanceAnalysisParameters;
  }

  public void setDeviceCheckInstanceAnalysisParameters(String deviceCheckInstanceAnalysisParameters) {
    this.deviceCheckInstanceAnalysisParameters = deviceCheckInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return deviceCheckInstanceAnalysisReport
  **/

  public Object getDeviceCheckInstanceAnalysisReport() {
    return deviceCheckInstanceAnalysisReport;
  }

  public void setDeviceCheckInstanceAnalysisReport(Object deviceCheckInstanceAnalysisReport) {
    this.deviceCheckInstanceAnalysisReport = deviceCheckInstanceAnalysisReport;
  }


}

