package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord
 */
public class CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord   {
  private String networkReference = null;

  private String participantAcquirerBankReference = null;

  private String participantIssuerBankReference = null;

  private CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord cardTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the network the authentication is processed through 
   * @return networkReference
  **/

  public String getNetworkReference() {
    return networkReference;
  }

  public void setNetworkReference(String networkReference) {
    this.networkReference = networkReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Acquiring bank requesting authorization 
   * @return participantAcquirerBankReference
  **/

  public String getParticipantAcquirerBankReference() {
    return participantAcquirerBankReference;
  }

  public void setParticipantAcquirerBankReference(String participantAcquirerBankReference) {
    this.participantAcquirerBankReference = participantAcquirerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Issuing bank providing authorization 
   * @return participantIssuerBankReference
  **/

  public String getParticipantIssuerBankReference() {
    return participantIssuerBankReference;
  }

  public void setParticipantIssuerBankReference(String participantIssuerBankReference) {
    this.participantIssuerBankReference = participantIssuerBankReference;
  }


  /**
   * Get cardTransactionRecord
   * @return cardTransactionRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord getCardTransactionRecord() {
    return cardTransactionRecord;
  }

  public void setCardTransactionRecord(CRCreditChargeCardAuthorizationAssessmentRequestInputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord cardTransactionRecord) {
    this.cardTransactionRecord = cardTransactionRecord;
  }


}

