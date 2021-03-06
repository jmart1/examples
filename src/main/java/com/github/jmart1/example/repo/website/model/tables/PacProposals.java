/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Indexes;
import com.github.jmart1.example.repo.website.model.Keys;
import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.PacProposalsRecord;
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
public class PacProposals extends TableImpl<PacProposalsRecord> {

    /**
     * The reference instance of <code>pacnode.pac_proposals</code>
     */
    public static final PacProposals PAC_PROPOSALS = new PacProposals();
    private static final long serialVersionUID = -19621324;
    /**
     * The column <code>pacnode.pac_proposals.hash</code>.
     */
    public final TableField<PacProposalsRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");
    /**
     * The column <code>pacnode.pac_proposals.name</code>.
     */
    public final TableField<PacProposalsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>pacnode.pac_proposals.colhash</code>.
     */
    public final TableField<PacProposalsRecord, String> COLHASH = createField("colhash", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.pac_proposals.payment_addr</code>.
     */
    public final TableField<PacProposalsRecord, String> PAYMENT_ADDR = createField("payment_addr", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.pac_proposals.amount</code>.
     */
    public final TableField<PacProposalsRecord, Double> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DOUBLE, this, "");
    /**
     * The column <code>pacnode.pac_proposals.start_date</code>.
     */
    public final TableField<PacProposalsRecord, Timestamp> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>pacnode.pac_proposals.end_date</code>.
     */
    public final TableField<PacProposalsRecord, Timestamp> END_DATE = createField("end_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>pacnode.pac_proposals.create_date</code>.
     */
    public final TableField<PacProposalsRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");
    /**
     * The column <code>pacnode.pac_proposals.url</code>.
     */
    public final TableField<PacProposalsRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>pacnode.pac_proposals.abs_yes_count</code>.
     */
    public final TableField<PacProposalsRecord, Integer> ABS_YES_COUNT = createField("abs_yes_count", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pacnode.pac_proposals.yes_count</code>.
     */
    public final TableField<PacProposalsRecord, Integer> YES_COUNT = createField("yes_count", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pacnode.pac_proposals.no_count</code>.
     */
    public final TableField<PacProposalsRecord, Integer> NO_COUNT = createField("no_count", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pacnode.pac_proposals.abstain_count</code>.
     */
    public final TableField<PacProposalsRecord, Integer> ABSTAIN_COUNT = createField("abstain_count", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pacnode.pac_proposals.block_valid</code>.
     */
    public final TableField<PacProposalsRecord, Byte> BLOCK_VALID = createField("block_valid", org.jooq.impl.SQLDataType.TINYINT, this, "");
    /**
     * The column <code>pacnode.pac_proposals.valid_reason</code>.
     */
    public final TableField<PacProposalsRecord, String> VALID_REASON = createField("valid_reason", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>pacnode.pac_proposals.cached_valid</code>.
     */
    public final TableField<PacProposalsRecord, Byte> CACHED_VALID = createField("cached_valid", org.jooq.impl.SQLDataType.TINYINT, this, "");
    /**
     * The column <code>pacnode.pac_proposals.cached_funding</code>.
     */
    public final TableField<PacProposalsRecord, Byte> CACHED_FUNDING = createField("cached_funding", org.jooq.impl.SQLDataType.TINYINT, this, "");
    /**
     * The column <code>pacnode.pac_proposals.cached_delete</code>.
     */
    public final TableField<PacProposalsRecord, Byte> CACHED_DELETE = createField("cached_delete", org.jooq.impl.SQLDataType.TINYINT, this, "");
    /**
     * The column <code>pacnode.pac_proposals.cached_endorsed</code>.
     */
    public final TableField<PacProposalsRecord, Byte> CACHED_ENDORSED = createField("cached_endorsed", org.jooq.impl.SQLDataType.TINYINT, this, "");
    /**
     * The column <code>pacnode.pac_proposals.cycles</code>.
     */
    public final TableField<PacProposalsRecord, Integer> CYCLES = createField("cycles", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>pacnode.pac_proposals</code> table reference
     */
    public PacProposals() {
        this(DSL.name("pac_proposals"), null);
    }

    /**
     * Create an aliased <code>pacnode.pac_proposals</code> table reference
     */
    public PacProposals(String alias) {
        this(DSL.name(alias), PAC_PROPOSALS);
    }

    /**
     * Create an aliased <code>pacnode.pac_proposals</code> table reference
     */
    public PacProposals(Name alias) {
        this(alias, PAC_PROPOSALS);
    }

    private PacProposals(Name alias, Table<PacProposalsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PacProposals(Name alias, Table<PacProposalsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PacProposalsRecord> getRecordType() {
        return PacProposalsRecord.class;
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
        return Arrays.<Index>asList(Indexes.PAC_PROPOSALS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PacProposalsRecord> getPrimaryKey() {
        return Keys.KEY_PAC_PROPOSALS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PacProposalsRecord>> getKeys() {
        return Arrays.<UniqueKey<PacProposalsRecord>>asList(Keys.KEY_PAC_PROPOSALS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacProposals as(String alias) {
        return new PacProposals(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PacProposals as(Name alias) {
        return new PacProposals(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PacProposals rename(String name) {
        return new PacProposals(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PacProposals rename(Name name) {
        return new PacProposals(name, null);
    }
}
