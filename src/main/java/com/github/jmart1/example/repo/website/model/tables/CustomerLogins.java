/*
 * This file is generated by jOOQ.
 */
package com.github.jmart1.example.repo.website.model.tables;


import com.github.jmart1.example.repo.website.model.Indexes;
import com.github.jmart1.example.repo.website.model.Keys;
import com.github.jmart1.example.repo.website.model.Pacnode;
import com.github.jmart1.example.repo.website.model.tables.records.CustomerLoginsRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
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
public class CustomerLogins extends TableImpl<CustomerLoginsRecord> {

    /**
     * The reference instance of <code>pacnode.customer_logins</code>
     */
    public static final CustomerLogins CUSTOMER_LOGINS = new CustomerLogins();
    private static final long serialVersionUID = 933591672;
    /**
     * The column <code>pacnode.customer_logins.account_id</code>.
     */
    public final TableField<CustomerLoginsRecord, Integer> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>pacnode.customer_logins.password</code>.
     */
    public final TableField<CustomerLoginsRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>pacnode.customer_logins.email_address</code>.
     */
    public final TableField<CustomerLoginsRecord, String> EMAIL_ADDRESS = createField("email_address", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>pacnode.customer_logins</code> table reference
     */
    public CustomerLogins() {
        this(DSL.name("customer_logins"), null);
    }

    /**
     * Create an aliased <code>pacnode.customer_logins</code> table reference
     */
    public CustomerLogins(String alias) {
        this(DSL.name(alias), CUSTOMER_LOGINS);
    }

    /**
     * Create an aliased <code>pacnode.customer_logins</code> table reference
     */
    public CustomerLogins(Name alias) {
        this(alias, CUSTOMER_LOGINS);
    }

    private CustomerLogins(Name alias, Table<CustomerLoginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerLogins(Name alias, Table<CustomerLoginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerLoginsRecord> getRecordType() {
        return CustomerLoginsRecord.class;
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
        return Arrays.<Index>asList(Indexes.CUSTOMER_LOGINS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CustomerLoginsRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_LOGINS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CustomerLoginsRecord>> getKeys() {
        return Arrays.<UniqueKey<CustomerLoginsRecord>>asList(Keys.KEY_CUSTOMER_LOGINS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerLogins as(String alias) {
        return new CustomerLogins(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerLogins as(Name alias) {
        return new CustomerLogins(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerLogins rename(String name) {
        return new CustomerLogins(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerLogins rename(Name name) {
        return new CustomerLogins(name, null);
    }
}