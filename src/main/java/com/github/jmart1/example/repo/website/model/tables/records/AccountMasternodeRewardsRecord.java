/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables.records;


import com.github.jmart1.example.repo.website.model.tables.AccountMasternodeRewards;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
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
public class AccountMasternodeRewardsRecord extends UpdatableRecordImpl<AccountMasternodeRewardsRecord> implements Record6<Integer, Integer, Double, Double, Double, Timestamp> {

    private static final long serialVersionUID = -2117381811;

    /**
     * Create a detached AccountMasternodeRewardsRecord
     */
    public AccountMasternodeRewardsRecord() {
        super(AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS);
    }

    /**
     * Create a detached, initialised AccountMasternodeRewardsRecord
     */
    public AccountMasternodeRewardsRecord(Integer accountId, Integer mnId, Double rewardAmount, Double feeAmount, Double withdrawalAmount, Timestamp lastPayoutDate) {
        super(AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS);

        set(0, accountId);
        set(1, mnId);
        set(2, rewardAmount);
        set(3, feeAmount);
        set(4, withdrawalAmount);
        set(5, lastPayoutDate);
    }

    /**
     * Getter for <code>pacnode.account_masternode_rewards.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pacnode.account_masternode_rewards.account_id</code>.
     */
    public void setAccountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pacnode.account_masternode_rewards.mn_id</code>.
     */
    public Integer getMnId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>pacnode.account_masternode_rewards.mn_id</code>.
     */
    public void setMnId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>pacnode.account_masternode_rewards.reward_amount</code>.
     */
    public Double getRewardAmount() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>pacnode.account_masternode_rewards.reward_amount</code>.
     */
    public void setRewardAmount(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>pacnode.account_masternode_rewards.fee_amount</code>.
     */
    public Double getFeeAmount() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>pacnode.account_masternode_rewards.fee_amount</code>.
     */
    public void setFeeAmount(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>pacnode.account_masternode_rewards.withdrawal_amount</code>.
     */
    public Double getWithdrawalAmount() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>pacnode.account_masternode_rewards.withdrawal_amount</code>.
     */
    public void setWithdrawalAmount(Double value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pacnode.account_masternode_rewards.last_payout_date</code>.
     */
    public Timestamp getLastPayoutDate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>pacnode.account_masternode_rewards.last_payout_date</code>.
     */
    public void setLastPayoutDate(Timestamp value) {
        set(5, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Double, Double, Double, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Double, Double, Double, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS.MN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS.REWARD_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS.FEE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS.WITHDRAWAL_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return AccountMasternodeRewards.ACCOUNT_MASTERNODE_REWARDS.LAST_PAYOUT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component3() {
        return getRewardAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getFeeAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getWithdrawalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLastPayoutDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMnId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getRewardAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getFeeAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getWithdrawalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastPayoutDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord value1(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord value2(Integer value) {
        setMnId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord value3(Double value) {
        setRewardAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord value4(Double value) {
        setFeeAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord value5(Double value) {
        setWithdrawalAmount(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord value6(Timestamp value) {
        setLastPayoutDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountMasternodeRewardsRecord values(Integer value1, Integer value2, Double value3, Double value4, Double value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}
