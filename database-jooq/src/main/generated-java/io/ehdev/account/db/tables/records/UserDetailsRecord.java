/*
 * This file is generated by jOOQ.
 */
package io.ehdev.account.db.tables.records;


import io.ehdev.account.db.tables.UserDetailsTable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "user_details", schema = "account_manager", indexes = {
    @Index(name = "email", unique = true, columnList = "email ASC"),
    @Index(name = "PRIMARY", unique = true, columnList = "user_id ASC"),
    @Index(name = "user_ref", unique = true, columnList = "user_ref ASC")
})
public class UserDetailsRecord extends UpdatableRecordImpl<UserDetailsRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = -1982633433;

    /**
     * Setter for <code>account_manager.user_details.user_id</code>.
     */
    public void setUserId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>account_manager.user_details.user_id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false, precision = 19)
    public Long getUserId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>account_manager.user_details.user_ref</code>.
     */
    public void setUserRef(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>account_manager.user_details.user_ref</code>.
     */
    @Column(name = "user_ref", unique = true, nullable = false, length = 12)
    @NotNull
    @Size(max = 12)
    public String getUserRef() {
        return (String) get(1);
    }

    /**
     * Setter for <code>account_manager.user_details.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>account_manager.user_details.email</code>.
     */
    @Column(name = "email", unique = true, nullable = false, length = 128)
    @NotNull
    @Size(max = 128)
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>account_manager.user_details.display_name</code>.
     */
    public void setDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>account_manager.user_details.display_name</code>.
     */
    @Column(name = "display_name", nullable = false, length = 128)
    @NotNull
    @Size(max = 128)
    public String getDisplayName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return UserDetailsTable.USER_DETAILS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UserDetailsTable.USER_DETAILS.USER_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserDetailsTable.USER_DETAILS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return UserDetailsTable.USER_DETAILS.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUserRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDetailsRecord value1(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDetailsRecord value2(String value) {
        setUserRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDetailsRecord value3(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDetailsRecord value4(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserDetailsRecord values(Long value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserDetailsRecord
     */
    public UserDetailsRecord() {
        super(UserDetailsTable.USER_DETAILS);
    }

    /**
     * Create a detached, initialised UserDetailsRecord
     */
    public UserDetailsRecord(Long userId, String userRef, String email, String displayName) {
        super(UserDetailsTable.USER_DETAILS);

        set(0, userId);
        set(1, userRef);
        set(2, email);
        set(3, displayName);
    }
}
