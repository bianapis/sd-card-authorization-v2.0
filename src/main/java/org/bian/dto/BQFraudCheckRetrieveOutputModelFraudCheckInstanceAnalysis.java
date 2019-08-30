package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudCheckRetrieveOutputModelFraudCheckInstanceAnalysis
 */
public class BQFraudCheckRetrieveOutputModelFraudCheckInstanceAnalysis   {
  private Object fraudCheckInstanceAnalysisRecord = null;

  private String fraudCheckInstanceAnalysisReportType = null;

  private String fraudCheckInstanceAnalysisParameters = null;

  private Object fraudCheckInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudCheckInstanceAnalysisRecord
  **/

  public Object getFraudCheckInstanceAnalysisRecord() {
    return fraudCheckInstanceAnalysisRecord;
  }

  public void setFraudCheckInstanceAnalysisRecord(Object fraudCheckInstanceAnalysisRecord) {
    this.fraudCheckInstanceAnalysisRecord = fraudCheckInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudCheckInstanceAnalysisReportType
  **/

  public String getFraudCheckInstanceAnalysisReportType() {
    return fraudCheckInstanceAnalysisReportType;
  }

  public void setFraudCheckInstanceAnalysisReportType(String fraudCheckInstanceAnalysisReportType) {
    this.fraudCheckInstanceAnalysisReportType = fraudCheckInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudCheckInstanceAnalysisParameters
  **/

  public String getFraudCheckInstanceAnalysisParameters() {
    return fraudCheckInstanceAnalysisParameters;
  }

  public void setFraudCheckInstanceAnalysisParameters(String fraudCheckInstanceAnalysisParameters) {
    this.fraudCheckInstanceAnalysisParameters = fraudCheckInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudCheckInstanceAnalysisReport
  **/

  public Object getFraudCheckInstanceAnalysisReport() {
    return fraudCheckInstanceAnalysisReport;
  }

  public void setFraudCheckInstanceAnalysisReport(Object fraudCheckInstanceAnalysisReport) {
    this.fraudCheckInstanceAnalysisReport = fraudCheckInstanceAnalysisReport;
  }


}

