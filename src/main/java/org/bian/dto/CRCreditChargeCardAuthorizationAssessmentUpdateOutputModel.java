package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentUpdateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentUpdateOutputModel   {
  private CRCreditChargeCardAuthorizationAssessmentUpdateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private String creditChargeCardAuthorizationAssessmentUpdateActionTaskReference = null;

  private Object creditChargeCardAuthorizationAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentUpdateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(CRCreditChargeCardAuthorizationAssessmentUpdateInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditChargeCardAuthorizationAssessmentUpdateActionTaskReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentUpdateActionTaskReference() {
    return creditChargeCardAuthorizationAssessmentUpdateActionTaskReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentUpdateActionTaskReference(String creditChargeCardAuthorizationAssessmentUpdateActionTaskReference) {
    this.creditChargeCardAuthorizationAssessmentUpdateActionTaskReference = creditChargeCardAuthorizationAssessmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentUpdateActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentUpdateActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentUpdateActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentUpdateActionTaskRecord(Object creditChargeCardAuthorizationAssessmentUpdateActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentUpdateActionTaskRecord = creditChargeCardAuthorizationAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

