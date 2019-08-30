package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentGrantInputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentGrantInputModel   {
  private String cardAuthorizationServicingSessionReference = null;

  private String creditChargeCardAuthorizationAssessmentInstanceReference = null;

  private Object creditChargeCardAuthorizationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCreditChargeCardAuthorizationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return creditChargeCardAuthorizationAssessmentGrantActionTaskRecord
  **/

  public Object getCreditChargeCardAuthorizationAssessmentGrantActionTaskRecord() {
    return creditChargeCardAuthorizationAssessmentGrantActionTaskRecord;
  }

  public void setCreditChargeCardAuthorizationAssessmentGrantActionTaskRecord(Object creditChargeCardAuthorizationAssessmentGrantActionTaskRecord) {
    this.creditChargeCardAuthorizationAssessmentGrantActionTaskRecord = creditChargeCardAuthorizationAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCreditChargeCardAuthorizationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

