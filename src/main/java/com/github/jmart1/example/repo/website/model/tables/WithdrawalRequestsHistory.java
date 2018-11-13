/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Indexes;
import com.github.jmart1.example.repo.website.model.Keys;
import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.WithdrawalRequestsHistoryRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


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
public class WithdrawalRequestsHistory extends TableImpl<WithdrawalRequestsHistoryRecord> {

    /**
     * The reference instance of <code>pacnode.withdrawal_requests_history</code>
     */
    public static final WithdrawalRequestsHistory WITHDRAWAL_REQUESTS_HISTORY = new WithdrawalRequestsHistory();
    private static final long serialVersionUID = 1973717093;
    /**
     * The column <code>pacnode.withdrawal_requests_history.request_id</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Integer> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.payout_id</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Integer> PAYOUT_ID = createField("payout_id", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.account_id</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.payout_address</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, String> PAYOUT_ADDRESS = createField("payout_address", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.status</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("Pending", org.jooq.impl.SQLDataType.VARCHAR)), this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.confirmations</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Integer> CONFIRMATIONS = createField("confirmations", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.withdrawal_amount</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Double> WITHDRAWAL_AMOUNT = createField("withdrawal_amount", org.jooq.impl.SQLDataType.DOUBLE, this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.pacnode_fee</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Double> PACNODE_FEE = createField("pacnode_fee", org.jooq.impl.SQLDataType.DOUBLE, this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.gross_rewards</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Double> GROSS_REWARDS = createField("gross_rewards", org.jooq.impl.SQLDataType.DOUBLE, this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.request_date</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Timestamp> REQUEST_DATE = createField("request_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.send_date</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Timestamp> SEND_DATE = createField("send_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.transaction_id</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, String> TRANSACTION_ID = createField("transaction_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.withdrawal_requests_history.history_date</code>.
     */
    public final TableField<WithdrawalRequestsHistoryRecord, Timestamp> HISTORY_DATE = createField("history_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>pacnode.withdrawal_requests_history</code> table reference
     */
    public WithdrawalRequestsHistory() {
        this(DSL.name("withdrawal_requests_history"), null);
    }

    /**
     * Create an aliased <code>pacnode.withdrawal_requests_history</code> table reference
     */
    public WithdrawalRequestsHistory(String alias) {
        this(DSL.name(alias), WITHDRAWAL_REQUESTS_HISTORY);
    }

    /**
     * Create an aliased <code>pacnode.withdrawal_requests_history</code> table reference
     */
    public WithdrawalRequestsHistory(Name alias) {
        this(alias, WITHDRAWAL_REQUESTS_HISTORY);
    }

    private WithdrawalRequestsHistory(Name alias, Table<WithdrawalRequestsHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private WithdrawalRequestsHistory(Name alias, Table<WithdrawalRequestsHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WithdrawalRequestsHistoryRecord> getRecordType() {
        return WithdrawalRequestsHistoryRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Pacnode.PACNODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WITHDRAWAL_REQUESTS_HISTORY_ACCOUNT_IDX, Indexes.WITHDRAWAL_REQUESTS_HISTORY_PAYOUT_ADDRESS_IDX, Indexes.WITHDRAWAL_REQUESTS_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WithdrawalRequestsHistoryRecord> getPrimaryKey() {
        return Keys.KEY_WITHDRAWAL_REQUESTS_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WithdrawalRequestsHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<WithdrawalRequestsHistoryRecord>>asList(Keys.KEY_WITHDRAWAL_REQUESTS_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WithdrawalRequestsHistory as(String alias) {
        return new WithdrawalRequestsHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WithdrawalRequestsHistory as(Name alias) {
        return new WithdrawalRequestsHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public WithdrawalRequestsHistory rename(String name) {
        return new WithdrawalRequestsHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public WithdrawalRequestsHistory rename(Name name) {
        return new WithdrawalRequestsHistory(name, null);
    }
}