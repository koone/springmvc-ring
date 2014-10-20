package com.baidu.rigel.ring.bo;

import java.io.Serializable;

public class Config implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.config_key
     *
     * @mbggenerated
     */
    private String configKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_config.config_value
     *
     * @mbggenerated
     */
    private Long configValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_config.id
     *
     * @return the value of tb_config.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_config.id
     *
     * @param id the value for tb_config.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_config.config_key
     *
     * @return the value of tb_config.config_key
     *
     * @mbggenerated
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_config.config_key
     *
     * @param configKey the value for tb_config.config_key
     *
     * @mbggenerated
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_config.config_value
     *
     * @return the value of tb_config.config_value
     *
     * @mbggenerated
     */
    public Long getConfigValue() {
        return configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_config.config_value
     *
     * @param configValue the value for tb_config.config_value
     *
     * @mbggenerated
     */
    public void setConfigValue(Long configValue) {
        this.configValue = configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_config
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Config other = (Config) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConfigKey() == null ? other.getConfigKey() == null : this.getConfigKey().equals(other.getConfigKey()))
            && (this.getConfigValue() == null ? other.getConfigValue() == null : this.getConfigValue().equals(other.getConfigValue()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConfigKey() == null) ? 0 : getConfigKey().hashCode());
        result = prime * result + ((getConfigValue() == null) ? 0 : getConfigValue().hashCode());
        return result;
    }
}