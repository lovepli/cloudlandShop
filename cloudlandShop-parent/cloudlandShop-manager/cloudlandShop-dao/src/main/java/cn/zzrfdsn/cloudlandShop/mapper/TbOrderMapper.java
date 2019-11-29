package cn.zzrfdsn.cloudlandShop.mapper;

import cn.zzrfdsn.cloudlandShop.pojo.TbOrder;
import cn.zzrfdsn.cloudlandShop.pojo.TbOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    long countByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int deleteByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int insert(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int insertSelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    List<TbOrder> selectByExample(TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    TbOrder selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int updateByPrimaryKeySelective(TbOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order
     *
     * @mbg.generated Sun Sep 15 17:34:15 CST 2019
     */
    int updateByPrimaryKey(TbOrder record);
}