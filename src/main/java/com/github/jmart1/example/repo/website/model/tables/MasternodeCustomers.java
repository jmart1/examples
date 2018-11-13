/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.MasternodeCustomersRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Date;


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
public class MasternodeCustomers extends TableImpl<MasternodeCustomersRecord> {

    /**
     * The reference instance of <code>pacnode.masternode_customers</code>
     */
    public static final MasternodeCustomers MASTERNODE_CUSTOMERS = new MasternodeCustomers();
    private static final long serialVersionUID = -1608802728;
    /**
     * The column <code>pacnode.masternode_customers.name</code>.
     */
    public final TableField<MasternodeCustomersRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_customers.receive_address</code>.
     */
    public final TableField<MasternodeCustomersRecord, String> RECEIVE_ADDRESS = createField("receive_address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");
    /**
     * The column <code>pacnode.masternode_customers.original_investment</code>.
     */
    public final TableField<MasternodeCustomersRecord, Integer> ORIGINAL_INVESTMENT = createField("original_investment", org.jooq.impl.SQLDataType.INTEGER, this, "");
    /**
     * The column <code>pacnode.masternode_customers.active</code>.
     */
    public final TableField<MasternodeCustomersRecord, String> ACTIVE = createField("active", org.jooq.impl.SQLDataType.CHAR(1), this, "");
    /**
     * The column <code>pacnode.masternode_customers.joined_date</code>.
     */
    public final TableField<MasternodeCustomersRecord, Date> JOINED_DATE = createField("joined_date", org.jooq.impl.SQLDataType.DATE, this, "");
    /**
     * The column <code>pacnode.masternode_customers.terminated_date</code>.
     */
    public final TableField<MasternodeCustomersRecord, Date> TERMINATED_DATE = createField("terminated_date", org.jooq.impl.SQLDataType.DATE, this, "");
    /**
     * The column <code>pacnode.masternode_customers.current_investment</code>.
     */
    public final TableField<MasternodeCustomersRecord, Integer> CURRENT_INVESTMENT = createField("current_investment", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>pacnode.masternode_customers</code> table reference
     */
    public MasternodeCustomers() {
        this(DSL.name("masternode_customers"), null);
    }

    /**
     * Create an aliased <code>pacnode.masternode_customers</code> table reference
     */
    public MasternodeCustomers(String alias) {
        this(DSL.name(alias), MASTERNODE_CUSTOMERS);
    }

    /**
     * Create an aliased <code>pacnode.masternode_customers</code> table reference
     */
    public MasternodeCustomers(Name alias) {
        this(alias, MASTERNODE_CUSTOMERS);
    }

    private MasternodeCustomers(Name alias, Table<MasternodeCustomersRecord> aliased) {
        this(alias, aliased, null);
    }

    private MasternodeCustomers(Name alias, Table<MasternodeCustomersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MasternodeCustomersRecord> getRecordType() {
        return MasternodeCustomersRecord.class;
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
    public MasternodeCustomers as(String alias) {
        return new MasternodeCustomers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MasternodeCustomers as(Name alias) {
        return new MasternodeCustomers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeCustomers rename(String name) {
        return new MasternodeCustomers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MasternodeCustomers rename(Name name) {
        return new MasternodeCustomers(name, null);
    }
}