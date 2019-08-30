package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentExecuteInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentExecuteInputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentExecuteInputModel   {
  private String cardAuthorizationServicingSessionReference = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReference = null;

  private CRCreditChargeCardAuthorizationAssessmentExecuteInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord = null;

  private Object creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord = null;

  private CRCreditChargeCardAuthorizationAssessmentExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRCreditChargeCardAuthorizationAssessmentExecuteInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord getCRCreditChargeCardAuthorizationAssessmentInstanceRecord() {
    return cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }

  public void setCRCreditChargeCardAuthorizationAssessmentInstanceRecord(CRCreditChargeCardAuthorizationAssessmentExecuteInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord cRCreditChargeCardAuthorizationAssessmentInstanceRecord) {
    this.cRCreditChargeCardAuthorizationAssessmentInstanceRecord = cRCreditChargeCardAuthorizationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentExecuteActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentExecuteActionTaskRecord(Object creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord = creditChargeCardAuthorizationAssessmentExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCreditChargeCardAuthorizationAssessmentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCreditChargeCardAuthorizationAssessmentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

