package org.jarling.v2;

import org.jarling.v2.api.*;
import org.jarling.v2.http.CertificateType;

import java.security.PrivateKey;
import java.util.UUID;

public interface StarlingBank extends AccountHolderResource, AccountsResource, AddressesResource, ApiUserIdentityResource, BusinessesResource, TransactionFeedResource, IndividualsResource, JointAccountsResource, KycResource, PayeesResource, PaymentsResource, CustomResource {
    AccountHolderResource accountHolder();
    AccountsResource accounts();
    AddressesResource addresses();
    ApiUserIdentityResource identity();
    BusinessesResource businesses();
    CustomResource custom();
    TransactionFeedResource transactionFeed();
    IndividualsResource individuals();
    JointAccountsResource jointAccounts();
    KycResource kyc();
    PayeesResource payees();
    PaymentsResource payments();

    void configureRequestSigning(PrivateKey privateKey, UUID publicKeyUid, CertificateType certificateType);
    boolean canSignRequests();
}
