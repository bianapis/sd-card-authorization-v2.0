package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord
 */
public class BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord   {
  private BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord cardTransactionRecord = null;


  /**
   * Get cardTransactionRecord
   * @return cardTransactionRecord
  **/

  public BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord getCardTransactionRecord() {
    return cardTransactionRecord;
  }

  public void setCardTransactionRecord(BQAuthenticationRetrieveOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord cardTransactionRecord) {
    this.cardTransactionRecord = cardTransactionRecord;
  }


}

