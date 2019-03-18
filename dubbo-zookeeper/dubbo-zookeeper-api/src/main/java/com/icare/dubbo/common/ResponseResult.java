package com.icare.dubbo.common;


import java.io.Serializable;

/**
 * 相应结果集封装
 *
 * @author TianHaibo
 * @create 2017-11-30 17:58
 **/
public class ResponseResult<T> implements Serializable {

    private static final long serialVersionUID = -2391938914864875717L;

    private boolean success;

    private T data;

    private String code;

    private String message;

    private String detailMessage;

    private String url;

    public static <T> ResponseResult<T> responseSuccess(){
        return response(true,null,null,null,null);
    }

    public static <T> ResponseResult<T> responseSuccess(T t){
       return response(true,t,null,null,null);
    }

    public static <T> ResponseResult<T> responseFaild(EnumInterface enumDto){
        return response(false,null,enumDto.getCode(),enumDto.getMessage(),null);
    }

    public static <T> ResponseResult<T> responseSuccess(EnumInterface enumDto){
        return response(true,null,enumDto.getCode(),enumDto.getMessage(),null);
    }

    public static <T> ResponseResult<T> responseFaild(EnumInterface enumDto, String detailMeaasge){
        return response(false,null,enumDto.getCode(),enumDto.getMessage(),detailMeaasge);
    }
    public static <T> ResponseResult<T> responseFaild(EnumInterface enumDto, String message, String detailMeaasge){
        return response(false,null,enumDto.getCode(),message,detailMeaasge);
    }
    public static <T> ResponseResult<T> responseFaild(ResponseResult responseResult){
        return response(false,null,responseResult.getCode(),responseResult.getMessage(),null);
    }
    public static <T> ResponseResult<T> responseFaild(ResponseResult responseResult, String detailMessage){
        return response(false,null,responseResult.getCode(),responseResult.getMessage(),detailMessage);
    }
    public static <T> ResponseResult<T> responseFaild(String faildCode, String faildMeaasge){
        return response(false,null,faildCode,faildMeaasge,null);
    }

    public static <T> ResponseResult<T> responseFaild(String faildCode, String faildMeaasge, String detailMessage){
        return response(false,null,faildCode,faildMeaasge,detailMessage);
    }

    public static <T> ResponseResult<T> response(boolean success, T t, String faildCode, String faildMeaasge, String faildDetailMeaasge){
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.setSuccess(success);
        responseResult.setCode(faildCode);
        responseResult.setData(t);
        responseResult.setMessage(faildMeaasge);
        responseResult.setDetailMessage(faildDetailMeaasge);
        return responseResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

}
