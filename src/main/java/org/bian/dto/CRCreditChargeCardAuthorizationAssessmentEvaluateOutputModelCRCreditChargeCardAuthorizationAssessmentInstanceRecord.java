package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord;

import javax.validation.Valid;
  
/**
 * CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord
 */
public class CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecord   {
  private CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord cardTransactionRecord = null;


  /**
   * Get cardTransactionRecord
   * @return cardTransactionRecord
  **/

  public CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord getCardTransactionRecord() {
    return cardTransactionRecord;
  }

  public void setCardTransactionRecord(CRCreditChargeCardAuthorizationAssessmentEvaluateOutputModelCRCreditChargeCardAuthorizationAssessmentInstanceRecordCardTransactionRecord cardTransactionRecord) {
    this.cardTransactionRecord = cardTransactionRecord;
  }


}

