/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables.records;


import com.github.jmart1.example.repo.website.model.tables.PacPropVoting;
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
public class PacPropVotingRecord extends UpdatableRecordImpl<PacPropVotingRecord> implements Record6<Integer, String, Byte, Byte, Byte, Timestamp> {

    private static final long serialVersionUID = 879945428;

    /**
     * Create a detached PacPropVotingRecord
     */
    public PacPropVotingRecord() {
        super(PacPropVoting.PAC_PROP_VOTING);
    }

    /**
     * Create a detached, initialised PacPropVotingRecord
     */
    public PacPropVotingRecord(Integer accountId, String hash, Byte yes, Byte no, Byte abstain, Timestamp firstVoteDate) {
        super(PacPropVoting.PAC_PROP_VOTING);

        set(0, accountId);
        set(1, hash);
        set(2, yes);
        set(3, no);
        set(4, abstain);
        set(5, firstVoteDate);
    }

    /**
     * Getter for <code>pacnode.pac_prop_voting.account_id</code>.
     */
    public Integer getAccountId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pacnode.pac_prop_voting.account_id</code>.
     */
    public void setAccountId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pacnode.pac_prop_voting.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pacnode.pac_prop_voting.hash</code>.
     */
    public void setHash(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pacnode.pac_prop_voting.yes</code>.
     */
    public Byte getYes() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>pacnode.pac_prop_voting.yes</code>.
     */
    public void setYes(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>pacnode.pac_prop_voting.no</code>.
     */
    public Byte getNo() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>pacnode.pac_prop_voting.no</code>.
     */
    public void setNo(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>pacnode.pac_prop_voting.abstain</code>.
     */
    public Byte getAbstain() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>pacnode.pac_prop_voting.abstain</code>.
     */
    public void setAbstain(Byte value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pacnode.pac_prop_voting.first_vote_date</code>.
     */
    public Timestamp getFirstVoteDate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>pacnode.pac_prop_voting.first_vote_date</code>.
     */
    public void setFirstVoteDate(Timestamp value) {
        set(5, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Byte, Byte, Byte, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Byte, Byte, Byte, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PacPropVoting.PAC_PROP_VOTING.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PacPropVoting.PAC_PROP_VOTING.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return PacPropVoting.PAC_PROP_VOTING.YES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return PacPropVoting.PAC_PROP_VOTING.NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return PacPropVoting.PAC_PROP_VOTING.ABSTAIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return PacPropVoting.PAC_PROP_VOTING.FIRST_VOTE_DATE;
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
    public String component2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getYes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getAbstain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getFirstVoteDate();
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
    public String value2() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getYes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getAbstain();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getFirstVoteDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord value1(Integer value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord value2(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord value3(Byte value) {
        setYes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord value4(Byte value) {
        setNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord value5(Byte value) {
        setAbstain(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord value6(Timestamp value) {
        setFirstVoteDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacPropVotingRecord values(Integer value1, String value2, Byte value3, Byte value4, Byte value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}
