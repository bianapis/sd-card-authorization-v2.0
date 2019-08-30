package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis
 */
public class CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceAnalysis   {
  private String creditChargeCardAuthorizationAssessmentInstanceAnalysisReference = null;

  private String creditChargeCardAuthorizationAssessmentInstanceAnalysisReportType = null;

  private String creditChargeCardAuthorizationAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysisReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceAnalysisReference() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysisReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysisReference(String creditChargeCardAuthorizationAssessmentInstanceAnalysisReference) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysisReference = creditChargeCardAuthorizationAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditChargeCardAuthorizationAssessmentInstanceAnalysisParameters
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceAnalysisParameters() {
    return creditChargeCardAuthorizationAssessmentInstanceAnalysisParameters;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceAnalysisParameters(String creditChargeCardAuthorizationAssessmentInstanceAnalysisParameters) {
    this.creditChargeCardAuthorizationAssessmentInstanceAnalysisParameters = creditChargeCardAuthorizationAssessmentInstanceAnalysisParameters;
  }


}

