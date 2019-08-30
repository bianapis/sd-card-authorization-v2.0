package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord
 */
public class CRCreditChargeCardAuthorizationAssessmentRetrieveInputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord   {
  private String creditChargeCardAuthorizationAssessmentInstanceReportReference = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReportType = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return creditChargeCardAuthorizationAssessmentInstanceReportReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReportReference() {
    return creditChargeCardAuthorizationAssessmentInstanceReportReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReportReference(String creditChargeCardAuthorizationAssessmentInstanceReportReference) {
    this.creditChargeCardAuthorizationAssessmentInstanceReportReference = creditChargeCardAuthorizationAssessmentInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditChargeCardAuthorizationAssessmentInstanceReportType
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReportType() {
    return creditChargeCardAuthorizationAssessmentInstanceReportType;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReportType(String creditChargeCardAuthorizationAssessmentInstanceReportType) {
    this.creditChargeCardAuthorizationAssessmentInstanceReportType = creditChargeCardAuthorizationAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return creditChargeCardAuthorizationAssessmentInstanceReportParameters
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReportParameters() {
    return creditChargeCardAuthorizationAssessmentInstanceReportParameters;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReportParameters(String creditChargeCardAuthorizationAssessmentInstanceReportParameters) {
    this.creditChargeCardAuthorizationAssessmentInstanceReportParameters = creditChargeCardAuthorizationAssessmentInstanceReportParameters;
  }


}

