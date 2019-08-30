package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStandInRetrieveOutputModelStandInInstanceAnalysis
 */
public class BQStandInRetrieveOutputModelStandInInstanceAnalysis   {
  private Object standInInstanceAnalysisRecord = null;

  private String standInInstanceAnalysisReportType = null;

  private String standInInstanceAnalysisParameters = null;

  private Object standInInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return standInInstanceAnalysisRecord
  **/

  public Object getStandInInstanceAnalysisRecord() {
    return standInInstanceAnalysisRecord;
  }

  public void setStandInInstanceAnalysisRecord(Object standInInstanceAnalysisRecord) {
    this.standInInstanceAnalysisRecord = standInInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return standInInstanceAnalysisReportType
  **/

  public String getStandInInstanceAnalysisReportType() {
    return standInInstanceAnalysisReportType;
  }

  public void setStandInInstanceAnalysisReportType(String standInInstanceAnalysisReportType) {
    this.standInInstanceAnalysisReportType = standInInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return standInInstanceAnalysisParameters
  **/

  public String getStandInInstanceAnalysisParameters() {
    return standInInstanceAnalysisParameters;
  }

  public void setStandInInstanceAnalysisParameters(String standInInstanceAnalysisParameters) {
    this.standInInstanceAnalysisParameters = standInInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return standInInstanceAnalysisReport
  **/

  public Object getStandInInstanceAnalysisReport() {
    return standInInstanceAnalysisReport;
  }

  public void setStandInInstanceAnalysisReport(Object standInInstanceAnalysisReport) {
    this.standInInstanceAnalysisReport = standInInstanceAnalysisReport;
  }


}

