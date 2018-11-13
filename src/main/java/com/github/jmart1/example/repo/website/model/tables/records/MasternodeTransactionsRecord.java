/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables.records;


import com.github.jmart1.example.repo.website.model.tables.MasternodeTransactions;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MasternodeTransactionsRecord extends UpdatableRecordImpl<MasternodeTransactionsRecord> implements Record7<Integer, BigDecimal, Date, Timestamp, String, String, Integer> {

    private static final long serialVersionUID = -1839767159;

    /**
     * Create a detached MasternodeTransactionsRecord
     */
    public MasternodeTransactionsRecord() {
        super(MasternodeTransactions.MASTERNODE_TRANSACTIONS);
    }

    /**
     * Create a detached, initialised MasternodeTransactionsRecord
     */
    public MasternodeTransactionsRecord(Integer mnId, BigDecimal rewardAmount, Date rewardDate, Timestamp rewardDatetime, String payoutAddress, String transactionId, Integer confirmations) {
        super(MasternodeTransactions.MASTERNODE_TRANSACTIONS);

        set(0, mnId);
        set(1, rewardAmount);
        set(2, rewardDate);
        set(3, rewardDatetime);
        set(4, payoutAddress);
        set(5, transactionId);
        set(6, confirmations);
    }

    /**
     * Getter for <code>pacnode.masternode_transactions.mn_id</code>.
     */
    public Integer getMnId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pacnode.masternode_transactions.mn_id</code>.
     */
    public void setMnId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pacnode.masternode_transactions.reward_amount</code>.
     */
    public BigDecimal getRewardAmount() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>pacnode.masternode_transactions.reward_amount</code>.
     */
    public void setRewardAmount(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>pacnode.masternode_transactions.reward_date</code>.
     */
    public Date getRewardDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>pacnode.masternode_transactions.reward_date</code>.
     */
    public void setRewardDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>pacnode.masternode_transactions.reward_datetime</code>.
     */
    public Timestamp getRewardDatetime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>pacnode.masternode_transactions.reward_datetime</code>.
     */
    public void setRewardDatetime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>pacnode.masternode_transactions.payout_address</code>.
     */
    public String getPayoutAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pacnode.masternode_transactions.payout_address</code>.
     */
    public void setPayoutAddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pacnode.masternode_transactions.transaction_id</code>.
     */
    public String getTransactionId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pacnode.masternode_transactions.transaction_id</code>.
     */
    public void setTransactionId(String value) {
        set(5, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pacnode.masternode_transactions.confirmations</code>.
     */
    public Integer getConfirmations() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>pacnode.masternode_transactions.confirmations</code>.
     */
    public void setConfirmations(Integer value) {
        set(6, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<Integer, String, String> key() {
        return (Record3) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, BigDecimal, Date, Timestamp, String, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, BigDecimal, Date, Timestamp, String, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.MN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.REWARD_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.REWARD_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.REWARD_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.PAYOUT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.TRANSACTION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return MasternodeTransactions.MASTERNODE_TRANSACTIONS.CONFIRMATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getRewardAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getRewardDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getRewardDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPayoutAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getConfirmations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getRewardAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getRewardDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getRewardDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPayoutAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTransactionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getConfirmations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value1(Integer value) {
        setMnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value2(BigDecimal value) {
        setRewardAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value3(Date value) {
        setRewardDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value4(Timestamp value) {
        setRewardDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value5(String value) {
        setPayoutAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value6(String value) {
        setTransactionId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord value7(Integer value) {
        setConfirmations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeTransactionsRecord values(Integer value1, BigDecimal value2, Date value3, Timestamp value4, String value5, String value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }
}
