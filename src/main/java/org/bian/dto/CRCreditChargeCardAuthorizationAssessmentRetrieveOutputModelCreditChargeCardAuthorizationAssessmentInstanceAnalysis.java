package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis
 */
public class CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis   {
  private String creditChargeCardAuthorizationAssessmentInstanceAnalysisData = null;

  private String creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType = null;

  private Object creditChargeCardAuthorizationAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysisData
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceAnalysisData() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysisData;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysisData(String creditChargeCardAuthorizationAssessmentInstanceAnalysisData) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysisData = creditChargeCardAuthorizationAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceAnalysisReportType() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysisReportType(String creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType = creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysisReport
  **/

  public Object getCreditChargeCardAuthorizationAssessmentInstanceAnalysisReport() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysisReport;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysisReport(Object creditChargeCardAuthorizationAssessmentInstanceAnalysisReport) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysisReport = creditChargeCardAuthorizationAssessmentInstanceAnalysisReport;
  }


}

