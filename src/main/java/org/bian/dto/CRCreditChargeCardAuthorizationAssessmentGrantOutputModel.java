package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentGrantOutputModel
 */
public class CRCreditChargeCardAuthorizationAssessmentGrantOutputModel   {
  private String creditChargeCardAuthorizationAssessmentGrantActionTaskReference = null;

  private Object creditChargeCardAuthorizationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCreditChargeCardAuthorizationAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Charge Card Authorization Assessment instance grant service call 
   * @return creditChargeCardAuthorizationAssessmentGrantActionTaskReference
  **/

  public String getCreditChargeCardAuthorizationAssessmentGrantActionTaskReference() {
    return creditChargeCardAuthorizationAssessmentGrantActionTaskReference;
  }

  public void setCreditChargeCardAuthorizationAssessmentGrantActionTaskReference(String creditChargeCardAuthorizationAssessmentGrantActionTaskReference) {
    this.creditChargeCardAuthorizationAssessmentGrantActionTaskReference = creditChargeCardAuthorizationAssessmentGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCreditChargeCardAuthorizationAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

