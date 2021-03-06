/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.portfolio.savings.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;

/**
 * Created by Chirag Gupta on 12/30/17.
 */
final class SavingsAccountChargesApiResourceSwagger {

    private SavingsAccountChargesApiResourceSwagger() {}

    @ApiModel(value = "GetSavingsAccountsSavingsAccountIdChargesResponse")
    public static final class GetSavingsAccountsSavingsAccountIdChargesResponse {

        private GetSavingsAccountsSavingsAccountIdChargesResponse() {}

        static final class GetChargesCurrencyResponse {

            @ApiModelProperty(example = "USD")
            public String code;
            @ApiModelProperty(example = "US Dollar")
            public String name;
            @ApiModelProperty(example = "2")
            public Integer decimalPlaces;
            @ApiModelProperty(example = "$")
            public String displaySymbol;
            @ApiModelProperty(example = "currency.USD")
            public String nameCode;
            @ApiModelProperty(example = "US Dollar ($)")
            public String displayLabel;
        }

        static final class GetChargesChargeCalculationType {

            private GetChargesChargeCalculationType() {}

            @ApiModelProperty(example = "1")
            public Integer id;
            @ApiModelProperty(example = "chargeCalculationType.flat")
            public String code;
            @ApiModelProperty(example = "Flat")
            public String value;
        }

        static final class GetChargesChargeTimeType {

            private GetChargesChargeTimeType() {}

            @ApiModelProperty(example = "1")
            public Integer id;
            @ApiModelProperty(example = "chargeTimeType.specifiedDueDate")
            public String code;
            @ApiModelProperty(example = "Specified due date")
            public String value;
        }

        @ApiModelProperty(example = "1")
        public Integer id;
        @ApiModelProperty(example = "3")
        public Integer chargeId;
        @ApiModelProperty(example = "57")
        public Integer accountId;
        @ApiModelProperty(example = "Savings account maintenance fee")
        public String name;
        public GetChargesChargeTimeType chargeTimeType;
        public GetChargesChargeCalculationType chargeCalculationType;
        @ApiModelProperty(example = "0")
        public Double percentage;
        @ApiModelProperty(example = "0")
        public Double amountPercentageAppliedTo;
        public GetChargesCurrencyResponse currency;
        @ApiModelProperty(example = "100")
        public Float amount;
        @ApiModelProperty(example = "0")
        public Float amountPaid;
        @ApiModelProperty(example = "0")
        public Float amountWaived;
        @ApiModelProperty(example = "0")
        public Float amountWrittenOff;
        @ApiModelProperty(example = "100")
        public Float amountOutstanding;
        @ApiModelProperty(example = "100")
        public Float amountOrPercentage;
        @ApiModelProperty(example = "false")
        public Boolean penalty;
    }

    @ApiModel(value = "GetSavingsAccountsSavingsAccountIdChargesTemplateResponse")
    public static final class GetSavingsAccountsSavingsAccountIdChargesTemplateResponse {

        private GetSavingsAccountsSavingsAccountIdChargesTemplateResponse() {}

        static final class GetSavingsChargesOptions {

            private GetSavingsChargesOptions() {}

            static final class GetSavingsChargesChargeTimeType {

                private GetSavingsChargesChargeTimeType() {}

                @ApiModelProperty(example = "2")
                public Integer id;
                @ApiModelProperty(example = "chargeTimeType.specifiedDueDate")
                public String code;
                @ApiModelProperty(example = "Specified due date")
                public String value;
            }

            static final class GetChargesAppliesTo {

                private GetChargesAppliesTo() {}

                @ApiModelProperty(example = "1")
                public Integer id;
                @ApiModelProperty(example = "chargeAppliesTo.savings")
                public String code;
                @ApiModelProperty(example = "Savings")
                public String value;
            }

            @ApiModelProperty(example = "2")
            public Integer id;
            @ApiModelProperty(example = "Passbook Fee")
            public String name;
            @ApiModelProperty(example = "true")
            public Boolean active;
            @ApiModelProperty(example = "false")
            public Boolean penalty;
            public GetSavingsAccountsSavingsAccountIdChargesResponse.GetChargesCurrencyResponse currency;
            @ApiModelProperty(example = "100")
            public Float amount;
            public GetSavingsChargesChargeTimeType chargeTimeType;
            public GetChargesAppliesTo chargesAppliesTo;
            public GetSavingsAccountsSavingsAccountIdChargesResponse.GetChargesChargeCalculationType chargeCalculationType;
        }

        @ApiModelProperty(example = "0")
        public Float amountPaid;
        @ApiModelProperty(example = "0")
        public Float amountWaived;
        @ApiModelProperty(example = "0")
        public Float amountWrittenOff;
        public Set<GetSavingsChargesOptions> chargeOptions;
        @ApiModelProperty(example = "false")
        public Boolean penalty;
    }

    @ApiModel(value = "GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse")
    public static final class GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {

        private GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse() {}

        @ApiModelProperty(example = "1")
        public Integer id;
        @ApiModelProperty(example = "1")
        public Integer chargeId;
        @ApiModelProperty(example = "Passbook fee")
        public String name;
        public GetSavingsAccountsSavingsAccountIdChargesResponse.GetChargesChargeTimeType chargeTimeType;
        public GetSavingsAccountsSavingsAccountIdChargesResponse.GetChargesChargeCalculationType chargeCalculationType;
        @ApiModelProperty(example = "0")
        public Double percentage;
        @ApiModelProperty(example = "0")
        public Double amountPercentageAppliedTo;
        public GetSavingsAccountsSavingsAccountIdChargesResponse.GetChargesCurrencyResponse currency;
        @ApiModelProperty(example = "100")
        public Float amount;
        @ApiModelProperty(example = "0")
        public Float amountPaid;
        @ApiModelProperty(example = "0")
        public Float amountWaived;
        @ApiModelProperty(example = "0")
        public Float amountWrittenOff;
        @ApiModelProperty(example = "100")
        public Float amountOutstanding;
        @ApiModelProperty(example = "100")
        public Float amountOrPercentage;
        @ApiModelProperty(example = "false")
        public Boolean penalty;
    }

    @ApiModel(value = "PostSavingsAccountsSavingsAccountIdChargesRequest")
    public static final class PostSavingsAccountsSavingsAccountIdChargesRequest {

        private PostSavingsAccountsSavingsAccountIdChargesRequest() {}

        @ApiModelProperty(example = "2")
        public Integer chargeId;
        @ApiModelProperty(example = "en")
        public String locale;
        @ApiModelProperty(example = "100")
        public Float amount;
        @ApiModelProperty(example = "dd MMMM yyyy")
        public String dateFormat;
        @ApiModelProperty(example = "29 April 2013")
        public String dueDate;
    }

    @ApiModel(value = "PostSavingsAccountsSavingsAccountIdChargesResponse")
    public static final class PostSavingsAccountsSavingsAccountIdChargesResponse {

        private PostSavingsAccountsSavingsAccountIdChargesResponse() {}

        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "1")
        public Integer clientId;
        @ApiModelProperty(example = "1")
        public Integer savingsId;
        @ApiModelProperty(example = "6")
        public Integer resourceId;
    }

    @ApiModel(value = "PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest")
    public static final class PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest {

        private PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest() {}

        @ApiModelProperty(example = "dd MMMM yyyy")
        public String dateFormat;
        @ApiModelProperty(example = "en")
        public String locale;
        @ApiModelProperty(example = "60")
        public Float amount;
        @ApiModelProperty(example = "27 March 2013")
        public String dueDate;
    }

    @ApiModel(value = "PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse")
    public static final class PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {

        private PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse() {}

        static final class PutSavingsChanges {

            private PutSavingsChanges() {}

            @ApiModelProperty(example = "27 March 2013")
            public String dueDate;
            @ApiModelProperty(example = "dd MMMM yyyy")
            public String dateFormat;
            @ApiModelProperty(example = "en")
            public String locale;
            @ApiModelProperty(example = "60.0")
            public Float amount;
        }

        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "1")
        public Integer clientId;
        @ApiModelProperty(example = "1")
        public Integer savingsId;
        @ApiModelProperty(example = "6")
        public Integer resourceId;
        public PutSavingsChanges changes;
    }

    @ApiModel(value = "PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest")
    public static final class PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest {

        private PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest() {}

        @ApiModelProperty(example = "dd MMMM yyyy")
        public String dateFormat;
        @ApiModelProperty(example = "en")
        public String locale;
        @ApiModelProperty(example = "60")
        public Float amount;
        @ApiModelProperty(example = "12 September 2013")
        public String dueDate;
    }

    @ApiModel(value = "PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse")
    public static final class PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {

        private PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse() {}

        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "1")
        public Integer clientId;
        @ApiModelProperty(example = "1")
        public Integer savingsId;
        @ApiModelProperty(example = "2")
        public Integer resourceId;
    }

    @ApiModel(value = "DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse")
    public static final class DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {

        private DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse() {}

        @ApiModelProperty(example = "1")
        public Integer officeId;
        @ApiModelProperty(example = "1")
        public Integer clientId;
        @ApiModelProperty(example = "1")
        public Integer savingsId;
        @ApiModelProperty(example = "2")
        public Integer resourceId;
    }
}
