package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord
 */
public class CRCreditChargeCardAuthorizationAssessmentRetrieveOutputModelCreditChargeCardAuthorizationAssessmentInstanceReportRecord   {
  private String creditChargeCardAuthorizationAssessmentInstanceReportData = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReportType = null;

  private Object creditChargeCardAuthorizationAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditChargeCardAuthorizationAssessmentInstanceReportData
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReportData() {
    return creditChargeCardAuthorizationAssessmentInstanceReportData;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReportData(String creditChargeCardAuthorizationAssessmentInstanceReportData) {
    this.creditChargeCardAuthorizationAssessmentInstanceReportData = creditChargeCardAuthorizationAssessmentInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditChargeCardAuthorizationAssessmentInstanceReport
  **/

  public Object getCreditChargeCardAuthorizationAssessmentInstanceReport() {
    return creditChargeCardAuthorizationAssessmentInstanceReport;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReport(Object creditChargeCardAuthorizationAssessmentInstanceReport) {
    this.creditChargeCardAuthorizationAssessmentInstanceReport = creditChargeCardAuthorizationAssessmentInstanceReport;
  }


}

