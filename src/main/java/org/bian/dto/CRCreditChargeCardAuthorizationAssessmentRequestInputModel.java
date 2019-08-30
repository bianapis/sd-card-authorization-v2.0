package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRequestInputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentRequestInputModel   {
  private String cardAuthorizationServicingSessionReference = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReference = null;

  private CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private Object creditChargeCardAuthorizationAssessmentRequestActionTaskRecord = null;

  private CRCreditChargeCardAuthorizationAssessmentRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return cardAuthorizationServicingSessionReference
  **/

  public String getCardAuthorizationServicingSessionReference() {
    return cardAuthorizationServicingSessionReference;
  }

  public void setCardAuthorizationServicingSessionReference(String cardAuthorizationServicingSessionReference) {
    this.cardAuthorizationServicingSessionReference = cardAuthorizationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Charge Card Authorization Assessment instance 
   * @return creditChargeCardAuthorizationAssessmentInstanceReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentInstanceReference() {
    return creditChargeCardAuthorizationAssessmentInstanceReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentInstanceReference(String creditChargeCardAuthorizationAssessmentInstanceReference) {
    this.creditChargeCardAuthorizationAssessmentInstanceReference = creditChargeCardAuthorizationAssessmentInstanceReference;
  }


  /**
   * Get cRCreditChargeCardAuthorizationAssessmentInstanceRecord
   * @return cRCreditChargeCardAuthorizationAssessmentInstanceRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentRequestActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentRequestActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentRequestActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentRequestActionTaskRecord(Object creditChargeCardAuthorizationAssessmentRequestActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentRequestActionTaskRecord = creditChargeCardAuthorizationAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCreditChargeCardAuthorizationAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCreditChargeCardAuthorizationAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

