package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCreditCheckRetrieveOutputModelCreditCheckInstanceAnalysis
 */
public class BQCreditCheckRetrieveOutputModelCreditCheckInstanceAnalysis   {
  private Object creditCheckInstanceAnalysisRecord = null;

  private String creditCheckInstanceAnalysisReportType = null;

  private String creditCheckInstanceAnalysisParameters = null;

  private Object creditCheckInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditCheckInstanceAnalysisRecord
  **/

  public Object getCreditCheckInstanceAnalysisRecord() {
    return creditCheckInstanceAnalysisRecord;
  }

  public void setCreditCheckInstanceAnalysisRecord(Object creditCheckInstanceAnalysisRecord) {
    this.creditCheckInstanceAnalysisRecord = creditCheckInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditCheckInstanceAnalysisReportType
  **/

  public String getCreditCheckInstanceAnalysisReportType() {
    return creditCheckInstanceAnalysisReportType;
  }

  public void setCreditCheckInstanceAnalysisReportType(String creditCheckInstanceAnalysisReportType) {
    this.creditCheckInstanceAnalysisReportType = creditCheckInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditCheckInstanceAnalysisParameters
  **/

  public String getCreditCheckInstanceAnalysisParameters() {
    return creditCheckInstanceAnalysisParameters;
  }

  public void setCreditCheckInstanceAnalysisParameters(String creditCheckInstanceAnalysisParameters) {
    this.creditCheckInstanceAnalysisParameters = creditCheckInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditCheckInstanceAnalysisReport
  **/

  public Object getCreditCheckInstanceAnalysisReport() {
    return creditCheckInstanceAnalysisReport;
  }

  public void setCreditCheckInstanceAnalysisReport(Object creditCheckInstanceAnalysisReport) {
    this.creditCheckInstanceAnalysisReport = creditCheckInstanceAnalysisReport;
  }


}

